<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<div class="row col-xs-12" style="margin: 0 auto;padding: 0;">
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<div class="c-expo-title">
				<div class="expose-happen-word">暴露就发生在刚才（仅打钩即可）</div>
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
	    <div class="solid-line"></div>
	
	    <div class="form-group">
	    	<span class="control-label c_con_sen_title">暴露者传染病史</span>
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbsAg</div>
	    			<div class="common-little-title">乙肝表面抗原</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbsAg" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbsAg-unknown-result">未知</div>
	    			<div class="HbsAg-plus-result">阳性</div>
	    			<div class="HbsAg-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbsAb</div>
	    			<div class="common-little-title">乙肝表面抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbsAb" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbsAb-unknown-result">未知</div>
	    			<div class="HbsAb-plus-result">阳性</div>
	    			<div class="HbsAb-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbeAg</div>
	    			<div class="common-little-title">乙肝e抗原</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbeAg" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbeAg-unknown-result">未知</div>
	    			<div class="HbeAg-plus-result">阳性</div>
	    			<div class="HbeAg-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbeAb</div>
	    			<div class="common-little-title">乙肝e抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbeAb" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbeAb-unknown-result">未知</div>
	    			<div class="HbeAb-plus-result">阳性</div>
	    			<div class="HbeAb-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HBcAb</div>
	    			<div class="common-little-title">核心抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HBcAb" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HBcAb-unknown-result">未知</div>
	    			<div class="HBcAb-plus-result">阳性</div>
	    			<div class="HBcAb-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">Anti-HCV</div>
	    			<div class="common-little-title">丙肝抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right Anti-HCV" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="Anti-HCV-unknown-result">未知</div>
	    			<div class="Anti-HCV-plus-result">阳性</div>
	    			<div class="Anti-HCV-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">TPPA</div>
	    			<div class="common-little-title">梅毒螺旋体抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right TPPA" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="TPPA-unknown-result">未知</div>
	    			<div class="TPPA-plus-result">阳性</div>
	    			<div class="TPPA-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">Anti-HIV</div>
	    			<div class="common-little-title">艾滋病毒抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right Anti-HIV" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="Anti-HIV-unknown-result">未知</div>
	    			<div class="Anti-HIV-plus-result">阳性</div>
	    			<div class="Anti-HIV-reduce-result">阴性</div>
	    		</div>
	    	</div>
	    </div>
	    
	    <!-- 实线 -->
	    <div class="solid-line"></div>
	    
	    <div class="form-group">
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title" style="font-size: 1.1em;">曾经是否注射乙肝疫苗</div>
	    		</div>
	    		<div class="col-xs-10 pull-right bef-status" style="font-size: 1.1em;color: #9f9f9f;">
    				<input class="bef-status-unknown-result" style="font-size: 0.8em;" 
    					type="text" placeholder="注射次数" name="" >
	    			<div class="bef-status-plus-result">否</div>
	    			<div class="bef-status-reduce-result">是</div>
	    		</div>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="submit" class="btn btn-success" style="background: #f59b79;border-color: #f59b79;">保存并继续填写</button>
	    	</div>
	    </div>
	</form>
</div>
	
	
