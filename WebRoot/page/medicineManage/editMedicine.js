/**
 * 
 */
var medicineData;
layui.config({
	base : "js/"
}).use([ 'form', 'layer', 'jquery' ], function() {
	var form = layui.form();
	var layer = parent.layer === undefined ? layui.layer : parent.layer;
	var $ = layui.jquery;
	$form = $('form');

	var medicineno = parent.medicineId;

	$.ajax({
		url : "getMedicineById.action",
		data : medicineno,
		contentType : "application/json;charset=UTF-8", //发送数据的格式
		type : "post",
		dataType : "json",
		success : function(data) {
			//console.log(data);
			medicineData = data;
			showData(data);
		}
	});
	
	function showData(meData){
		$("#medicineName").val(meData.medicinename);
		$("#medicineMadein").val(meData.medicinemadein);
		$("#medicineType").val(meData.medicinetype);
		$("#medicineUnit").val(meData.medicineunit);
		$("#medicineSpec").val(meData.medicinespec);
		$("#medicineInPrice").val(meData.medicineinprice);
		$("#medicinePrice").val(meData.medicineprice);
		$("#medicineRemarks").val(meData.medicineremarks);
	}
	
	form.on("submit(editMedicine)",function(data){
		medicineData.medicineprice=data.field.medicinePrice;
		medicineData.medicineinprice=data.field.medicineInPrice;
		medicineData.medicineremarks=data.field.medicineRemarks;
		if(medicineData.medicinenum==null){
			medicineData.medicinenum=0;
		}
		
		console.log(medicineData);
		var MD =  JSON.stringify(medicineData);
		var successFlag=0;
		var index;
		$.ajax({
			url : "updateMedicine.action",
			data : MD,
			contentType : "application/json;charset=UTF-8", //发送数据的格式
			type : "post",
			dataType : "json",
			success : function(data) {
				console.log(data);
				successFlag = data;
				//弹出loading
				index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
			}
		});
		
		setTimeout(function(){
			top.layer.close(index);
			if(successFlag==1){
				top.layer.msg("药品修改成功！");
			}else{
				top.layer.msg("药品修改失败！");
			}
			layer.closeAll("iframe");
			//刷新父页面
			parent.location.reload();
		},2000);
		return false;
		
	})

})