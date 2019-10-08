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
			<div class="layui-inline">
				<a class="layui-btn layui-btn-danger batchDel">批量删除</a>
			</div>
			<div class="layui-inline" style="margin-left: 15%;">
				<label class="layui-form-label">收款单编号</label>
				<div class="layui-input-block">
			    	<input type="text" id="payno" value="${payment.payno}" disabled class="layui-input layui-disabled">
			    	<input type="hidden" id="prescriptionno" value="${payment.prescriptionno}">
			    </div>
			</div>
		</blockquote>
		<div class="layui-form users_list">
			<table class="layui-table">
				<colgroup>
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
						<th style="text-align">药品编号</th>
						<th>药品名称</th>
						<th>药品类型</th>
						<th>药品规格</th>
						<th>药品单位</th>
						<th>药品价格</th>
						<th>药品数量</th>
						<th>药品产地</th>
					</tr> 
				</thead>
				<tbody class="users_content">
					<c:forEach items="${preList}" var="prescription">
						<tr>
			    		<td>${prescription.medicineno}</td>
			    		<td>${prescription.medicineprice}</td>
			    		<td>${prescription.takenum}</td>
			    		<td>${prescription}</td>
			    		<td>${prescription}</td>
			    		<td>${prescription}</td>
			    		<td>${prescription}</td>
			    		<td>${prescription}</td>
			    	</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="page"></div>
		<div class="layui-form-item" style="margin-left: 15%;">
			<div class="layui-inline">
				<label class="layui-form-label">创建时间</label>
			    <div class="layui-input-block">
			    	<input type="hidden" id="date" value="${payment.paytime}" disabled class="layui-input layui-disabled">
			    	<input type="text" id="time" disabled class="layui-input layui-disabled">
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">收款医生</label>
			    <div class="layui-input-block">
			    	<input type="text" id="username" value="${user.username}" disabled class="layui-input layui-disabled">
			    </div>
			</div>
		</div>
		<div class="layui-form-item" style="margin-left: 15%;">
			<div class="layui-inline">
			    <label class="layui-form-label">患者编号</label>
			    <div class="layui-input-block">
			    	<input type="text" id="patientno" value="${payment.patientno}" placeholder="请输入真实姓名"  class="layui-input layui-disabled">
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">患者姓名</label>
			    <div class="layui-input-block">
<%-- 			    	<input type="text" id="patientname" value="${payment.patientname}" placeholder="请输入真实姓名" class="layui-input layui-disabled">
 --%>			    </div>
			</div>
		</div>
		<div class="layui-form-item" style="margin-left: 30%">
		    <div class="layui-input-block">
		    	<c:if test="${payment.paystatus==0}">
			    	<button class="layui-btn" lay-submit="" lay-filter="changePayment">确认收款</button>
		    	</c:if>
				<button type="reset" class="layui-btn layui-btn-primary">返回</button>
		    </div>
		</div>
	</form>
	<script type="text/javascript" src="layui/layui.js"></script>
	<script type="text/javascript" src="page/pay/payment.js"></script>
</body>
</html>