$(function(){
	/* 计算按钮的点击次数 */
    var con_s_btn_coll_1_sharp_cou = 0;
    var con_s_btn_coll_1_blood_cou = 0;
    var con_s_btn_coll_2_history_cou = 0;
    var confirm_expo_look_cou = 0;
    var notice_event_add_cou = 0;
    
	/*利器伤上报*/
	$(".con-s-btn-coll-1-sharp").click(function(){
		// 计算点击次数
		con_s_btn_coll_1_sharp_cou = con_s_btn_coll_1_sharp_cou + 1;
		$("#con_s_btn_coll_1_sharp_count_id").val(con_s_btn_coll_1_sharp_cou);
		
		window.location.href = "#";
	});
	/*血体液上报*/
	$(".con-s-btn-coll-1-blood").click(function(){
		// 计算点击次数
		con_s_btn_coll_1_blood_cou = con_s_btn_coll_1_blood_cou + 1;
		$("#con_s_btn_coll_1_blood_count_id").val(con_s_btn_coll_1_blood_cou);
		
		window.location.href = "#";
	});
	/*暴露历史*/
	$(".con-s-btn-coll-2-history").click(function(){
		// 计算点击次数
		con_s_btn_coll_2_history_cou = con_s_btn_coll_2_history_cou + 1;
		$("#con_s_btn_coll_2_history_count_id").val(con_s_btn_coll_2_history_cou);
		
		window.location.href = "#";
	});
	/*查看*/
	$(".confirm-expo-look-count").click(function(){
		// 计算点击次数
		confirm_expo_look_cou = confirm_expo_look_cou + 1;
		$("#confirm_expo_look_count_id").val(confirm_expo_look_cou);
		
		window.location.href = "#";
	});
	/*补报*/
	$(".notice-event-add-count").click(function(){
		// 计算点击次数
		notice_event_add_cou = notice_event_add_cou + 1;
		$("#notice_event_add_count_id").val(notice_event_add_cou);
		
		window.location.href = "#";
	});
	
});