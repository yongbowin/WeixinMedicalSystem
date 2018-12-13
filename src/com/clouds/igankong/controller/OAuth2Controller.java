package com.clouds.igankong.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.clouds.igankong.ParamesAPI.AccessToken;
import com.clouds.igankong.ParamesAPI.ParamesAPI;
import com.clouds.igankong.ParamesAPI.WeixinUtil;
import com.clouds.igankong.po.User;
import com.clouds.igankong.services.LoginService;
import com.clouds.igankong.weixinUtils.Result;

@Controller
public class OAuth2Controller {

	/**
	 * 拼接网页授权链接
	 * 此处步骤也可以用页面链接代替
	 * @return
	 */
	@RequestMapping(value = { "/oauth2wx" })
	public static String Oauth2API(HttpServletRequest request){
		// 获取项目域名
		StringBuffer url = request.getRequestURL();  
		String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/").toString(); 
		// 获取工程名
		String projectName = request.getContextPath().replace("/", "");
		//拼接微信回调地址 http://tiandaochouqin.tunnel.qydev.com/QiyeProject/
		String backUrl = tempContextUrl + projectName + "/oauth2me.action";
		
		System.out.println("加密前的回调地址是：" + backUrl);
		
		String redirect_uri = "";
		try {
			redirect_uri = java.net.URLEncoder.encode(backUrl, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String oauth2Url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + ParamesAPI.corpId + "&redirect_uri=" + redirect_uri
				+ "&response_type=code&scope=snsapi_base&state=sunlight#wechat_redirect";
		System.out.println("oauth2Url的值是：" + oauth2Url + "!!!!!!!!!!!!!!!!!!!!!!!!!");
		return "redirect:" + oauth2Url;
	}
	
	//调用service查找 数据库
	@Autowired
	private LoginService loginService;
	
	/**
	 * 授权回调请求处理
	 * @return
	 */
	@RequestMapping(value = { "/oauth2me" })
	public String oAuth2Url(HttpServletRequest request, @RequestParam String code){
		
		AccessToken accessToken = WeixinUtil.getAccessToken(ParamesAPI.corpId, ParamesAPI.secret);
		HttpSession session = request.getSession();
		
		String Userid = "";
		
		if (accessToken != null && accessToken.getToken() != null) {
			Userid = getMemberGuidByCode(accessToken.getToken(), code, ParamesAPI.AGENTID);
			if (Userid != null) {
				session.setAttribute("UserId", Userid);
			}
		}
		
		User user = null;
		try {
			user = loginService.checkLogin(Userid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(user != null){
			session.setAttribute("username", user.getUsername());
			// 判断用户身份，如果为临床端用户，则跳转到临床端首页，否则跳转到感控端首页（临床端为1，感控端为2）
			int position = 1;
			
			if(position == 1){
				// 跳转到临床端首页
				return "clinical/c_index";
			} else {
				// 跳转到感控端首页
				return "sense_control/s_index";
			}
		}
		// 这里简单处理,存储到session中
		return "login";
	}
	
	/**
	 * 获取用户在企业的Userid
	 * @param request
	 * @param code
	 * @return
	 */
	public String getUserID(HttpServletRequest request, @RequestParam String code){
		AccessToken accessToken = WeixinUtil.getAccessToken(ParamesAPI.corpId, ParamesAPI.secret);
		String Userid= "";
		if (accessToken != null && accessToken.getToken() != null) {
			Userid = getMemberGuidByCode(accessToken.getToken(), code, ParamesAPI.AGENTID);
		}
		// 返回用户在企业的Userid
		return Userid;
	}
	
	/**
	 * 调用接口获取用户信息
	 * 
	 * @param token
	 * @param code
	 * @param agentId
	 * @return
	 * @throws SQLException
	 * @throws RemoteException
	 */
	public String getMemberGuidByCode(String token, String code, int agentId) {
		System.out.println("code==" + code + "\ntoken=" + token + "\nagentid=" + agentId);
		Result<String> result = WeixinUtil.oAuth2GetUserByCode(token, code, agentId);
		System.out.println("result=" + result);
		if (result.getErrcode() == "0") {
			if (result.getObj() != null) {
				// 此处可以通过微信授权用code还钱的Userid查询自己本地服务器中的数据
				return result.getObj();
			}
		}
		return "";
	}
}
