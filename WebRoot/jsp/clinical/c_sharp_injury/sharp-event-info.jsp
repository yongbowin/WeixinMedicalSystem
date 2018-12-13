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
	   
	   <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control sharp-instrument-type" style="border-color: #9f9f9f;" placeholder="器械类型">
	    	</div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;">
    		<div class="col-xs-9">
    			<div class="form-control sharp-noodle">针头</div>
    			<div class="form-control sharp-glass">玻璃</div>
    			<div class="form-control sharp-surgical">外科器械</div>
    		</div>
    		<div class="col-xs-3" style="padding-left: 0;">
    			<div class="form-control sharp-other">其他</div>
    		</div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;">
	       <div class="sharp-use-word">您是否使用该器械（必填）</div>
	       <div class="sharp-use-select" style="padding-left: 0;padding-right: 0;">
	           <div class="sharp-use-no">否</div>
	           <div class="sharp-use-yes">是</div>
	       </div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;">
	       <div class="sharp-pollute-word">器械污染情况（必填）</div>
	       <div class="sharp-pollute-select" style="padding-left: 0;padding-right: 0;">
               <div class="sharp-pollute-no">未见</div>
               <div class="sharp-pollute-less">少</div>
               <div class="sharp-pollute-more">多</div>
	       </div>
	   </div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	       <div class="sharp-blood-word">器械是否被血液污染（必填）</div>
	       <div class="sharp-use-select" style="padding-left: 0;padding-right: 0;">
	           <div class="sharp-blood-no">否</div>
	           <div class="sharp-blood-yes">是</div>
	       </div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="padding-bottom: 0;margin-top: 7px;margin-bottom: 7px;">
	       <div class="sharp-glove-word">是否戴手套</div>
	       <div class="sharp-glove-select" style="padding-left: 0;padding-right: 0;">
               <div class="sharp-glove-single">单层手套</div>
               <div class="sharp-glove-double">双层手套</div>
               <div class="sharp-glove-no">未戴手套</div>
	       </div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group" style="padding-bottom: 0;">
	       <span class="control-label c_con_sen_title" style="padding-left: 15px;">暴露部位</span>
	       <div class="col-xs-12" style="padding: 0;">
		       <div class="sharp-hand-word">左手</div>
		       <div class="sharp-hand-select" style="padding-left: 0;padding-right: 0;">
	               <div class="sharp-thumb-finger-left">拇指</div>
	               <div class="sharp-index-finger-left">食指</div>
	               <div class="sharp-middle-finger-left">中指</div>
	               <div class="sharp-little-finger-left">小指</div>
	               <div class="sharp-ring-finger-left">无名指</div>
		       </div>
	       </div>
	       <div class="col-xs-12" style="padding: 0;">
		       <div class="sharp-hand-word">右手</div>
		       <div class="sharp-hand-select" style="padding-left: 0;padding-right: 0;">
	               <div class="sharp-thumb-finger-right">拇指</div>
	               <div class="sharp-index-finger-right">食指</div>
	               <div class="sharp-middle-finger-right">中指</div>
	               <div class="sharp-little-finger-right">小指</div>
	               <div class="sharp-ring-finger-right">无名指</div>
		       </div>
	       </div>
	   </div>
	    
	    <div class="form-group">
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-expose-parts expose-parts-on">
						<input type="radio" name="sharp_expose_parts" id="sharp_expose_parts1" 
				        	value="1" class="radio-expose-parts" checked>
				    </span>
				    <span class="common-select-distance">左手掌侧</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-parts">
				       <input type="radio" name="sharp_expose_parts" id="sharp_expose_parts2" 
				          value="2" class="radio-expose-parts">
				    </span>
				    <span class="common-select-distance">左手背侧</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-parts">
				       <input type="radio" name="sharp_expose_parts" id="sharp_expose_parts3" 
				          value="3" class="radio-expose-parts">
				    </span>
				    <span class="common-select-distance">右手掌侧</span>
			    </label>
		    </div>
		    <div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-expose-parts">
				       <input type="radio" name="sharp_expose_parts" id="sharp_expose_parts4" 
				          value="4" class="radio-expose-parts">
				    </span>
				    <span class="common-select-distance">右手背侧</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-parts">
				       <input type="radio" name="sharp_expose_parts" id="sharp_expose_parts5" 
				          value="5" class="radio-expose-parts">
				    </span>
				    <span class="common-select-distance">左足</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-parts">
				       <input type="radio" name="sharp_expose_parts" id="sharp_expose_parts6" 
				          value="6" class="radio-expose-parts">
				    </span>
				    <span class="common-select-distance">右足</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-parts">
				       <input type="radio" name="sharp_expose_parts" id="sharp_expose_parts7" 
				          value="7" class="radio-expose-parts">
				    </span>
				    <span class="common-select-distance">眼</span>
			    </label>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他部位">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">发生暴露时的操作</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-expose-operate expose-operate-on">
						<input type="radio" name="sharp_expose_operate" id="sharp_expose_operate1" 
				        	value="1" class="radio-expose-operate" checked>
			        </span>
			        <span class="common-select-distance">肌注注射</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate2" 
				          value="2" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">静注注射</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate3" 
				          value="3" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">肝素封管</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate4" 
				          value="4" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">盐水冲洗</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate5" 
				          value="5" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">采末梢血</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate6" 
				          value="6" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">连输液器</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline" style="width: 113px;float:left;">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate7" 
				          value="7" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">缝合/切割</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="float:left;padding-left: 7px;">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate8" 
				          value="8" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">获取病理标本</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-expose-operate">
				       <input type="radio" name="sharp_expose_operate" id="sharp_expose_operate9" 
				          value="9" class="radio-expose-operate">
				    </span>
				    <span class="common-select-distance">中心静脉置管</span>
			    </label>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;margin-bottom: 7px;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他情况">
	    	</div>
	   </div>
	   
	   <!-- 实线 -->
	   <div class="solid-line"></div>
	   
	   <div class="form-group">
	    	<span class="control-label c_con_sen_title">损伤发生于</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-injury-place injury-place-on">
						<input type="radio" name="sharp_injury_place" id="sharp_injury_place1" 
				        	value="1" class="radio-injury-place" checked>
				    </span>
				    <span class="common-select-distance">器械使用前中后</span>
			    </label>
			    <label class="checkbox-inline">
				    <span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place2" 
				          value="2" class="radio-injury-place">
				    </span>
				    <span class="common-select-distance">拆卸器械或设备</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline" style="float:left;">
			    	<span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place3" 
				          value="3" class="radio-injury-place">
				    </span>
				    <span class="common-select-distance">回帽</span>
			    </label>
			
			    <label class="checkbox-inline" style="margin-left: 60px;float:left;">
			       <span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place4" 
				          value="4" class="radio-injury-place">
				   </span>
				   <span class="common-select-distance">再次使用可复用器械</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline" style="float:left;">
			    	<span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place5" 
				          value="5" class="radio-injury-place">
				    </span>
				    <span class="common-select-distance">拔针头</span>
			    </label>
			    <label class="checkbox-inline" style="margin-left: 44px;float:left;">
			       <span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place6" 
				          value="6" class="radio-injury-place">
				   </span>
				   <span class="common-select-distance">锐器使用后处理前</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			       <span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place7" 
				          value="7" class="radio-injury-place">
				   </span>
				   <span class="common-select-distance">被锐器盒内的锐器刺伤</span>
			    </label>
			</div>
			<div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-injury-place">
				       <input type="radio" name="sharp_injury_place" id="sharp_injury_place8" 
				          value="8" class="radio-injury-place">
				    </span>
				    <span class="common-select-distance">获垃圾袋内的锐器刺伤</span>
			    </label>
			</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-9">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="其他情况">
	    	</div>
	   </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="submit" class="btn btn-success" style="background: #80CEF5;border-color: #80CEF5;">保存并继续填写</button>
	    	</div>
	    </div>
	    
	</form>
</div>
	
	
