$(function(){
	$(".con-e-item-5-sub").addClass("con-e-item-5-sub-down");
	/*三角形下拉面板效果*/
	$(".con-e-item").click(function(){
		// 判断当前条目是否处于展开状态，如果是，则将其关闭，否则将其展开
		if($(this).next().css("display") == 'none'){
			// 当前条目处于关闭状态，所以将其展开
			$(this).children(".con-e-item-5")
					.children()
					.removeClass("con-e-item-5-sub-down");
			$(this).children(".con-e-item-5")
					.children()
					.addClass("con-e-item-5-sub-up");
			// 当条目展开时,将天目的下边框去掉
			$(this).css("border-bottom-color", "#fff")
					.css("border-bottom-left-radius", "0")
					.css("border-bottom-right-radius", "0");
			// 同时将包含content内容的div显示出来
			$(this).next().css("display", "block");
		} else {
			// 当前条目处于展开状态，所以将其关闭
			$(this).children(".con-e-item-5")
					.children()
					.addClass("con-e-item-5-sub-down");
			$(this).children(".con-e-item-5")
					.children()
					.removeClass("con-e-item-5-sub-up");
			// 当条目展开时,将天目的下边框去掉
			$(this).css("border-bottom-color", "#5DC12D")
					.css("border-bottom-left-radius", "5px")
					.css("border-bottom-right-radius", "5px");
			// 同时将包含content内容的div显示出来
			$(this).next().css("display", "none");
		}
	});
	
	/*暴露级别*/
	// 定义公共函数
	function item_con_circle(arg){
		$(arg).css("background-color", "#5DC12D")
				.css("border-color", "#5DC12D")
				.css("color", "#fff");
		$(arg).parent().siblings().children()
				.css("background-color", "#fff")
				.css("border-color", "#9D9D9D")
				.css("color", "#9D9D9D");
	}
	/*初始化-调用函数*/
	item_con_circle(".con-e-item-con-cir-1-1-sub");
	item_con_circle(".con-e-item-con-cir-2-1-sub");
	// 暴露级别1级
	$(".con-e-item-con-cir-1-1-sub").click(function(){
		var args = ".con-e-item-con-cir-1-1-sub";
		item_con_circle(args);
	});
	// 暴露级别2级
	$(".con-e-item-con-cir-1-2-sub").click(function(){
		var args = ".con-e-item-con-cir-1-2-sub";
		item_con_circle(args);
	});
	// 暴露级别3级
	$(".con-e-item-con-cir-1-3-sub").click(function(){
		var args = ".con-e-item-con-cir-1-3-sub";
		item_con_circle(args);
	});
	/*暴露源头严重程度*/
	// 暴露源头严重程度1级
	$(".con-e-item-con-cir-2-1-sub").click(function(){
		var args = ".con-e-item-con-cir-2-1-sub";
		item_con_circle(args);
	});
	// 暴露源头严重程度2级
	$(".con-e-item-con-cir-2-2-sub").click(function(){
		var args = ".con-e-item-con-cir-2-2-sub";
		item_con_circle(args);
	});
	// 暴露源头严重程度3级
	$(".con-e-item-con-cir-2-3-sub").click(function(){
		var args = ".con-e-item-con-cir-2-3-sub";
		item_con_circle(args);
	});
	
	/*治疗预案或处理措施*/
	// 定义函数
	function item_con_select(arg){
		// 当时绿色的时候
		if($(arg).children().css("background-color") == 'rgb(93, 193, 45)'){
			//alert("彩色");
			$(arg).css("border-color", "#9F9F9F");
			$(arg).children().css("background-color", "#fff");
		} else {
			//alert("灰色");
			$(arg).css("border-color", "#5DC12D");
			$(arg).children().css("background-color", "#5DC12D");
		}
	}
	// 1
	$(".con-e-item-con-sel-1-select").click(function(){
		var args = ".con-e-item-con-sel-1-select";
		item_con_select(args);
	});
	// 2
	$(".con-e-item-con-sel-2-select").click(function(){
		var args = ".con-e-item-con-sel-2-select";
		item_con_select(args);
	});
	// 3
	$(".con-e-item-con-sel-3-select").click(function(){
		var args = ".con-e-item-con-sel-3-select";
		item_con_select(args);
	});
	// 4
	$(".con-e-item-con-sel-4-select").click(function(){
		var args = ".con-e-item-con-sel-4-select";
		item_con_select(args);
	});
	// 5
	$(".con-e-item-con-sel-5-select").click(function(){
		var args = ".con-e-item-con-sel-5-select";
		item_con_select(args);
	});
	
	/*毒副作用*/
	/* 有无症状选项 */
	$(".con-e-item-side-eff-sel-1").click(function(){
		$(".con-e-item-side-eff-sel-2").css("border-color", "#9F9F9F")
										.css("background", "#fff")
										.css("color", "#9F9F9F");
		
		$(".con-e-item-side-eff-sel-1").css("border-color", "#5DC12D")
										.css("background", "#5DC12D")
										.css("color", "#fff");
	});
	$(".con-e-item-side-eff-sel-2").click(function(){
		$(".con-e-item-side-eff-sel-1").css("border-color", "#9F9F9F")
										.css("background", "#fff")
										.css("color", "#9F9F9F");

		$(".con-e-item-side-eff-sel-2").css("border-color", "#5DC12D")
										.css("background", "#5DC12D")
										.css("color", "#fff");
	});
	
	/*填完提交-模态*/
	$(".con-e-item-submit").click(function(){
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











