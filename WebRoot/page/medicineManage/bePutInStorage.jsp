<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'bePutInStorage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="layui/css/layui.css" media="all" />
<style type="text/css">
.layui-form-item .layui-inline {
	width: 33.333%;
	float: left;
	margin-right: 0;
}

@media ( max-width :1240px) {
	.layui-form-item .layui-inline {
		width: 100%;
		float: none;
	}
}
</style>
</head>

<body class="childrenBody">

	<form class="layui-form" style="width:50%;">

		<div class="layui-form-item">
			<label class="layui-form-label">药品编号</label>
			<div class="layui-input-block">
				<select id="medicineNos" name="medicineNos" lay-filter="medicineNos"
					lay-verify="required">
					<option value="0"></option>
				</select>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">入库数量</label>
			<div class="layui-input-block">
				<input type="text" id="newNum" name="newNum" class="layui-input newNum" lay-verify="required">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">库存数量</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineNum" name="medicineNum" class="layui-input medicineNum" lay-verify="required">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">药品名称</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineName" name="medicineName"
					class="layui-input medicineName" lay-verify="required">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">药品产地</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineMadein" name="medicineMadein"
					class="layui-input medicineMadein" lay-verify="required">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">药品类型</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineType" name="medicineType"
					class="layui-input medicineType" lay-verify="required">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">药品单位</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineUnit" name="medicineUnit"
					class="layui-input medicineUnit" lay-verify="required">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">药品规格</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineSpec" name="medicineSpec"
					class="layui-input medicineSpec" lay-verify="required">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">进价</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicineInPrice" name="medicineInPrice"
					class="layui-input medicineInPrice">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">售价</label>
			<div class="layui-input-block">
				<input disabled type="text" id="medicinePrice" name="medicinePrice"
					class="layui-input medicinePrice">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">备注</label>
			<div class="layui-input-block">
				<textarea disabled id="medicineRemarks" name="medicineRemarks"
					class="layui-textarea medicineRemarks"></textarea>
			</div>
		</div>

		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit="" lay-filter="commitMedicine">提交</button>
			</div>
		</div>

	</form>
	
	<script type="text/javascript" src="layui/layui.js"></script>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="page/medicineManage/bePutInStorage.js"></script>
</html>
