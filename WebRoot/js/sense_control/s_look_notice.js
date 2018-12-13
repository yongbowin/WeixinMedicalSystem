$(function(){
	
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
		window.location.href = "s_index.jsp";
	});
    /*读完点我-标记为已读*/
    $(".panel-noti-cont-mark").click(function(){
    	$(this).html("已读");
    	$(this).css("color", "#9F9F9F")
    			.css("background-color", "#fff");
    });
	
});
