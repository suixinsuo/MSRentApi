package com.dpp.rent.app.api.constant;

public enum BusinessErrorCode {
	
	SYSTEM_ERROR("SYSTEM_ERROR", "系统错误"),
	TOKEN_IS_INVALID("TOKEN_IS_INVALID", "登录已失效，请重新登录"),
	QI_NIU_ISERROR("QI_NIU_ISERROR", "7牛图片服务器系统异常"),
	SEND_SMS_ERROR("SEND_SMS_ERROR", "发送手机验证码失败"),
	SMS_IS_NOT_REGISTER("SMS_IS_NOT_REGISTER","用户未注册"),
	REQDATA_IS_NULL("REQDATA_IS_NULL", "请求数据reqData为空"), 
	REQDATA_PARSEOBJECT_IS_NULL("REQDATA_PARSEOBJECT_IS_NULL", "请求json数据转换对象异常异常"), 
	OPERATE_HUANXINUSER_ERROR("OPERATE_HUANXINUSER_ERROR", "操作环信用户失败"), 
	
	ILLEGAL_REQUEST("ILLEGAL_REQUEST", "非法请求"), 
	USER_IS_NOT_NORMAL("USER_IS_NOT_NORMAL","用户状态异常无法登录，请联系客服"),
	USER_IS_NOT_REGISTER("USER_IS_NOT_REGISTER","用户未注册，无法登录"),
	USER_PASSWORD_ERROR("USER_PASSWORD_ERROR","登录密码错误，请重新登录"),
	USER_HAS_REGISTED("USER_HAS_REGISTED","手机号已注册，请更换手机号进行注册"),
	MOBILE_VERIFYCODE_ERROR("MOBILE_VERIFYCODE_ERROR","手机验证码错误"),
	MOBILE_QUICK_VERIFYCODE_ERROR("MOBILE_QUICK_VERIFYCODE_ERROR","用户快速登录验证码错误"),
	
	
	SYSTEM_CACHE_ERROR("SYSTEM_CACHE_ERROR","系统错误"),
	;
	private String id;
	private String description;

	private BusinessErrorCode(String id, String description) {
		this.id = id;
		this.description = description;
	}

	/**
	 * description: 根据id获取描述 
	 * retrun_type:String 
	 * date: 下午2:20:58 
	 * author:jpg
	 */
	public static String getDes(String id) {
		for (BusinessErrorCode bc : BusinessErrorCode.values()) {
			if (bc.getId() == id) {
				return bc.description;
			}
		}
		return null;
	}
	
	/**
	 * description: 根据id获取对象
	 * retrun_type:BusinessErrorCode
	 * date: 2018年6月30日
	 * author:jpg
	 */
	public static BusinessErrorCode getObject(String id) {
		for (BusinessErrorCode bc : BusinessErrorCode.values()) {
			if (bc.getId() == id) {
				return bc;
			}
		}
		return null;
	}
	

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
}
