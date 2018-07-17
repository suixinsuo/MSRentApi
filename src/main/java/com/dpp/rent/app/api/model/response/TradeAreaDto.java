package com.dpp.rent.app.api.model.response;

import java.io.Serializable;

public class TradeAreaDto implements Serializable {

	private static final long serialVersionUID = -2633846695156647009L;

	// 商圈id
	private String tradeId;
	// 区域id
	private String areaId;
	// 区域名称
	private String areaName;
	// 商圈名称
	private String tradeName;
	// 商圈描述
	private String remark;
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

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
}
