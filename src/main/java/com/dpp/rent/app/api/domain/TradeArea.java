package com.dpp.rent.app.api.domain;

import java.io.Serializable;

/**
 * className:TradeArea.java
 * description: 商圈划分表
 * date: 2018年7月11日
 * author:jpg
 */
public class TradeArea implements Serializable{

	private static final long serialVersionUID = -7571148655271932682L;
	// 商圈id
	private String tradeId;
	// 区域id
	private String areaId;

	private String tradeName;
	// 备注说明
	private String remark;
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
