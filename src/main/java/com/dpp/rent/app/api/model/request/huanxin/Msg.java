package com.dpp.rent.app.api.model.request.huanxin;

import java.io.Serializable;

public class Msg implements Serializable{

	private static final long serialVersionUID = 1108098617012656300L;
	
	private String type;
	
	private String msg;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
