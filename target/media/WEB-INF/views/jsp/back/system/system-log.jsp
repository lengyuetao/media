<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/header.jsp"%>

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 系统日志 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
  <div class="text-c"> 日期范围：
    <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" class="input-text Wdate" style="width:120px;">
    -
    <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" class="input-text Wdate" style="width:120px;">
    <input type="text" name="" id="" placeholder="日志名称" style="width:250px" class="input-text"><button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜日志</button>
  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
  <table class="table table-border table-bordered table-bg table-hover table-sort" id="logData">
    <thead>
      <tr class="text-c">
        <th width="25"><input type="checkbox" name="" value=""></th>
        <th width="80">ID</th>
        <th width="100">日志名称</th>
        <th>内容</th>
        <th width="17%">用户名</th>
        <th width="120">时间</th>
        <%--<th width="70">操作</th>--%>
      </tr>
    </thead>
    <tbody>
    <tr class="text-c">
      <td><input type="checkbox" value="" name=""></td>
    </tr>
    </tbody>
  </table>

  <div id="pageNav" class="pageNav"></div>
</div>
<%@ include file="../common/footer.jsp"%>

<script type="text/javascript">

$('.table-sort').dataTable({

    "responsive" : true,//响应
    "bPaginate": true, //翻页功能

    "bLengthChange": true, //改变每页显示数据数量
    "bFilter": true, //过滤功能
    "bSort": false, //排序功能
    "bInfo": true,//页脚信息
    "bAutoWidth": true,//自动宽度
    "bDestroy" : true,

    "bProcessing" : true, //开启读取服务器数据时显示正在加载中……特别是大数据量的时候，开启此功能比较好
    "bServerSide" : true,//服务器处理分页，默认是false，需要服务器处理，必须true
    "pagingType" : 'full_numbers',
    "sAjaxDataProp" : "aData",//是服务器分页的标志，必须有
    "sAjaxSource" : "${contextPath}/log/list",//通过ajax实现分页的url路径。
    "columns":[
        {data:'id'},
        {data:'logName'},
        {data:'content'},
        {data:'author'},
        {data:'isDel'},
        {data:'addTime'}
    ],
    "oLanguage" : {//语言设置
        "sProcessing" : "处理中...",
        "sLengthMenu" : "显示 _MENU_ 项结果",
        "sZeroRecords" : "没有匹配结果",
        "sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
        "sInfoEmpty" : "显示第 0 至 0 项结果，共 0 项",
        "sInfoFiltered" : "(由 _MAX_ 项结果过滤)",
        "sInfoPostFix" : "",
        "sSearch" : "搜索:",
        "sUrl" : "",
        "sEmptyTable" : "表中数据为空",
        "sLoadingRecords" : "载入中...",
        "sInfoThousands" : ",",
        "oPaginate" : {
            "sFirst" : "首页",
            "sPrevious" : "上页",
            "sNext" : "下页",
            "sLast" : "末页"
        },
        "oAria" : {
            "sSortAscending" : ": 以升序排列此列",
            "sSortDescending" : ": 以降序排列此列"
        }
    }
});
</script>

</body>
</html>