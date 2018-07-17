package com.dpp.rent.app.api.model.request;

import com.dpp.rent.app.api.model.BaseForm;

/**
 * className:RegisterForm.java
 * description: 用户注册form
 * date: 2018年6月24日
 * author:jpg
 */
public class RegisterForm extends BaseForm{

	private static final long serialVersionUID = 5808742661523979021L;
	
	// 短信验证码
	private String verifyCode;
	
	// 用户设置密码
	private String password;
	
	// 注册码
	private String linkCode;
	
	public String getLinkCode() {
		return linkCode;
	}

	public void setLinkCode(String linkCode) {
		this.linkCode = linkCode;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
