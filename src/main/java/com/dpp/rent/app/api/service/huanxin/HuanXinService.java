package com.dpp.rent.app.api.service.huanxin;

/**
 * className:HuanXinService.java
 * description: 环信用户管理
 * date: 2018年7月19日
 * author:jpg
 */
public interface HuanXinService {
	
	/**
	 * description: 创建环信用户
	 * retrun_type:void
	 * date: 2018年7月19日
	 * author:jpg
	 */
	void addUser(String userId,String password);
	
	/**
	 * description: 根据用户id删除环信用户
	 * retrun_type:void
	 * date: 2018年7月21日
	 * author:jpg
	 */
	void deleteUser(String userId);
	
	/**
	 * 重置用户密码
	 */
	void reSetPwd(String id,String password);
	
	/**
	 * description: 获取授权token
	 * retrun_type:void
	 * date: 2018年7月21日
	 * author:jpg
	 */
	String getToken();
}
