var medicineData;
layui.config({
	base : "js/"
}).use([ 'form', 'layer', 'jquery' ], function() {
	var form = layui.form();
	var layer = parent.layer === undefined ? layui.layer : parent.layer;
	var $ = layui.jquery;
	$form = $('form');

	$(function() {
		$.ajax({
			url : "getMedicineNoList.action",
			/* data: addMedicine, */
			contentType : "application/json;charset=UTF-8", //发送数据的格式
			type : "post",
			dataType : "json", //这是返回来是json，也就是回调json
			success : function(data) {
				//console.log(data);
				//给medicineNo下拉框添加值
				var op = '';
				$.each(data, function(n, values) {
					op += '<option value="' + values + '">' + values + '</option>';
				});
				$form.find('select[name=medicineNos]').append(op);
				form.render();
			}
		});
	});

	form.on('select(medicineNos)', function(data) {
		var medicineno = data.value;
		console.log(medicineno);
		
		$.ajax({
			url : "getMedicineById.action",
			data : medicineno,
			contentType : "application/json;charset=UTF-8", //发送数据的格式
			type : "post",
			dataType : "json",
			success : function(data) {
				medicineData = data;
				console.log(data);
				showData(data);
			}
		});
		
	});
	
	form.on("submit(commitMedicine)", function(data) {
		medicineData.medicinenum = Number(data.field.newNum)+Number(medicineData.medicinenum);
		var MD = JSON.stringify(medicineData);
		var successFlag = 0;
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
				index = top.layer.msg('数据提交中，请稍候', {
					icon : 16,
					time : false,
					shade : 0.8
				});
			}
		});

		setTimeout(function() {
			top.layer.close(index);
			if (successFlag == 1) {
				top.layer.msg("药品入库成功！");
			} else {
				top.layer.msg("药品入库失败！");
			}
			layer.closeAll("iframe");
			//刷新父页面
			parent.location.reload();
		}, 2000);
		return false;
		
	})
	
	function showData(meData) {
		$("#medicineName").val(meData.medicinename);
		$("#medicineNum").val(meData.medicinenum);
		$("#medicineMadein").val(meData.medicinemadein);
		$("#medicineType").val(meData.medicinetype);
		$("#medicineUnit").val(meData.medicineunit);
		$("#medicineSpec").val(meData.medicinespec);
		$("#medicineInPrice").val(meData.medicineinprice);
		$("#medicinePrice").val(meData.medicineprice);
		$("#medicineRemarks").val(meData.medicineremarks);
	}

})