layui.config({
	base : "js/"
}).use(['form','layer','jquery','laypage'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,
		$ = layui.jquery;

	//加载页面数据
	var medicineData = '';
	$.post("medicineList.action", function(data){
		medicineData = data;
		if(window.sessionStorage.getItem("addMedicine")){
			var addMedicine = window.sessionStorage.getItem("addMedicine");
			medicineData = JSON.parse(addMedicine).concat(medicineData);
		}
		//执行加载数据的方法
		medicineList();
	})

	//查询
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
						if(window.sessionStorage.getItem("addMedicine")){
							var addMedicine = window.sessionStorage.getItem("addMedicine");
							medicineData = JSON.parse(addMedicine).concat(data);
						}else{
							medicineData = data;
						}
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

	//打开新增药品页面
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
	            		for(var i=0;i<medicineData.length;i++){
							if(medicineData[i].newsId == $checked.eq(j).parents("tr").find(".news_del").attr("data-id")){
								medicineData.splice(i,1);
								medicineList(medicineData);
							}
						}
	            	}
	            	$('.users_list thead input[type="checkbox"]').prop("checked",false);
	            	form.render();
	                layer.close(index);
					layer.msg("删除成功");
	            },2000);
	        })
		}else{
			layer.msg("请选择需要删除的文章");
		}
	})

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
		var childChecked = $(data.elem).parents('table').find('tbody input[type="checkbox"]:not([name="show"]):checked')
		if(childChecked.length == child.length){
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = true;
		}else{
			$(data.elem).parents('table').find('thead input#allChoose').get(0).checked = false;
		}
		form.render('checkbox');
	})

	//TODO操作
	$("body").on("click",".users_edit",function(){  //编辑
		layer.alert('您点击了会员编辑按钮，由于是纯静态页面，所以暂时不存在编辑内容，后期会添加，敬请谅解。。。',{icon:6, title:'文章编辑'});
	})

	$("body").on("click",".users_del",function(){  //删除
		var _this = $(this);
		layer.confirm('确定删除此用户？',{icon:3, title:'提示信息'},function(index){
			//_this.parents("tr").remove();
			for(var i=0;i<medicineData.length;i++){
				if(medicineData[i].usersId == _this.attr("data-id")){
					medicineData.splice(i,1);
					medicineList(medicineData);
				}
			}
			layer.close(index);
		});
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
			    	+  '<td>'+currData[i].medicinespec+'</td>'
			    	+  '<td>'+currData[i].medicineunit+'</td>'
			    	+  '<td>'+currData[i].medicinetype+'</td>'
			    	+  '<td>'+currData[i].medicinemadein+'</td>'
			    	+  '<td>'
					+    '<a class="layui-btn layui-btn-mini users_edit"><i class="iconfont icon-edit"></i> 编辑</a>'
					+    '<a class="layui-btn layui-btn-danger layui-btn-mini users_del" data-id="'+data[i].medicineno+'"><i class="layui-icon">&#xe640;</i> 删除</a>'
			        +  '</td>'
			    	+'</tr>';
				}
			}else{
				dataHtml = '<tr><td colspan="9">暂无数据</td></tr>';
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
				$('.users_list thead input[type="checkbox"]').prop("checked",false);
		    	form.render();
			}
		})
	}
        
})