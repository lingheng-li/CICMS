var medicineId='666';

layui.config({
	base : "js/"
}).use(['form','layer','jquery','laypage'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,
		$ = layui.jquery;

	// 加载页面数据
	var medicineData = '';
	$.post("medicineList.action", function(data){
		medicineData = data;
		medicineList();
	})
	
	// 刷新
	$(".refresh_btn").click(function(){
		$.post("medicineList.action", function(data){
			medicineData = data;
			medicineList();
		})
	})

	// 查询
	$(".search_btn").click(function(){
		var medicineArray = [];
		if($(".search_input").val() != ''){
			var index = layer.msg('查询中，请稍候',{icon: 16,time:false,shade:0.8});
            setTimeout(function(){
            	$.ajax({
					url : "medicineList.action",
					type : "post",
					dataType : "json",
					success : function(data){
						medicineData = data;
						for(var i=0;i<medicineData.length;i++){
							var medicineStr = medicineData[i];
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
		            		//药品名称
		            		if(medicineStr.medicinename.indexOf(selectStr) > -1){
			            		medicineStr["medicinename"] = changeStr(medicineStr.medicinename);
		            		}
		            		//药品编号
		            		if(medicineStr.medicineno.indexOf(selectStr) > -1){
			            		medicineStr["medicineno"] = changeStr(medicineStr.medicineno);
		            		}
		            		
		            		if(medicineStr.medicinename.indexOf(selectStr)>-1 || medicineStr.medicineno.indexOf(selectStr)>-1){
		            			medicineArray.push(medicineStr);
		            		}
		            	}
		            	medicineData = medicineArray;
		            	medicineList(medicineData);
					}
				})
            	
                layer.close(index);
            },2000);
		}else{
			layer.msg("请输入药品编号或名称进行查询");
		}
	})

	// 打开新增药品页面
	$(".medicineAdd_btn").click(function(){
		var index = layui.layer.open({
			title : "新增药品",
			type : 2,
			content : "page/medicineManage/addMedicine.jsp",
			success : function(layero, index){
				setTimeout(function(){
					layui.layer.tips('点击此处返回药品列表', '.layui-layer-setwin .layui-layer-close', {
						tips: 3
					});
				},500)
			}
		})
		// 改变窗口大小时，重置弹窗的高度，防止超出可视区域（如F12调出debug的操作）
		$(window).resize(function(){
			layui.layer.full(index);
		})
		layui.layer.full(index);
	})
	
	// 打开编辑药品页面	
	$("body").on("click",".medicine_edit",function(){
		var _this = $(this);
		medicineId = _this.attr("data-id");
		console.log(medicineId);
		var index = layui.layer.open({
			title : "修改药品",
			type : 2,
			content : "page/medicineManage/editMedicine.jsp",
			success : function(layero, index){
				setTimeout(function(){
					layui.layer.tips('点击此处返回药品列表', '.layui-layer-setwin .layui-layer-close', {
						tips: 3
					});
				},500)
			}
		})
		// 改变窗口大小时，重置弹窗的高度，防止超出可视区域（如F12调出debug的操作）
		$(window).resize(function(){
			layui.layer.full(index);
		})
		layui.layer.full(index);
	})
	
	// 删除
	$("body").on("click",".medicine_del",function(){  
		var _this = $(this);
		medicineId = _this.attr("data-id");
		console.log("要删除的药品编号:"+medicineId);
		layer.confirm('确定删除药品编号为 '+medicineId+' 的药品？',{icon:3, title:'提示信息'},function(index){
			var successFlag;
			$.ajax({
				url : "deleteMedicineById.action",
				data : medicineId,
				contentType : "application/json;charset=UTF-8", //发送数据的格式
				type : "post",
				dataType : "json",
				success : function(data) {
					successFlag = data;
					if(successFlag == 1){
						_this.parents("tr").remove();
						layer.msg("删除成功！");
					}else{
						layer.msg("删除失败！");
					}
				}
			});

			layer.close(index);
		});
	})

	// 批量删除
	$(".batchDel").click(function(){
		var $checkbox = $('.medicine_list tbody input[type="checkbox"][name="checked"]');
		var $checked = $('.medicine_list tbody input[type="checkbox"][name="checked"]:checked');
		if($checkbox.is(":checked")){
			layer.confirm('确定删除所有选中的药品？',{icon:3, title:'提示信息'},function(index){
				var index = layer.msg('删除中，请稍候',{icon: 16,time:false,shade:0.8});
	            setTimeout(function(){
	            	var ids=[];
	            	for(var j=0;j<$checked.length;j++){
	            		for(var i=0;i<medicineData.length;i++){
							if(medicineData[i].medicineno == $checked.eq(j).parents("tr").find(".medicine_del").attr("data-id")){
								console.log("即将删除的药品编号:"+medicineData[i].medicineno);
								ids.push(medicineData[i].medicineno);
								medicineData.splice(i,1);
								medicineList(medicineData);/**/
							}
						}
	            	}
	            	
	            	var idss=ids.join(",");
	            	//console.log(ids);
	            	//console.log(idss);
	            	
	            	$.ajax({
	    				url : "batchDel.action",
	    				data : idss,
	    				contentType : "application/json;charset=UTF-8", //发送数据的格式
	    				type : "post",
	    				dataType : "json",
	    				success : function(data) {
	    					console.log(data);
	    					if(data==1){
	    						layer.msg("删除成功");
	    					}else{
	    						layer.msg("删除失败,请刷新之后再尝试");
	    					}
	    					$('.medicine_list thead input[type="checkbox"]').prop("checked",false);
	    					form.render();
	    					layer.close(index);
	    				}
	    			});
	            	
	            },2000);
	        })
		}else{
			layer.msg("请选择需要删除的药品");
		}
	})

    // 全选
	form.on('checkbox(allChoose)', function(data){
		var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"])');
		child.each(function(index, item){
			item.checked = data.elem.checked;
		});
		form.render('checkbox');
	});

	// 通过判断文章是否全部选中来确定全选按钮是否选中
	form.on("checkbox(choose)",function(data){
		var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"])');
		var childChecked = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"]):checked')
		if(childChecked.length == child.length){
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = true;
		}else{
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = false;
		}
		form.render('checkbox');
	})

	function medicineList(){
		//渲染数据
		function renderDate(data,curr){
			var dataHtml = '';
			currData = medicineData.concat().splice(curr*nums-nums, nums);
			if(currData.length != 0){
				for(var i=0;i<currData.length;i++){
					dataHtml += '<tr>'
			    	+  '<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose"></td>'
			    	+  '<td>'+(i+1)+'</td>'
			    	+  '<td>'+currData[i].medicineno+'</td>'
			    	+  '<td>'+currData[i].medicinename+'</td>'
			    	+  '<td>'+currData[i].medicineinprice+'</td>'
			    	+  '<td>'+currData[i].medicineprice+'</td>'
			    	+  '<td>'+currData[i].medicinespec+'</td>'
			    	+  '<td>'+currData[i].medicineunit+'</td>'
			    	+  '<td>'+currData[i].medicinetype+'</td>'
			    	+  '<td>'+currData[i].medicinemadein+'</td>'
			    	+  '<td>'
					+    '<a class="layui-btn layui-btn-mini medicine_edit" data-id="'+data[i].medicineno+'"><i class="iconfont icon-edit"></i> 编辑</a>'
					+    '<a class="layui-btn layui-btn-danger layui-btn-mini medicine_del" data-id="'+data[i].medicineno+'"><i class="layui-icon">&#xe640;</i> 删除</a>'
			        +  '</td>'
			    	+'</tr>';
				}
			}else{
				dataHtml = '<tr><td colspan="11">暂无数据</td></tr>';
			}
		    return dataHtml;
		}

		//分页
		var nums = 10; //每页出现的数据量
		laypage({
			cont : "page",
			pages : Math.ceil(medicineData.length/nums),
			jump : function(obj){
				$(".users_content").html(renderDate(medicineData,obj.curr));
				$('.medicine_list thead input[type="checkbox"]').prop("checked",false);
		    	form.render();
			}
		})
	}
        
})