$(function(){
	/*当本页面刚载入的时候，默认显示 提醒信息 面板-下划线*/
	$(".look-notice-header-tab-1").css("border-bottom-color", "#EB4E4F");
	$(".look-notice-header-tab-2").css("border-bottom-color", "#fff");
	// 显示 提醒信息容器
	$(".c-look-remind-msg").css("display", "block");
	$(".c-look-noti-msg").css("display", "none");
	
	// 当点击顶部的切换按钮时，进行面板的切换
	$(".look-notice-header-tab-1").click(function(){
		// 面板头部下划线
		$(".look-notice-header-tab-1").css("border-bottom-color", "#EB4E4F");
		$(".look-notice-header-tab-2").css("border-bottom-color", "#fff");
		// 显示 提醒信息容器
		$(".c-look-remind-msg").css("display", "block");
		$(".c-look-noti-msg").css("display", "none");
	});
	$(".look-notice-header-tab-2").click(function(){
		// 面板头部下划线
		$(".look-notice-header-tab-1").css("border-bottom-color", "#fff");
		$(".look-notice-header-tab-2").css("border-bottom-color", "#EB4E4F");
		// 显示 提醒信息容器
		$(".c-look-remind-msg").css("display", "none");
		$(".c-look-noti-msg").css("display", "block");
		//alert($(".c-look-remind-msg").css("display"));
	});
	
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
			$(".supervise-msg-look-notice").height(115);
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
			$(".supervise-msg-look-notice").height(stretch_panel_2 + 85);
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
			$(".supervise-msg-look-notice").height(115);
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
			$(".supervise-msg-look-notice").height(stretch_panel_2 + 85);
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
			$(".supervise-msg-look-notice").height(115);
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
			$(".supervise-msg-look-notice").height(stretch_panel_2 + 85);
			$(this).html("收起");
		}
	});
	
	/*右侧下拉面板的变换三角形效果-开始*/
	/* 当页面刚载入时，将第一条置为倒三角形，其他的置为正三角形 */
	$(".panel-1-look-notice-2-1-sub").addClass("panel-1-look-notice-2-1-sub-up");
	/*$(".panel-self-base-info-2-1-sub").addClass("panel-self-base-info-2-1-sub-down");
	$(".panel-expose-source-info-2-1-sub").addClass("panel-expose-source-info-2-1-sub-down");
	$(".panel-sharp-event-info-2-1-sub").addClass("panel-sharp-event-info-2-1-sub-down");
	$(".panel-others-info-2-1-sub").addClass("panel-others-info-2-1-sub-down");*/
	
	/* 当显示时 */
    $('#collapseOne').on('show.bs.collapse', function () {
    	$(".panel-1-look-notice-2-1-sub").removeClass("panel-1-look-notice-2-1-sub-up");
    	$(".panel-1-look-notice-2-1-sub").removeClass("panel-1-look-notice-2-1-sub-down");
    	
		//当点击时将倒三角形转换为正三角形
    	$(".panel-1-look-notice-2-1-sub").addClass("panel-1-look-notice-2-1-sub-up");
	})
    /* 当关闭显示时 */
    $('#collapseOne').on('hide.bs.collapse', function () {
    	$(".panel-1-look-notice-2-1-sub").removeClass("panel-1-look-notice-2-1-sub-up");
    	$(".panel-1-look-notice-2-1-sub").removeClass("panel-1-look-notice-2-1-sub-down");
    	
    	//当点击时将正三角形转换为倒三角形
    	$(".panel-1-look-notice-2-1-sub").addClass("panel-1-look-notice-2-1-sub-down");
	})
	/*右侧下拉面板的变换三角形效果-结束*/
	
	/*页面跳转-返回临床端首页*/
	$(".c-look-notice-btn-back").click(function(){
		window.location.href = "c_index.jsp";
	});
    /*读完点我-标记为已读*/
    $(".panel-noti-cont-mark").click(function(){
    	$(this).html("已读");
    	$(this).css("color", "#9F9F9F")
    			.css("background-color", "#fff");
    });
	
});
