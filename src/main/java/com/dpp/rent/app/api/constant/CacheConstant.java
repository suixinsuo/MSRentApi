package com.dpp.rent.app.api.constant;

import com.dpp.rent.app.api.model.request.SmsForm;

/**
 * className:CacheConstant.java
 * description: 缓存key前缀
 * date: 2018年6月23日
 * author:jpg
 */
public class CacheConstant {
	
	/**
	 * description: 获取登录缓存key
	 * retrun_type:String
	 * date: 2018年6月24日
	 * author:jpg
	 */
	public static String getLoginKey(String mobile) {
		return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getLoginKey")
					.append(mobile).toString();
	}
	
//	public static String getQuickLoginKey(String mobile) {
//		return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getQuickLoginKey")
//					.append(mobile).toString();
//	}
	
	/**
	 * description: 获取发送各类型短信key
	 * retrun_type:String
	 * date: 2018年6月24日
	 * author:jpg
	 */
	public static String getSMSKey(String mobile,String type) {
		if (MSConstant.SEND_MOBILE_REGISTER.equals(type)){
			return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getRegisterMobileKey")
					.append(mobile).toString();
		}
		if (MSConstant.SEND_MOBILE_QUICKLOGIN.equals(type)){
			return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getQuickLoginMobileKey")
					.append(mobile).toString();
		}
		if (MSConstant.SEND_MOBILE_MODIFYPWD.equals(type)){
			return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getModifyPwdMobileKey")
					.append(mobile).toString();
		}
		return null;
	}
	
	/**
	 * description: 获取授权code缓存key
	 * retrun_type:void
	 * date: 2018年7月21日
	 * author:jpg
	 */
	public static String getHxtokenKey() {
		return new StringBuffer().append("com.dpp.rent.app.api.constant.CacheConstant.getHxtokenKey")
				.toString();
	}
}
