package com.dpp.rent.app.api.service.agent;

import com.dpp.rent.app.api.model.request.agent.AddAgenthouseForm;
import com.dpp.rent.app.api.model.request.agent.AgentHouseForm;
import com.dpp.rent.app.api.model.request.agent.AgentHouseVo;
import com.dpp.rent.app.api.model.response.AgentHouseResponse;


public interface AgentHouseService {
	
	/**
	 * description: 新增房子
	 * retrun_type:void
	 * date: 2018年7月13日
	 * author:jpg
	 */
	void addAgentHouse(AddAgenthouseForm addAgenthouseForm);
	
	/**
	 * description: 查询房源
	 * retrun_type:void
	 * date: 2018年7月13日
	 * author:jpg
	 */
	AgentHouseResponse getAgentHouse(AgentHouseForm agentHouseForm);
	
	
}
