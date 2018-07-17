package com.dpp.rent.app.api.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * className:AgentHouse.java 
 * description: 经纪人发布的房源 
 * date: 2018年7月13日 
 * author:jpg
 */
public class AgentHouse implements Serializable {

	private static final long serialVersionUID = -4783224680160046225L;
	// 房源id
	private String houseId;
	
	// 对应经纪人id
	private String id;

	// 房源类型0.出售，1.出租
	private String type;

	// 创建时间
	private Date createDate;

	// 房源状态 0.发布1.带看，2.签约中心，3.签订合同，4.过户，5.银行放款，6.成交，7.买卖双方评价
	private String status;

	// 绑定的游客或者信息员id
	private String childId;

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChildId() {
		return childId;
	}

	public void setChildId(String childId) {
		this.childId = childId;
	}
}
