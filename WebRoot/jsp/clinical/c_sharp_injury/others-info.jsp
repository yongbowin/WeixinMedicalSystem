<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<div class="row col-xs-12" style="margin: 0 auto;padding: 0;">
	<form class="form-horizontal" role="form">
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	       <div class="sharp-pregnant-word">女性员工是否处于妊娠期</div>
	       <div class="sharp-pregnant-select" style="padding-left: 0;padding-right: 0;">
	           <div class="sharp-pregnant-no">否</div>
	           <div class="sharp-pregnant-yes">是</div>
	       </div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	       <div class="sharp-use-hand-word">医护人员习惯用手</div>
	       <div class="sharp-use-hand-select" style="padding-left: 0;padding-right: 0;">
	           <div class="sharp-use-hand-no">否</div>
	           <div class="sharp-use-hand-yes">是</div>
	       </div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="margin-bottom: 7px;">
	    	<span class="control-label c_con_sen_title">损伤程度</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-injury-degree injury-degree-on">
						<input type="radio" name="injury_degree" id="injury_degree1" 
				        	value="1" class="radio-injury-degree" checked>
			        </span>
			       	<span class="common-select-distance">表面-少量出血或无出血</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-injury-degree">
				       <input type="radio" name="injury_degree" id="injury_degree2" 
				          value="2" class="radio-injury-degree">
				    </span>
				   	<span class="common-select-distance">中度皮肤刺穿有出血</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-injury-degree">
				       <input type="radio" name="injury_degree" id="injury_degree3" 
				          value="3" class="radio-injury-degree">
				   	</span>
				   	<span class="common-select-distance">严重的-深度刺入或切割，大量出血</span>
			    </label>
			</div>
	    </div>
	    
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="margin-bottom: 7px;">
	    	<span class="control-label c_con_sen_title">锐器伤后处理</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-sharp-injury sharp-injury-on">
						<input type="radio" name="sharp_injury" id="sharp_injury1" 
				        	value="1" class="radio-sharp-injury" checked>
				    </span>
				    <span class="common-select-distance">挤血</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-sharp-injury">
				       <input type="radio" name="sharp_injury" id="sharp_injury2" 
				          value="2" class="radio-sharp-injury">
				    </span>
				    <span class="common-select-distance">冲洗</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-sharp-injury">
				       	<input type="radio" name="sharp_injury" id="sharp_injury3" 
				          	value="3" class="radio-sharp-injury">
			        </span>
			        <span class="common-select-distance">消毒</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-sharp-injury">
				       <input type="radio" name="sharp_injury" id="sharp_injury4" 
				          value="4" class="radio-sharp-injury">
				    </span>
				    <span class="common-select-distance">病人抽血检查</span>
			    </label>
			</div>
	    </div>
	    
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="margin-bottom: 7px;">
	    	<span class="control-label c_con_sen_title">受伤次数</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
		    	<div class="col-xs-8" style="padding: 7px 0 0 0;">
		    		<label class="checkbox-inline">
		    			<span class="pay-list-injury-num injury-num-on">
							<input type="radio" name="injury_num" id="injury_num1" 
					        	value="1" class="radio-injury-num" checked>
				        </span>
				        <span class="common-select-distance">第一次</span>
				    </label>
				    <label class="checkbox-inline ck-padd-left">
				    	<span class="pay-list-injury-num">
					       <input type="radio" name="injury_num" id="injury_num2" 
					          value="2" class="radio-injury-num">
					    </span>
					    <span class="common-select-distance">受过伤</span>
				    </label>
				</div>
				<div class="col-xs-4" style="padding: 0;">
				    <label class="checkbox-inline" style="margin-top: 0;">
				       <input type="text" class="form-control injury-num-inp" style="border-color: #9f9f9f;" name="" placeholder="受伤次数">
				    </label>
				</div>
			</div>
	    </div>
	    
	   <!-- 实线 -->
	   <div class="solid-line" style="margin-bottom: 7px;"></div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="现场证明人：">
	    	</div>
	   </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="button" class="btn btn-success report-submit-btn" style="background: #60bf2f;border-color: #60bf2f;">结束，请提交</button>
	    	</div>
	    </div>
	    
	</form>
	
</div>

