package com.dpp.rent.app.api.service.user;

import com.dpp.rent.app.api.model.request.user.UserBuyHouseForm;
import com.dpp.rent.app.api.model.request.user.UserLeaseHouseForm;
import com.dpp.rent.app.api.model.request.user.UserRentHouseForm;
import com.dpp.rent.app.api.model.request.user.UserSellHouseForm;

/**
 * className:UserBuyHouseService.java
 * description: 用户发布出售求购意向接口
 * date: 2018年7月5日
 * author:jpg
 */
public interface UserBuyHouseService {
	/**
	 * description: 新增出售房源记录
	 * retrun_type:void
	 * date: 2018年7月5日
	 * author:jpg
	 */
	void addUserSellHouse(UserSellHouseForm userSellHouseForm);
	
	/**
	 * description: 新增求购房源记录
	 * retrun_type:void
	 * date: 2018年7月5日
	 * author:jpg
	 */
	void addUserBuyHouse(UserBuyHouseForm userBuyHouseForm);
	
	/**
	 * description: 新增出租房源记录
	 * retrun_type:void
	 * date: 2018年7月7日
	 * author:jpg
	 */
	void addUserLeaseHouse(UserLeaseHouseForm userLeaseHouseForm);
	
	/**
	 * description: 新增求租房源记录
	 * retrun_type:void
	 * date: 2018年7月7日
	 * author:jpg
	 */
	void addUserRentHouse(UserRentHouseForm userRentHouseForm);
	
}
