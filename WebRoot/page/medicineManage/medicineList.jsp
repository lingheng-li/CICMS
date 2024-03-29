<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta name="renderer" content="webkit">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="//at.alicdn.com/t/font_tnyc012u2rlwstt9.css" media="all" />
	<link rel="stylesheet" href="css/user.css" media="all" />
  </head>
  
<body class="childrenBody">
	<blockquote class="layui-elem-quote news_search">
		<div class="layui-inline">
		    <div class="layui-input-inline">
		    	<input type="text" value="" placeholder="请输入关键字" class="layui-input search_input">
		    </div>
		    <a class="layui-btn search_btn">查询</a>
		</div>
		<div class="layui-inline">
			<a class="layui-btn layui-btn-normal medicineAdd_btn">新增药品</a>
		</div>
		<div class="layui-inline">
			<a class="layui-btn layui-btn-normal PIS_btn">药品入库</a>
		</div>
		<div class="layui-inline">
			<a class="layui-btn layui-btn-danger batchDel">批量删除</a>
		</div>
		<div class="layui-inline">
			<a class="layui-btn refresh_btn"><i class="layui-icon">ဂ</i> 刷新</a>
		</div>
	</blockquote>
	<div class="layui-form medicine_list">
	  	<table class="layui-table">
		    <colgroup>
				<col width="5%">
				<col width="5%">
				<col width="10%">
				<col width="15%">
				<col width="5%">
				<col width="5%">
				<col width="10%">
				<col width="5%">
				<col width="5%">
				<col width="10%">
				<col width="15%">
				<col width="10%">
		    </colgroup>
		    <thead>
				<tr>
					<th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose" id="allChoose"></th>
					<th>序号</th>
					<th>药品编号</th>
					<th>药品名称</th>
					<th>进价</th>
					<th>售价</th>
					<th>规格</th>
					<th>单位</th>
					<th>库存</th>
					<th>药品类型</th>
					<th>产地</th>
					<th>操作</th>
				</tr> 
		    </thead>
		    <tbody class="users_content"></tbody>
		</table>
	</div>
	<div id="page"></div>
	<script type="text/javascript" src="layui/layui.js"></script>
	<script type="text/javascript" src="page/medicineManage/medicineList.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>
