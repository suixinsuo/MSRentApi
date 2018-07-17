package com.dpp.rent.app.api.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * className:User.java
 * description: 用户表t_user
 * date: 2018年6月23日
 * author:jpg
 */
public class User implements Serializable{

	private static final long serialVersionUID = 7315207941384449960L;
	// 用户id，即手机号
	private String id;
	
	// 用户名
	private String name;
	
	// 用户密码
	private String password;
	
	// 创建时间
	private Date createDate;
	
	// 用户类型：0.游客,1.经纪人,2.信息员 3.代理公司  4.物业服务站  5.合伙人 6.管理员
	private String type;
	
	// 用户状态0.未审核1.正常 9.注销
	private String status;
	
	// 经纪人绑定的商圈
	private String tradeId;
	
	// 绑定的小区id
	private String cooId;
	
	// 推荐生成码
	private String linkCode;
	
	// 上级id，信息员或者游客的上级经纪人
	private String parentId;
	
	// 用户说明
	private String remark;
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getLinkCode() {
		return linkCode;
	}

	public void setLinkCode(String linkCode) {
		this.linkCode = linkCode;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
