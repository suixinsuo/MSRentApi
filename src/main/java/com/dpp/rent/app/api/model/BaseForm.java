package com.dpp.rent.app.api.model;

import java.io.Serializable;

/**
 * @author jpg
 *	请求基础类
 */
public class BaseForm implements Serializable  {

	private static final long serialVersionUID = -2114761897494426185L;
	
	// 手机号
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
