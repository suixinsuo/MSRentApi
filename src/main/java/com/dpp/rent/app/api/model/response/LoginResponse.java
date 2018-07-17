package com.dpp.rent.app.api.model.response;

import java.io.Serializable;

/**
 * className:LoginResponse.java
 * description: 常规登录返回对象
 * date: 2018年6月23日
 * author:jpg
 */
public class LoginResponse implements Serializable{

	private static final long serialVersionUID = 1272890454386892860L;
	
	// 用户登录id
	private String id;
	
	// 登录返回token
	private String token;
	
	// 账号类型  0.游客,1.经纪人,2.信息员 3.代理公司  4.物业服务站  5.合伙人 6.管理员
	private String type;
	
	// 经纪人的推荐吗
	private String linkCode;
	
	// 用户名
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLinkCode() {
		return linkCode;
	}

	public void setLinkCode(String linkCode) {
		this.linkCode = linkCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
