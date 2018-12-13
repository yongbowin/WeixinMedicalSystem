<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>临床端首页</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<!-- 临床端首页-模态开始 -->
<div class="clinical-index-out"></div>
<div class="clinical-index-in">
	<div class="modal-c-index-notice-1">
		<div class="modal-c-index-circle-big">
			<div class="modal-c-index-circle-little-1"></div>
		</div>
		<div class="modal-c-index-send-msg">发通知</div>
	</div>
	<div class="modal-c-index-notice-2">
		<div class="modal-c-index-circle-big">
			<div class="modal-c-index-circle-little-2"></div>
		</div>
		<div class="modal-c-index-send-msg">看提醒</div>
	</div>
</div>
<!-- 临床端首页-模态结束 -->

<div class="container" style="padding: 3px 0 0 0;">
	
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;">
		<div class="c-index-rank pull-left">
			<div class="c-index-rank-out-1">
				<div class="c-index-rank-1">脊柱外科：排名</div>
				<!-- 绿色向下箭头-开始 -->
				<div class="green-up-arrow">
					<div class="green-down-arrow-rectangle"></div>
					<div class="green-down-arrow-triangle"></div>
				</div>
				<!-- 绿色向下箭头-结束 -->
			</div>
			<div class="c-index-rank-out-2">
				<div class="c-index-rank-2">颌面外科：排名</div>
				<!-- 红色向上箭头-开始 -->
				<div class="red-up-arrow">
					<div class="red-up-arrow-triangle"></div>
					<div class="red-up-arrow-rectangle"></div>
				</div>
				<!-- 红色向上箭头-结束 -->
			</div>
			<div class="c-index-rank-out-3">
				<div class="c-index-rank-3"><span class="c-index-rank-3-span">消化</span>科：排名</div>
				<!-- 绿色向下箭头-开始 -->
				<div class="green-up-arrow">
					<div class="green-down-arrow-rectangle"></div>
					<div class="green-down-arrow-triangle"></div>
				</div>
				<!-- 绿色向下箭头-结束 -->
			</div>
		</div>
		<!-- 圆形 -->
		<div class="circle-title pull-left">
			4.8%
		</div>
		<div class="qr-code pull-right">
			<!-- 此处为二维码 -->
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
		
		<!-- 督查信息-开始 -->
		<div class="blue-line-word">督查信息</div>
		<div class="blue-line">
			<div class="blue-rectangle"></div> 
			<div class="blue-triangle"></div> 
		</div>
		
		<div class="supervise-msg">
			<div class="supervise-msg-word">
				<div class="supervise-msg-word-1">贵科可能存在如下问题，请查看:</div>
				<div class="supervise-msg-word-2">
					（注：如已整改，请在查看详细内容后，点击<span class="supervise-msg-word-2-1">去执行</span>通知我们。如有疑问，请点击下方“联系我”按钮。）
				</div>
			</div>		
			<div class="supervise-msg-list">
				<!-- 现场督察-第一条 -->
				<div class="supervise-msg-list-sub">
					<div class="supervise-msg-list-sub-1">1</div>
					<!-- 页面刚载入时显示 -->
					<div class="supervise-msg-list-sub-2 supervise-msg-list-1-sub-2">
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
					<div class="supervise-msg-list-1-sub-2-hid">
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
					<div class="supervise-msg-list-1-sub-3">查看</div>
				</div>
				<!-- 现场督察-第二条 -->
				<div class="supervise-msg-list-sub supervise-msg-list-2-sub">
					<div class="supervise-msg-list-sub-1">2</div>
					<div class="supervise-msg-list-sub-2 supervise-msg-list-2-sub-2">
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
					<div class="supervise-msg-list-2-sub-2-hid">
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
					<div class="supervise-msg-list-2-sub-3">查看</div>
				</div>
				<!-- 现场督察-第三条 -->
				<div class="supervise-msg-list-sub supervise-msg-list-3-sub">
					<div class="supervise-msg-list-sub-1">3</div>
					<div class="supervise-msg-list-sub-2 supervise-msg-list-3-sub-2">
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
					<div class="supervise-msg-list-3-sub-2-hid">
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
					<div class="supervise-msg-list-3-sub-3">查看</div>
				</div>
			</div>		
		</div>
		<!-- 督查信息-结束 -->
	</div>
	
	<!-- 实线 -->
	<div class="col-xs-12" style="padding-left: 0;padding-right: 0;margin-top: 50px;">
		<div class="solid-line-index"></div>
	</div>
	
	<div class="col-xs-12 c-index-btn">
		<div class="c-index-btn-sub">
			<div class="c-index-btn-1">通知</div>
			<div class="c-index-btn-2">制定计划</div>
			<div class="c-index-btn-3">联系感控</div>
			<div class="c-index-btn-4">职业暴露</div>
		</div>
		<!-- 通知角标 -->
		<div class="c-index-btn-1-1">2</div>
		<div class="c-index-btn-4-1">复查</div>
	</div>
	
</div>

<!-- 记录按钮的点击次数 -->
<input type="hidden" name="qr_code_count" id="qr_code_count_id" value="" />
<input type="hidden" name="c_index_btn_1_count" id="c_index_btn_1_count_id" value="" />
<input type="hidden" name="c_index_btn_2_count" id="c_index_btn_2_count_id" value="" />
<input type="hidden" name="c_index_btn_3_count" id="c_index_btn_3_count_id" value="" />
<input type="hidden" name="c_index_btn_4_count" id="c_index_btn_4_count_id" value="" />
<input type="hidden" name="modal_c_index_notice_1_count" id="modal_c_index_notice_1_count_id" value="" />
<input type="hidden" name="modal_c_index_notice_2_count" id="modal_c_index_notice_2_count_id" value="" />
<!-- 记录按钮的点击次数-结束 -->

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/js/clinical/c_index.js"></script>

</body>
</html>








