package com.dpp.rent.app.api.model.response;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable{
	private static final long serialVersionUID = -4321699736732251476L;

	// 用户id，即手机号
	private String id;
	
	// 用户名
	private String name;
	
	// 创建时间
	private Date createDate;
	
	// 用户类型：0.游客,1.经纪人,2.信息员 3.代理公司  4.物业服务站  5.合伙人 6.管理员
	private String type;
	
	// 用户状态0.未审核1.正常 9.注销
	private String status;
	
	// 用户说明
	private String remark;

	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
