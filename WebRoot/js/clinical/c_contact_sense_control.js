$(function(){
	$(".connect_sense_control_person").click(function(){
		$(".connect_sense_control_person").css("background", "#fff");
		$(".connect_sense_control_person").css("color", "#000");
		
		$(this).css("background", "#5DC12D");
		$(this).css("color", "#fff");
	});

	/* 点击返回临床端首页 */
	$(".c-cont-sen-contr-btn").click(function(){
		window.location.href = "c_index.jsp";
	});
	
	/* 计算按钮的点击次数 */
    var c_con_sen_cont_send_btn_cou = 0;
    
    /*发送按钮*/
	$(".c-con-sen-cont-send-btn").click(function(){
		// 计算点击次数
		c_con_sen_cont_send_btn_cou = c_con_sen_cont_send_btn_cou + 1;
		$("#c_con_sen_cont_send_btn_count_id").val(c_con_sen_cont_send_btn_cou);
		
		window.location.href = "#";
	});
});