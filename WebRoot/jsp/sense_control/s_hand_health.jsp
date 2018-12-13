<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>手卫生检查</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<!-- 签字页面-模态开始 -->
<div class="sign-page-out"></div>
<div class="sign-page-in">
	<div class="sign-page-row-word">请翻转屏幕签字</div>
	<div class="sign-page-col-word">请在白板上手写签字</div>
	<!-- 关闭签字页面 -->
	<div class="sign-page-close">×</div>
	<!-- 按钮 -->
	<div class="sign-page-btn">
		<div class="sign-page-btn-1">一键签字</div>
		<div class="sign-page-btn-2">完成</div>
	</div>
</div>
<!-- 签字页面-模态结束 -->

<div class="container" style="padding: 5px 10px 0 10px;">
	
	<div class="col-xs-12" style="padding: 0;">
		<h4>手卫生检查</h4>
	</div>
	
	<div class="row col-xs-12" style="margin: 0 auto;padding: 0;">
		<form class="form-horizontal" role="form">
		
		    <div class="form-group" style="padding: 0 15px;">
		    	<div class="s-hand-dep">
		    		<select name="department" class="form-control">
		    			<option value="内科" selected="selected">内科</option>
		    			<option value="外科">外科</option>
		    			<option value="口腔科">口腔科</option>
		    			<option value="急诊科">急诊科</option>
		    		</select>
		    	</div>
		    	<div class="s-hand-dep-sub">
		    		<select name="department_sub" class="form-control">
		    			<option value="神经内科一" selected="selected">神经内科一</option>
		    			<option value="神经内科二">神经内科二</option>
		    			<option value="神经内科三">神经内科三</option>
		    			<option value="神经内科四">神经内科四</option>
		    		</select>
		    	</div>
		    </div>
		    
		    <!-- 选择角色-开始 -->
		    <div class="s-select-role">
		    	<div class="s-select-role-word">选择角色</div>
		    	<div class="s-select-role-group">
		    		<div class="s-select-role-group-1">
		    			<div class="s-select-role-group-1-sub">卫生员</div>
		    		</div>
		    		<div class="s-select-role-group-2">
		    			<div class="s-select-role-group-2-sub">护理员</div>
		    		</div>
		    		<div class="s-select-role-group-3">
		    			<div class="s-select-role-group-3-sub">医生</div>
		    		</div>
		    		<div class="s-select-role-group-4">
		    			<div class="s-select-role-group-4-sub">护士</div>
		    		</div>
		    	</div>
		    </div>
		    <!-- 选择角色-结束 -->
		    
		    <!-- 洗手时刻-开始 -->
		    <div class="s-wash-time">
		    	<div class="s-wash-time-word">洗手时刻</div>
		    	<div class="s-wash-time-group">
		    		<div class="s-wash-time-group-1">
		    			<div class="s-wash-time-group-1-sub">
		    				<div>接触</div><div>病人前</div>
		    			</div>
		    		</div>
		    		<div class="s-wash-time-group-2">
		    			<div class="s-wash-time-group-2-sub">
		    				<div>无菌</div><div>操作前</div>
		    			</div>
		    		</div>
		    		<div class="s-wash-time-group-3">
		    			<div class="s-wash-time-group-3-sub">
		    				<div>接触</div><div>体液后</div>
		    			</div>
		    		</div>
		    		<div class="s-wash-time-group-4">
		    			<div class="s-wash-time-group-4-sub">
		    				<div>接触</div><div>病人后</div>
		    			</div>
		    		</div>
		    		<div class="s-wash-time-group-5">
		    			<div class="s-wash-time-group-5-sub">
		    				<div>接触</div><div>环境后</div>
		    			</div>
		    		</div>
		    	</div>
		    </div>
		    <!-- 洗手时刻-结束 -->
		    
		    <!-- 洗手行为-开始 -->
		    <div class="s-wash-behavior">
		    	<div class="s-wash-behavior-word">洗手行为</div>
		    	<div class="s-wash-behavior-group">
		    		<div class="s-wash-behavior-group-1">
		    			<div class="s-wash-behavior-group-1-sub">未洗手</div>
		    		</div>
		    		<div class="s-wash-behavior-group-2">
		    			<div class="s-wash-behavior-group-2-sub-1">
		    				<div>是否</div><div>戴手套</div>
		    			</div>
		    			<div class="s-wash-behavior-group-2-sub-2">
		    				已戴手套
		    			</div>
		    			<div class="s-wash-behavior-group-2-sub-3">
		    				未戴手套
		    			</div>
		    		</div>
		    		<div class="s-wash-behavior-group-3">
		    			<div class="s-wash-behavior-group-3-sub">肥皂/水</div>
		    		</div>
		    		<div class="s-wash-behavior-group-4">
		    			<div class="s-wash-behavior-group-4-sub">洗手液</div>
		    		</div>
		    		<div class="s-wash-behavior-group-5">
		    			<div class="s-wash-behavior-group-5-sub-1">
		    				<div>是否</div><div>六步法</div><div>正确？</div>
		    			</div>
		    			<div class="s-wash-behavior-group-5-sub-2">
		    				<div>六步法</div><div>正确</div>
		    			</div>
		    			<div class="s-wash-behavior-group-5-sub-3">
		    				<div>六步法</div><div>错误</div>
		    			</div>
		    		</div>
		    	</div>
		    </div>
		    <!-- 洗手行为-结束 -->
		    
		    <!-- 实线 -->
		    <div class="solid-line" style="margin-top: 10px;"></div>
		   	<div class="s-hand-sign">
		   		<div class="s-hand-sign-word">需要时请被检人签字:</div>
		   		<div class="s-hand-sign-btn">签字</div>
		   	</div>
		    <!-- 实线 -->
		    <div class="solid-line"></div>
		    
		    <div class="form-group" style="margin-top: 12px;">
		    	<div class="col-xs-12">
		    		<a href="#" class="btn btn-success pull-left btn-color-self c-hand-back-btn" style="width: 45%;">返 回</a>
		    		<button type="submit" class="btn btn-success pull-left btn-color-self s-hand-yes-btn" style="width: 45%;margin-left: 10%;">确 定</button>
		    	</div>
		    </div>
		    
		</form>
	</div>
	
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/sense_control/s_hand_health.js"></script>

</body>
</html>








