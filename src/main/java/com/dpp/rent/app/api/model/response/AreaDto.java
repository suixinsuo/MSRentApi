package com.dpp.rent.app.api.model.response;

import java.io.Serializable;

public class AreaDto implements Serializable {

	private static final long serialVersionUID = -8589509352547528033L;

	// 区域id
	private String areaId;
	// 区域名称
	private String areaName;

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
}
