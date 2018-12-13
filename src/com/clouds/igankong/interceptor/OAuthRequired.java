package com.clouds.igankong.interceptor;

import java.lang.annotation.*;

/**
 * 
 * @ClassName: OAuthRequired.java
 * @author: 王勇博
 * @Description: 验证OAuth2注解 
 * @date:   2016年6月27日 下午4:44:17
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OAuthRequired {
	
}
