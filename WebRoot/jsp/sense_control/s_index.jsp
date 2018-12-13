<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>感控端首页</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<div class="container" style="padding: 3px 0 0 0;">
	
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;">
		<div class="c-index-rank pull-left"></div>
		<!-- 圆形 -->
		<div class="s-circle-title pull-left">
			4.8%
		</div>
	</div>
	
	<!-- 实线 -->
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;">
		<div class="solid-line-index"></div>
	</div>
	
	<div class="col-xs-12" style="padding: 0;margin-top: 20px;">
		
		<div class="green-line-word">概览</div>
		<div class="green-line">
			<div class="green-rectangle"></div> 
			<div class="green-triangle"></div> 
		</div>
		
		<div class="green-overview">
			<div class="green-now-in-department">
				在科:XXX人
			</div>
			<div class="green-infected-patients">
				<div class="green-infected-patients-in">
					<div class="green-infected-patients-word">感染患者:XXX人</div>
					<!-- 红色向上箭头-开始 -->
					<div class="red-up-arrow">
						<div class="red-up-arrow-triangle"></div>
						<div class="red-up-arrow-rectangle"></div>
					</div>
					<!-- 红色向上箭头-结束 -->
				</div>
			</div>
			<div class="green-quarantine">
				触隔离:XXX人
			</div>
		</div>
		
		<!-- 易感因素-开始 -->
		<div class="red-line-word">易感因素</div>
		<div class="red-line">
			<div class="red-rectangle"></div> 
			<div class="red-triangle"></div> 
		</div>
		
		<div class="easy-factor">
			<div class="easy-factor-sub">
				<div class="easy-factor-sub-1">消毒液过期</div>
				<div class="easy-factor-sub-2">消毒液过期</div>
				<div class="easy-factor-sub-3">消毒液过期</div>
			</div>
			<div class="easy-factor-sub">
				<div class="easy-factor-sub-4">消毒液过期</div>
				<div class="easy-factor-sub-5">消毒液过期</div>
				<div class="easy-factor-sub-6">消毒液过期</div>
			</div>
			<div class="easy-factor-sub">
				<div class="easy-factor-sub-7">消毒液过期</div>
				<div class="easy-factor-sub-8">消毒液过期</div>
				<div class="easy-factor-sub-9">消毒液过期</div>
			</div>
		</div>
		<!-- 易感因素-结束 -->
		
		<!-- 复查工作-开始 -->
		<div class="blue-line-word">复查工作</div>
		<div class="blue-line">
			<div class="blue-rectangle"></div> 
			<div class="blue-triangle"></div> 
		</div>
		
		<div class="supervise-msg-blue">
			<div class="supervise-msg-list-blue">
				<!-- 现场督察-第一条 -->
				<div class="supervise-msg-list-sub">
					<div class="supervise-msg-list-sub-1">1</div>
					<!-- 页面刚载入时显示 -->
					<div class="supervise-msg-list-sub-2 supervise-1-msg-list-1-sub-2">
						<div class="supervise-msg-list-sub-2-1">
							今天
						</div>
						<div class="supervise-msg-list-sub-2-2">
							多重耐药菌
						</div>
						<div class="supervise-msg-list-sub-2-3">
							现场督察
						</div>
					</div>
					<!-- 点击 查看 按钮时显示 -->
					<div class="supervise-1-msg-list-1-sub-2-hid">
						<div class="supervi-noti-title">
							<div class="supervi-noti-title-1">今天</div>
							<div class="supervi-noti-title-2">备注信息备注信息备注信息</div>
						</div>
						<div class="supervi-noti-line"></div>
						<div class="supervi-noti-relate-people">
							涉及人员：张三，李四
						</div>
						<div class="supervi-noti-relate-people">
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
						</div>
					</div>
					<div class="c-1-supervise-msg-list-1-sub-3">查看</div>
				</div>
				<!-- 现场督察-第二条 -->
				<div class="supervise-msg-list-sub supervise-msg-list-2-sub">
					<div class="supervise-msg-list-sub-1">2</div>
					<div class="supervise-msg-list-sub-2 supervise-1-msg-list-2-sub-2">
						<div class="supervise-msg-list-sub-2-1">
							昨天
						</div>
						<div class="supervise-msg-list-sub-2-2">
							关节四肢外科
						</div>
						<div class="supervise-msg-list-sub-2-3">
							现场督察
						</div>
					</div>
					<!-- 点击 查看 按钮时显示 -->
					<div class="supervise-1-msg-list-2-sub-2-hid">
						<div class="supervi-noti-title">
							<div class="supervi-noti-title-1">今天</div>
							<div class="supervi-noti-title-2">备注信息备注信息备注信息</div>
						</div>
						<div class="supervi-noti-line"></div>
						<div class="supervi-noti-relate-people">
							涉及人员：张三，李四
						</div>
						<div class="supervi-noti-relate-people">
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
						</div>
					</div>
					<div class="c-1-supervise-msg-list-2-sub-3">查看</div>
				</div>
				<!-- 现场督察-第三条 -->
				<div class="supervise-msg-list-sub supervise-msg-list-3-sub">
					<div class="supervise-msg-list-sub-1">3</div>
					<div class="supervise-msg-list-sub-2 supervise-1-msg-list-3-sub-2">
						<div class="supervise-msg-list-sub-2-1">
							12.31
						</div>
						<div class="supervise-msg-list-sub-2-2">
							脊柱外科
						</div>
						<div class="supervise-msg-list-sub-2-3">
							现场督察
						</div>
					</div>
					<!-- 点击 查看 按钮时显示 -->
					<div class="supervise-1-msg-list-3-sub-2-hid">
						<div class="supervi-noti-title">
							<div class="supervi-noti-title-1">今天</div>
							<div class="supervi-noti-title-2">备注信息备注信息备注信息</div>
						</div>
						<div class="supervi-noti-line"></div>
						<div class="supervi-noti-relate-people">
							涉及人员：张三，李四
						</div>
						<div class="supervi-noti-relate-people">
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
						</div>
					</div>
					<div class="c-1-supervise-msg-list-3-sub-3">查看</div>
				</div>
			</div>		
		</div>
		<!-- 复查工作-结束 -->
		
		<!-- 工作提醒-开始 -->
		<div class="brown-line-word">工作提醒</div>
		<div class="brown-line">
			<div class="brown-rectangle"></div> 
			<div class="brown-triangle"></div> 
		</div>
		
		<div class="supervise-msg-brown">
			<div class="supervise-msg-list-brown">
				<!-- 现场督察-第一条 -->
				<div class="supervise-msg-list-sub">
					<div class="supervise-msg-list-sub-1">1</div>
					<!-- 页面刚载入时显示 -->
					<div class="supervise-msg-list-sub-2 supervise-2-msg-list-1-sub-2">
						<div class="supervise-msg-list-sub-2-1">
							今天
						</div>
						<div class="supervise-msg-list-sub-2-2">
							多重耐药菌
						</div>
						<div class="supervise-msg-list-sub-2-3">
							现场督察
						</div>
					</div>
					<!-- 点击 查看 按钮时显示 -->
					<div class="supervise-2-msg-list-1-sub-2-hid">
						<div class="supervi-noti-title">
							<div class="supervi-noti-title-1">今天</div>
							<div class="supervi-noti-title-2">备注信息备注信息备注信息</div>
						</div>
						<div class="supervi-noti-line"></div>
						<div class="supervi-noti-relate-people">
							涉及人员：张三，李四
						</div>
						<div class="supervi-noti-relate-people">
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
						</div>
					</div>
					<div class="c-2-supervise-msg-list-1-sub-3">查看</div>
				</div>
				<!-- 现场督察-第二条 -->
				<div class="supervise-msg-list-sub supervise-msg-list-2-sub">
					<div class="supervise-msg-list-sub-1">2</div>
					<div class="supervise-msg-list-sub-2 supervise-2-msg-list-2-sub-2">
						<div class="supervise-msg-list-sub-2-1">
							昨天
						</div>
						<div class="supervise-msg-list-sub-2-2">
							关节四肢外科
						</div>
						<div class="supervise-msg-list-sub-2-3">
							现场督察
						</div>
					</div>
					<!-- 点击 查看 按钮时显示 -->
					<div class="supervise-2-msg-list-2-sub-2-hid">
						<div class="supervi-noti-title">
							<div class="supervi-noti-title-1">今天</div>
							<div class="supervi-noti-title-2">备注信息备注信息备注信息</div>
						</div>
						<div class="supervi-noti-line"></div>
						<div class="supervi-noti-relate-people">
							涉及人员：张三，李四
						</div>
						<div class="supervi-noti-relate-people">
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
						</div>
					</div>
					<div class="c-2-supervise-msg-list-2-sub-3">查看</div>
				</div>
				<!-- 现场督察-第三条 -->
				<div class="supervise-msg-list-sub supervise-msg-list-3-sub">
					<div class="supervise-msg-list-sub-1">3</div>
					<div class="supervise-msg-list-sub-2 supervise-2-msg-list-3-sub-2">
						<div class="supervise-msg-list-sub-2-1">
							12.31
						</div>
						<div class="supervise-msg-list-sub-2-2">
							脊柱外科
						</div>
						<div class="supervise-msg-list-sub-2-3">
							现场督察
						</div>
					</div>
					<!-- 点击 查看 按钮时显示 -->
					<div class="supervise-2-msg-list-3-sub-2-hid">
						<div class="supervi-noti-title">
							<div class="supervi-noti-title-1">今天</div>
							<div class="supervi-noti-title-2">备注信息备注信息备注信息</div>
						</div>
						<div class="supervi-noti-line"></div>
						<div class="supervi-noti-relate-people">
							涉及人员：张三，李四
						</div>
						<div class="supervi-noti-relate-people">
							备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息备注信息
						</div>
					</div>
					<div class="c-2-supervise-msg-list-3-sub-3">查看</div>
				</div>
			</div>		
		</div>
		<!-- 工作提醒-结束 -->
	</div>
	
	<!-- 实线 -->
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;margin-top: 50px;">
		<div class="solid-line-index"></div>
	</div>
	
	<div class="col-xs-12 c-index-btn">
		<div class="c-index-btn-sub">
			<div class="c-index-btn-1">通知</div>
			<div class="c-index-btn-2">制定计划</div>
			<div class="c-index-btn-3">手卫生</div>
			<div class="c-index-btn-4">职业暴露</div>
		</div>
		<!-- 通知角标 -->
		<div class="c-index-btn-1-1">2</div>
		<div class="c-index-btn-4-1">复查</div>
	</div>
	
</div>

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/sense_control/s_index.js"></script>

</body>
</html>








