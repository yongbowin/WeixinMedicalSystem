<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>临床端职业暴露首页</title>
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

<div class="container" style="padding: 8px 10px 0 10px;">

	<div class="con-e-tit-1">以下是需要评估的职业暴露事件：</div>
	<div class="con-e-tit-2">（点击查看详情）</div>
	
	<!-- 第一条记录 -->
	<form class="form-horizontal" role="form" 
		style="padding-left: 15px;padding-right: 15px;">
		<div class="form-group">
	    	<div class="con-e-item">
				<div class="con-e-item-1">1</div>
				<div class="con-e-item-2">耳鼻咽喉科</div>
				<div class="con-e-item-3">欧阳雪丽</div>
				<div class="con-e-item-4">乙肝艾滋梅毒</div>
				<div class="con-e-item-5">
					<div class="con-e-item-5-sub"></div>
				</div>
	    	</div>
	    	<div class="con-e-item-content">
	    		<!-- 实线 -->
	    		<div class="con-e-item-content-line"></div>
				
				<!-- 暴露级别-圆形选框 -->
				<div class="con-e-item-con-tit-1">暴露级别</div>
				<div class="con-e-item-con-cir-1">
					<div class="con-e-item-con-cir-1-1">
						<div class="con-e-item-con-cir-1-1-sub">1级</div>
					</div>
					<div class="con-e-item-con-cir-1-2">
						<div class="con-e-item-con-cir-1-2-sub">2级</div>
					</div>
					<div class="con-e-item-con-cir-1-3">
						<div class="con-e-item-con-cir-1-3-sub">3级</div>
					</div>
				</div>
				
				<!-- 暴露源头严重程度-圆形选框 -->
				<div class="con-e-item-con-tit-2">暴露源头严重程度</div>
				<div class="con-e-item-con-cir-2">
					<div class="con-e-item-con-cir-2-1">
						<div class="con-e-item-con-cir-2-1-sub">1级</div>
					</div>
					<div class="con-e-item-con-cir-2-2">
						<div class="con-e-item-con-cir-2-2-sub">2级</div>
					</div>
					<div class="con-e-item-con-cir-2-3">
						<div class="con-e-item-con-cir-2-3-sub">3级</div>
					</div>
				</div>
				
				<!-- 实线 -->
				<div class="con-e-item-content-line" style="margin-top: 3px;"></div>
	    		
	    		<div class="con-e-item-con-tit-1">治疗预案或处理措施</div>
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">1.立即注射乙肝疫苗10 ug qd</div>
					<div class="con-e-item-con-sel-1-select">
						<div class="con-e-item-con-sel-1-select-sub"></div>
					</div>
				</div>
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">2.立即肌注乙肝免疫球蛋白200 IU qd</div>
					<div class="con-e-item-con-sel-2-select">
						<div class="con-e-item-con-sel-2-select-sub"></div>
					</div>
				</div>
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">3.口服双汰芝1片 bid</div>
					<div class="con-e-item-con-sel-3-select">
						<div class="con-e-item-con-sel-3-select-sub"></div>
					</div>
				</div>
				
				<div class="col-xs-12">
					<input class="form-control" type="text" placeholder="时间区间控件">
				</div>
				
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">4.口服茚地那伟 0.8 q8h</div>
					<div class="con-e-item-con-sel-4-select">
						<div class="con-e-item-con-sel-4-select-sub"></div>
					</div>
				</div>
				
				<div class="col-xs-12">
					<input class="form-control" type="text" placeholder="时间区间控件">
				</div>
				
	    		<div class="con-e-item-con-sel-1" style="margin-bottom: 10px;">
					<div class="con-e-item-con-sel-1-word">5.立即静注人免疫球蛋白 50ml qd</div>
					<div class="con-e-item-con-sel-5-select">
						<div class="con-e-item-con-sel-5-select-sub"></div>
					</div>
				</div>
				
				<div class="col-xs-12 con-e-item-con-other-drug">
					<input class="form-control" type="text" placeholder="其他用药"
						 style="border-color: #9F9F9F;">
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-other-drug-line"></div>
				
				<div class="con-e-item-side-eff">
					<div class="con-e-item-side-eff-word">毒副作用</div>
					<div class="con-e-item-side-eff-sel">
						<div class="con-e-item-side-eff-sel-1">有</div>
						<div class="con-e-item-side-eff-sel-2">无</div>
					</div>
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-other-drug-line"></div>
				
				<div class="col-xs-12 con-e-item-con-tit-1" style="margin-top: -6px;margin-bottom: -2px;">治疗预案或处理措施</div>
				
				<div class="col-xs-12 con-e-item-con-other-drug">
					<textarea class="form-control" rows="3" placeholder="请输入异常结果和检查值"
						 style="border-color: #9F9F9F;"></textarea>
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-res-line"></div>
				
				<div class="col-xs-12 con-e-item-con-btns">
		    		<a href="#" class="btn btn-success pull-left btn-color-self f-sym-btn" style="width: 48%;">返 回</a>
		    		<button type="button" class="btn btn-success pull-left btn-color-self con-e-item-submit" style="width: 48%;margin-left: 4%;">确 定</button>
		    	</div>
				
	    	</div>
	    </div>
	</form>
	<!-- 第一条记录-结束 -->
	
	<!-- 第二条记录-开始 -->
	<form class="form-horizontal" role="form" 
		style="padding-left: 15px;padding-right: 15px;">
		<div class="form-group">
	    	<div class="con-e-item">
				<div class="con-e-item-1">1</div>
				<div class="con-e-item-2">耳鼻咽喉科</div>
				<div class="con-e-item-3">欧阳雪丽</div>
				<div class="con-e-item-4">乙肝艾滋梅毒</div>
				<div class="con-e-item-5">
					<div class="con-e-item-5-sub"></div>
				</div>
	    	</div>
	    	<div class="con-e-item-content">
	    		<!-- 实线 -->
	    		<div class="con-e-item-content-line"></div>
				
				<!-- 暴露级别-圆形选框 -->
				<div class="con-e-item-con-tit-1">暴露级别</div>
				<div class="con-e-item-con-cir-1">
					<div class="con-e-item-con-cir-1-1">
						<div class="con-e-item-con-cir-1-1-sub">1级</div>
					</div>
					<div class="con-e-item-con-cir-1-2">
						<div class="con-e-item-con-cir-1-2-sub">2级</div>
					</div>
					<div class="con-e-item-con-cir-1-3">
						<div class="con-e-item-con-cir-1-3-sub">3级</div>
					</div>
				</div>
				
				<!-- 暴露源头严重程度-圆形选框 -->
				<div class="con-e-item-con-tit-2">暴露源头严重程度</div>
				<div class="con-e-item-con-cir-2">
					<div class="con-e-item-con-cir-2-1">
						<div class="con-e-item-con-cir-2-1-sub">1级</div>
					</div>
					<div class="con-e-item-con-cir-2-2">
						<div class="con-e-item-con-cir-2-2-sub">2级</div>
					</div>
					<div class="con-e-item-con-cir-2-3">
						<div class="con-e-item-con-cir-2-3-sub">3级</div>
					</div>
				</div>
				
				<!-- 实线 -->
				<div class="con-e-item-content-line" style="margin-top: 3px;"></div>
	    		
	    		<div class="con-e-item-con-tit-1">治疗预案或处理措施</div>
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">1.立即注射乙肝疫苗10 ug qd</div>
					<div class="con-e-item-con-sel-1-select">
						<div class="con-e-item-con-sel-1-select-sub"></div>
					</div>
				</div>
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">2.立即肌注乙肝免疫球蛋白200 IU qd</div>
					<div class="con-e-item-con-sel-2-select">
						<div class="con-e-item-con-sel-2-select-sub"></div>
					</div>
				</div>
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">3.口服双汰芝1片 bid</div>
					<div class="con-e-item-con-sel-3-select">
						<div class="con-e-item-con-sel-3-select-sub"></div>
					</div>
				</div>
				
				<div class="col-xs-12">
					<input class="form-control" type="text" placeholder="时间区间控件">
				</div>
				
	    		<div class="con-e-item-con-sel-1">
					<div class="con-e-item-con-sel-1-word">4.口服茚地那伟 0.8 q8h</div>
					<div class="con-e-item-con-sel-4-select">
						<div class="con-e-item-con-sel-4-select-sub"></div>
					</div>
				</div>
				
				<div class="col-xs-12">
					<input class="form-control" type="text" placeholder="时间区间控件">
				</div>
				
	    		<div class="con-e-item-con-sel-1" style="margin-bottom: 10px;">
					<div class="con-e-item-con-sel-1-word">5.立即静注人免疫球蛋白 50ml qd</div>
					<div class="con-e-item-con-sel-5-select">
						<div class="con-e-item-con-sel-5-select-sub"></div>
					</div>
				</div>
				
				<div class="col-xs-12 con-e-item-con-other-drug">
					<input class="form-control" type="text" placeholder="其他用药"
						 style="border-color: #9F9F9F;">
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-other-drug-line"></div>
				
				<div class="con-e-item-side-eff">
					<div class="con-e-item-side-eff-word">毒副作用</div>
					<div class="con-e-item-side-eff-sel">
						<div class="con-e-item-side-eff-sel-1">有</div>
						<div class="con-e-item-side-eff-sel-2">无</div>
					</div>
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-other-drug-line"></div>
				
				<div class="col-xs-12 con-e-item-con-tit-1" style="margin-top: -6px;margin-bottom: -2px;">治疗预案或处理措施</div>
				
				<div class="col-xs-12 con-e-item-con-other-drug">
					<textarea class="form-control" rows="3" placeholder="请输入异常结果和检查值"
						 style="border-color: #9F9F9F;"></textarea>
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-res-line"></div>
				
				<div class="col-xs-12 con-e-item-con-btns">
		    		<a href="#" class="btn btn-success pull-left btn-color-self f-sym-btn" style="width: 48%;">返 回</a>
		    		<button type="button" class="btn btn-success pull-left btn-color-self con-e-item-submit" style="width: 48%;margin-left: 4%;">确 定</button>
		    	</div>
				
	    	</div>
	    </div>
	</form>
	<!-- 第二条记录-结束 -->
	
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/o_expose/confirm_expose_evaluate.js"></script>

</body>
</html>