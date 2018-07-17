package com.dpp.rent.app.api.model.response;

import java.io.Serializable;
import java.util.List;

/**
 * className:AgentHouseResponse.java
 * description: 经纪人查询房源
 * date: 2018年7月13日
 * author:jpg
 */
public class AgentHouseResponse implements Serializable{

	private static final long serialVersionUID = -7905612480024539323L;
	
	private List<AgentHouseDto> list;

	public List<AgentHouseDto> getList() {
		return list;
	}

	public void setList(List<AgentHouseDto> list) {
		this.list = list;
	}

}
