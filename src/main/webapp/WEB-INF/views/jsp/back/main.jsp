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
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/html5.js"></script>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/respond.min.js"></script>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/h-ui/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/h-ui/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/h-ui/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/h-ui/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/h-ui/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${contextPath}/resources/h-ui/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>H-ui.admin v2.4</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">会员管理系统</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml"></a> <span class="logo navbar-slogan f-l mr-10 hidden-xs"></span> <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:">&#xe667;</a>
			<%--<nav class="nav navbar-nav">--%>
				<%--<ul class="cl">--%>
					<%--<li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>--%>
						<%--<ul class="dropDown-menu menu radius box-shadow">--%>
							<%--<li><a href="javascript:;" onclick="article_add('添加资讯','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>--%>
							<%--<li><a href="javascript:;" onclick="picture_add('添加资讯','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>--%>
							<%--<li><a href="javascript:;" onclick="product_add('添加资讯','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>--%>
							<%--<li><a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>--%>
						<%--</ul>--%>
					<%--</li>--%>
				<%--</ul>--%>
			<%--</nav>--%>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
				<ul class="cl">
					<li>超级管理员</li>
					<li class="dropDown dropDown_hover"> <a href="#" class="dropDown_A">admin <i class="Hui-iconfont">&#xe6d5;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="#">个人信息</a></li>
							<li><a href="#">切换账户</a></li>
							<li><a href="${contextPath}/back/loginOut">退出</a></li>
						</ul>
					</li>
					<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
					<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="javascript:" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
							<li><a href="javascript:" data-val="blue" title="蓝色">蓝色</a></li>
							<li><a href="javascript:" data-val="green" title="绿色">绿色</a></li>
							<li><a href="javascript:" data-val="red" title="红色">红色</a></li>
							<li><a href="javascript:" data-val="yellow" title="黄色">黄色</a></li>
							<li><a href="javascript:" data-val="orange" title="绿色">橙色</a></li>
						</ul>
					</li>
				</ul>
			</nav>
		</div>
	</div>
</header>
<aside class="Hui-aside">
	<input runat="server" id="divScrollValue" type="hidden" value="" />
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 资讯管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${contextPath}/article/list" data-title="资讯管理" href="javascript:void(0)">资讯管理</a></li>
				</ul>
			</dd>
		</dl>
		<%--<dl id="menu-picture">--%>
			<%--<dt><i class="Hui-iconfont">&#xe613;</i> 图片管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>--%>
			<%--<dd>--%>
				<%--<ul>--%>
					<%--<li><a _href="${contextPath}/back/picture/picture-list.jsp" data-title="图片管理" href="javascript:void(0)">图片管理</a></li>--%>
				<%--</ul>--%>
			<%--</dd>--%>
		<%--</dl>--%>
		<%--<dl id="menu-comments">--%>
			<%--<dt><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>--%>
			<%--<dd>--%>
				<%--<ul>--%>
					<%--<li><a _href="http://h-ui.duoshuo.com/admin/" data-title="评论列表" href="javascript:;">评论列表</a></li>--%>
					<%--<li><a _href="${contextPath}/back/feedback/feedback-list.jsp" data-title="意见反馈" href="javascript:void(0)">意见反馈</a></li>--%>
				<%--</ul>--%>
			<%--</dd>--%>
		<%--</dl>--%>
		<dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe60d;</i> 会员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${contextPath}/back/member/member-list.jsp" data-title="会员列表" href="javascript:">会员列表</a></li>
					<%--<li><a _href="${contextPath}/back/member/member-del.jsp" data-title="删除的会员" href="javascript:;">删除的会员</a></li>--%>
					<%-- <li><a _href="${contextPath}/back/member/member-level.jsp" data-title="等级管理" href="javascript:;">等级管理</a></li>
					<li><a _href="${contextPath}/back/member/member-scoreoperation.jsp" data-title="积分管理" href="javascript:;">积分管理</a></li> --%>
					<%--<li><a _href="${contextPath}/back/member/member-record-browse.jsp" data-title="浏览记录" href="javascript:void(0)">浏览记录</a></li>--%>
					<%--<li><a _href="${contextPath}/back/member/member-record-download.jsp" data-title="下载记录" href="javascript:void(0)">下载记录</a></li>--%>
					<%--<li><a _href="${contextPath}/back/member/member-record-share.jsp" data-title="分享记录" href="javascript:void(0)">分享记录</a></li>--%>
				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${contextPath}/back/admin/admin-role.jsp" data-title="角色管理" href="javascript:void(0)">角色管理</a></li>
					<%--<li><a _href="${contextPath}/back/admin/admin-permission.jsp" data-title="权限管理" href="javascript:void(0)">权限管理</a></li>--%>
					<li><a _href="${contextPath}/back/admin/admin-list.jsp" data-title="管理员列表" href="javascript:void(0)">管理员列表</a></li>
				</ul>
			</dd>
		</dl>
		
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<%--<li><a _href="${contextPath}/back/system/system-base.jsp" data-title="系统设置" href="javascript:void(0)">系统设置</a></li>--%>
					<%-- <li><a _href="${contextPath}/back/system/system-category.jsp" data-title="栏目管理" href="javascript:void(0)">栏目管理</a></li> --%>
					<%--<li><a _href="${contextPath}/back/system/system-data.jsp" data-title="数据字典" href="javascript:void(0)">数据字典</a></li>--%>
					<%--<li><a _href="${contextPath}/back/system/system-shielding.jsp" data-title="屏蔽词" href="javascript:void(0)">屏蔽词</a></li>--%>
					<li><a _href="${contextPath}/log/index" data-title="系统日志" href="javascript:void(0)">系统日志</a></li>
				</ul>
			</dd>
		</dl>
	</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="${contextPath}/back/welcome">我的桌面</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="${contextPath}/back/welcome"></iframe>
		</div>
	</div>
</section>
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="${contextPath}/resources/h-ui/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="${contextPath}/resources/h-ui/static/h-ui.admin/js/H-ui.admin.js"></script> 
<script type="text/javascript">
/*资讯-添加*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
</script> 

</body>
</html>