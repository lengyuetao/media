<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!--_meta 作为公共模版分离出去-->
<%@ include file="../common/header.jsp"%>
<!--/meta 作为公共模版分离出去-->

<title>新增文章</title>
<link rel="stylesheet" href="${contextPath}/resources/editor/css/style.css" />
<link rel="stylesheet" href="${contextPath}/resources/editor/css/editormd.min.css" />
<link rel="shortcut icon" href="https://pandao.github.io/editor.md/favicon.ico" type="image/x-icon" />
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-article-add">
		<div class="row cl">
			<label class="form-label col-xs-2 col-sm-2"><span class="c-red">*</span>文章标题：</label>
			<div class="formControls col-xs-4 col-sm-4">
				<input type="text" class="input-text" value="" placeholder="" id="artTitle" name="artTitle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">评论开始日期：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">评论结束日期：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'datemin\')}'})" id="datemax" class="input-text Wdate">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">文章内容：</label>
			<div class="formControls col-xs-10 col-sm-10">
				<div id="test-editormd" class="col-xs-10 col-sm-10">
					<textarea style="display:none;">

					</textarea>
				</div>
			</div>
		</div>

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="article_save_submit();" class="btn btn-default radius" type="submit">&nbsp;&nbsp;保存&nbsp;&nbsp;</button>
				<button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>


</article>

<!--_footer 作为公共模版分离出去-->
<%@ include file="../common/footer.jsp"%>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${contextPath}/resources/h-ui/lib/My97DatePicker/WdatePicker.js"></script>
<script src="${contextPath}/resources/editor/editormd.js"></script>
<script type="text/javascript">

    var testEditor;

    $(function() {
        // You can custom Emoji's graphics files url path
        editormd.emoji     = {
            path  : "http://www.emoji-cheat-sheet.com/graphics/emojis/",
            ext   : ".png"
        };

        // Twitter Emoji (Twemoji)  graphics files url path
        editormd.twemoji = {
            path : "http://twemoji.maxcdn.com/72x72/",
            ext  : ".png"
        };

        testEditor = editormd("test-editormd", {
            width  : "90%",
            height : 720,
            toc : true,
            emoji : true,       // Support Github emoji, Twitter Emoji(Twemoji), fontAwesome, Editor.md logo emojis.
            taskList : true,
            path   : '${contextPath}/resources/editor/lib/'
        });
    });

    //testEditor.getMarkdown();       // 获取 Markdown 源码
    //testEditor.getHTML();           // 获取 Textarea 保存的 HTML 源码
    //testEditor.getPreviewedHTML();  // 获取预览窗口里的 HTML，在开启 watch 且没有开启 saveHTMLToTextarea 时使用
    function save() {

        var content=testEditor.getHTML();//获取html
    }
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>