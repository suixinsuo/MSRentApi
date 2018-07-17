package com.dpp.rent.app.api.domain;

import java.io.Serializable;

/**
 * className:Cooperation.java
 * description: 小区名称
 * date: 2018年7月11日
 * author:jpg
 */
public class Cooperation implements Serializable{

	private static final long serialVersionUID = 6024912209134809043L;
	// 小区id
	private String cooId;
	// 小区名称
	private String cooName;
	// 小区详细地址
	private String cooAddress;
	// 商圈id
	private String tradeId;
	// 状态0.正常，1.弃用
	private String status;
	// 小区说明
	private String remark;
	
	public String getCooId() {
		return cooId;
	}
	public void setCooId(String cooId) {
		this.cooId = cooId;
	}
	public String getCooName() {
		return cooName;
	}
	public void setCooName(String cooName) {
		this.cooName = cooName;
	}
	public String getCooAddress() {
		return cooAddress;
	}
	public void setCooAddress(String cooAddress) {
		this.cooAddress = cooAddress;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
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
