$(function(){
	/* 全体医生 */
	$("#all_doctor").click(function(){
		$("#all_doctor").css("background", "#5DC12D");
		$("#all_doctor").css("color", "#fff");

		$("#gk_doctor").css("background", "#fff");
		$("#gk_doctor").css("color", "#B9B9B9");
	});
	/* 感控医生 */
	$("#gk_doctor").click(function(){
		$("#gk_doctor").css("background", "#5DC12D");
		$("#gk_doctor").css("color", "#fff");

		$("#all_doctor").css("background", "#fff");
		$("#all_doctor").css("color", "#B9B9B9");
	});
	/* 全体护士 */
	$("#all_nurse").click(function(){
		$("#all_nurse").css("background", "#5DC12D");
		$("#all_nurse").css("color", "#fff");

		$("#gk_nurse").css("background", "#fff");
		$("#gk_nurse").css("color", "#B9B9B9");
	});
	/* 感控医生 */
	$("#gk_nurse").click(function(){
		$("#gk_nurse").css("background", "#5DC12D");
		$("#gk_nurse").css("color", "#fff");

		$("#all_nurse").css("background", "#fff");
		$("#all_nurse").css("color", "#B9B9B9");
	});
	/* 点击返回临床端首页 */
	$(".c-send-noti-btn").click(function(){
		window.location.href = "c_index.jsp";
	});
	
	/* 计算按钮的点击次数 */
    var c_send_noti_btn_cou = 0;
    
    /*发送通知*/
	$(".c-send-noti-btn-count").click(function(){
		// 计算点击次数
		c_send_noti_btn_cou = c_send_noti_btn_cou + 1;
		$("#c_send_noti_btn_count_id").val(c_send_noti_btn_cou);
		
		window.location.href = "#";
	});
});