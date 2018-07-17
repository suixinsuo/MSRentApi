package com.dpp.rent.app.api.model.response;

import java.io.Serializable;
import java.util.List;

/**
 * className:AreaResponse.java
 * description: 区域返回对象
 * date: 2018年7月11日
 * author:jpg
 */
public class AreaResponse implements Serializable{

	private static final long serialVersionUID = -7588982047516602878L;
	
	private List<AreaDto> areaResponse;

	public List<AreaDto> getAreaResponse() {
		return areaResponse;
	}

	public void setAreaResponse(List<AreaDto> areaResponse) {
		this.areaResponse = areaResponse;
	}
	
}
