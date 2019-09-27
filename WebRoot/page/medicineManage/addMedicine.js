var $;
layui.config({
	base : "js/"
}).use(['form','layer','jquery'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage;
		$ = layui.jquery;

 	var addMedicineArray = [],addMedicine;
 	form.on("submit(addMedicine)",function(data){
 		//是否添加过信息
	 	/*if(window.sessionStorage.getItem("addMedicine")){
	 		addMedicineArray = JSON.parse(window.sessionStorage.getItem("addMedicine"));
	 	}*/
 		if(data.field.medicineMadein==0){
 			layer.msg("请选择药品产地");
 			return false;
 		}else if(data.field.medicineType==0){
 			layer.msg("请选择药品类型");
 			return false;
 		}

	 	var userEndTime;

 		addMedicine = '{"medicineno":"'+ new Date().getTime().toString() +'",'; //药品编号
 		addMedicine += '"medicinename":"'+ $(".medicineName").val() +'",';  //药品名称
 		addMedicine += '"medicinemadein":"'+ data.field.medicineMadein +'",'; //药品产地
 		addMedicine += '"medicinetype":"'+ data.field.medicineType +'",'; //药品类型
 		addMedicine += '"medicineunit":"'+ data.field.medicineUnit +'",'; //药品单位
 		addMedicine += '"medicinespec":"'+ $(".medicineSpec").val() +'",'; //药品规格
 		addMedicine += '"medicineinprice":"'+ $(".medicineInPrice").val() +'",'; //进价
 		addMedicine += '"medicineprice":"'+ $(".medicinePrice").val() +'",'; //售价
 		addMedicine += '"medicineremarks":"'+ $(".medicineRemarks").val() +'"}'; //备注
 		
 		//addMedicine += '"userEndTime":"'+ formatTime(new Date()) +'"}';  //时间
 		console.log(addMedicine);
 		
 		addMedicineArray.unshift(JSON.parse(addMedicine));
 		window.sessionStorage.setItem("addMedicine",JSON.stringify(addMedicineArray));
 		
 		$.ajax({
            url: "addMedicine.action",
            data: addMedicine,
            contentType: "application/json;charset=UTF-8", //发送数据的格式
            type: "post",
            dataType: "json", //这是返回来是json，也就是回调json
            success: function(data){
                //alert(data);
            }
        });
 		
 		//弹出loading
 		var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
        setTimeout(function(){
            top.layer.close(index);
			top.layer.msg("药品添加成功！");
 			layer.closeAll("iframe");
	 		//刷新父页面
	 		parent.location.reload();
        },2000);
 		return false;
 	})
	
})

//格式化时间
function formatTime(_time){
    var year = _time.getFullYear();
    var month = _time.getMonth()+1<10 ? "0"+(_time.getMonth()+1) : _time.getMonth()+1;
    var day = _time.getDate()<10 ? "0"+_time.getDate() : _time.getDate();
    var hour = _time.getHours()<10 ? "0"+_time.getHours() : _time.getHours();
    var minute = _time.getMinutes()<10 ? "0"+_time.getMinutes() : _time.getMinutes();
    return year+"-"+month+"-"+day+" "+hour+":"+minute;
}
