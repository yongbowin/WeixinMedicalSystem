$(function(){
	$(".s-sc-select-expose-event-3").click(function(){
		//去掉另外一个的颜色
		$(".s-sc-select-sharp-event-3").css("border-color", "#9F9F9F");
		$(".s-sc-select-sharp-event-3-sub").css("background-color", "#fff");
		
		$(".s-sc-select-expose-event-3").css("border-color", "#5DC12D");
		$(".s-sc-select-expose-event-3-sub").css("background-color", "#5DC12D");
	});
	$(".s-sc-select-sharp-event-3").click(function(){
		//去掉另外一个的颜色
		$(".s-sc-select-expose-event-3").css("border-color", "#9F9F9F");
		$(".s-sc-select-expose-event-3-sub").css("background-color", "#fff");
		
		$(".s-sc-select-sharp-event-3").css("border-color", "#5DC12D");
		$(".s-sc-select-sharp-event-3-sub").css("background-color", "#5DC12D");
	});
	
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
	
	$(".expose-happen-select").click(function(){
		// 当时绿色的时候
		if($(".expose-happen-select-sub").css("background-color") == 'rgb(93, 193, 45)'){
			//alert("彩色");
			$(".expose-happen-select").css("border-color", "#9F9F9F");
			$(".expose-happen-select-sub").css("background-color", "#fff");
		} else {
			//alert("灰色");
			$(".expose-happen-select").css("border-color", "#5DC12D");
			$(".expose-happen-select-sub").css("background-color", "#5DC12D");
		}
	});
	
	/*定义公共函数*/
	var expose_history = function(arg1, arg2, arg3){
    	$(arg1).css("background", "#fff");
		$(arg1).css("border-color", "#9F9F9F");
		$(arg1).css("color", "#9F9F9F");
		$(arg2).css("background", "#fff");
		$(arg2).css("border-color", "#9F9F9F");
		$(arg2).css("color", "#9F9F9F");
		
		$(arg3).css("background", "#5DC12D");
		$(arg3).css("border-color", "#5DC12D");
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
	
	/*类脂质抗体*/
	$(".RPR-unknown-result").click(function(){
		/*定义变量*/
		var var1 = ".RPR-plus-result";
		var var2 = ".RPR-reduce-result";
		var var3 = ".RPR-unknown-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".RPR-plus-result").click(function(){
		/*定义变量*/
		var var1 = ".RPR-unknown-result";
		var var2 = ".RPR-reduce-result";
		var var3 = ".RPR-plus-result";
		/*调用函数*/
		expose_history(var1, var2, var3);
	});
	$(".RPR-reduce-result").click(function(){
		/*定义变量*/
		var var1 = ".RPR-plus-result";
		var var2 = ".RPR-unknown-result";
		var var3 = ".RPR-reduce-result";
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
	
	// 返回临床端职业暴露首页
	$(".s-check-revi-btn").click(function(){
		window.location.href = "#";
	});
	
	/*填完提交-模态*/
	$(".s-check-revi-submit").click(function(){
		// 显示提交成功提示
		$(".s-check-revi-model").css("display", "block");
		$(".s-check-revi-notice").css("display", "block");
	});
	$(".s-check-revi-notice").click(function(){
		// 隐藏提交成功提示
		$(".s-check-revi-model").css("display", "none");
		$(".s-check-revi-notice").css("display", "none");
	});
});