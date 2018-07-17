package com.dpp.rent.app.api.domain;

import java.io.Serializable;

/**
 * className:Area.java
 * description: 区域表
 * date: 2018年7月11日
 * author:jpg
 */
public class Area implements Serializable{

	private static final long serialVersionUID = 4273049121349364916L;
	// 区域id
	private String areaId;
	// 区域名称
	private String areaName;
	// 备注
	private String remark;
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
