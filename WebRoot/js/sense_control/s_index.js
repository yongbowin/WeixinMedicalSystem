$(function(){
	/*感控端首页-复查工作-查看按钮*/
	/*现场督察-第一条*/
	$(".c-1-supervise-msg-list-1-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-1-msg-list-1-sub-2").css("display") == 'none'){
			// 此时该条目处于展开状态
			
			$(".supervise-1-msg-list-1-sub-2").css("display", "block");
			$(".supervise-1-msg-list-1-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-1-msg-list-1-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-blue").height(125);
			$(".supervise-msg-list-blue").height(125);
			$(this).html("查看");
		} else {
			//alert("此时第一个条目处于关闭状态");
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
			
			$(".supervise-1-msg-list-1-sub-2").css("display", "none");
			$(".supervise-1-msg-list-1-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-1-msg-list-1-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-blue").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	/*现场督察-第二条*/
	$(".c-1-supervise-msg-list-2-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-1-msg-list-2-sub-2").css("display") == 'none'){
			$(".supervise-1-msg-list-2-sub-2").css("display", "block");
			$(".supervise-1-msg-list-2-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-1-msg-list-2-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-blue").height(125);
			$(".supervise-msg-list-blue").height(125);
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
			
			$(".supervise-1-msg-list-2-sub-2").css("display", "none");
			$(".supervise-1-msg-list-2-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-1-msg-list-2-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-blue").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	/*现场督察-第三条*/
	$(".c-1-supervise-msg-list-3-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-1-msg-list-3-sub-2").css("display") == 'none'){
			$(".supervise-1-msg-list-3-sub-2").css("display", "block");
			$(".supervise-1-msg-list-3-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-1-msg-list-3-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-blue").height(125);
			$(".supervise-msg-list-blue").height(125);
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
			
			$(".supervise-1-msg-list-3-sub-2").css("display", "none");
			$(".supervise-1-msg-list-3-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-1-msg-list-3-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-blue").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	
	/*感控端首页-工作提醒-查看按钮*/
	/*现场督察-第一条*/
	$(".c-2-supervise-msg-list-1-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-2-msg-list-1-sub-2").css("display") == 'none'){
			$(".supervise-2-msg-list-1-sub-2").css("display", "block");
			$(".supervise-2-msg-list-1-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-2-msg-list-1-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-brown").height(125);
			$(".supervise-msg-list-brown").height(125);
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
			
			$(".supervise-2-msg-list-1-sub-2").css("display", "none");
			$(".supervise-2-msg-list-1-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-2-msg-list-1-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-brown").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	/*现场督察-第二条*/
	$(".c-2-supervise-msg-list-2-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-2-msg-list-2-sub-2").css("display") == 'none'){
			$(".supervise-2-msg-list-2-sub-2").css("display", "block");
			$(".supervise-2-msg-list-2-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-2-msg-list-2-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-brown").height(125);
			$(".supervise-msg-list-brown").height(125);
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
			
			$(".supervise-2-msg-list-2-sub-2").css("display", "none");
			$(".supervise-2-msg-list-2-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-2-msg-list-2-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-brown").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	/*现场督察-第三条*/
	$(".c-2-supervise-msg-list-3-sub-3").click(function(){
		//alert("成功！");
		if($(".supervise-2-msg-list-3-sub-2").css("display") == 'none'){
			$(".supervise-2-msg-list-3-sub-2").css("display", "block");
			$(".supervise-2-msg-list-3-sub-2-hid").css("display", "none");
			// 获取此时收缩面板的高度
			var stretch_panel_1 = $(".supervise-2-msg-list-3-sub-2").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_1);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-brown").height(125);
			$(".supervise-msg-list-brown").height(125);
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
			
			$(".supervise-2-msg-list-3-sub-2").css("display", "none");
			$(".supervise-2-msg-list-3-sub-2-hid").css("display", "block");
			// 获取此时展开面板的高度
			var stretch_panel_2 = $(".supervise-2-msg-list-3-sub-2-hid").height();
			// 将该面板的父元素的高度置为 此时面板的高度
			$(this).parent().height(stretch_panel_2);
			// 设置其 父-父 元素的高度
			$(".supervise-msg-brown").height(stretch_panel_2 + 90);
			$(this).html("收起");
		}
	});
	
	/*跳转链接*/
	/*通知*/
	$(".c-index-btn-1").click(function(){
		window.location.href = "s_look_notice.jsp";
	});
	/*制定计划*/
	$(".c-index-btn-2").click(function(){
		window.location.href = "s_work_plan.jsp";
	});
	/*手卫生*/
	$(".c-index-btn-3").click(function(){
		window.location.href = "s_hand_health.jsp";
	});
	/*职业暴露*/
	$(".c-index-btn-4").click(function(){
		window.location.href = "s_occupational_exposure.jsp";
	});
	
	
	
	
	
	
	
	
});