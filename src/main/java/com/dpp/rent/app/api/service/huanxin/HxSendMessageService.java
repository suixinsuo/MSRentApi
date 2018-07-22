package com.dpp.rent.app.api.service.huanxin;

/**
 * className:HxSendMessageService.java
 * description: 发送环信消息
 * date: 2018年7月21日
 * author:jpg
 */
public interface HxSendMessageService {
	/**
	 * description: 发送消息
	 * retrun_type:void
	 * date: 2018年7月22日
	 * author:jpg
	 */
	void sendMsg(String id,String houseId);
}
