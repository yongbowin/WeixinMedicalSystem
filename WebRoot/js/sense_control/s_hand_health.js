$(function(){
	// 返回感控端首页
	$(".c-hand-back-btn").click(function(){
		window.location.href = "s_index.jsp";
	});
	
	/*页面刚载入的时候，禁用确定按钮*/
	$(".s-hand-yes-btn").attr("disabled", true);
	
	/*选择角色*/
	// 定义公共函数
	function s_select_role(arg){
		if($(arg).css("background-color") != 'rgb(93, 193, 45)'){
			$(arg).css("background-color", "#5DC12D")
					.css("border-color", "#5DC12D")
					.css("color", "#fff");
			$(arg).parent().siblings().children()
					.css("background-color", "#fff")
					.css("border-color", "#9F9F9F")
					.css("color", "#000");
		}
	}
	// 页面刚载入时，默认选择第一个，调用函数
	s_select_role(".s-select-role-group-1-sub");
	
	// 卫生员
	$(".s-select-role-group-1-sub").click(function(){
		//alert($(this).css("background-color"));
		// 调用函数
		s_select_role(".s-select-role-group-1-sub");
	});
	// 护理员
	$(".s-select-role-group-2-sub").click(function(){
		// 调用函数
		s_select_role(".s-select-role-group-2-sub");
	});
	// 医生
	$(".s-select-role-group-3-sub").click(function(){
		// 调用函数
		s_select_role(".s-select-role-group-3-sub");
	});
	// 护士
	$(".s-select-role-group-4-sub").click(function(){
		// 调用函数
		s_select_role(".s-select-role-group-4-sub");
	});
	
	/*洗手时刻*/
	// 定义公共函数
	function s_wash_hand_time(arg){
		if($(".s-wash-behavior-group-3-sub").css("background-color") != 'rgb(255, 255, 255)' || 
				$(".s-wash-behavior-group-4-sub").css("background-color") != 'rgb(255, 255, 255)'){
			// 当背景是白色时
			if($(arg).css("background-color") == 'rgb(255, 255, 255)'){
				$(arg).css("background-color", "#F299AF")
						.css("border-color", "#F299AF")
						.css("color", "#fff");
				$(arg).parent().siblings().children()
						.css("background-color", "#848484")
						.css("border-color", "#848484")
						.css("color", "#000");
			} else if($(arg).css("background-color") == 'rgb(242, 153, 175)'){
				// 当背景是粉红色时
				$(arg).css("background-color", "#fff")
						.css("border-color", "#9F9F9F")
						.css("color", "#000");
				$(arg).parent().siblings().children()
						.css("background-color", "#fff")
						.css("border-color", "#9F9F9F")
						.css("color", "#000");
			}
		}
	}
	// 接触病人前
	$(".s-wash-time-group-1-sub").click(function(){
		//alert($(this).css("background-color"));
		// 调用函数
		s_wash_hand_time(".s-wash-time-group-1-sub");
	});
	// 无菌操作前
	$(".s-wash-time-group-2-sub").click(function(){
		// 调用函数
		s_wash_hand_time(".s-wash-time-group-2-sub");
	});
	// 接触体液后
	$(".s-wash-time-group-3-sub").click(function(){
		// 调用函数
		s_wash_hand_time(".s-wash-time-group-3-sub");
	});
	// 接触病人后
	$(".s-wash-time-group-4-sub").click(function(){
		// 调用函数
		s_wash_hand_time(".s-wash-time-group-4-sub");
	});
	// 接触环境后
	$(".s-wash-time-group-5-sub").click(function(){
		// 调用函数
		s_wash_hand_time(".s-wash-time-group-5-sub");
	});
	
	/*洗手行为*/
	// 页面刚载入时“戴手套”和“六步法正确”选项默认隐藏
	$(".s-wash-behavior-group-2-sub").css("display", "none");
	$(".s-wash-behavior-group-2-sub-1").css("display", "none");
	$(".s-wash-behavior-group-5-sub").css("display", "none");
	$(".s-wash-behavior-group-5-sub-1").css("display", "none");
	$(".s-wash-behavior-group-5-sub-2").css("display", "none");
	$(".s-wash-behavior-group-5-sub-3").css("display", "none");
	// 未洗手
	$(".s-wash-behavior-group-1-sub").click(function(){
		//alert($(this).css("background-color"));
		$(this).parent().siblings().children()
				.css("background-color", "#fff")
				.css("border-color", "#9F9F9F")
				.css("color", "#000");
		// 隐藏“戴手套”和“六步法正确”选项
		$(".s-wash-behavior-group-2-sub").css("display", "none");
		$(".s-wash-behavior-group-2-sub-1").css("display", "none");
		$(".s-wash-behavior-group-2-sub-2").css("display", "none");
		$(".s-wash-behavior-group-2-sub-3").css("display", "none");
		$(".s-wash-behavior-group-5-sub").css("display", "none");
		$(".s-wash-behavior-group-5-sub-1").css("display", "none");
		$(".s-wash-behavior-group-5-sub-2").css("display", "none");
		$(".s-wash-behavior-group-5-sub-3").css("display", "none");
		// rgb(144, 209, 249) 蓝色
		// 当选项背景是白色时
		if($(this).css("background-color") == 'rgb(255, 255, 255)'){
			// 显示“戴手套”选项
			$(".s-wash-behavior-group-2-sub").css("display", "block");
			// 显示其中的第一个结果，隐藏其他两个结果
			$(".s-wash-behavior-group-2-sub-1").css("display", "block");
			$(".s-wash-behavior-group-2-sub-1").siblings().css("display", "none");
			
			$(this).css("background-color", "#90D1F9")
					.css("border-color", "#90D1F9")
					.css("color", "#fff");
			$(this).parent().siblings().children()
					.css("background-color", "#fff")
					.css("border-color", "#9F9F9F")
					.css("color", "#000");
		} else if($(this).css("background-color") == 'rgb(144, 209, 249)'){
			// 当选项背景是蓝色时
			// 隐藏“戴手套”选项
			$(".s-wash-behavior-group-2-sub").css("display", "none");
			$(this).css("background-color", "#fff")
					.css("border-color", "#9F9F9F")
					.css("color", "#000");
			$(this).parent().siblings().children()
					.css("background-color", "#fff")
					.css("border-color", "#9F9F9F")
					.css("color", "#000");
		}
	});
	// 是否戴手套
	$(".s-wash-behavior-group-2-sub-1").click(function(){
		// 显示“已戴手套”且背景变成蓝色
		// 显示“已戴手套”文字
		$(".s-wash-behavior-group-2-sub").css("display", "block");
		// 显示其中的第一个结果，隐藏其他两个结果
		$(".s-wash-behavior-group-2-sub-2").css("display", "block");
		$(".s-wash-behavior-group-2-sub-2").siblings().css("display", "none");
		$(".s-wash-behavior-group-2-sub-2").css("background-color", "#90D1F9")
											.css("border-color", "#90D1F9")
											.css("color", "#fff");
		/*启用确定按钮*/
		$(".s-hand-yes-btn").attr("disabled", false);
	});
	// 已戴手套
	$(".s-wash-behavior-group-2-sub-2").click(function(){
		// 显示“未戴手套”且背景变成粉红色 #F69BA0 rgb(246, 155, 160)
		// 显示“未戴手套”文字
		$(".s-wash-behavior-group-2-sub").css("display", "block");
		// 显示其中的第一个结果，隐藏其他两个结果
		$(".s-wash-behavior-group-2-sub-3").css("display", "block");
		$(".s-wash-behavior-group-2-sub-3").siblings().css("display", "none");
		$(".s-wash-behavior-group-2-sub-3").css("background-color", "#F69BA0")
											.css("border-color", "#F69BA0")
											.css("color", "#fff");
		/*启用确定按钮*/
		$(".s-hand-yes-btn").attr("disabled", false);
	});
	// 未戴手套
	$(".s-wash-behavior-group-2-sub-3").click(function(){
		// 显示“是否戴手套”且背景变成白色
		// 显示“是否戴手套”文字
		$(".s-wash-behavior-group-2-sub").css("display", "block");
		// 显示其中的第一个结果，隐藏其他两个结果
		$(".s-wash-behavior-group-2-sub-1").css("display", "block");
		$(".s-wash-behavior-group-2-sub-1").siblings().css("display", "none");
		$(".s-wash-behavior-group-2-sub-1").css("background-color", "#fff")
											.css("border-color", "#9F9F9F")
											.css("color", "#000");
		/*禁用确定按钮*/
		$(".s-hand-yes-btn").attr("disabled", true);
	});
	
	// 肥皂/水
	$(".s-wash-behavior-group-3-sub").click(function(){
		$(".s-wash-behavior-group-1-sub").css("background-color", "#fff")
										.css("border-color", "#9F9F9F")
										.css("color", "#000");
		// 隐藏“戴手套”和“六步法正确”选项
		$(".s-wash-behavior-group-2-sub").css("display", "none");
		$(".s-wash-behavior-group-2-sub-1").css("display", "none");
		$(".s-wash-behavior-group-2-sub-2").css("display", "none");
		$(".s-wash-behavior-group-2-sub-3").css("display", "none");
		
		// 当“洗手液”也为蓝色的时候，不隐藏“六步法”，否则隐藏“六步法”
		if($(".s-wash-behavior-group-3-sub").css("background-color") == 'rgb(144, 209, 249)'){
			if($(".s-wash-behavior-group-4-sub").css("background-color") == 'rgb(144, 209, 249)'){
				// 前者和后者都为蓝色
				// 只有当前变为白色，其他不变
				$(this).css("background-color", "#fff")
						.css("border-color", "#9F9F9F")
						.css("color", "#000");
			} else {
				// 前者为蓝色，后者都为白色
				// 当前变为白色，同时5隐藏
				$(this).css("background-color", "#fff")
						.css("border-color", "#9F9F9F")
						.css("color", "#000");
				$(".s-wash-behavior-group-5-sub").css("display", "none");
				$(".s-wash-behavior-group-5-sub-1").css("display", "none");
				$(".s-wash-behavior-group-5-sub-2").css("display", "none");
				$(".s-wash-behavior-group-5-sub-3").css("display", "none");
			}
		} else {
			// 变蓝色 #90D1F9 rgb(144, 209, 249)
			$(this).css("background-color", "#90D1F9")
					.css("border-color", "#90D1F9")
					.css("color", "#fff");
			if($(".s-wash-behavior-group-4-sub").css("background-color") == 'rgb(144, 209, 249)'){
				// 前者为白色，后者为蓝色
				// 只有当前变为蓝色，其他不变
			} else {
				// 前者为白色，后者也为白色
				// 当前变为蓝色，同时5显示
				$(".s-wash-behavior-group-5-sub").css("display", "block");
				$(".s-wash-behavior-group-5-sub-1").css("display", "block");
				$(".s-wash-behavior-group-5-sub-2").css("display", "none");
				$(".s-wash-behavior-group-5-sub-3").css("display", "none");
			}
		}
	});
	// 洗手液
	$(".s-wash-behavior-group-4-sub").click(function(){
		$(".s-wash-behavior-group-1-sub").css("background-color", "#fff")
										.css("border-color", "#9F9F9F")
										.css("color", "#000");
		// 隐藏“戴手套”和“六步法正确”选项
		$(".s-wash-behavior-group-2-sub").css("display", "none");
		$(".s-wash-behavior-group-2-sub-1").css("display", "none");
		$(".s-wash-behavior-group-2-sub-2").css("display", "none");
		$(".s-wash-behavior-group-2-sub-3").css("display", "none");

		// 当“洗手液”也为蓝色的时候，不隐藏“六步法”，否则隐藏“六步法”
		if($(".s-wash-behavior-group-3-sub").css("background-color") == 'rgb(144, 209, 249)'){
			if($(".s-wash-behavior-group-4-sub").css("background-color") == 'rgb(144, 209, 249)'){
				// 前者和后者都为蓝色
				// 只有当前变为白色，其他不变
				$(this).css("background-color", "#fff")
						.css("border-color", "#9F9F9F")
						.css("color", "#000");
			} else {
				// 前者为蓝色，后者为白色
				// 当前变为蓝色，其他不变
				// 变蓝色 #90D1F9 rgb(144, 209, 249)
				$(this).css("background-color", "#90D1F9")
						.css("border-color", "#90D1F9")
						.css("color", "#fff");
			}
		} else {
			if($(".s-wash-behavior-group-4-sub").css("background-color") == 'rgb(144, 209, 249)'){
				// 前者为白色，后者为蓝色
				// 当前变为白色，同时5隐藏
				$(this).css("background-color", "#fff")
						.css("border-color", "#9F9F9F")
						.css("color", "#000");
				$(".s-wash-behavior-group-5-sub").css("display", "none");
				$(".s-wash-behavior-group-5-sub-1").css("display", "none");
				$(".s-wash-behavior-group-5-sub-2").css("display", "none");
				$(".s-wash-behavior-group-5-sub-3").css("display", "none");
			} else {
				// 前者为白色，后者也为白色
				// 当前变为蓝色，同时5显示
				// 变蓝色 #90D1F9 rgb(144, 209, 249)
				$(this).css("background-color", "#90D1F9")
						.css("border-color", "#90D1F9")
						.css("color", "#fff");
				$(".s-wash-behavior-group-5-sub").css("display", "block");
				$(".s-wash-behavior-group-5-sub-1").css("display", "block");
				$(".s-wash-behavior-group-5-sub-2").css("display", "none");
				$(".s-wash-behavior-group-5-sub-3").css("display", "none");
			}
		}
	});
	
	// 是否六步法正确
	$(".s-wash-behavior-group-5-sub-1").click(function(){
		$(".s-wash-behavior-group-5-sub-1").css("display", "none");
		$(".s-wash-behavior-group-5-sub-2").css("display", "block");
		$(".s-wash-behavior-group-5-sub-3").css("display", "none");
		$(".s-wash-behavior-group-5-sub-2").css("background-color", "#90D1F9")
											.css("border-color", "#90D1F9")
											.css("color", "#fff");
		/*启用确定按钮*/
		$(".s-hand-yes-btn").attr("disabled", false);
	});
	// 六步法正确
	$(".s-wash-behavior-group-5-sub-2").click(function(){
		$(".s-wash-behavior-group-5-sub-1").css("display", "none");
		$(".s-wash-behavior-group-5-sub-2").css("display", "none");
		$(".s-wash-behavior-group-5-sub-3").css("display", "block");
		$(".s-wash-behavior-group-5-sub-3").css("background-color", "#F69BA0")
											.css("border-color", "#F69BA0")
											.css("color", "#fff");
		/*启用确定按钮*/
		$(".s-hand-yes-btn").attr("disabled", false);
	});
	// 六步法错误
	$(".s-wash-behavior-group-5-sub-3").click(function(){
		$(".s-wash-behavior-group-5-sub-1").css("display", "block");
		$(".s-wash-behavior-group-5-sub-2").css("display", "none");
		$(".s-wash-behavior-group-5-sub-3").css("display", "none");
		$(".s-wash-behavior-group-5-sub-1").css("background-color", "#fff")
											.css("border-color", "#9F9F9F")
											.css("color", "#000");
		/*禁用确定按钮*/
		$(".s-hand-yes-btn").attr("disabled", true);
	});
	
	/*签字*/
	$(".s-hand-sign-btn").click(function(){
		//alert("测试！");
		if($(".s-wash-behavior-group-2-sub-2").css("display") != 'none' || 
				$(".s-wash-behavior-group-2-sub-3").css("display") != 'none'){
			// 显示签字页面
			$(".sign-page-out").css("display", "block");
			$(".sign-page-in").css("display", "block");
		} else if($(".s-wash-behavior-group-5-sub-2").css("display") != 'none' || 
					$(".s-wash-behavior-group-5-sub-3").css("display") != 'none'){
			if($(".s-wash-time-group-1-sub").css("background-color") != 'rgb(255, 255, 255)'){
				// 显示签字页面
				$(".sign-page-out").css("display", "block");
				$(".sign-page-in").css("display", "block");
			}
		} else {
			// 隐藏签字页面
			$(".sign-page-out").css("display", "none");
			$(".sign-page-in").css("display", "none");
		}
	});
	$(".sign-page-out").click(function(){
		// 隐藏签字页面
		$(".sign-page-out").css("display", "none");
		$(".sign-page-in").css("display", "none");
	});
	$(".sign-page-close").click(function(){
		// 隐藏签字页面
		$(".sign-page-out").css("display", "none");
		$(".sign-page-in").css("display", "none");
	});
	
});