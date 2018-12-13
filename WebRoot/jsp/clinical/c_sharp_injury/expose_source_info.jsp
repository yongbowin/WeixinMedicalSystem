<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<div class="row col-xs-12" style="margin: 0 auto;padding: 0;">
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<div class="c-expo-title">
				<span style="font-size: 1.1em;float: left;margin-right: 15px;">
					如暴露源病毒情况不详，请点击下方按钮，并在知晓后在职业暴露里补报。
				</span>
			</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;margin-top: 20px;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="button" class="btn btn-success" style="background: #f19d9b;border-color: #f19d9b;">情况不详，之后补报</button>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="c-con-sen-name">
	    		<input class="form-control bor-color-2" placeholder="请输入姓名" >
	    	</div>
	    	<div class="c-con-sen-sex">
	    		<!-- 将选中的性别信息放在隐藏域中 -->
	    		<input type="hidden" name="sex-1" value="">
	    		<div class="sex-male-1">男</div>
	    		<div class="sex-female-1">女</div>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="c-con-sen-name">
	    		<input class="form-control bor-color-2" placeholder="住院号（请输入以供备查）" >
	    	</div>
	    	<div class="c-con-sen-sex" style="color: #9f9f9f;width: 23%;margin-left: 8px;">
	    		<div class="input-group">
			       <span class="input-group-addon" style="color: #9f9f9f;padding: 3px;">年龄</span>
			       <input type="text" class="form-control" style="border-color: #9f9f9f;">
			    </div>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-12">
	    		<input type="text" class="form-control" style="border-color: #9f9f9f;" placeholder="联系电话">
	    	</div>
	    </div>
	    
	    <!-- 实线 -->
	    <div class="solid-line"></div>
	    
	    <div class="form-group">
	    	<span class="control-label c_con_sen_title">血清学检查情况（仅填写已查项目）</span>
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">Anti-HIV</div>
	    			<div class="common-little-title">艾滋病毒抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right Anti-HIV-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="Anti-HIV-res-plus-result">阳性</div>
	    			<div class="Anti-HIV-res-reduce-result">阴性</div>
	    			<div class="Anti-HIV-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbsAg</div>
	    			<div class="common-little-title">乙肝表面抗原</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbsAg-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbsAg-res-plus-result">阳性</div>
	    			<div class="HbsAg-res-reduce-result">阴性</div>
	    			<div class="HbsAg-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbsAb</div>
	    			<div class="common-little-title">乙肝表面抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbsAb-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbsAb-res-plus-result">阳性</div>
	    			<div class="HbsAb-res-reduce-result">阴性</div>
	    			<div class="HbsAb-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbeAg</div>
	    			<div class="common-little-title">乙肝e抗原</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbeAg-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbeAg-res-plus-result">阳性</div>
	    			<div class="HbeAg-res-reduce-result">阴性</div>
	    			<div class="HbeAg-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbeAb</div>
	    			<div class="common-little-title">乙肝e抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbeAb-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbeAb-res-plus-result">阳性</div>
	    			<div class="HbeAb-res-reduce-result">阴性</div>
	    			<div class="HbeAb-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">HbcAb</div>
	    			<div class="common-little-title">乙肝核心抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right HbcAb-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="HbcAb-res-plus-result">阳性</div>
	    			<div class="HbcAb-res-reduce-result">阴性</div>
	    			<div class="HbcAb-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">Anti-HCV</div>
	    			<div class="common-little-title">丙肝抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right Anti-HCV-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="Anti-HCV-res-plus-result">阳性</div>
	    			<div class="Anti-HCV-res-reduce-result">阴性</div>
	    			<div class="Anti-HCV-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">TPPA</div>
	    			<div class="common-little-title">梅毒螺旋体抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right TPPA-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="TPPA-res-plus-result">阳性</div>
	    			<div class="TPPA-res-reduce-result">阴性</div>
	    			<div class="TPPA-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<div class="common-big-title">RPR</div>
	    			<div class="common-little-title">类脂质抗体</div>
	    		</div>
	    		<div class="col-xs-10 pull-right RPR-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="RPR-res-plus-result">阳性</div>
	    			<div class="RPR-res-reduce-result">阴性</div>
	    			<div class="RPR-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    	
	    	<div class="col-xs-12">
	    		<div class="col-xs-2 pull-left common-title">
	    			<input name="" type="text" class="form-control other-res-inp" placeholder="其他" >
	    		</div>
	    		<div class="col-xs-10 pull-right other-res" style="font-size: 1.1em;color: #9f9f9f;">
	    			<div class="other-res-plus-result">阳性</div>
	    			<div class="other-res-reduce-result">阴性</div>
	    			<div class="other-res-unknown-result">
	    				<input type="text" name="time" value="" class="form-control date-contr-inp" 
	    					 data-inputmask="'alias': 'yyyy.mm.dd'" 
	    					 placeholder="   检查时间" data-mask>
	    			</div>
	    		</div>
	    	</div>
	    </div>
	    
	    <div class="form-group" style="padding-bottom: 0;">
	    	<div class="col-xs-6 col-xs-offset-3" style="padding-bottom: 0;">
	    		<button type="submit" class="btn btn-success" style="background: #f19d9b;border-color: #f19d9b;">保存并继续填写</button>
	    	</div>
	    </div>
	    
	</form>
</div>
	
	
