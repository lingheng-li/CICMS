layui.config({
	base : "js/"
}).use(['form','layer','jquery'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
		$form = $('form');
		var time;
		
		
	    //确认收款
	    form.on("submit(changePayment)",function(){
			layer.confirm('确定收款？',{icon:3, title:'提示信息'},function(index){
				layer.close(index);
				var obj = {payno:$('#payno').val(),
						prescriptionno:$('#prescriptionno').val(),
						patientno:$('#patientno').val(),
						username:$('#username').val(),
						paytime:time,
						paystatus:"1"};
		    	var payment = JSON.stringify(obj);
		    	$.ajax({
		    	 	url: "updatePaymen.action",
		    	 	contentType: "application/json;charset=UTF-8", //发送数据的格式
		    	    data: payment,
		    	    type: "post",
		    	    dataType: "json", //这是返回来是json，也就是回调json
		    	    success: function(data){
						console.log(data);
						successFlag = data;
						//弹出loading
		    	    }
		    	}); 
				setTimeout(function(){
					layer.closeAll("iframe");
					//刷新父页面
					parent.location.reload();
				},1000);
				return false;
			});
	    	return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
	    });
		
	    
	    $(function(){
	    	time = new Date();
	    	$("#time").val(formatTime(time));
	    });
	    
	    function formatTime(_time){
	        var year = _time.getFullYear();
	        var month = _time.getMonth()+1<10 ? "0"+(_time.getMonth()+1) : _time.getMonth()+1;
	        var day = _time.getDate()<10 ? "0"+_time.getDate() : _time.getDate();
	        var hour = _time.getHours()<10 ? "0"+_time.getHours() : _time.getHours();
	        var minute = _time.getMinutes()<10 ? "0"+_time.getMinutes() : _time.getMinutes();
	        return year+"-"+month+"-"+day+" "+hour+":"+minute;
	    }
		
});