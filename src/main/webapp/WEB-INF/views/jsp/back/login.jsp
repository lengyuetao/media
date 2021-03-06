<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/resources/common/taglib.jsp"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/html5.js"></script>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/respond.min.js"></script>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${contextPath}/resources/h-ui/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/h-ui/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/h-ui/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/h-ui/lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>秀美人间后台登录 </title>
</head>
<body>
<h1>${userName}</h1>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form class="form form-horizontal" action="${contextPath}/login" method="post" onsubmit="return toValidate()">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="userName" name="userName" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input id="code" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
          <img id="imgUrl" src="${contextPath}/validate/code" /><a id="kanbuq">看不清，换一张</a>
        </div>
      </div>
      <%--<div class="row cl">--%>
        <%--<div class="formControls col-xs-8 col-xs-offset-3">--%>
          <%--<label for="online">--%>
            <%--<input type="checkbox" name="online" id="online" value="">--%>
            <%--使我保持登录状态</label>--%>
        <%--</div>--%>
      <%--</div>--%>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input id="btnSubmit" name="btnSubmit" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
          <input id="btnClear" name="btnClear" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright 你的公司名称 by H-ui.admin.v2.3</div>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/resources/h-ui/static/h-ui/js/H-ui.js"></script>

<script>

  $("#kanbuq").click(function(){
    var url = "${contextPath}/validate/code?t=" + Math.random();
    $("#imgUrl").attr("src",url);
  });

  function toValidate(){
    var userName=$("#username").val();
    var password=$("#password").val();
    var code=$("#code").val();
    if(userName==''){
      alert("账号不能为空！");
      return false;
    }
    if(password==''){
      alert("密码不能为空！");
      return false;
    }
    var json=[];
    $.ajax({
      type:"POST",
      url:'${contextPath}/validate/examine',
      dataType:"json",
      async:false,
      data:{"code":code},
      success:function (data) {
        json=data;
      }
    });
    if(json.code!=1) {
      alert("验证码错误！");
      return false;
    }
    return true;

  }

</script>
</body>
</html>