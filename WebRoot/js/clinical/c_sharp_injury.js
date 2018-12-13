$(function () { 
	/* 基本信息-页面 */
	/* 性别选项 */
	$(".sex-male").click(function(){
		$(".sex-female").css("border-color", "#9F9F9F");
		$(".sex-female").css("background", "#fff");
		$(".sex-female").css("color", "#9F9F9F");
		
		$(".sex-male").css("border-color", "#60BF2F");
		$(".sex-male").css("background", "#60BF2F");
		$(".sex-male").css("color", "#fff");
	});
	$(".sex-female").click(function(){
		$(".sex-male").css("border-color", "#9F9F9F");
		$(".sex-male").css("background", "#fff");
		$(".sex-male").css("color", "#9F9F9F");
		
		$(".sex-female").css("border-color", "#60BF2F");
		$(".sex-female").css("background", "#60BF2F");
		$(".sex-female").css("color", "#fff");
	});
	/* 暴露源情况-页面 */
	/* 性别选项 */
	$(".sex-male-1").click(function(){
		$(".sex-female-1").css("border-color", "#9F9F9F");
		$(".sex-female-1").css("background", "#fff");
		$(".sex-female-1").css("color", "#9F9F9F");
		
		$(".sex-male-1").css("border-color", "#f19d9b");
		$(".sex-male-1").css("background", "#f19d9b");
		$(".sex-male-1").css("color", "#fff");
	});
	$(".sex-female-1").click(function(){
		$(".sex-male-1").css("border-color", "#9F9F9F");
		$(".sex-male-1").css("background", "#fff");
		$(".sex-male-1").css("color", "#9F9F9F");
		
		$(".sex-female-1").css("border-color", "#f19d9b");
		$(".sex-female-1").css("background", "#f19d9b");
		$(".sex-female-1").css("color", "#fff");
	});
	
    //时间选择
    $("[data-mask]").inputmask();
	
	/*基本信息-开始*/
	/* 当页面刚载入时，将第一条置为倒三角形，其他的置为正三角形 */
	$(".panel-base-info-2-1-sub").addClass("panel-base-info-2-1-sub-up");
	$(".panel-self-base-info-2-1-sub").addClass("panel-self-base-info-2-1-sub-down");
	$(".panel-expose-source-info-2-1-sub").addClass("panel-expose-source-info-2-1-sub-down");
	$(".panel-sharp-event-info-2-1-sub").addClass("panel-sharp-event-info-2-1-sub-down");
	$(".panel-others-info-2-1-sub").addClass("panel-others-info-2-1-sub-down");
	
	/* 基本信息-当显示时 */
    $('#collapseOne').on('show.bs.collapse', function () {
    	$(".panel-base-info-2-1-sub").removeClass("panel-base-info-2-1-sub-up");
    	$(".panel-base-info-2-1-sub").removeClass("panel-base-info-2-1-sub-down");
    	
		//当点击时将倒三角形转换为正三角形
    	$(".panel-base-info-2-1-sub").addClass("panel-base-info-2-1-sub-up");
	})
    /* 基本信息-当关闭显示时 */
    $('#collapseOne').on('hide.bs.collapse', function () {
    	$(".panel-base-info-2-1-sub").removeClass("panel-base-info-2-1-sub-up");
    	$(".panel-base-info-2-1-sub").removeClass("panel-base-info-2-1-sub-down");
    	
    	//当点击时将正三角形转换为倒三角形
    	$(".panel-base-info-2-1-sub").addClass("panel-base-info-2-1-sub-down");
	})
	
	/* 本底信息-当显示时 */
	$('#collapseTwo').on('show.bs.collapse', function () {
		$(".panel-self-base-info-2-1-sub").removeClass("panel-self-base-info-2-1-sub-up");
		$(".panel-self-base-info-2-1-sub").removeClass("panel-self-base-info-2-1-sub-down");
		
		//当点击时将倒三角形转换为正三角形
		$(".panel-self-base-info-2-1-sub").addClass("panel-self-base-info-2-1-sub-up");
	})
	/* 本底信息-当关闭显示时 */
	$('#collapseTwo').on('hide.bs.collapse', function () {
		$(".panel-self-base-info-2-1-sub").removeClass("panel-self-base-info-2-1-sub-up");
		$(".panel-self-base-info-2-1-sub").removeClass("panel-self-base-info-2-1-sub-down");
		
		//当点击时将正三角形转换为倒三角形
		$(".panel-self-base-info-2-1-sub").addClass("panel-self-base-info-2-1-sub-down");
	})
	
	/* 暴露源情况-当显示时 */
	$('#collapseThree').on('show.bs.collapse', function () {
		$(".panel-expose-source-info-2-1-sub").removeClass("panel-expose-source-info-2-1-sub-up");
		$(".panel-expose-source-info-2-1-sub").removeClass("panel-expose-source-info-2-1-sub-down");
		
		//当点击时将倒三角形转换为正三角形
		$(".panel-expose-source-info-2-1-sub").addClass("panel-expose-source-info-2-1-sub-up");
	})
	/* 暴露源情况-当关闭显示时 */
	$('#collapseThree').on('hide.bs.collapse', function () {
		$(".panel-expose-source-info-2-1-sub").removeClass("panel-expose-source-info-2-1-sub-up");
		$(".panel-expose-source-info-2-1-sub").removeClass("panel-expose-source-info-2-1-sub-down");
		
		//当点击时将正三角形转换为倒三角形
		$(".panel-expose-source-info-2-1-sub").addClass("panel-expose-source-info-2-1-sub-down");
	})
	
	/* 锐器伤事件描述-当显示时 */
	$('#collapseFour').on('show.bs.collapse', function () {
		$(".panel-sharp-event-info-2-1-sub").removeClass("panel-sharp-event-info-2-1-sub-up");
		$(".panel-sharp-event-info-2-1-sub").removeClass("panel-sharp-event-info-2-1-sub-down");
		
		//当点击时将倒三角形转换为正三角形
		$(".panel-sharp-event-info-2-1-sub").addClass("panel-sharp-event-info-2-1-sub-up");
	})
	/* 锐器伤事件描述-当关闭显示时 */
	$('#collapseFour').on('hide.bs.collapse', function () {
		$(".panel-sharp-event-info-2-1-sub").removeClass("panel-sharp-event-info-2-1-sub-up");
		$(".panel-sharp-event-info-2-1-sub").removeClass("panel-sharp-event-info-2-1-sub-down");
		
		//当点击时将正三角形转换为倒三角形
		$(".panel-sharp-event-info-2-1-sub").addClass("panel-sharp-event-info-2-1-sub-down");
	})
	
	/* 其他-当显示时 */
	$('#collapseFive').on('show.bs.collapse', function () {
		$(".panel-others-info-2-1-sub").removeClass("panel-others-info-2-1-sub-up");
		$(".panel-others-info-2-1-sub").removeClass("panel-others-info-2-1-sub-down");
		
		//当点击时将倒三角形转换为正三角形
		$(".panel-others-info-2-1-sub").addClass("panel-others-info-2-1-sub-up");
	})
	/* 其他-当关闭显示时 */
	$('#collapseFive').on('hide.bs.collapse', function () {
		$(".panel-others-info-2-1-sub").removeClass("panel-others-info-2-1-sub-up");
		$(".panel-others-info-2-1-sub").removeClass("panel-others-info-2-1-sub-down");
		
		//当点击时将正三角形转换为倒三角形
		$(".panel-others-info-2-1-sub").addClass("panel-others-info-2-1-sub-down");
	})
	/*基本信息-结束*/
	
	/*本底信息-开始*/
	/*<div class="HbsAg-unknown-result">未知</div>
	<div class="HbsAg-plus-result">阳性</div>
	<div class="HbsAg-reduce-result">阴性</div>*/
	/*定义公共函数*/
	var expose_history = function(arg1, arg2, arg3){
    	$(arg1).css("background", "#fff");
		$(arg1).css("border-color", "#9F9F9F");
		$(arg1).css("color", "#9F9F9F");
		$(arg2).css("background", "#fff");
		$(arg2).css("border-color", "#9F9F9F");
		$(arg2).css("color", "#9F9F9F");
		
		$(arg3).css("background", "#f59b79");
		$(arg3).css("border-color", "#f59b79");
		$(arg3).css("color", "#fff");
    }
	/*乙肝表面抗原*/
	$(".HbsAg-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".HbsAg-plus-result";
		var var2 = ".HbsAg-reduce-result";
		var var3 = ".HbsAg-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbsAg-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".HbsAg-unknown-result";
		var var2 = ".HbsAg-reduce-result";
		var var3 = ".HbsAg-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbsAg-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".HbsAg-plus-result";
		var var2 = ".HbsAg-unknown-result";
		var var3 = ".HbsAg-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*乙肝表面抗体*/
	$(".HbsAb-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".HbsAb-plus-result";
		var var2 = ".HbsAb-reduce-result";
		var var3 = ".HbsAb-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbsAb-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".HbsAb-unknown-result";
		var var2 = ".HbsAb-reduce-result";
		var var3 = ".HbsAb-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbsAb-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".HbsAb-plus-result";
		var var2 = ".HbsAb-unknown-result";
		var var3 = ".HbsAb-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*乙肝e抗原*/
	$(".HbeAg-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".HbeAg-plus-result";
		var var2 = ".HbeAg-reduce-result";
		var var3 = ".HbeAg-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbeAg-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".HbeAg-unknown-result";
		var var2 = ".HbeAg-reduce-result";
		var var3 = ".HbeAg-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbeAg-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".HbeAg-plus-result";
		var var2 = ".HbeAg-unknown-result";
		var var3 = ".HbeAg-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*乙肝e抗体*/
	$(".HbeAb-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".HbeAb-plus-result";
		var var2 = ".HbeAb-reduce-result";
		var var3 = ".HbeAb-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbeAb-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".HbeAb-unknown-result";
		var var2 = ".HbeAb-reduce-result";
		var var3 = ".HbeAb-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HbeAb-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".HbeAb-plus-result";
		var var2 = ".HbeAb-unknown-result";
		var var3 = ".HbeAb-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*核心抗体*/
	$(".HBcAb-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".HBcAb-plus-result";
		var var2 = ".HBcAb-reduce-result";
		var var3 = ".HBcAb-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HBcAb-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".HBcAb-unknown-result";
		var var2 = ".HBcAb-reduce-result";
		var var3 = ".HBcAb-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".HBcAb-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".HBcAb-plus-result";
		var var2 = ".HBcAb-unknown-result";
		var var3 = ".HBcAb-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*丙肝抗体*/
	$(".Anti-HCV-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".Anti-HCV-plus-result";
		var var2 = ".Anti-HCV-reduce-result";
		var var3 = ".Anti-HCV-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".Anti-HCV-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".Anti-HCV-unknown-result";
		var var2 = ".Anti-HCV-reduce-result";
		var var3 = ".Anti-HCV-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".Anti-HCV-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".Anti-HCV-plus-result";
		var var2 = ".Anti-HCV-unknown-result";
		var var3 = ".Anti-HCV-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*梅毒螺旋体抗体*/
	$(".TPPA-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".TPPA-plus-result";
		var var2 = ".TPPA-reduce-result";
		var var3 = ".TPPA-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".TPPA-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".TPPA-unknown-result";
		var var2 = ".TPPA-reduce-result";
		var var3 = ".TPPA-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".TPPA-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".TPPA-plus-result";
		var var2 = ".TPPA-unknown-result";
		var var3 = ".TPPA-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*艾滋病毒抗体*/
	$(".Anti-HIV-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".Anti-HIV-plus-result";
		var var2 = ".Anti-HIV-reduce-result";
		var var3 = ".Anti-HIV-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".Anti-HIV-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".Anti-HIV-unknown-result";
		var var2 = ".Anti-HIV-reduce-result";
		var var3 = ".Anti-HIV-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".Anti-HIV-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".Anti-HIV-plus-result";
		var var2 = ".Anti-HIV-unknown-result";
		var var3 = ".Anti-HIV-reduce-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	
	/*注射次数*/
	$(".bef-status-plus-result").click(function(){
		// 点击 否，禁用输入次数框
		$(".bef-status-reduce-result").css("background", "#fff");
		$(".bef-status-reduce-result").css("border-color", "#9F9F9F");
		$(".bef-status-reduce-result").css("color", "#9F9F9F");
		
		$(".bef-status-unknown-result").css("border-color", "#9F9F9F");
		$(".bef-status-unknown-result").css("background", "#fff");
		
		$(".bef-status-plus-result").css("background", "#f59b79");
		$(".bef-status-plus-result").css("border-color", "#f59b79");
		$(".bef-status-plus-result").css("color", "#fff");
		
		// 禁用次数输入框
		$(".bef-status-unknown-result").attr("disabled", true);
		$(".bef-status-unknown-result").css("background", "#fff");
	});
	$(".bef-status-reduce-result").click(function(){
		// 点击 是，开启输入次数框
		$(".bef-status-plus-result").css("background", "#fff");
		$(".bef-status-plus-result").css("border-color", "#9F9F9F");
		$(".bef-status-plus-result").css("color", "#9F9F9F");
		
		$(".bef-status-unknown-result").css("border-color", "#f59b79");
		$(".bef-status-unknown-result").css("background", "#fff");
		
		$(".bef-status-reduce-result").css("background", "#f59b79");
		$(".bef-status-reduce-result").css("border-color", "#f59b79");
		$(".bef-status-reduce-result").css("color", "#fff");
		
		// 启用次数输入框
		$(".bef-status-unknown-result").attr("disabled", false);
		$(".bef-status-unknown-result").css("background", "#fff");
		// 输入框获取焦点
		$(".bef-status-unknown-result").focus();
	});
	
	/* 当输入次数框获取焦点的时候 */
	$(".bef-status-unknown-result").focus(function(){
		$(".bef-status-plus-result").css("background", "#fff");
		$(".bef-status-plus-result").css("border-color", "#9F9F9F");
		$(".bef-status-plus-result").css("color", "#9F9F9F");
		
		$(".bef-status-unknown-result").css("border-color", "#f59b79");
		$(".bef-status-unknown-result").css("background", "#fff");
		
		$(".bef-status-reduce-result").css("background", "#f59b79");
		$(".bef-status-reduce-result").css("border-color", "#f59b79");
		$(".bef-status-reduce-result").css("color", "#fff");
		
		// 启用次数输入框
		$(".bef-status-unknown-result").attr("disabled", false);
		$(".bef-status-unknown-result").css("background", "#fff");
	});
	/*输入框数字验证*/
	$(".bef-status-unknown-result").keyup(function(){ 
		//keyup事件处理 
		$(this).val($(this).val().replace(/\D|^0/g,''));
	}).bind("paste",function(){ 
		//CTR+V事件处理 
		$(this).val($(this).val().replace(/\D|^0/g,''));
	}).css("ime-mode", "disabled"); //CSS设置输入法不可用 
	/*本底信息-结束*/
	
	/*--------------------------------------------------------------*/
	
	/*暴露源情况-开始*/
	/*<div class="Anti-HIV-res-plus-result">阳性</div>
		<div class="Anti-HIV-res-reduce-result">阴性</div>
		<div class="Anti-HIV-res-unknown-result">*/
	/*启用时间控件*/
	$(".Anti-HIV-res-unknown-result").children("input").attr("disabled", true);
	$(".Anti-HIV-res-unknown-result").children("input").css("background", "#fff");
	$(".HbsAg-res-unknown-result").children("input").attr("disabled", true);
	$(".HbsAg-res-unknown-result").children("input").css("background", "#fff");
	$(".HbsAb-res-unknown-result").children("input").attr("disabled", true);
	$(".HbsAb-res-unknown-result").children("input").css("background", "#fff");
	$(".HbeAg-res-unknown-result").children("input").attr("disabled", true);
	$(".HbeAg-res-unknown-result").children("input").css("background", "#fff");
	$(".HbeAb-res-unknown-result").children("input").attr("disabled", true);
	$(".HbeAb-res-unknown-result").children("input").css("background", "#fff");
	$(".HbcAb-res-unknown-result").children("input").attr("disabled", true);
	$(".HbcAb-res-unknown-result").children("input").css("background", "#fff");
	$(".Anti-HCV-res-unknown-result").children("input").attr("disabled", true);
	$(".Anti-HCV-res-unknown-result").children("input").css("background", "#fff");
	$(".TPPA-res-unknown-result").children("input").attr("disabled", true);
	$(".TPPA-res-unknown-result").children("input").css("background", "#fff");
	$(".RPR-res-unknown-result").children("input").attr("disabled", true);
	$(".RPR-res-unknown-result").children("input").css("background", "#fff");
	$(".other-res-unknown-result").children("input").attr("disabled", true);
	$(".other-res-unknown-result").children("input").css("background", "#fff");
	
	/*定义公共函数1*/
	var expose_situation_1 = function(arg1, arg2){
		// 变为灰色
		$(arg1).css("background", "#fff");
		$(arg1).css("border-color", "#9F9F9F");
		$(arg1).css("color", "#9F9F9F");
		
		// 禁用时间控件
		$(arg2).children("input").attr("disabled", true);
    }
	/*定义公共函数2*/
	var expose_situation_2 = function(arg1, arg2, arg3){
		// 当该控件为 灰色 的时候
		// 变为彩色
		$(arg1).css("background", "#f19d9b");
		$(arg1).css("border-color", "#f19d9b");
		$(arg1).css("color", "#fff");
		
		// 变为灰色
		$(arg2).css("background", "#fff");
		$(arg2).css("border-color", "#9F9F9F");
		$(arg2).css("color", "#9F9F9F");
		
		// 启用时间控件
		$(arg3).children("input").attr("disabled", false);
		$(arg3).children("input").focus();
		// 变为彩色
		$(arg3).children("input").css("background", "#fff");
		$(arg3).children("input").css("border-color", "#9F9F9F");
		$(arg3).children("input").css("color", "#f19d9b");
	}
	
	/*艾滋病毒抗体*/
	$(".Anti-HIV-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".Anti-HIV-res-plus-result";
		var args2 = ".Anti-HIV-res-reduce-result";
		var args3 = ".Anti-HIV-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	
	/*颜色代码与rgb值得对应关系为：
	 * #f19d9b == rgb(241, 157, 155)
	 * #fff == rgb(255, 255, 255)*/
	$(".Anti-HIV-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".Anti-HIV-res-plus-result";
		var args2 = ".Anti-HIV-res-reduce-result";
		var args3 = ".Anti-HIV-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*乙肝表面抗原*/
	$(".HbsAg-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".HbsAg-res-plus-result";
		var args2 = ".HbsAg-res-reduce-result";
		var args3 = ".HbsAg-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".HbsAg-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".HbsAg-res-plus-result";
		var args2 = ".HbsAg-res-reduce-result";
		var args3 = ".HbsAg-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*乙肝表面抗体*/
	$(".HbsAb-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".HbsAb-res-plus-result";
		var args2 = ".HbsAb-res-reduce-result";
		var args3 = ".HbsAb-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".HbsAb-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".HbsAb-res-plus-result";
		var args2 = ".HbsAb-res-reduce-result";
		var args3 = ".HbsAb-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*乙肝e抗原*/
	$(".HbeAg-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".HbeAg-res-plus-result";
		var args2 = ".HbeAg-res-reduce-result";
		var args3 = ".HbeAg-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".HbeAg-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".HbeAg-res-plus-result";
		var args2 = ".HbeAg-res-reduce-result";
		var args3 = ".HbeAg-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*乙肝e抗体*/
	$(".HbeAb-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".HbeAb-res-plus-result";
		var args2 = ".HbeAb-res-reduce-result";
		var args3 = ".HbeAb-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".HbeAb-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".HbeAb-res-plus-result";
		var args2 = ".HbeAb-res-reduce-result";
		var args3 = ".HbeAb-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*核心抗体*/
	$(".HbcAb-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".HbcAb-res-plus-result";
		var args2 = ".HbcAb-res-reduce-result";
		var args3 = ".HbcAb-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".HbcAb-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".HbcAb-res-plus-result";
		var args2 = ".HbcAb-res-reduce-result";
		var args3 = ".HbcAb-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*丙肝抗体*/
	$(".Anti-HCV-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".Anti-HCV-res-plus-result";
		var args2 = ".Anti-HCV-res-reduce-result";
		var args3 = ".Anti-HCV-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".Anti-HCV-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".Anti-HCV-res-plus-result";
		var args2 = ".Anti-HCV-res-reduce-result";
		var args3 = ".Anti-HCV-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*梅毒螺旋体抗体*/
	$(".TPPA-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".TPPA-res-plus-result";
		var args2 = ".TPPA-res-reduce-result";
		var args3 = ".TPPA-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".TPPA-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".TPPA-res-plus-result";
		var args2 = ".TPPA-res-reduce-result";
		var args3 = ".TPPA-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*类脂质抗体*/
	$(".RPR-res-plus-result").click(function(){
		// 定义变量
		var args1 = ".RPR-res-plus-result";
		var args2 = ".RPR-res-reduce-result";
		var args3 = ".RPR-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阳性为彩色！");
			// 调用函数
			expose_situation_1(args1, args3);
		} else {
			//调用函数
			expose_situation_2(args1, args2, args3);
		}
	});
	$(".RPR-res-reduce-result").click(function(){
		// 定义变量
		var args1 = ".RPR-res-plus-result";
		var args2 = ".RPR-res-reduce-result";
		var args3 = ".RPR-res-unknown-result";
		// 当该控件为 彩色 的时候
		if($(this).css("background-color") == 'rgb(241, 157, 155)'){
			//alert("此时，阴性为彩色！");
			// 调用函数
			expose_situation_1(args2, args3);
		} else {
			//调用函数
			expose_situation_2(args2, args1, args3);
		}
	});
	
	/*其他*/
	/*<div class="other-res-plus-result">阳性</div>
	<div class="other-res-reduce-result">阴性</div>
	<div class="other-res-unknown-result">*/
	$(".other-res-plus-result").attr("disabled", true);
	$(".other-res-reduce-result").attr("disabled", true);
	$(".other-res-unknown-result").attr("disabled", true);
	
	$(".other-res-plus-result").click(function(){
		// 判断 其他 输入框手否为空，不为空时，开启 阴性/阳性 的启用选项
		if($(".other-res-inp").val() != '' && $(".other-res-inp").val() != null){
			$(".other-res-plus-result").attr("disabled", false);
			$(".other-res-reduce-result").attr("disabled", false);
			
			// 定义变量
			var args1 = ".other-res-plus-result";
			var args2 = ".other-res-reduce-result";
			var args3 = ".other-res-unknown-result";
			// 当该控件为 彩色 的时候
			if($(".other-res-plus-result").css("background-color") == 'rgb(241, 157, 155)'){
				//alert("此时，阳性为彩色！");
				// 调用函数
				expose_situation_1(args1, args3);
			} else {
				//调用函数
				expose_situation_2(args1, args2, args3);
			}
		} else {
			$(".other-res-plus-result").attr("disabled", true);
			$(".other-res-reduce-result").attr("disabled", true);
			$(".other-res-unknown-result").attr("disabled", true);
		}
	});
	$(".other-res-reduce-result").click(function(){
		// 判断 其他 输入框手否为空，不为空时，开启 阴性/阳性 的启用选项
		if($(".other-res-inp").val() != '' && $(".other-res-inp").val() != null){
			$(".other-res-plus-result").attr("disabled", false);
			$(".other-res-reduce-result").attr("disabled", false);
			
			// 定义变量
			var args1 = ".other-res-plus-result";
			var args2 = ".other-res-reduce-result";
			var args3 = ".other-res-unknown-result";
			// 当该控件为 彩色 的时候
			if($(".other-res-reduce-result").css("background-color") == 'rgb(241, 157, 155)'){
				//alert("此时，阴性为彩色！");
				// 调用函数
				expose_situation_1(args2, args3);
			} else {
				//调用函数
				expose_situation_2(args2, args1, args3);
			}
			
		} else {
			$(".other-res-plus-result").attr("disabled", true);
			$(".other-res-reduce-result").attr("disabled", true);
			$(".other-res-unknown-result").attr("disabled", true);
		}
	});
	/*暴露源情况-结束*/
	
	/*锐器伤事件描述-开始*/
	
	
	
	/*锐器伤事件描述-结束*/
	/*其他-开始*/
	
	
	
	
	/*其他-结束*/
	
	/*定义-按钮选项-公共函数-绿色*/
	var common_select_green = function(args1, args2){
		$(args2).css("border-color", "#9F9F9F");
		$(args2).css("background", "#fff");
		$(args2).css("color", "#9F9F9F");
		
		// 变绿色
		$(args1).css("border-color", "#60bf2f");
		$(args1).css("background", "#60bf2f");
		$(args1).css("color", "#fff");
	}
	/*radio选择框js效果-开始*/
	/*others-info.jsp页面-开始*/
	$(".injury-num-inp").attr("disabled", true);
	$(".pay-list-injury-num").on("click",function(){
		//alert($(this).next().html());
		$(this).addClass("injury-num-on").parent().siblings()
			.children(".pay-list-injury-num").removeClass("injury-num-on");
		
		$(".injury-num-inp").attr("disabled", true);
		if($(this).siblings().html() == '受过伤'){
			//alert("受过伤");
			$(".injury-num-inp").attr("disabled", false);
			$(".injury-num-inp").focus();
		}
	})
	$(".pay-list-sharp-injury").on("click",function(){
		$(this).addClass("sharp-injury-on").parent().siblings()
			.children(".pay-list-sharp-injury")
			.removeClass("sharp-injury-on");
		// 将其他行的radio也包含在内
		$(this).addClass("sharp-injury-on").parent().parent().siblings()
			.children(".checkbox-inline")
			.children(".pay-list-sharp-injury")
			.removeClass("sharp-injury-on");
	})
	$(".pay-list-injury-degree").on("click",function(){
		// 将其他行的radio也包含在内
		$(this).addClass("injury-degree-on").parent().parent().siblings()
		.children(".checkbox-inline")
		.children(".pay-list-injury-degree")
		.removeClass("injury-degree-on");
	})
	
	/* 是否妊娠期-选项 */
	$(".sharp-pregnant-yes").click(function(){
		// 定义变量
		var arg1 = ".sharp-pregnant-yes";
		var arg2 = ".sharp-pregnant-no";
		// 调用函数
		common_select_green(arg1, arg2);
	});
	$(".sharp-pregnant-no").click(function(){
		// 定义变量
		var arg1 = ".sharp-pregnant-yes";
		var arg2 = ".sharp-pregnant-no";
		// 调用函数
		common_select_green(arg2, arg1);
	});
	/* 习惯用手-选项 */
	$(".sharp-use-hand-yes").click(function(){
		// 定义变量
		var arg1 = ".sharp-use-hand-yes";
		var arg2 = ".sharp-use-hand-no";
		// 调用函数
		common_select_green(arg1, arg2);
	});
	$(".sharp-use-hand-no").click(function(){
		// 定义变量
		var arg1 = ".sharp-use-hand-yes";
		var arg2 = ".sharp-use-hand-no";
		// 调用函数
		common_select_green(arg2, arg1);
	});
	/*others-info.jsp页面-结束*/
	/*sharp-event-info.jsp页面-开始*/
	/*定义-按钮选项-公共函数-蓝色1*/
	var common_select_blue_1 = function(args1, args2, args3, args4){
		$(args2).css("border-color", "#9F9F9F");
		$(args2).css("background", "#fff");
		$(args2).css("color", "#9F9F9F");
		$(args3).css("border-color", "#9F9F9F");
		$(args3).css("background", "#fff");
		$(args3).css("color", "#9F9F9F");
		$(args4).css("border-color", "#9F9F9F");
		$(args4).css("background", "#fff");
		$(args4).css("color", "#9F9F9F");
		
		// 变蓝色
		$(args1).css("border-color", "#80CEF5");
		$(args1).css("background", "#80CEF5");
		$(args1).css("color", "#fff");
		// 将器械类型输入框置为不可用状态
		$(".sharp-instrument-type").attr("disabled", true);
	}
	/* 器械类型-选项 */
	$(".sharp-noodle").click(function(){
		// 定义变量
		var arg1 = ".sharp-noodle";
		var arg2 = ".sharp-glass";
		var arg3 = ".sharp-surgical";
		var arg4 = ".sharp-other";
		// 调用函数
		common_select_blue_1(arg1, arg2, arg3, arg4);
	});
	$(".sharp-glass").click(function(){
		// 定义变量
		var arg1 = ".sharp-noodle";
		var arg2 = ".sharp-glass";
		var arg3 = ".sharp-surgical";
		var arg4 = ".sharp-other";
		// 调用函数
		common_select_blue_1(arg2, arg1, arg3, arg4);
	});
	$(".sharp-surgical").click(function(){
		// 定义变量
		var arg1 = ".sharp-noodle";
		var arg2 = ".sharp-glass";
		var arg3 = ".sharp-surgical";
		var arg4 = ".sharp-other";
		// 调用函数
		common_select_blue_1(arg3, arg2, arg1, arg4);
	});
	// 页面刚载入时，将器械类型输入框置为不可用状态
	$(".sharp-instrument-type").attr("disabled", true);
	$(".sharp-other").click(function(){
		// 定义变量
		var arg1 = ".sharp-noodle";
		var arg2 = ".sharp-glass";
		var arg3 = ".sharp-surgical";
		var arg4 = ".sharp-other";
		// 调用函数
		common_select_blue_1(arg4, arg2, arg3, arg1);
		// 将器械类型输入框置为可用状态
		$(".sharp-instrument-type").attr("disabled", false);
		// 该输入框获取焦点
		$(".sharp-instrument-type").focus();
	});
	
	/*定义-按钮选项-公共函数-蓝色2*/
	var common_select_blue_2 = function(args1, args2){
		$(args2).css("border-color", "#9F9F9F");
		$(args2).css("background", "#fff");
		$(args2).css("color", "#9F9F9F");
		
		// 变蓝色
		$(args1).css("border-color", "#80CEF5");
		$(args1).css("background", "#80CEF5");
		$(args1).css("color", "#fff");
	}
	/*是否使用该器械*/
	$(".sharp-use-yes").click(function(){
		// 定义变量
		var arg1 = ".sharp-use-yes";
		var arg2 = ".sharp-use-no";
		// 调用函数
		common_select_blue_2(arg1, arg2);
	});
	$(".sharp-use-no").click(function(){
		// 定义变量
		var arg1 = ".sharp-use-yes";
		var arg2 = ".sharp-use-no";
		// 调用函数
		common_select_blue_2(arg2, arg1);
	});
	/*器械是否被血液污染*/
	$(".sharp-blood-yes").click(function(){
		// 定义变量
		var arg1 = ".sharp-blood-yes";
		var arg2 = ".sharp-blood-no";
		// 调用函数
		common_select_blue_2(arg1, arg2);
	});
	$(".sharp-blood-no").click(function(){
		// 定义变量
		var arg1 = ".sharp-blood-yes";
		var arg2 = ".sharp-blood-no";
		// 调用函数
		common_select_blue_2(arg2, arg1);
	});
	
	/*定义-按钮选项-公共函数-蓝色3*/
	var common_select_blue_3 = function(args1, args2, args3){
		$(args2).css("border-color", "#9F9F9F");
		$(args2).css("background", "#fff");
		$(args2).css("color", "#9F9F9F");
		$(args3).css("border-color", "#9F9F9F");
		$(args3).css("background", "#fff");
		$(args3).css("color", "#9F9F9F");
		
		// 变蓝色
		$(args1).css("border-color", "#80CEF5");
		$(args1).css("background", "#80CEF5");
		$(args1).css("color", "#fff");
	}
	/*器械污染情况*/
	$(".sharp-pollute-more").click(function(){
		// 定义变量
		var arg1 = ".sharp-pollute-more";
		var arg2 = ".sharp-pollute-less";
		var arg3 = ".sharp-pollute-no";
		// 调用函数
		common_select_blue_3(arg1, arg2, arg3);
	});
	$(".sharp-pollute-less").click(function(){
		// 定义变量
		var arg1 = ".sharp-pollute-more";
		var arg2 = ".sharp-pollute-less";
		var arg3 = ".sharp-pollute-no";
		// 调用函数
		common_select_blue_3(arg2, arg1, arg3);
	});
	$(".sharp-pollute-no").click(function(){
		// 定义变量
		var arg1 = ".sharp-pollute-more";
		var arg2 = ".sharp-pollute-less";
		var arg3 = ".sharp-pollute-no";
		// 调用函数
		common_select_blue_3(arg3, arg2, arg1);
	});
	
	/*是否戴手套*/
	$(".sharp-glove-no").click(function(){
		// 定义变量
		var arg1 = ".sharp-glove-no";
		var arg2 = ".sharp-glove-double";
		var arg3 = ".sharp-glove-single";
		// 调用函数
		common_select_blue_3(arg1, arg2, arg3);
	});
	$(".sharp-glove-double").click(function(){
		// 定义变量
		var arg1 = ".sharp-glove-no";
		var arg2 = ".sharp-glove-double";
		var arg3 = ".sharp-glove-single";
		// 调用函数
		common_select_blue_3(arg2, arg1, arg3);
	});
	$(".sharp-glove-single").click(function(){
		// 定义变量
		var arg1 = ".sharp-glove-no";
		var arg2 = ".sharp-glove-double";
		var arg3 = ".sharp-glove-single";
		// 调用函数
		common_select_blue_3(arg3, arg2, arg1);
	});
	
	/*定义-按钮选项-公共函数-蓝色4*/
	var common_select_blue_4 = function(args1){
		// 当背景色为蓝色，此处必须用 background-color 进行判断
		if($(args1).css("background-color") == 'rgb(128, 206, 245)'){
			//alert("背景为蓝色");
			$(args1).css("border-color", "#9F9F9F")
					.css("background", "#fff")
					.css("color", "#9F9F9F");
		} else {
			//alert("背景为白色");
			$(args1).css("border-color", "#80CEF5")
					.css("background", "#80CEF5")
					.css("color", "#fff");
		}
	}
	/*暴露部位*/
	/*左手-开始*/
	$(".sharp-ring-finger-left").click(function(){
		var arg1 = ".sharp-ring-finger-left";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-little-finger-left").click(function(){
		var arg1 = ".sharp-little-finger-left";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-middle-finger-left").click(function(){
		var arg1 = ".sharp-middle-finger-left";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-index-finger-left").click(function(){
		var arg1 = ".sharp-index-finger-left";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-thumb-finger-left").click(function(){
		var arg1 = ".sharp-thumb-finger-left";
		// 调用函数
		common_select_blue_4(arg1);
	});
	/*左手-结束*/
	/*右手-开始*/
	$(".sharp-ring-finger-right").click(function(){
		var arg1 = ".sharp-ring-finger-right";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-little-finger-right").click(function(){
		var arg1 = ".sharp-little-finger-right";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-middle-finger-right").click(function(){
		var arg1 = ".sharp-middle-finger-right";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-index-finger-right").click(function(){
		var arg1 = ".sharp-index-finger-right";
		// 调用函数
		common_select_blue_4(arg1);
	});
	$(".sharp-thumb-finger-right").click(function(){
		var arg1 = ".sharp-thumb-finger-right";
		// 调用函数
		common_select_blue_4(arg1);
	});
	/*右手-结束*/
	/*radio选择框js效果-开始*/
	$(".pay-list-expose-parts").on("click",function(){
		$(this).addClass("expose-parts-on").parent().siblings()
				.children(".pay-list-expose-parts")
				.removeClass("expose-parts-on");
		// 将其他行的radio也包含在内
		$(this).addClass("expose-parts-on").parent().parent().siblings()
				.children(".checkbox-inline")
				.children(".pay-list-expose-parts")
				.removeClass("expose-parts-on");
	})
	$(".pay-list-expose-operate").on("click",function(){
		$(this).addClass("expose-operate-on").parent().siblings()
				.children(".pay-list-expose-operate")
				.removeClass("expose-operate-on");
		// 将其他行的radio也包含在内
		$(this).addClass("expose-operate-on").parent().parent().siblings()
				.children(".checkbox-inline")
				.children(".pay-list-expose-operate")
				.removeClass("expose-operate-on");
	})
	$(".pay-list-injury-place").on("click",function(){
		$(this).addClass("injury-place-on").parent().siblings()
		.children(".pay-list-injury-place")
		.removeClass("injury-place-on");
		// 将其他行的radio也包含在内
		$(this).addClass("injury-place-on").parent().parent().siblings()
		.children(".checkbox-inline")
		.children(".pay-list-injury-place")
		.removeClass("injury-place-on");
	})
	/*radio选择框js效果-开始*/
	/*sharp-event-info.jsp页面-结束*/
	/*self_base_info.jsp页面-开始*/
	$(".expose-happen-select").click(function(){
		// 当时粉红色的时候
		if($(".expose-happen-select").css("border-color") == 'rgb(239, 154, 117)'){
			//alert("彩色");
			$(".expose-happen-select").css("border-color", "#9F9F9F");
			$(".expose-happen-select-sub").css("background-color", "#fff");
		} else {
			//alert("灰色");
			$(".expose-happen-select").css("border-color", "#EF9A75");
			$(".expose-happen-select-sub").css("background-color", "#EF9A75");
		}
	});
	$(".pay-list-title-select").on("click",function(){
		$(this).addClass("base-title-select-on").parent().siblings()
		.children(".pay-list-title-select")
		.removeClass("base-title-select-on");
		// 将其他行的radio也包含在内
		$(this).addClass("base-title-select-on").parent().parent().siblings()
		.children(".checkbox-inline")
		.children(".pay-list-title-select")
		.removeClass("base-title-select-on");
	})
	$(".pay-list-position-select").on("click",function(){
		$(this).addClass("position-select-on").parent().siblings()
		.children(".pay-list-position-select")
		.removeClass("position-select-on");
		// 将其他行的radio也包含在内
		$(this).addClass("position-select-on").parent().parent().siblings()
		.children(".checkbox-inline")
		.children(".pay-list-position-select")
		.removeClass("position-select-on");
	})
	/*self_base_info.jsp页面-结束*/
	
	/* 计算按钮的点击次数 */
    var sign_icon_cou = 0;
	
	/*签字*/
	$(".sign-icon").click(function(){
		//alert("显示签字页面！");
		//.sign-page-out  .sign-page-in
		// 显示签字页面
		$(".sign-page-out").css("display", "block");
		$(".sign-page-in").css("display", "block");
		
		// 计算点击次数
		sign_icon_cou = sign_icon_cou + 1;
		$("#sign_icon_count_id").val(sign_icon_cou);
	});
	$(".sign-page-out").click(function(){
		// 隐藏签字页面
		$(".sign-page-out").css("display", "none");
		$(".sign-page-in").css("display", "none");
	});
	$(".sign-page-close").click(function(){
		// 隐藏签字页面
		$(".sign-page-out").css("display", "none");
		$(".sign-page-in").css("display", "none");
	});
	
	/*填完提交*/
	$(".report-submit-btn").click(function(){
		// 显示保存成功提示
		$(".report-save-model").css("display", "block");
		$(".report-save-notice").css("display", "block");
	});
	$(".report-save-notice-close").click(function(){
		// 隐藏保存成功提示
		$(".report-save-model").css("display", "none");
		$(".report-save-notice").css("display", "none");
	});
	
 });






