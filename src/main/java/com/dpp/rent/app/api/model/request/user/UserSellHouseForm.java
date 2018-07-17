package com.dpp.rent.app.api.model.request.user;

import com.dpp.rent.app.api.model.CommonForm;

/**
 * className:UserSellHouseForm.java 
 * description: 用户发布出售房子formbean date:
 * 2018年7月5日 author:jpg
 */
public class UserSellHouseForm extends CommonForm {

	private static final long serialVersionUID = -1366601307525735713L;
	
	// 期望售价（单位元）
	private String expectPrice;

	// 户型,0.不限1.一居2.二居3.三居4.四居5.五局6.别墅
	private String huxing;

	// 业主电话，即卖房人或者买房人手机号或者电话
	private String housePhone;

	// 补充说明，即对房子的各方面情况说明
	private String remark;

	// 产权面积（出售时可选字段）
	private double houseArea;

	// 小区名称（出售时可选字段
	private String communityName;

	// 小区地址（出售时可选字段）
	private String address;

	// 栋座（出售时可选字段）
	private String pedestal;

	// 单元（出售时可选字段）
	private String unit;

	// 室号（出售时可选字段）
	private String roomNum;

	public String getExpectPrice() {
		return expectPrice;
	}

	public void setExpectPrice(String expectPrice) {
		this.expectPrice = expectPrice;
	}

	public String getHuxing() {
		return huxing;
	}

	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}

	public String getHousePhone() {
		return housePhone;
	}

	public void setHousePhone(String housePhone) {
		this.housePhone = housePhone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public double getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(double houseArea) {
		this.houseArea = houseArea;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPedestal() {
		return pedestal;
	}

	public void setPedestal(String pedestal) {
		this.pedestal = pedestal;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
}
