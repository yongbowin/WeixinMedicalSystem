<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<div class="row col-xs-12" style="margin: 0 auto;padding: 0;">
	<form class="form-horizontal" role="form">
	   <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="发生地点">
	    	</div>
	   </div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">体液类型</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-fluid-type blood-fluid-type-on">
						<input type="radio" name="blood_fluid_type" id="blood_fluid_type1" 
				        	value="1" class="radio-blood-fluid-type" checked>
			        </span>
			        <span class="common-select-distance">血液</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type2" 
				          value="2" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">痰液</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type3" 
				          value="3" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">尿液</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type4" 
				          value="4" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">羊水</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type5" 
				          value="5" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">脑脊液</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: -5px;">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type6" 
				          value="6" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">胸膜液</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: -6px;">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type7" 
				          value="7" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">腹膜液</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: -5px;">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type8" 
				          value="8" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">唾液</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-fluid-type">
				       <input type="radio" name="blood_fluid_type" id="blood_fluid_type9" 
				          value="9" class="radio-blood-fluid-type">
				    </span>
				    <span class="common-select-distance">呕吐物</span>
			    </label>
			</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他类型">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-top: 7px;margin-bottom: 7px;">
	       <div class="sharp-pollute-word">体液是否含有血液</div>
	       <div class="sharp-pollute-select" style="padding-left: 0;padding-right: 0;">
               <div class="blood-fluid-unknown">未知</div>
               <div class="blood-fluid-no">否</div>
               <div class="blood-fluid-yes">是</div>
	       </div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">暴露部位</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-expose-part blood-expose-part-on">
						<input type="radio" name="blood_expose_part" id="blood_expose_part1" 
				        	value="1" class="radio-blood-expose-part" checked>
			        </span>
			        <span class="common-select-distance">眼</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: 56px;">
			    	<span class="pay-list-blood-expose-part">
				       <input type="radio" name="blood_expose_part" id="blood_expose_part2" 
				          value="2" class="radio-blood-expose-part">
				    </span>
				    <span class="common-select-distance">口腔</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: 40px;">
			    	<span class="pay-list-blood-expose-part">
				       <input type="radio" name="blood_expose_part" id="blood_expose_part3" 
				          value="3" class="radio-blood-expose-part">
				    </span>
				    <span class="common-select-distance">鼻</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-part">
				       <input type="radio" name="blood_expose_part" id="blood_expose_part4" 
				          value="4" class="radio-blood-expose-part">
				    </span>
				    <span class="common-select-distance">无损的皮肤</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: -5px;">
			    	<span class="pay-list-blood-expose-part">
				       <input type="radio" name="blood_expose_part" id="blood_expose_part5" 
				          value="5" class="radio-blood-expose-part">
				    </span>
				    <span class="common-select-distance">受损的皮肤</span>
			    </label>
			</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他类型">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">血液或体液是否（选择所使用的项目）</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-body-status blood-body-status-on">
						<input type="radio" name="blood_body_status" id="blood_body_status1" 
				        	value="1" class="radio-blood-body-status" checked>
			        </span>
			        <span class="common-select-distance">接触未保护的皮肤</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-body-status">
				       <input type="radio" name="blood_body_status" id="blood_body_status2" 
				          value="2" class="radio-blood-body-status">
				    </span>
				    <span class="common-select-distance">接触防护衣内侧的皮肤</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-body-status">
				       <input type="radio" name="blood_body_status" id="blood_body_status3" 
				          value="3" class="radio-blood-body-status">
				    </span>
				    <span class="common-select-distance">渗透屏障或防护衣</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-body-status">
				       <input type="radio" name="blood_body_status" id="blood_body_status4" 
				          value="4" class="radio-blood-body-status">
				    </span>
				    <span class="common-select-distance">渗透衣物</span>
			    </label>
			</div>
	    </div>
	    
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">发生时是否穿戴防护用具（可多选）</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-protect-hidden blood-protect-hidden-on">
						<input type="radio" name="blood_protect_hidden" id="blood_protect_hidden1" 
				        	value="1" class="radio-blood-protect-hidden" checked>
			        </span>
			        <span class="common-select-distance">单层手套</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden2" 
				          value="2" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">双层手套</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden3" 
				          value="3" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">外科口罩</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-protect-hidden">
						<input type="radio" name="blood_protect_hidden" id="blood_protect_hidden4" 
				        	value="4" class="radio-blood-protect-hidden" checked>
			        </span>
			        <span class="common-select-distance">塑料围裙</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden5" 
				          value="5" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">外科手术服</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: -5px;">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden6" 
				          value="6" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">护面罩</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden7" 
				          value="7" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">无保护功能眼镜</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: 74px;">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden8" 
				          value="8" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">防护镜</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden9" 
				          value="9" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">无保护功能实验室工作服</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-protect-hidden">
				       <input type="radio" name="blood_protect_hidden" id="blood_protect_hidden10" 
				          value="10" class="radio-blood-protect-hidden">
				    </span>
				    <span class="common-select-distance">带侧面防护罩的眼镜</span>
			    </label>
			</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他类型">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">暴露的原因</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-expose-reason blood-expose-reason-on">
						<input type="radio" name="blood_expose_reason" id="blood_expose_reason1" 
				        	value="1" class="radio-blood-expose-reason" checked>
			        </span>
			        <span class="common-select-distance">直接接触病人</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-reason">
				       <input type="radio" name="blood_expose_reason" id="blood_expose_reason2" 
				          value="2" class="radio-blood-expose-reason">
				    </span>
				    <span class="common-select-distance">样品容器破裂</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-reason">
				       <input type="radio" name="blood_expose_reason" id="blood_expose_reason3" 
				          value="3" class="radio-blood-expose-reason">
				    </span>
				    <span class="common-select-distance">静脉管/袋/泵泄露</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-reason">
				       <input type="radio" name="blood_expose_reason" id="blood_expose_reason4" 
				          value="4" class="radio-blood-expose-reason">
				    </span>
				    <span class="common-select-distance">其他体液容器破裂、泄露</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-reason">
				       <input type="radio" name="blood_expose_reason" id="blood_expose_reason5" 
				          value="5" class="radio-blood-expose-reason">
				    </span>
				    <span class="common-select-distance">接触污染设备/表面</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-reason">
				       <input type="radio" name="blood_expose_reason" id="blood_expose_reason6" 
				          value="6" class="radio-blood-expose-reason">
				    </span>
				    <span class="common-select-distance">接触污染帘幕/床单/大褂</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-expose-reason">
				       <input type="radio" name="blood_expose_reason" id="blood_expose_reason7" 
				          value="7" class="radio-blood-expose-reason">
				    </span>
				    <span class="common-select-distance">鼻嗜管/通气管/其它导管滑出/泄露</span>
			    </label>
			</div>
	    </div>
	    
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他类型">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">与体液、血液接触的时间</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-body-time blood-body-time-on">
						<input type="radio" name="blood_body_time" id="blood_body_time1" 
				        	value="1" class="radio-blood-body-time" checked>
			        </span>
			        <span class="common-select-distance">&lt;5分钟</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="float: right;">
			    	<span class="pay-list-blood-body-time">
				       <input type="radio" name="blood_body_time" id="blood_body_time2" 
				          value="2" class="radio-blood-body-time">
				    </span>
				    <span class="common-select-distance">5~14分钟</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-blood-body-time">
				       <input type="radio" name="blood_body_time" id="blood_body_time3" 
				          value="3" class="radio-blood-body-time">
				    </span>
				    <span class="common-select-distance">15分钟~1小时</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="float: right;">
			    	<span class="pay-list-blood-body-time">
				       <input type="radio" name="blood_body_time" id="blood_body_time4" 
				          value="4" class="radio-blood-body-time">
				    </span>
				    <span class="common-select-distance">&nbsp;&nbsp;&nbsp;&nbsp;&gt;1小时</span>
			    </label>
			</div>
	    </div>
	    
	    <div class="form-group">
	    	<span class="control-label c_con_sen_title">与体液、血液接触的量</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-blood-body-amount blood-body-amount-on">
						<input type="radio" name="blood_body_amount" id="blood_body_amount" 
				        	value="1" class="radio-blood-body-amount" checked>
			        </span>
			        <span class="common-select-distance">&lt;5ml</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-body-amount">
				       <input type="radio" name="blood_body_amount" id="blood_body_amount" 
				          value="2" class="radio-blood-body-amount">
				    </span>
				    <span class="common-select-distance">不超过50ml</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-blood-body-amount">
				       <input type="radio" name="blood_body_amount" id="blood_body_amount" 
				          value="3" class="radio-blood-body-amount">
				    </span>
				    <span class="common-select-distance">&gt;50ml</span>
			    </label>
			</div>
	    </div>
	    
	    <div class="form-group">
	    	<div class="col-xs-9">
	    		<textarea class="form-control" rows="5" style="border-color: #9f9f9f;" placeholder="请输入内容"></textarea>
	    	</div>
	    </div>
	    
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="margin-bottom: 7px;">
	   		<span class="control-label c_con_sen_title">暴露部位</span>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="最大暴露部位">
	    	</div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="中级暴露部位">
	    	</div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="最小暴露部位">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="margin-top: 7px;">
	    	<div class="col-xs-12">
	    		<textarea class="form-control" rows="5" style="border-color: #9f9f9f;" placeholder="暴露过程描述（不少于20字）"></textarea>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="现场证明人：">
	    	</div>
	   </div>
	   
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="button" class="btn btn-success report-submit-btn" style="background: #80CEF5;border-color: #80CEF5;">结束，请提交</button>
	    	</div>
	    </div>
	    
	</form>
</div>
	
	
