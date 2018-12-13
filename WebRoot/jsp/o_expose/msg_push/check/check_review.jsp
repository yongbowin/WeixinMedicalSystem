<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>暴露者检查和复查</title>
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

<div class="s-check-revi-distance"></div>

<div class="s-cr-green-line-word">上报检查结果</div>
<div class="s-cr-green-line">
	<div class="green-rectangle"></div> 
	<div class="green-triangle"></div> 
</div>

<div class="container">

	<form class="form-horizontal" role="form">
		<div class="form-group" style="margin-top: 20px;">
			<div class="c-expo-title">
				<div class="expose-happen-word">今天检查的（仅打钩即可）</div>
				<div class="expose-happen-select">
					<div class="expose-happen-select-sub"></div>
				</div>
			</div>
			
			<div class="c-expo-title" style="padding: 5px 0 0 0;">
				<span style="font-size: 1.1em;float: left;width: 70px;color: #9f9f9f;line-height: 30px;">或选择时间</span>
				<input id="c_expo_time_input" style="font-size: 1.1em;float: right;width: 65%;margin-right: 15px;" class="form-control bor-color-1" type="text">
			</div>
	    </div>
	    
	    <!-- 实线 -->
		<div class="s-check-revi-line" style="margin-top: 16px;"></div>
		
		<div class="form-group">
	    	<span class="control-label s-check-revi_title">暴露者传染病史</span>
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">HbsAg</div>
	    			<div class="common-little-title">乙肝表面抗原</div>
	    		</div>
	    		<div class="pull-right HbsAg" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbsAg-unknown-result">未知</div>
	    			<div class="HbsAg-plus-result">阳性</div>
	    			<div class="HbsAg-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">HbsAb</div>
	    			<div class="common-little-title">乙肝表面抗体</div>
	    		</div>
	    		<div class="pull-right HbsAb" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbsAb-unknown-result">未知</div>
	    			<div class="HbsAb-plus-result">阳性</div>
	    			<div class="HbsAb-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">HbeAg</div>
	    			<div class="common-little-title">乙肝e抗原</div>
	    		</div>
	    		<div class="pull-right HbeAg" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbeAg-unknown-result">未知</div>
	    			<div class="HbeAg-plus-result">阳性</div>
	    			<div class="HbeAg-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">HbeAb</div>
	    			<div class="common-little-title">乙肝e抗体</div>
	    		</div>
	    		<div class="pull-right HbeAb" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbeAb-unknown-result">未知</div>
	    			<div class="HbeAb-plus-result">阳性</div>
	    			<div class="HbeAb-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">HBcAb</div>
	    			<div class="common-little-title">核心抗体</div>
	    		</div>
	    		<div class="pull-right HBcAb" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HBcAb-unknown-result">未知</div>
	    			<div class="HBcAb-plus-result">阳性</div>
	    			<div class="HBcAb-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">Anti-HCV</div>
	    			<div class="common-little-title">丙肝抗体</div>
	    		</div>
	    		<div class="pull-right Anti-HCV" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="Anti-HCV-unknown-result">未知</div>
	    			<div class="Anti-HCV-plus-result">阳性</div>
	    			<div class="Anti-HCV-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">TPPA</div>
	    			<div class="common-little-title">梅毒螺旋体抗体</div>
	    		</div>
	    		<div class="pull-right TPPA" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="TPPA-unknown-result">未知</div>
	    			<div class="TPPA-plus-result">阳性</div>
	    			<div class="TPPA-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">RPR</div>
	    			<div class="common-little-title">类脂质抗体</div>
	    		</div>
	    		<div class="pull-right RPR" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="RPR-unknown-result">未知</div>
	    			<div class="RPR-plus-result">阳性</div>
	    			<div class="RPR-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12 s-check-revi-tit-left">
	    		<div class="pull-left common-title">
	    			<div class="common-big-title">Anti-HIV</div>
	    			<div class="common-little-title">艾滋病毒抗体</div>
	    		</div>
	    		<div class="pull-right Anti-HIV" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="Anti-HIV-unknown-result">未知</div>
	    			<div class="Anti-HIV-plus-result">阳性</div>
	    			<div class="Anti-HIV-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    </div>
	    
	    <!-- 实线 -->
		<div class="s-check-revi-line"></div>
		
		<div class="form-group" style="margin-top: 8px;">
	    	<div class="col-xs-12">
	    		<a href="#" class="btn btn-success pull-left btn-color-self s-check-revi-btn" style="width: 45%;">返 回</a>
	    		<button type="button" class="btn btn-success pull-left btn-color-self s-check-revi-submit" style="width: 45%;margin-left: 10%;">提 交</button>
	    	</div>
	    </div>
	    
	</form>
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/sense_control/msg_push/check_review.js"></script>

</body>
</html>

