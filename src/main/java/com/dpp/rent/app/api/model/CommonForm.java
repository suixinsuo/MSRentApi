package com.dpp.rent.app.api.model;

import com.dpp.rent.app.api.model.BaseForm;

/**
 * className:CommonForm.java
 * description: 登录之后所有的请求form需继承该类
 * date: 2018年6月30日
 * author:jpg
 */
public class CommonForm extends BaseForm{

	private static final long serialVersionUID = 1L;
	// 登录返回的token
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
