<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息登记</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css">
</head>
<body>

<div class="container" style="padding: 3px 0 0 0;">
	
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;">
	
		<div class="login-top-word">
			<div class="login-top-word-1">欢迎您的加入，</div>
			<div class="login-top-word-2">首次登陆将审核您的工作信息</div>
		</div>
		
		<!-- 实线 -->
		<div class="solid-line-index"></div>
		
		<form class="form-horizontal" role="form" 
			 action="${pageContext.request.contextPath }/Login.action" method="post">
		     <div class="form-group">
			      <div class="l-name">姓名</div>
			      <div class="l-inp-name">
			         <input type="text" name="username" class="form-control" placeholder="请填写真实姓名" required autofocus />
			      </div>
			 </div>
			 
			 <div class="form-group">
			 	<div class="l-name">科室</div>
		    	<div class="l-dep">
		    		<select name="department" class="form-control">
		    			<option value="内科" selected="selected">内科</option>
		    			<option value="外科">外科</option>
		    			<option value="口腔科">口腔科</option>
		    			<option value="急诊科">急诊科</option>
		    		</select>
		    	</div>
		    	<div class="l-dep-sub">
		    		<select name="department_sub" class="form-control">
		    			<option value="神经内科一" selected="selected">神经内科一</option>
		    			<option value="神经内科二">神经内科二</option>
		    			<option value="神经内科三">神经内科三</option>
		    			<option value="神经内科四">神经内科四</option>
		    		</select>
		    	</div>
		     </div>
		     
			 <div class="form-group">
			 	<div class="l-position-1">
			 		<div class="l-name">您是</div>
			 		<div class="l-position-1-1 l-p-common">医生</div>
		    		<div class="l-position-1-2 l-p-common">感控医生</div>
		    	</div>
		    	<div class="l-position-2">
		    		<div class="l-position-2-1 l-p-common">正副主任</div>
		    	</div>	
		    	<div class="l-position-3">
		    		<div class="l-name"></div>
		    		<div class="l-position-3-1 l-p-common">护士</div>
		    		<div class="l-position-3-2 l-p-common">感控护士</div>
		    	</div>
		    	<div class="l-position-4">
		    		<div class="l-position-4-1 l-p-common">护士长</div>
			 	</div>
		     </div>
		     
		     <div class="form-group">
			      <div class="l-name">电话</div>
			      <div class="l-inp-name">
			         <input type="text" name="phone_number" class="form-control" placeholder="验证用，请认真填写" required />
			      </div>
			 </div>
			 
			 <div class="form-group">
			      <div class="l-name">邮箱</div>
			      <div class="l-inp-name">
			         <input type="text" name="email" class="form-control" placeholder="验证用，请认真填写" required />
			      </div>
			 </div>
			 
			 <div class="form-group">
			      <div class="l-user-name">设置用户名</div>
			      <div class="l-user-inp-name">
			         <input type="text" name="username_alias" class="form-control" placeholder="验证用，请认真填写" required />
			      </div>
			 </div>
			 
			 <!-- 实线 -->
			 <div class="solid-line-index-2"></div>
			 
			 <div class="form-group">
		    	  <button type="submit" class="btn btn-success login-submit-btn">提&nbsp;&nbsp;&nbsp;&nbsp;交</button>
		     </div>
			 
	    </form>
	    
	</div>
</div>

<!-- 记录按钮的点击次数-开始 -->
<input type="hidden" name="click_count" id="click_count_id" value="" />
<!-- 记录按钮的点击次数-结束 -->

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/login.js"></script>

<script type="text/javascript">
/* 计算按钮的点击次数 */
    var count=0;
    $(".login-submit-btn").click(function(){
    	count = count + 1;
		$("#click_count_id").val(count);
    });
</script>

</body>
</html>








