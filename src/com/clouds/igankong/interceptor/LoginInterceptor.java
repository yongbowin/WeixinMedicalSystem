package com.clouds.igankong.interceptor;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	// @Autowired
	private List<String> excludedUrls;

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println(request.getRequestURI() + "===========>进入LoginInterceptor");
		
		String requestUrl = request.getRequestURI().replace(".jsp", "").replace(".action", "");
		
		System.out.println(requestUrl + "===========>进入LoginInterceptor");
		
		// 判断是否是公开地址，如果是则放行
		for (String url : excludedUrls) {
			if (requestUrl.endsWith(url)) {
				return true;
			}
		}
		// 判断是否存在session
		HttpSession session = request.getSession();
		String mobile = (String) session.getAttribute("userCode");
		
		System.out.println("session:" + mobile);
		
		if (mobile != null) {
			return true;
		}
		request.getRequestDispatcher("/jsp/login.jsp").forward(request,
				response);
		// 跳转到登录界面
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	public List<String> getExcludedUrls() {
		return excludedUrls;
	}

	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

}
