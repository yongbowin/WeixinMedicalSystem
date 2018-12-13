$(function(){
	/* 点击返回临床端首页 */
	$(".f-sym-btn").click(function(){
		window.location.href = "#";
	});
	
	/* 有无症状选项 */
	$(".f-symptom-1").click(function(){
		$(".f-symptom-2").css("border-color", "#5DC12D")
						.css("background", "#fff")
						.css("color", "#000");
		
		$(".f-symptom-1").css("border-color", "#5DC12D")
						.css("background", "#5DC12D")
						.css("color", "#fff");
	});
	$(".f-symptom-2").click(function(){
		$(".f-symptom-1").css("border-color", "#5DC12D")
						.css("background", "#fff")
						.css("color", "#000");

		$(".f-symptom-2").css("border-color", "#5DC12D")
						.css("background", "#5DC12D")
						.css("color", "#fff");
	});
	
	/*填完提交-模态*/
	$(".f-sym-submit").click(function(){
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