package com.dpp.rent.app.api.model.request.agent;

import com.dpp.rent.app.api.model.CommonForm;

/**
 * className:SearchAgentForm.java
 * description: 查询经纪人
 * date: 2018年7月13日
 * author:jpg
 */
public class SearchAgentForm extends CommonForm{

	private static final long serialVersionUID = -1220126337520756366L;
	// 手机号
	private String mobile;
	
	// 用户名
	private String name;
	
	// 用户类型：1.经纪人 3.代理公司 4.物业服务站 5.合伙人 
	private String type;
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
