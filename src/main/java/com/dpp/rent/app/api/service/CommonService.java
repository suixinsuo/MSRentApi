package com.dpp.rent.app.api.service;

import java.util.List;

import javax.xml.ws.ServiceMode;

import com.dpp.rent.app.api.domain.Area;
import com.dpp.rent.app.api.model.request.SmsForm;
import com.dpp.rent.app.api.model.response.AreaResponse;
import com.dpp.rent.app.api.model.response.TradeAreaResponse;

/**
 * className:CommonService.java
 * description: 封装公共服务
 * date: 2018年6月24日
 * author:jpg
 */
public interface CommonService {
	/**
	 * description: 发送短信服务
	 * retrun_type:void
	 * date: 2018年6月24日
	 * author:jpg
	 */
	void sendSms(SmsForm smsForm);
	
	/**
	 * 获取所有区域
	 */
	AreaResponse getAllArea();
	
	/**
	 * description: 根据区域id获取所有商圈
	 * retrun_type:TradeAreaResponse
	 * date: 2018年7月11日
	 * author:jpg
	 */
	TradeAreaResponse getTradeArea(String areaId);
	
	TradeAreaResponse getAllTradeArea();
	
	
}
