package com.dpp.rent.app.api.constant;

/**
 * 常量定义
 */
public interface MSConstant {
	public static String REQDATA = "reqData";
	
	public static String REP_DATA = "reqData_response";
	
	/**
	 * 用户状态码
	 */
	public static String USER_NORMAL_STATUS = "1";
	
	/**
	 * 发送短信类型 1.注册，2.登录，3.修改密码
	 */
	public static String SEND_MOBILE_REGISTER = "1";
	public static String SEND_MOBILE_QUICKLOGIN = "2";
	public static String SEND_MOBILE_MODIFYPWD = "3";
	
	public static String USER_STATUS_APPLY="0";
	public static String USER_STATUS_NORMAL="1";
	public static String USER_STATUS_CANCELL="9";
	

}
