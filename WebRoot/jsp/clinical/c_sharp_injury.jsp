<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>利器伤上报</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>

<!-- 签字页面-模态开始 -->
<div class="sign-page-out"></div>
<div class="sign-page-in">
	<div class="sign-page-row-word">请翻转屏幕签字</div>
	<div class="sign-page-col-word">请在白板上手写签字</div>
	<!-- 关闭签字页面 -->
	<div class="sign-page-close">×</div>
	<!-- 按钮 -->
	<div class="sign-page-btn">
		<div class="sign-page-btn-1">一键签字</div>
		<div class="sign-page-btn-2">完成</div>
	</div>
</div>
<!-- 签字页面-模态结束 -->
<!-- 保存成功提示-开始 -->
<div class="report-save-model"></div>
<div class="report-save-notice">
	<div class="report-save-notice-word">保存成功</div>
	<!-- 关闭提示 -->
	<div class="report-save-notice-close">×</div>
</div>
<!-- 保存成功提示-结束 -->

<div class="container" style="padding: 15px 0 0 0;">
	
	<div class="row col-xs-12">
		<div class="col-xs-11 col-xs-offset-1" style="padding-left: 0;padding-right: 0;">
			<h4>请如实填写暴露的详细过程</h4>
			<h6>（填写过程大概会持续10-20分钟，请确保留有足够的时间，
			确保完成每个部分后保存以免信息丢失，确保保存时已连接网络。保存后不可修改）</h6>
		</div>
	</div>
	
	<div class="row col-xs-12" style="padding: 0;">
		
		<div class="panel-group col-xs-11 col-xs-offset-1" 
			style="padding-left: 0;padding-right: 0;" id="accordion">
		
			<form class="form-horizontal" role="form">
			   <div class="panel">
				    <div class="panel-heading panel-base-info">
				    
				    	<div class="panel-base-info-1">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-parent="#accordion" 
					          href="#collapseOne">
					          	基本信息
					        </a>
					      </h4>
					     </div>
					     
					     <div class="panel-base-info-2">
					     	<a data-toggle="collapse" data-parent="#accordion" 
					          		href="#collapseOne">
						     	<div class="panel-base-info-2-1">
							     	<div class="panel-base-info-2-1-sub"></div>
						     	</div>
					     	</a>
					     </div>
					     
				    </div>
				    <div id="collapseOne" class="panel-collapse collapse in">
				      <div class="panel-body" style="border: 1px solid #5EC02D;">
				        <!-- 基本信息-页面 -->
				        <%@ include file="c_sharp_injury/base_info.jsp" %>
				      </div>
				    </div>
				  </div>
			</form>
			
			<form class="form-horizontal" role="form">
			   <div class="panel" style="margin-top: 6px;">
			      <div class="panel-heading panel-self-base-info">
			      
			      	<div class="panel-self-base-info-1">
						<h4 class="panel-title">
						   <a data-toggle="collapse" data-parent="#accordion" 
						      href="#collapseTwo">
						      	本底信息
						   </a>
						</h4>
			        </div>
			        
			        <div class="panel-self-base-info-2">
				     	<a data-toggle="collapse" data-parent="#accordion" 
				          		href="#collapseTwo">
					     	<div class="panel-self-base-info-2-1">
						     	<div class="panel-self-base-info-2-1-sub"></div>
					     	</div>
				     	</a>
				     </div>
			        
			      </div>
			      <div id="collapseTwo" class="panel-collapse collapse">
			         <div class="panel-body" style="border: 1px solid #F59B79;">
			            <!-- 本底信息-页面 -->
				        <%@ include file="c_sharp_injury/self_base_info.jsp" %>
			         </div>
			      </div>
			   </div>
		   </form>
		   
		   <form class="form-horizontal" role="form">
			   <div class="panel" style="margin-top: 6px;">
			      <div class="panel-heading panel-expose-source-info">
			      
				      <div class="panel-expose-source-info-1">
				         <h4 class="panel-title">
				            <a data-toggle="collapse" data-parent="#accordion" 
				               href="#collapseThree">
				               	暴露源情况
				            </a>
				         </h4>
				      </div>
				      
				     <div class="panel-expose-source-info-2">
				     	<a data-toggle="collapse" data-parent="#accordion" 
				          		href="#collapseThree">
					     	<div class="panel-expose-source-info-2-1">
						     	<div class="panel-expose-source-info-2-1-sub"></div>
					     	</div>
				     	</a>
				     </div>
				      
			      </div>
			      <div id="collapseThree" class="panel-collapse collapse">
			         <div class="panel-body" style="border: 1px solid #F19D9B;">
			            <!-- 暴露源情况-页面 -->
				        <%@ include file="c_sharp_injury/expose_source_info.jsp" %>
			         </div>
			      </div>
			   </div>
		   </form>
		   
		   <form class="form-horizontal" role="form">
			   <div class="panel" style="margin-top: 6px;">
			      <div class="panel-heading panel-sharp-event-info">
			      
				      <div class="panel-sharp-event-info-1">
				         <h4 class="panel-title">
				            <a data-toggle="collapse" data-parent="#accordion" 
				               href="#collapseFour">
				               	锐器伤事件描述
				            </a>
				         </h4>
				      </div>
				      
				      <div class="panel-sharp-event-info-2">
				     	<a data-toggle="collapse" data-parent="#accordion" 
				          		href="#collapseFour">
					     	<div class="panel-sharp-event-info-2-1">
						     	<div class="panel-sharp-event-info-2-1-sub"></div>
					     	</div>
				     	</a>
				      </div>
				      
			      </div>
			      <div id="collapseFour" class="panel-collapse collapse">
			         <div class="panel-body" style="border: 1px solid #80CEF5;">
			            <!-- 锐器伤事件描述-页面 -->
				        <%@ include file="c_sharp_injury/sharp-event-info.jsp" %>
			         </div>
			      </div>
			   </div>
		   </form>
		   
		   <form class="form-horizontal" role="form">
			   <div class="panel" style="margin-top: 6px;">
			      <div class="panel-heading panel-others-info">
			      
				      <div class="panel-others-info-1">
				         <h4 class="panel-title">
				            <a data-toggle="collapse" data-parent="#accordion" 
				               href="#collapseFive">
				               	其他
				            </a>
				         </h4>
				       </div>
				       
				       <div class="panel-others-info-2">
							<a data-toggle="collapse" data-parent="#accordion" 
							    		href="#collapseFive">
								<div class="panel-others-info-2-1">
							 		<div class="panel-others-info-2-1-sub"></div>
								</div>
							</a>
					    </div> 
			         
			      	</div>
			      <div id="collapseFive" class="panel-collapse collapse">
			         <div class="panel-body" style="border: 1px solid #60BF2F;">
			            <!-- 其他-页面 -->
				        <%@ include file="c_sharp_injury/others-info.jsp" %>
			         </div>
			         
			         <!-- 签字确认页面 -->
					<div class="row col-xs-12" style="padding: 0;margin: 0 auto;">
						<div class="col-xs-12" style="padding: 0;margin: 0 auto;">
							<h5 style="text-align: center;color: #E64D50;">最后您还需完成两件事情</h5>
							<h5 style="color: #E64D50;">
							1.立即请护士长或主任签字确认（下方图标）如不能立即找到，请发短信给他们
							</h5>
						</div>
						<!-- 签字图标 -->
						<div class="sign-icon"></div>
						<div class="col-xs-12" style="padding: 0;margin: 0 auto;">
							<h5 style="color: #E64D50;padding: 0;margin-bottom: -7px;">
							2.完成第一步后，请立即到感控科进行暴露评估
							</h5>
							<h5 style="color: #9D9D9D;padding: 0;">
							短信模板（可复制）：主任或护士长，您好，我刚才发生了职业暴露。已在“感控科”上报，
							按照相关流程规定，请您查看“爱感控”里的上报信息，并签字确认。谢谢。
							</h5>
						</div>
					</div>									         
			         
			      </div>
			   </div>
		   </form>
		   
		</div>
	</div>
	
</div>

<!-- 记录按钮的点击次数-开始 -->
<input type="hidden" name="sign_icon_count" id="sign_icon_count_id" value="" />
<!-- 记录按钮的点击次数-结束 -->

<script src="${pageContext.request.contextPath }/js/jQuery-2.1.4.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<!-- 时间控件 -->
<script src="${pageContext.request.contextPath }/js/jquery.inputmask.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.inputmask.date.extensions.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery.inputmask.extensions.js"></script>
<!-- 条目右侧三角形动态效果 -->
<script src="${pageContext.request.contextPath }/js/clinical/c_sharp_injury.js"></script>

</body>
</html>








