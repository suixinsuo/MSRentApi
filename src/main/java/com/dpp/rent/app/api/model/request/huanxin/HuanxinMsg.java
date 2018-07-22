package com.dpp.rent.app.api.model.request.huanxin;

import java.io.Serializable;

public class HuanxinMsg implements Serializable{

	private static final long serialVersionUID = -7326997528494480412L;
	
	private String target_type;
	// 用户数组
	private String[] target;
	
	private Msg msg;
	// 初始化消息
	public HuanxinMsg(String[] target,String message ) {
		this.target_type = "users";
		this.target = target;
		Msg msgReq = new Msg();
		msgReq.setType("txt");
		msgReq.setMsg(message);
		this.msg = msgReq;
		
	}
	public String getTarget_type() {
		return target_type;
	}

	public void setTarget_type(String target_type) {
		this.target_type = target_type;
	}

	public String[] getTarget() {
		return target;
	}

	public void setTarget(String[] target) {
		this.target = target;
	}

	public Msg getMsg() {
		return msg;
	}

	public void setMsg(Msg msg) {
		this.msg = msg;
	}
	
}
