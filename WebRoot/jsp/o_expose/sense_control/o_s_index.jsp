<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>感控端职业暴露首页</title>
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

	<div class="con-s-index-tit">本年度累计发生职业暴露XXX例，其中锐器伤XXX例，血液体液暴露XXX例。</div>
	
	<!-- 实线 -->
	<div class="solid-line" style="margin-top: 3px;"></div>
	
	<div class="con-s-btn-coll">
		<div class="con-s-btn-coll-1">
			<div class="con-s-btn-coll-1-sharp">
				<div class="con-s-btn-coll-1-sharp-1"></div>
				<!-- <div class="con-s-btn-coll-1-sharp-2">利器伤上报</div> -->
				利器伤上报
			</div>
			<div class="con-s-btn-coll-1-blood">
				<div class="con-s-btn-coll-1-blood-1"></div>
				<!-- <div class="con-s-btn-coll-1-blood-2">利器伤上报</div> -->
				血体液上报
			</div>
		</div>
		<div class="con-s-btn-coll-2">
			<div class="con-s-btn-coll-2-history">
				<div class="con-s-btn-coll-2-history-1"></div>
				<!-- <div class="con-s-btn-coll-1-sharp-2">利器伤上报</div> -->
				暴 露 历 史
			</div>
		</div>
	</div>
	
	<div class="s-check-revi-distance"></div>	
	<div class="s-cr-green-line-word con-s-red-line-word">确认暴露</div>
	<div class="s-cr-green-line con-s-red-line">
		<div class="red-rectangle"></div> 
		<div class="red-triangle"></div> 
	</div>
	
	<div class="con-s-items-events">
		<div class="con-s-red-lit-cir"></div>
		<div class="con-s-red-lit-word">张三丰上报了职业暴露，请立即确认！</div>
		<div class="con-s-red-lit-btn confirm-expo-look-count">查看</div>
	</div>
	
	<div class="s-check-revi-distance"></div>
	<div class="s-cr-green-line-word con-s-red-line-word">提醒事件</div>
	<div class="s-cr-green-line con-s-red-line">
		<div class="green-rectangle"></div> 
		<div class="green-triangle"></div> 
	</div>
	
	<div class="con-s-items-events">
		<div class="con-s-red-lit-cir"></div>
		<div class="con-s-red-lit-word">请于近3日，做第N次$test复查。</div>
		<div class="con-s-red-lit-btn notice-event-add-count">查看</div>
	</div>
	<div class="con-s-items-events">
		<div class="con-s-red-lit-cir"></div>
		<div class="con-s-red-lit-word">12.31暴露案例需补报暴露源情况</div>
		<div class="con-s-red-lit-btn notice-event-add-count">补报</div>
	</div>
	<div class="con-s-items-events">
		<div class="con-s-red-lit-cir"></div>
		<div class="con-s-red-lit-word">12.31补报第四周后有无特殊症状</div>
		<div class="con-s-red-lit-btn notice-event-add-count">补报</div>
	</div>
	
	<div class="s-check-revi-distance"></div>
	<div class="con-s-blue-line-word">个人暴露历史</div>
	<div class="blue-line con-s-blue-line">
		<div class="blue-rectangle"></div> 
		<div class="blue-triangle"></div> 
	</div>
	
	<!-- 第一条记录 -->
	<form class="form-horizontal" role="form" 
		style="padding-left: 15px;padding-right: 15px;">
		<div class="form-group">
	    	<div class="con-e-item" style="padding-left: 5px;">
				<div class="con-e-item-2">2016.12.31</div>
				<div class="con-e-item-3" style="width: 90px;">血液体液暴露</div>
				<div class="con-e-item-5">
					<div class="con-e-item-5-sub"></div>
				</div>
				<div class="con-e-item-4" style="float: right;">$暴露源</div>
	    	</div>
	    	<div class="con-e-item-content con-s-item-content">
	    		<!-- 实线 -->
	    		<div class="con-e-item-content-line"></div>
				
				<!-- 暴露级别-圆形选框 -->
				<div class="con-e-item-con-tit-1">
					暴露级别：<span style="color: #EB4E4F;">1级</span>
				</div>
				
				<!-- 暴露源头严重程度-圆形选框 -->
				<div class="con-e-item-con-tit-2">
					暴露源头严重程度：<span style="color: #EB4E4F;">3级</span>
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
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-other-drug-line"></div>
				
				<div class="con-e-item-side-eff">
					<div class="con-e-item-side-eff-word">毒副作用</div>
					<div class="con-e-item-side-eff-sel">
						<div class="con-e-item-side-eff-sel-1-rus">有</div>
					</div>
				</div>
				
				<!-- 实线 -->
				<div class="col-xs-12 con-e-item-content-line con-e-item-con-other-drug-line"></div>
				
				<div class="col-xs-12 con-e-item-con-tit-1" style="margin-top: -6px;margin-bottom: -2px;">复查历史</div>
				
				<div class="con-s-rev-history">
					<div class="con-s-rev-history-1">2016.01.31</div>
					<div class="con-s-rev-history-2">第1次</div>
					<div class="con-s-rev-history-3">乙肝检查</div>
					<div class="con-s-rev-history-4">阳性</div>
				</div>
				<div class="con-s-rev-history">
					<div class="con-s-rev-history-1">2016.01.31</div>
					<div class="con-s-rev-history-2">第2次</div>
					<div class="con-s-rev-history-3">乙肝检查</div>
					<div class="con-s-rev-history-4">阳性</div>
				</div>
				<div class="con-s-rev-history">
					<div class="con-s-rev-history-1">2016.01.31</div>
					<div class="con-s-rev-history-2">第3次</div>
					<div class="con-s-rev-history-3">乙肝检查</div>
					<div class="con-s-rev-history-4">阳性</div>
				</div>
				<div class="con-s-rev-history">
					<div class="con-s-rev-history-1">2016.01.31</div>
					<div class="con-s-rev-history-2">第4次</div>
					<div class="con-s-rev-history-3">乙肝检查</div>
					<div class="con-s-rev-history-4">阳性</div>
				</div>
				<div class="con-s-rev-history">
					<div class="con-s-rev-history-1">2016.01.31</div>
					<div class="con-s-rev-history-2">第5次</div>
					<div class="con-s-rev-history-3">乙肝检查</div>
					<div class="con-s-rev-history-4">阳性</div>
				</div>
				
				<div class="col-xs-12 con-e-item-con-btns">
		    		<button type="button" class="btn btn-success pull-left btn-color-self con-e-item-submit" style="width: 100%;">确 定</button>
		    	</div>
				
	    	</div>
	    </div>
	</form>
	<!-- 第一条记录-结束 -->
	
</div>

<!-- 记录按钮的点击次数-开始 -->
<input type="hidden" name="con_s_btn_coll_1_sharp_count" id="con_s_btn_coll_1_sharp_count_id" value="" />
<input type="hidden" name="con_s_btn_coll_1_blood_count" id="con_s_btn_coll_1_blood_count_id" value="" />
<input type="hidden" name="con_s_btn_coll_2_history_count" id="con_s_btn_coll_2_history_count_id" value="" />
<input type="hidden" name="confirm_expo_look_count" id="confirm_expo_look_count_id" value="" />
<input type="hidden" name="notice_event_add_count" id="notice_event_add_count_id" value="" />
<!-- 记录按钮的点击次数-结束 -->

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/o_expose/confirm_expose_evaluate.js"></script>
<script src="${pageContext.request.contextPath }/js/o_expose/o_s_index.js"></script>

</body>
</html>