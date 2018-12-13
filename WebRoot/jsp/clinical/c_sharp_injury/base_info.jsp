<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<div class="row col-xs-12" style="margin: 0 auto;padding: 0;">
	<form class="form-horizontal" role="form">
		<div class="form-group">
	    	<!-- <label class="col-xs-1 control-label"></label> -->
	    	<div class="c-con-sen-name">
	    		<input class="form-control" placeholder="请输入姓名" >
	    	</div>
	    	<div class="c-con-sen-sex">
	    		<!-- 将选中的性别信息放在隐藏域中 -->
	    		<input type="hidden" name="sex" value="">
	    		<div class="sex-male">男</div>
	    		<div class="sex-female">女</div>
	    	</div>
	    </div>
	
	    <div class="form-group">
	    	<div class="col-xs-6 pull-left" style="padding-right: 5px;">
	    		<select name="department" class="form-control">
	    			<option value="内科" selected="selected">内科</option>
	    			<option value="外科">外科</option>
	    			<option value="口腔科">口腔科</option>
	    			<option value="急诊科">急诊科</option>
	    		</select>
	    	</div>
	    	<div class="col-xs-6 pull-left" style="padding-left: 5px;">
	    		<select name="department_sub" class="form-control">
	    			<option value="神经内科一" selected="selected">神经内科一</option>
	    			<option value="神经内科二">神经内科二</option>
	    			<option value="神经内科三">神经内科三</option>
	    			<option value="神经内科四">神经内科四</option>
	    		</select>
	    	</div>
	    </div>
	    
	    <div class="form-group">
	    	<!-- <label class="col-xs-1 control-label"></label> -->
	    	<div class="col-xs-4 pull-left" style="padding-right: 5px;">
	    		<div class="input-group">
			       <span class="input-group-addon">年龄</span>
			       <input type="text" class="form-control">
			    </div>
	    	</div>
	    	<div class="col-xs-4 col-xs-offset-2 pull-left" style="padding-left: 5px;">
	    		<div class="input-group">
			       <span class="input-group-addon">工龄</span>
			       <input type="text" class="form-control">
			    </div>
	    	</div>
	    </div>
	    
	    <div class="solid-line"></div>
	    
	    <div class="form-group">
	    	<span class="control-label c_con_sen_title">职称（单选）</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-title-select base-title-select-on">
						<input type="radio" name="base_title_select" id="base_title_select1" 
				        	value="1" class="radio-base-title-select" checked>
				    </span>
				    <span class="common-select-distance">教授</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="width: 81px;">
			    	<span class="pay-list-title-select">
				       <input type="radio" name="base_title_select" id="base_title_select2" 
				          value="2" class="radio-base-title-select">
				    </span>
				    <span class="common-select-distance">副教授</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left" style="margin-left: 3px;padding-left: 0;">
			    	<span class="pay-list-title-select">
				       <input type="radio" name="base_title_select" id="base_title_select3" 
				          value="3" class="radio-base-title-select">
				    </span>
				    <span class="common-select-distance">中级</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-title-select">
				       <input type="radio" name="base_title_select" id="base_title_select4" 
				          value="4" class="radio-base-title-select">
				    </span>
				   <span class="common-select-distance">初级</span>
			    </label>
			</div>
		    <div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-title-select">
				       <input type="radio" name="base_title_select" id="base_title_select5" 
				          value="5" class="radio-base-title-select">
				    </span>
				    <span class="common-select-distance">进修</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-title-select">
				       <input type="radio" name="base_title_select" id="base_title_select6" 
				          value="6" class="radio-base-title-select">
				    </span>
				    <span class="common-select-distance">实习</span>
			    </label>
	    	</div>
	    </div>
	    
	    <div class="form-group">
	    	<!-- <label class="col-xs-1 control-label"></label> -->
	    	<div class="col-xs-10">
	    		<input class="form-control" placeholder="其他职称"></input>
	    	</div>
	    </div>
	    
	    <!-- 实线 -->
	    <div class="solid-line"></div>
	    
	    <div class="form-group">
	    	<span class="control-label c_con_sen_title">岗位（单选）</span>
	    	<div class="col-xs-12" style="padding-left: 0;">
	    		<label class="checkbox-inline">
	    			<span class="pay-list-position-select position-select-on">
						<input type="radio" name="base_position_select" id="base_position_select1" 
				        	value="1" class="radio-base-position-select" checked>
				   </span>     	
				   <span class="common-select-distance">医疗</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select2" 
				          value="2" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">护理</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select3" 
				          value="3" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">放射</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select4" 
				          value="4" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">检验</span>
			    </label>
			</div>
		    <div class="col-xs-12" style="padding-left: 0;">
			    <label class="checkbox-inline">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select5" 
				          value="5" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">病理</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select6" 
				          value="6" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">药剂</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select7" 
				          value="7" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">工勤</span>
			    </label>
			    <label class="checkbox-inline ck-padd-left">
			    	<span class="pay-list-position-select">
				       <input type="radio" name="base_position_select" id="base_position_select8" 
				          value="8" class="radio-base-position-select">
				    </span>      
				    <span class="common-select-distance">保洁</span>
			    </label>
	    	</div>
	    </div>
	    
	    <div class="form-group">
	    	<div class="col-xs-10">
	    		<input class="form-control" placeholder="其他岗位"></input>
	    	</div>
	    </div>
	    
	    <div class="form-group">
	    	<div class="col-xs-10">
	    		<input class="form-control" placeholder="联系电话"></input>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="submit" class="btn btn-success btn-color-self">保存并继续填写</button>
	    	</div>
	    </div>
	</form>
</div>
	
	
	
	
	
	
	
	
	