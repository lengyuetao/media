var json = {};

function loadData(url) {
	$('#dataTables').dataTable( {
   	 	responsive : true,//响应
        processing : true,//加载中
        bSort : true,// 排序
        bFilter : true,// 搜索
		searching : true,// 搜索
		bLengthChange : true,// 页面大小
		serverSide : true,// 开启异步数据加载
		pagingType : 'full_numbers',// 显示首页和尾页
		sAjaxSource :url,
		fnServerData : function(sSource, aDataSet, fnCallback) {
			json.start=aDataSet[3].value;
			json.limit=aDataSet[4].value;
			json.sEcho=aDataSet[0].value;
			$.ajax({
				"dataType" : 'json',
				"type" : "POST",
				"data" : json,
				"url" : sSource,
				"success" : fnCallback
			});
		}
   } );
}

/*
 * 加载数据
 */
function draw(){
	$("#searchDiv").find('input, select').each(function(){
		if(this.type=="radio"){//input 类型是 radio
			if($(this).is(':checked')){//选中
				json[$(this).attr("name")]=$(this).val();
			}
		}else{//其他input
			json[$(this).attr("name")]=$(this).val();
		}
    });
	$('#dataTables').DataTable().draw();//重新填充数据
	if($('#addBtn').hasClass("disabled")){
		$('#addBtn').removeClass("disabled")
	};
}

function findByparam() {
	draw();
}

/*
 * 点击事件
 */
$("#searchDiv").find('input').on('keypress',function(event){
    if(event.keyCode == "13"){
    	draw();
    }
});

/*
 * 日期控件
 */
if($('.form_datetime').html()!=undefined){
	$('.form_datetime').datetimepicker({
		format: 'yyyy-mm-dd hh:ii:ss',
		language: 'zh-CN', //汉化 
		autoclose:true,//选择日期后自动关闭 
		 weekStart: 1,
        todayBtn:  1,
		todayHighlight: 1,
		startView: 2
	});
}
