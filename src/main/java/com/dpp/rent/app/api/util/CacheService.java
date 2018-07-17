package com.dpp.rent.app.api.util;

/**
 * className:CacheService.java
 * description: 缓存业务处理
 * date: 2018年6月23日
 * author:jpg
 */
public interface CacheService {
	/**
	 * description: 缓存里赋值键值对
	 * retrun_type:void
	 * date: 2018年6月23日
	 * author:jpg
	 */
	public void set(String key ,int time,  String value);
	
	/**
	 * description: redis获取值
	 * retrun_type:Object
	 * date: 2018年6月23日
	 * author:jpg
	 */
	public Object get(String key);
}
