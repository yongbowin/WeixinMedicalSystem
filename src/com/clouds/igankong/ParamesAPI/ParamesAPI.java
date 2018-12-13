package com.clouds.igankong.ParamesAPI;

/**
 * 
 * @ClassName: ParamesAPI.java
 * @author: 王勇博
 * @Description: 参数工具类 
 * @date:   2016年5月12日 下午2:52:36
 *
 */
public class ParamesAPI {
	/**
	 * 常量说明：
	 * 此处定义的常量需要持久化，可以保存在数据库中，在需要的地方读取。
	 * 在多企业号中，最好以每个应用来定义。
	 */
	public static final int AGENTID = 1;
	// token
	public static String token = "xxxxxx";
	// 随机戳
	public static String encodingAESKey = "xxxxxx";  
	 //你的企业号ID
	public static String corpId = "xxxxxx";
	// 管理组的凭证密钥，每个secret代表了对应用、通讯录、接口的不同权限；不同的管理组拥有不同的secret
	public static String secret = "xxxxxx";
	// OAuth2 回调地址
	public static String REDIRECT_URI = "xxxxxx";
}
