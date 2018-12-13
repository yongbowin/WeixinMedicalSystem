<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>制定计划</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<div class="container" style="padding: 15px 0 0 0;">
	<div class="row col-xs-12">
	
		<div class="col-xs-11 col-xs-offset-1" style="padding-left: 0;">
			<h4>张三，请制定您的工作计划：</h4>
		</div>
	
		<form class="form-horizontal" role="form">
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<input class="form-control" placeholder="请确定工作时间">
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<select name="s-work-plan-table" class="form-control">
		    			<option value="0" selected="selected">请选择工作表格（选填）</option>
		    			<option value="1">表格一</option>
		    			<option value="2">表格二</option>
		    			<option value="3">表格三</option>
		    		</select>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<select name="s-work-plan-relate-people" class="form-control">
		    			<option value="0" selected="selected">请选择涉及的人员（选填）</option>
		    			<option value="1">张三</option>
		    			<option value="2">李四</option>
		    			<option value="3">王五</option>
		    		</select>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<textarea class="form-control" rows="5" placeholder="请输入备注信息"></textarea>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<a href="#" class="btn btn-success pull-left btn-color-self c-work-plan-btn" style="width: 48%;">返 回</a>
		    		<button type="submit" class="btn btn-success pull-left btn-color-self" style="width: 48%;margin-left: 4%;">确 定</button>
		    	</div>
		    </div>
		</form>
	</div>
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript">

/* 点击返回临床端首页 */
$(".c-work-plan-btn").click(function(){
	window.location.href = "s_index.jsp";
});

</script>

</body>
</html>