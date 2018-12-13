$(function(){
	/* 点击返回临床端首页 */
	$(".c-work-plan-btn").click(function(){
		window.location.href = "c_index.jsp";
	});
	
	/* 计算按钮的点击次数 */
    var c_work_plan_btn_cou = 0;
    
    /*制定计划*/
	$(".c-work-plan-btn-count").click(function(){
		// 计算点击次数
		c_work_plan_btn_cou = c_work_plan_btn_cou + 1;
		$("#c_work_plan_btn_count_id").val(c_work_plan_btn_cou);
		
		window.location.href = "#";
	});
});