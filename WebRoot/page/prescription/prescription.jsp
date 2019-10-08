<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>CICMS</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="css/user.css" media="all" />
	<style type="text/css">
		.layui-form-item .layui-inline{ width:33.333%; float:left; margin-right:0; }
		@media(max-width:1240px){
			.layui-form-item .layui-inline{ width:100%; float:none; }
		}
	</style>
</head>
<body class="childrenBody">
	<form class="layui-form">
		<blockquote class="layui-elem-quote">
			<div class="layui-inline" style="margin-left: 5%;">
			    <a class="layui-btn addRow" style="background-color:#5FB878">添加药品</a>
			</div>
			<div class="layui-inline">
				<a class="layui-btn layui-btn-danger batchDel">批量删除</a>
			</div>
			<div class="layui-inline" style="margin-left: 15%;">
				<label class="layui-form-label">开单编号</label>
				<div class="layui-input-block">
			    	<input type="text" id="prescriptionno" value="${prescriptionVo.prescriptionno}" disabled class="layui-input layui-disabled">
			    </div>
			</div>
		</blockquote>
		<div class="layui-form users_list">
			<table class="layui-table">
				<colgroup>
					<col width="50">
					<col>
					<col>
					<col>
					<col>
					<col>
					<col>
					<col>
					<col>
					<col>
				</colgroup>
				<thead>
					<tr>
						<th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose" id="allChoose"></th>
						<th style="text-align">药品名称</th>
						<th>药品编号</th>
						<th>类型</th>
						<th>规格</th>
						<th>单位</th>
						<th>价格</th>
						<th>数量</th>
						<th>产地</th>
						<th>操作</th>
					</tr> 
				</thead>
				<tbody class="users_content">
					<input type="hidden" id="tr">
				</tbody>
			</table>
		</div>
		<div id="page"></div>
		<div class="layui-form-item" style="margin-left: 15%;">
			<div class="layui-inline">
				<label class="layui-form-label">创建时间</label>
			    <div class="layui-input-block">
			    	<input type="text" id="time" value="请叫我马哥" disabled class="layui-input layui-disabled">
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">开单医生</label>
			    <div class="layui-input-block">
			    	<input type="text" id="username" value="${user.username}" disabled class="layui-input layui-disabled">
			    </div>
			</div>
		</div>
		<div class="layui-form-item" style="margin-left: 15%;">
			<div class="layui-inline">
			    <label class="layui-form-label">患者编号</label>
			    <div class="layui-input-block">
			    	<input type="text" id="patientno" value="${prescriptionVo.patientno}" placeholder="请输入真实姓名"  class="layui-input layui-disabled">
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">患者姓名</label>
			    <div class="layui-input-block">
			    	<input type="text" id="patientname" value="${prescriptionVo.patientname}" placeholder="请输入真实姓名" class="layui-input layui-disabled">
			    </div>
			</div>
		</div>
		<div class="layui-form-item" style="margin-left: 30%">
		    <div class="layui-input-block">
		    	<button class="layui-btn" lay-submit="" lay-filter="changePresc">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		    </div>
		</div>
	</form>
	<script type="text/javascript" src="layui/layui.js"></script>
	<script type="text/javascript" src="page/prescription/prescription.js"></script>
</body>
</html>
