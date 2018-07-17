package com.dpp.rent.app.api.model;

import java.io.Serializable;

public class JsonReturn implements Serializable {
	private static final long serialVersionUID = -6197907357688795950L;
	
	private boolean result;
	private Object data;
	private String errorCode;
	private String errorMsg;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public boolean isResult() {
		return result;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static JsonReturn ok() {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(true);
		return jsonReturn;
	}
	public static JsonReturn fali() {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(false);
		return jsonReturn;
	}
	
	public static JsonReturn ok(Object object) {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(true);
		jsonReturn.setData(object);
		return jsonReturn;
	}
	
	public static JsonReturn fail(String errorCode,String errorMsg) {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(false);
		jsonReturn.setErrorCode(errorCode);
		jsonReturn.setErrorMsg(errorMsg);
		return jsonReturn;
	}
	
	
}
