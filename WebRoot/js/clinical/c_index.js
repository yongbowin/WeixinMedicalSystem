$(function(){
	/*临床端首页-督查信息-查看按钮*/
	/*现场督察-第一条*/
	$(".supervise-msg-list-1-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-msg-list-1-sub-2").css("display") == 'none'){
			$(".supervise-msg-list-1-sub-2").css("display", "block");
			$(".supervise-msg-list-1-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-msg-list-1-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg").height(200);
			$(".supervise-msg-list").height(125);
			$(this).html("查看");
		} else {
			// 则将其兄弟条目的状态都置为关闭状态
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.children(".supervise-msg-list-sub-2")
					.css("display", "block");
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.children(".supervise-msg-list-sub-2")
					.next()
					.css("display", "none");
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.height(34);
			
			$(".supervise-msg-list-1-sub-2").css("display", "none");
			$(".supervise-msg-list-1-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-msg-list-1-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg").height(stretch_panel_2 + 160);
			$(".supervise-msg-list").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	/*现场督察-第二条*/
	$(".supervise-msg-list-2-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-msg-list-2-sub-2").css("display") == 'none'){
			$(".supervise-msg-list-2-sub-2").css("display", "block");
			$(".supervise-msg-list-2-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-msg-list-2-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg").height(200);
			$(".supervise-msg-list").height(125);
			$(this).html("查看");
		} else {
			// 则将其兄弟条目的状态都置为关闭状态
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.children(".supervise-msg-list-sub-2")
					.css("display", "block");
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.children(".supervise-msg-list-sub-2")
					.next()
					.css("display", "none");
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.height(34);
			
			$(".supervise-msg-list-2-sub-2").css("display", "none");
			$(".supervise-msg-list-2-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-msg-list-2-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg").height(stretch_panel_2 + 160);
			$(".supervise-msg-list").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	/*现场督察-第三条*/
	$(".supervise-msg-list-3-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-msg-list-3-sub-2").css("display") == 'none'){
			$(".supervise-msg-list-3-sub-2").css("display", "block");
			$(".supervise-msg-list-3-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-msg-list-3-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg").height(200);
			$(".supervise-msg-list").height(125);
			$(this).html("查看");
		} else {
			// 则将其兄弟条目的状态都置为关闭状态
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.children(".supervise-msg-list-sub-2")
					.css("display", "block");
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.children(".supervise-msg-list-sub-2")
					.next()
					.css("display", "none");
			$(this).parent()
					.siblings(".supervise-msg-list-sub")
					.height(34);
			
			$(".supervise-msg-list-3-sub-2").css("display", "none");
			$(".supervise-msg-list-3-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-msg-list-3-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg").height(stretch_panel_2 + 160);
			$(".supervise-msg-list").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	
	/* 计算按钮的点击次数 */
    var qr_code_cou = 0;
    var c_index_btn_1_cou = 0;
    var c_index_btn_2_cou = 0;
    var c_index_btn_3_cou = 0;
    var c_index_btn_4_cou = 0;
    var modal_c_index_notice_1_cou = 0;
    var modal_c_index_notice_2_cou = 0;
    
    /* 二维码点击次数 */
    $(".qr-code").click(function(){
    	// 计算点击次数
    	qr_code_cou = qr_code_cou + 1;
		$("#qr_code_count_id").val(qr_code_cou);
    });
	
	/*模态-开始*/
	$(".c-index-btn-1").click(function(){
		// 模态透明背景
		$(".clinical-index-out").css("display", "block");
		// 通知栏
		$(".clinical-index-in").css("display", "block");
		
		// 计算点击次数
		c_index_btn_1_cou = c_index_btn_1_cou + 1;
		$("#c_index_btn_1_count_id").val(c_index_btn_1_cou);
	});
	$(".clinical-index-out").click(function(){
		$(this).css("display", "none");
		// 通知栏
		$(".clinical-index-in").css("display", "none");
	});
	/*跳转链接*/
	/*发通知*/
	$(".modal-c-index-notice-1").click(function(){
		// 计算点击次数
		modal_c_index_notice_1_cou = modal_c_index_notice_1_cou + 1;
		$("#modal_c_index_notice_1_count_id").val(modal_c_index_notice_1_cou);
		
		window.location.href = "c_send_notice.jsp";
	});
	/*看提醒*/
	$(".modal-c-index-notice-2").click(function(){
		// 计算点击次数
		modal_c_index_notice_2_cou = modal_c_index_notice_2_cou + 1;
		$("#modal_c_index_notice_2_count_id").val(modal_c_index_notice_2_cou);
		
		window.location.href = "c_look_notice.jsp";
	});
	/*制定计划*/
	$(".c-index-btn-2").click(function(){
		// 计算点击次数
		c_index_btn_2_cou = c_index_btn_2_cou + 1;
		$("#c_index_btn_2_count_id").val(c_index_btn_2_cou);
		
		window.location.href = "c_work_plan.jsp";
	});
	/*联系感控*/
	$(".c-index-btn-3").click(function(){
		// 计算点击次数
		c_index_btn_3_cou = c_index_btn_3_cou + 1;
		$("#c_index_btn_3_count_id").val(c_index_btn_3_cou);
		
		window.location.href = "c_contact_sense_control.jsp";
	});
	/*职业暴露*/
	$(".c-index-btn-4").click(function(){
		// 计算点击次数
		c_index_btn_4_cou = c_index_btn_4_cou + 1;
		$("#c_index_btn_4_count_id").val(c_index_btn_4_cou);
		
		window.location.href = "#";
	});
		
	
});