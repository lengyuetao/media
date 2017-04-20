<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/header.jsp"%>

<title>数据字典</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 数据字典 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
  <div class="text-c"> 字典名称:
    <input type="text" class="input-text" id="" name="" style="width:150px">
    表名: <span class="select-box inline">
    <select class="select" id="" name="">
      <option value="0">选择一个系统表名</option>
      <option value="AccountInfo">AccountInfo</option>
      <option value="AdminInfo">AdminInfo</option>
    </select>
    </span> 字段名: <span class="select-box inline">
    <select class="select" id="" name="">
    </select>
    </span>
    <input type="hidden" id="" name="">
    <button type="submit" class="btn btn-primary radius" id="" name=""><i class="Hui-iconfont">&#xe600;</i> 添加字典</button>
  </div>
  <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
  <div class="mt-20">
    <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
      <tr class="text-c">
        <th width="25"><input type="checkbox" name="" value=""></th>
        <th width="80">ID</th>
        <th>名称</th>
        <th width="105">表名</th>
        <th width="105">字段名</th>
        <th width="100">操作</th>
      </tr>
    </thead>
    <tbody>
      <tr class="text-c">
        <td><input type="checkbox" value="" name=""></td>
        <td>0001</td>
        <td>城市</td>
        <td>city</td>
        <td>city</td>
        <td class="f-14"><a style="text-decoration:none" onclick="system_data_edit('角色编辑','system-data-edit.html','0001','400','310')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a title="删除" href="javascript:;" onclick="system_data_del(this,'10001')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
      </tr>
    </tbody>
  </table>
</div>
</div>
<%@ include file="../common/footer.jsp"%>
<script type="text/javascript">
$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,5]}// 制定列不参与排序
	]
});
/*数据字典-编辑*/
function system_data_edit(title,url,id,w,h){
  layer_show(title,url,w,h);
}
/*数据字典-删除*/
function system_data_del(obj,id){
  layer.confirm('确认要删除吗？',function(index){
    $(obj).parents("tr").remove();
    layer.msg('已删除!',{icon:1,time:1000});
  });
}
</script> 
</body>
</html>