package com.dpp.rent.app.api.model.request;

import com.dpp.rent.app.api.model.BaseForm;

public class LoginForm extends BaseForm{

	private static final long serialVersionUID = 6067057688384857917L;
	
	// 用户登录密码
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
