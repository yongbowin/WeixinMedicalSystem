package com.clouds.igankong.exception;

/**
 * 
 * @ClassName: CustomException.java
 * @author: 王勇博
 * @Description: 系统自定义异常类
 * @date:   2016年5月10日 下午1:16:19
 *
 */
public class CustomException extends Exception {
	String message;
	public CustomException(String message){
		super(message);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
