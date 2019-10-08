layui.config({
	base : "js/"
}).use(['form','layer','jquery','laypage'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,
		$ = layui.jquery;

	//加载页面数据
	var payData = '';
	$.post("payList.action", function(data){
		payData = data;
		payList();
	});

	//查询
	$(".search_btn").click(function(){
		var payArray = [];
		if($(".search_input").val() != ''){
			var index = layer.msg('查询中，请稍候',{icon: 16,time:false,shade:0.8});
            setTimeout(function(){
            	$.ajax({
					url : "payList.action",
					type : "post",
					dataType : "json",
					success : function(data){
						payData = data;
						for(var i=0;i<payData.length;i++){
							var payStr = payData[i];
							var selectStr = $(".search_input").val();
		            		function changeStr(data){
		            			var dataStr = '';
		            			var showNum = data.split(eval("/"+selectStr+"/ig")).length - 1;
		            			if(showNum > 1){
									for (var j=0;j<showNum;j++) {
		            					dataStr += data.split(eval("/"+selectStr+"/ig"))[j] + "<i style='color:#03c339;font-weight:bold;'>" + selectStr + "</i>";
		            				}
		            				dataStr += data.split(eval("/"+selectStr+"/ig"))[showNum];
		            				return dataStr;
		            			}else{
		            				dataStr = data.split(eval("/"+selectStr+"/ig"))[0] + "<i style='color:#03c339;font-weight:bold;'>" + selectStr + "</i>" + data.split(eval("/"+selectStr+"/ig"))[1];
		            				return dataStr;
		            			}
		            		}
		            		//收款单编号
		            		if(payStr.payno.indexOf(selectStr) > -1){
		            			payStr["payno"] = changeStr(payStr.payno);
		            		}
		            		//患者编号
		            		if(payStr.patientno.indexOf(selectStr) > -1){
		            			payStr["patientno"] = changeStr(payStr.patientno);
		            		}
		            		//药方编号
		            		if(payStr.prescriptionno.indexOf(selectStr) > -1){
		            			payStr["prescriptionno"] = changeStr(payStr.prescriptionno);
		            		}
//		            		//收款人
//		            		if(payStr.username.indexOf(selectStr) > -1){
//		            			payStr["username"] = changeStr(payStr.username);
//		            		}
//		            		//收款时间
//		            		if(payStr.paytime.indexOf(selectStr) > -1){
//		            			payStr["paytime"] = changeStr(payStr.paytime);
//		            		}
//		            		//收款金额
//		            		if(payStr.money.indexOf(selectStr) > -1){
//		            			payStr["money"] = changeStr(payStr.money);
//		            		}
		            		if(payStr.payno.indexOf(selectStr) > -1 || payStr.patientno.indexOf(selectStr) > -1 
		            				|| payStr.prescriptionno.indexOf(selectStr) > -1
//		            				|| payStr.username.indexOf(selectStr) > -1 
//		            				|| payStr.paytime.indexOf(selectStr) > -1
		            				/*|| payStr.money.indexOf(selectStr) > -1*/){
		            			payArray.push(payStr);
		            		}
		            	}
		            	payData = payArray;
		            	payList(payData);
					}
				});
                layer.close(index);
            },2000);
		}else{
			layer.msg("请输入查询内容");
		}
	});


	//TODO批量删除
	$(".batchDel").click(function(){
		var $checkbox = $('.users_list tbody input[type="checkbox"][name="checked"]');
		var $checked = $('.users_list tbody input[type="checkbox"][name="checked"]:checked');
		if($checkbox.is(":checked")){
			layer.confirm('确定删除选中的信息？',{icon:3, title:'提示信息'},function(index){
				var index = layer.msg('删除中，请稍候',{icon: 16,time:false,shade:0.8});
	            setTimeout(function(){
	            	//删除数据
	            	for(var j=0;j<$checked.length;j++){
	            		for(var i=0;i<payData.length;i++){
							if(payData[i].newsId == $checked.eq(j).parents("tr").find(".news_del").attr("data-id")){
								payData.splice(i,1);
								payList(payData);
							}
						}
	            	}
	            	$('.users_list thead input[type="checkbox"]').prop("checked",false);
	            	form.render();
	                layer.close(index);
					layer.msg("删除成功");
	            },2000);
	        });
		}else{
			layer.msg("请选择需要删除的文章");
		}
	});

    //全选
	form.on('checkbox(allChoose)', function(data){
		var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"])');
		child.each(function(index, item){
			item.checked = data.elem.checked;
		});
		form.render('checkbox');
	});

	//通过判断文章是否全部选中来确定全选按钮是否选中
	form.on("checkbox(choose)",function(data){
		var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"])');
		var childChecked = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"]):checked');
		if(childChecked.length == child.length){
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = true;
		}else{
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = false;
		}
		form.render('checkbox');
	});

//	//TODO操作
//	$("body").on("click",".users_edit",function(){  //编辑
//		layer.alert('您点击了会员编辑按钮，由于是纯静态页面，所以暂时不存在编辑内容，后期会添加，敬请谅解。。。',{icon:6, title:'文章编辑'});
//	});
//	
	//收款
	$("body").on("click",".users_edit",function(){  
		var _this = $(this);
		var id = _this.attr('data-id');
		var index = layui.layer.open({
			title : "收款",
			type : 2,
			content : "payShow.action?payno="+id,
			success : function(layero, index){
				setTimeout(function(){
					layui.layer.tips('点击此处返回会员列表', '.layui-layer-setwin .layui-layer-close', {
						tips: 3
					});
				},500);
			}
		});
		//改变窗口大小时，重置弹窗的高度，防止超出可视区域（如F12调出debug的操作）
		$(window).resize(function(){
			layui.layer.full(index);
		});
		layui.layer.full(index);
		
	});

	function payList(){
		//渲染数据
		function renderDate(data,curr){
			var dataHtml = '';
			currData = payData.concat().splice(curr*nums-nums, nums);
			if(currData.length != 0){
				for(var i=0;i<currData.length;i++){
					var status="";
					if(currData[i].paystatus==0){
						status="待收款";
					}else{
						status="已收款";
					}
					dataHtml += '<tr>'
			    	+  '<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose"></td>'
			    	+  '<td>'+(i+1)+'</td>'
			    	+  '<td>'+currData[i].payno+'</td>'
			    	+  '<td>'+currData[i].patientno+'</td>'
			    	+  '<td>'+currData[i].prescriptionno+'</td>'
			    	+  '<td>'+currData[i].username+'</td>'
			    	+  '<td>'+currData[i].paytime+'</td>'
			    	+  '<td>'+status+'</td>'
			    	+  '<td>'+currData[i].money+'</td>'
			    	+  '<td>'
					+    '<a class="layui-btn layui-btn-mini users_edit" data-id="'+currData[i].payno+'"><i class="iconfont icon-edit"></i> 编辑</a>'
			        +  '</td>'
			    	+'</tr>';
				}
			}else{
				dataHtml = '<tr><td colspan="9">暂无数据</td></tr>';
			}
		    return dataHtml;
		}

		//分页
		var nums = 8; //每页出现的数据量
		laypage({
			cont : "page",
			pages : Math.ceil(payData.length/nums),
			jump : function(obj){
				$(".pay_content").html(renderDate(payData,obj.curr));
				$('.users_list thead input[type="checkbox"]').prop("checked",false);
		    	form.render();
			}
		});
	}
});