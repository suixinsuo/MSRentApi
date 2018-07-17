package com.dpp.rent.app.api.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * className:DateUtil.java
 * description: 时间处理工具类
 * date: 2018年7月13日
 * author:jpg
 */
public class DateUtil {
	
	/**
	 * 格式化时间为yyyy
	 */
	public static String formatDate(Date date) {
		String str = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		str = formatter.format(date);
		return str;
	}
	
	/**
	 * description: 获取当前时间年份
	 * retrun_type:int
	 * date: 2018年7月13日
	 * author:jpg
	 */
	public static int getCurrentYear() {
		Calendar a=Calendar.getInstance();
		int result = a.get(Calendar.YEAR);
		return result;
	}
	
	public static void main(String[] args) {
		  Calendar a=Calendar.getInstance();
		  System.out.println(a.get(Calendar.YEAR));//得到年
	}
}
