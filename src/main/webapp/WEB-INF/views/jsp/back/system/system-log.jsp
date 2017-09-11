<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/header.jsp"%>
<style>
  #logData{
    text-align: center;
  }
</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 系统日志 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
  <div class="text-c"> 日期范围：
    <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" class="input-text Wdate" style="width:120px;">
    -
    <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" class="input-text Wdate" style="width:120px;">
    <input type="text" name="logName" id="logName" placeholder="日志名称" style="width:250px" class="input-text"><button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜日志</button>
  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span>  </div>
  <table class="table table-border table-bordered table-bg table-hover table-sort" id="logData">
    <thead>
      <tr class="text-c">
        <th width="25"><input type="checkbox" name="" value=""></th>
        <th width="20">ID</th>
        <th width="60">日志名称</th>
        <th width="200">内容</th>
        <th width="80"></th>
        <th width="60">用户名</th>
        <th width="120">时间</th>
      </tr>
    </thead>
    <tbody>

    </tbody>
  </table>

  <div id="pageNav" class="pageNav"></div>
</div>
<%@ include file="../common/footer.jsp"%>

<script type="text/javascript">
    //方法一
var json={};
$('.table-sort').dataTable({
    "bLengthChange": true,
    "bPaginate": true, //翻页功能
    "sPaginationType": "full_numbers",
    "serverSide": true,
    "sAjaxSource" : "${contextPath}/log/list",
    fnServerData : function(sSource, aDataSet, fnCallback) {
        json.draw=aDataSet[0].value;
        json.start=aDataSet[3].value;
        json.length=aDataSet[4].value;
        $.ajax({
            "dataType" : 'json',
            "type" : "POST",
            "data" : json,
            "url" : sSource,
            "success" : fnCallback
        });
    },
    "columns":[
        {
            data:'id',
            render:function (data) {
                return "<td><input type='checkbox' value='"+data+"' name=''></td>";
            }
        },
        {data:'id'},
        {data:'logName'},
        {data:'content'},
        {data:'author',class:'center'},
        {data:'isDel'},
        {
            data:'addTime',
            render : function(data, type, full) {
                return new Date(data).toLocaleString();//处理时间显示
            }
        }
    ]
  });

//方法二
<%--$(document).ready(function() {--%>
    <%--$('.table-sort').dataTable( {--%>
        <%--"processing": true,--%>
        <%--'bFilter': true,--%>
        <%--"serverSide": true,--%>
        <%--"ajax": "${contextPath}/log/list",--%>
        <%--"columns":[--%>
        <%--{data:'id'},--%>
        <%--{data:'logName'},--%>
        <%--{data:'content'},--%>
        <%--{data:'author'},--%>
        <%--{data:'isDel'},--%>
        <%--{data:'addTime'}--%>
        <%--]--%>
    <%--} );--%>
<%--} );--%>

</script>

</body>
</html>