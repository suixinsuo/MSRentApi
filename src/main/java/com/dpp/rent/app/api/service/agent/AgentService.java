package com.dpp.rent.app.api.service.agent;

import com.dpp.rent.app.api.model.request.agent.AddAgentForm;
import com.dpp.rent.app.api.model.request.agent.SearchAgentForm;
import com.dpp.rent.app.api.model.response.AgentResponse;

public interface AgentService {
	
	/**
	 * description: 录入经纪人
	 * retrun_type:void
	 * date: 2018年7月13日
	 * author:jpg
	 */
	void addAgent(AddAgentForm addAgentForm);
	
	/**
	 * description: 查询经纪人
	 * retrun_type:void
	 * date: 2018年7月13日
	 * author:jpg
	 */
	AgentResponse getAgent(SearchAgentForm searchAgentForm);
}
