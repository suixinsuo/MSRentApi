package com.dpp.rent.app.api.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * className:UserBuyHouse.java
 * description: 用户出售求购意向表（t_user_buyhouse）
 * date: 2018年7月5日
 * author:jpg
 */
public class UserBuyHouse implements Serializable{

	private static final long serialVersionUID = 6997935066915794916L;
	// houseId,主键，自增长生成
	private int houseId;
	
	// id，用户id，即手机号
	private String id;
	
	// 出售类型：0.出售，1.求购,2.出租，3.求租
	private String type;
	
	// 期望售价（单位元）
	private double expectPrice;
	
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
	
	// 求购时类型，0.区域 1.地铁
	private String areaType;
	
	// 所选区域的下级地点，例如：选0时，下级为武昌，选1时传东湖高新
	private String area1;
	
	// area1的下级，为积玉桥或者关山地铁站
	private String area2;
	
	// 创建时间
	private Date createDate;
	
	// 状态： 0.待抢单，1.已抢单
	private String status;

	// 姓名,购房时需填写
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getExpectPrice() {
		return expectPrice;
	}

	public void setExpectPrice(double expectPrice) {
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

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getArea1() {
		return area1;
	}

	public void setArea1(String area1) {
		this.area1 = area1;
	}

	public String getArea2() {
		return area2;
	}

	public void setArea2(String area2) {
		this.area2 = area2;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
}
