package com.clouds.igankong.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clouds.igankong.ParamesAPI.ParamesAPI;
import com.clouds.igankong.ParamesAPI.WeixinUtil;
import com.clouds.igankong.po.User;
import com.clouds.igankong.services.LoginService;

/**
 * 
 * @ClassName: LoginController.java
 * @author: 王勇博
 * @Description:  
 * @date:   2016年5月13日 下午6:08:40
 *
 */
//@Controller
public class LoginController {
	//调用service查找 数据库
	@Autowired
	private LoginService loginService;
	
	/**
	 * 判断当前用户是否已经登记，如已登记则判断是临床端还是感控端用户，然后跳转到相应页面
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping(value="/login",method={RequestMethod.POST, RequestMethod.GET})
	public String Login(HttpServletRequest request, HttpServletResponse response,
			Model model, HttpSession session)throws Exception{
		
		System.out.println("进入login方法...................新");
		
//		User user = loginService.checkLogin(userid);
		
		
		
		
		System.out.println("执行出来..........");
		return "login";
	}
	
	
	/*@RequestMapping("/clinicalIndex")
	public String ClinicalIndex() throws Exception {
		
		
		return null;
	}*/
		
}
