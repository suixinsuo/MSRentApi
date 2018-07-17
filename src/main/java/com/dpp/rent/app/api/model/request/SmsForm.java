package com.dpp.rent.app.api.model.request;

import com.dpp.rent.app.api.model.BaseForm;

public class SmsForm extends BaseForm{

	private static final long serialVersionUID = 3031987982933179802L;
	
	// 发送短信类型 1.注册 ，2.登陆，3.修改密码
	private String sendType;

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}
	
	
}
