<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>感控端-查看通知</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<div class="container" style="padding: 3px 0 0 0;">
	
	<div class="col-xs-12" style="padding-left: 10px;padding-right: 10px;">
		<div class="s-look-noti-title">张三，您有N条未读消息</div>
	</div>
	
	<!-- 通知信息容器-开始 -->
	<div class="col-xs-12 s-look-noti-msg" style="padding: 0;margin-top: 5px;">
		
		<div class="panel-group col-xs-12" 
		style="padding-left: 10px;padding-right: 10px;margin-bottom: 0;" id="accordion">
		
			<!-- 条目一 -->
		   <div class="panel">
			    <div class="panel-heading panel-1-look-notice">
			    	
			    	<!-- 发送人 -->
			    	<div class="panel-1-look-notice-1">
				      <h4 class="panel-title">
				        <a data-toggle="collapse" data-parent="#accordion" 
				          href="#collapseOne">
				          	From:张三
				        </a>
				      </h4>
				     </div>
				     
				     <!-- 变换三角形 -->
				     <div class="panel-1-look-notice-2">
				     	<a data-toggle="collapse" data-parent="#accordion" 
				          		href="#collapseOne">
					     	<div class="panel-1-look-notice-2-1">
						     	<div class="panel-1-look-notice-2-1-sub"></div>
					     	</div>
				     	</a>
				     </div>
				     
				     <!-- 时间 -->
				     <div class="panel-1-look-notice-time">今天</div>
				     
			    </div>
			    <div id="collapseOne" class="panel-collapse collapse in">
			      <div class="panel-body" style="margin-top: -15px;border: 1px solid #EB4E4F;">
			      	  <!-- 通知内容 -->
			      	  <div class="panel-noti-theme">通知主题</div>
			      	  <div class="panel-noti-content">
			      	  	  <div class="panel-noti-content-1">请全院各科室感染控制护士注意：</div>
			      	      <div class="panel-noti-content-2">请于1月30日下午，16:00到会议厅参加“医院等级评审”知识培训。医教部将打考勤。</div>
			      	  </div>
			      	  <!-- 转发与标记 -->
			      	  <div class="panel-noti-cont-status">
			      	  	  <div class="panel-noti-cont-share">转发</div>
			      	  	  <div class="panel-noti-cont-mark">读完点我</div>
			      	  </div>
			      </div>
			    </div>
			  </div>
		</div>
	</div>
	<!-- 通知信息容器-结束 -->
	
	<!-- 实线 -->
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;margin-top: 15px;">
		<div class="c-look-notice-line"></div>
	</div>
	
	<div class="col-xs-12" style="margin-top: 7px;padding: 0;">
		<div class="c-look-notice-btn-back">返回</div>
	</div>
	
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/sense_control/s_look_notice.js"></script>

</body>
</html>








