$(function(){
	// 定义公共函数
	function l_p_con(arg){
		$(arg).css("background-color", "#60bf2f")
				.css("border-color", "#60bf2f")
				.css("color", "#fff");
		$(arg).siblings(".l-p-common")
				.css("background-color", "#fff")
				.css("border-color", "#9f9f9f")
				.css("color", "#9f9f9f");
		$(arg).parent().siblings().children(".l-p-common")
				.css("background-color", "#fff")
				.css("border-color", "#9f9f9f")
				.css("color", "#9f9f9f");
	}
	// 初始化
	l_p_con(".l-position-1-1");
	// 绿色 rgb(96, 191, 47)
	$(".l-position-1-1").click(function(){
		var args = ".l-position-1-1";
		l_p_con(args);
	});
	$(".l-position-1-2").click(function(){
		var args = ".l-position-1-2";
		l_p_con(args);
	});
	$(".l-position-2-1").click(function(){
		var args = ".l-position-2-1";
		l_p_con(args);
	});
	$(".l-position-3-1").click(function(){
		var args = ".l-position-3-1";
		l_p_con(args);
	});
	$(".l-position-3-2").click(function(){
		var args = ".l-position-3-2";
		l_p_con(args);
	});
	$(".l-position-4-1").click(function(){
		var args = ".l-position-4-1";
		l_p_con(args);
	});
	
	
});