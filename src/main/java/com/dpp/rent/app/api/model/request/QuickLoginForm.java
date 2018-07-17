package com.dpp.rent.app.api.model.request;

import com.dpp.rent.app.api.model.BaseForm;

/**
 * className:QuickLoginForm.java
 * description: 快捷登录直接手机号+验证码登录
 * date: 2018年6月24日
 * author:jpg
 */
public class QuickLoginForm extends BaseForm {

	private static final long serialVersionUID = -8872123122423754654L;
	
	// 手机验证码
	private String verifyCode;

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
