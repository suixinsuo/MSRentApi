package com.dpp.rent.app.api.model.response;

import java.io.Serializable;
import java.util.List;

public class AgentResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<UserDto> agentResponse;

	public List<UserDto> getList() {
		return agentResponse;
	}

	public void setList(List<UserDto> list) {
		this.agentResponse = list;
	}
	
}
