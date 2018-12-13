<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联系感控</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/fontawesome/css/font-awesome.min.css">
</head>
<body>

<div class="container" style="padding: 15px 0 0 0;">
	<div class="row col-xs-12">
	
		<div class="col-xs-11 col-xs-offset-1" style="padding-left: 0;">
			<h4>张三，请选择您要联系的人员</h4>
		</div>
		
		<!-- 搜索输入框 -->
	  	<div class="input-group input-group-sm col-xs-11 col-xs-offset-1">
			<input type="text" class="form-control" placeholder="快速查找">
			<span class="input-group-btn">
				<button class="btn btn-success btn-flat btn-color-self"><i class="fa fa-search"></i> 搜索</button>
			</span>
		</div>
	
		<form class="form-horizontal" role="form" style="margin-top: 20px;">
			<div class="form-group">
				<div class="col-xs-11 col-xs-offset-1">
				    <table class="table table-bordered tab-self">
				    	<tr style="background: #DCDCDC;">
				    		<td>姓名</td>
				    		<td>科室</td>
				    		<td>角色</td>
				    	</tr>
				    	
				    	<tr class="connect_sense_control_person">
				    		<td>张三</td>
				    		<td>感控科</td>
				    		<td>感控护士</td>
				    	</tr>
				    	
				    	<tr class="connect_sense_control_person">
				    		<td>李四</td>
				    		<td>临床科</td>
				    		<td>临床医生</td>
				    	</tr>
				    	
				    	<tr class="connect_sense_control_person">
				    		<td>王五</td>
				    		<td>感控科</td>
				    		<td>感控护士</td>
				    	</tr>
				    	
				    	<tr class="connect_sense_control_person">
				    		<td>赵二</td>
				    		<td>临床科</td>
				    		<td>临床医生</td>
				    	</tr>
				    </table>
		    	</div>
		    </div>
		    
		    <div class="form-group" style="margin-top: -20px;">
		    	<!-- <label class="col-xs-1 control-label"></label> -->
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<textarea class="form-control" rows="5" placeholder="请输入内容"></textarea>
		    	</div>
		    </div>
		    
		    <div class="form-group">
		    	<div class="col-xs-11 col-xs-offset-1">
		    		<a href="#" class="btn btn-success pull-left btn-color-self c-cont-sen-contr-btn" style="width: 48%;">返 回</a>
		    		<button type="submit" class="btn btn-success pull-left btn-color-self c-con-sen-cont-send-btn" style="width: 48%;margin-left: 4%;">发 送</button>
		    	</div>
		    </div>
		</form>
		
	</div>
</div>

<!-- 记录按钮的点击次数-开始 -->
<input type="hidden" name="c_con_sen_cont_send_btn_count" id="c_con_sen_cont_send_btn_count_id" value="" />
<!-- 记录按钮的点击次数-结束 -->

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/c_contact_sense_control.js"></script>

</body>
</html>