<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发通知</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<div class="container" style="padding: 15px 0 0 0;">
	<div class="row col-xs-12">
	
		<div class="col-xs-11 col-xs-offset-1" style="padding-left: 0;">
			<h4>请问您的消息将发送给谁？</h4>
			<h6 style="color: red;">（请确保贵科所有人员均已加入通讯录）</h6>
		</div>
	
		<form class="form-horizontal" role="form">
		    <div class="form-group">
		    	<!-- <label class="col-xs-1 control-label"></label> -->
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<select name="department" class="form-control">
		    			<option value="内科" selected="selected">内科</option>
		    			<option value="外科">外科</option>
		    			<option value="口腔科">口腔科</option>
		    			<option value="急诊科">急诊科</option>
		    		</select>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<a id="all_doctor" class="btn btn-default pull-left" style="width: 45%;color: #B9B9B9;">全体医生</a>
		    		<a id="gk_doctor" class="btn btn-default pull-left" style="width: 45%;margin-left: 10%;color: #B9B9B9;">感控医生</a>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<a id="all_nurse" class="btn btn-default pull-left" style="width: 45%;color: #B9B9B9;">全体护士</a>
		    		<a id="gk_nurse" class="btn btn-default pull-left" style="width: 45%;margin-left: 10%;color: #B9B9B9;">感控护士</a>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<!-- <label class="col-xs-1 control-label"></label> -->
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<textarea class="form-control" rows="5" placeholder="请输入信息"></textarea>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<a href="#" class="btn btn-success pull-left btn-color-self c-send-noti-btn" style="width: 48%;">返 回</a>
		    		<button type="submit" class="btn btn-success pull-left btn-color-self c-send-noti-btn-count" style="width: 48%;margin-left: 4%;">发 送</button>
		    	</div>
		    </div>
		</form>
	</div>
</div>

<!-- 记录按钮的点击次数-开始 -->
<input type="hidden" name="c_send_noti_btn_count" id="c_send_noti_btn_count_id" value="" />
<!-- 记录按钮的点击次数-结束 -->

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/clinical/c_send_notice.js"></script>

</body>
</html>