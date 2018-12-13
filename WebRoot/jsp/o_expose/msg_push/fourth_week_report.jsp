<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>第四周症状报告</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<!-- 提交成功提示-开始 -->
<div class="s-check-revi-model"></div>
<div class="s-check-revi-notice">
	提交成功
</div>
<!-- 提交成功提示-结束 -->

<div class="container" style="padding: 15px 10px 0 10px;">
	
	<div class="f-title">请问你在暴露后第四周，有无异常症状？</div>
	
	<div class="f-symptom">
		<div class="f-symptom-1">无症状</div>
		<div class="f-symptom-2">有症状</div>
	</div>
	
	<form class="form-horizontal" role="form">
	    <div class="form-group">
	    	<div class="col-xs-12">
	    		<textarea class="form-control" rows="5" placeholder="症状描述："></textarea>
	    	</div>
	    </div>
	    
	    <div class="form-group">
	    	<div class="col-xs-12">
	    		<a href="#" class="btn btn-success pull-left btn-color-self f-sym-btn" style="width: 48%;">返 回</a>
	    		<button type="button" class="btn btn-success pull-left btn-color-self f-sym-submit" style="width: 48%;margin-left: 4%;">提 交</button>
	    	</div>
	    </div>
	</form>
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/o_expose/fourth_week_report.js"></script>

</body>
</html>