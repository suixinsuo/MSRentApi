package com.dpp.rent.app.api.model.request.agent;

import java.util.Date;

import com.dpp.rent.app.api.model.CommonForm;

/**
 * className:AddAgentForm.java 
 * description: 
 * 新增经纪人 date: 2018年7月13日 author:jpg
 */
public class AddAgentForm extends CommonForm {

	private static final long serialVersionUID = -4670011342881177769L;
	// 经纪人手机号
	private String mobile;
	// 用户名
	private String name;

	// 用户密码
	private String password;

	// 用户类型：0.游客,1.经纪人,2.信息员 3.代理公司 4.物业服务站 5.合伙人 6.管理员
	private String type;

	// 经纪人绑定的商圈
	private String tradeId;

	// 绑定的小区id
	private String cooId;

	// 用户说明
	private String remark;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getCooId() {
		return cooId;
	}

	public void setCooId(String cooId) {
		this.cooId = cooId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
