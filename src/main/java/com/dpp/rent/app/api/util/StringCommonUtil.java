package com.dpp.rent.app.api.util;

import org.apache.commons.lang3.StringUtils;

public class StringCommonUtil {
	
	/**
	 * 字符串倒序排序
	 */
	public static String reverseStr(String str) {
		if (StringUtils.isNotBlank(str)) {
			StringBuffer stringBuffer = new StringBuffer(str); 
			return stringBuffer.reverse().toString();
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseStr("BSERSFS12345SAFS3434"));
	}
}
