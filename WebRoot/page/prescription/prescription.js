var $form;
var form;
var $;
layui.config({
	base : "js/"
}).use(['form','layer','jquery'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
		$form = $('form');

	//加载页面数据
	var medicineData = '';
	
	//添加行
  	var i =1;
	//添加行
	$(".addRow").click(function(){
		var rowTem=+'<tr>'
				+  '<tr>'
		    	+  '<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose">'
		    	+  '</td>'
		    	+  '<td><div class="layui-input-inline">'
				+  '<select name="province'+i+'" id="medicinename'+i+'" onchange="fun1('+i+')"><option value="">请选择药品</option></select>'
				+  '</div></td>'
		    	+  '<td id="medicineno'+i+'">'+'</td>'
		    	+  '<input type="hidden"  id="medicineno1'+i+'" value=""  class="layui-input">'
		    	+  '<td id="medicinetype'+i+'">'+'</td>'
		    	+  '<td id="medicinespec'+i+'">'+'</td>'
		    	+  '<td id="medicineunit'+i+'">'+'</td>'
		    	+  '<td id="medicineinprice'+i+'">'+'</td>'
		    	+  '<input type="hidden"  id="medicineinprice1'+i+'" value=""  class="layui-input">'
		    	+  '<td width="50px"><input type="text" value="" id="medicinenum'+i+'" class="layui-input"></td>'
		    	+  '<td id="medicinemadein'+i+'">'+'</td>'
		    	+  '<td>'
				+  '<a class="layui-btn layui-btn-danger layui-btn-mini del" id="del" data-id="'+i+'"><i class="layui-icon">&#xe640;</i> 删除</a>'
		        +  '</td>'
		    	+'</tr>'
		    	+'</tr>';
			$("#t").before(rowTem);
			$.post("medicineList.action", function(data){
				medicineData = data;
				//执行加载数据的方法
		        loadProvince(); //加载药品信息
			});
	});
	

	$("body").on("click",".del",function(){  //删除
		var _this = $(this);
		layer.confirm('确定删除此用户？',{icon:3, title:'提示信息'},function(index){
			_this.parents("tr").remove();
			layer.close(index);
		});
	});
	
    //开药单
    form.on("submit(changePresc)",function(){
		layer.confirm('确定开出药方？',{icon:3, title:'提示信息'},function(index){
			layer.close(index);
	    	var prescription = [];
	    	for(var a=0;a<i;a++){
	    		if($("#medicinenum"+a).size()>0&&$("#medicinenum"+a).val()!=""){
	        		var pres={"id":"","prescriptionno":$("#prescriptionno").val(),
	        				"takenum":$("#medicinenum"+a).val(),"medicineprice":$("#medicineinprice1"+a).val(),
	        				"medicineno":$("#medicineno1"+a).val(),"drawer":$("#username").val()};
	        		prescription.unshift(pres);
	    		}
	    	}
	    	if (prescription.length == 0){
	    		layer.confirm('请完整输入药品信息！',{icon:3, title:'提示信息'},function(index){
	    			layer.close(index);
	    		});
	    	}else {
	    	    var obj={"prescriptionno":$("#prescriptionno").val(),
	    	    		"patientno":$("#patientno").val(),"patientname":$("#patientname").val(),
	    	    		"prescriptionList":prescription};
	    	    var prescriptionVo = JSON.stringify(obj);
	    	 	$.ajax({
	    	 		url: "savePrescAndPaymen.action",
	    	        data: prescriptionVo,
	    	        contentType: "application/json;charset=UTF-8", //发送数据的格式
	    	        type: "post",
	    	        dataType: "json", //这是返回来是json，也就是回调json
	    	        success: function(data){
	    	            window.location.href="page/pay/payList.jsp";
	    	        }
	    	    }); 
	    	}
		});
    	return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });

	//加载药品数据
	function loadProvince() {
	    var proHtml = '';
	    for (var j = 0; j < medicineData.length; j++) {
	        proHtml += '<option value="' + medicineData[j].medicinename + '">' + medicineData[j].medicinename + '</option>';
	    }
	    //初始化药品数据
	    $form.find('select[name=province'+i+']').append(proHtml);
	    form.render();
		i++;
	}
	
	//加载选中药品数据
    form.on('select', function(data) {
        var value = data.value;
        var a =  data.elem.getAttribute("id");
        var num=a.charAt(a.length - 1);
	    for (var j = 0; j < medicineData.length; j++) {
	    	if(value==medicineData[j].medicinename){
	    		$("#medicineno"+num).text(medicineData[j].medicineno);
	    		$("#medicineno1"+num).val(medicineData[j].medicineno);
	    		$("#medicinetype"+num).text(medicineData[j].medicinetype);
	    		$("#medicinespec"+num).text(medicineData[j].medicinespec);
	    		$("#medicineunit"+num).text(medicineData[j].medicineunit);
	    		$("#medicineinprice"+num).text(medicineData[j].medicineinprice);
	    		$("#medicineinprice1"+num).val(medicineData[j].medicineinprice);
	    		$("#medicinemadein"+num).text(medicineData[j].medicinemadein);
	    	}
	    }
    });
    
    $(function(){
    	var time = formatTime(new Date());
    	$("#time").val(time);
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