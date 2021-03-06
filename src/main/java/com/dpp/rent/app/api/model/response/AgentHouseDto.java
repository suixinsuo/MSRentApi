package com.dpp.rent.app.api.model.response;

import java.io.Serializable;

public class AgentHouseDto implements Serializable {
	
	private static final long serialVersionUID = -3379368320084076002L;
	// 经纪人id
	private String id;
	// 房子类型 0.出售，1.出租
	private String type;
	// 状态   0.发布1.带看，2.签约中心，3.签订合同，4.过户，5.银行放款，6.成交，7.买卖双方评价
	private String status;
	// 房子id
	private String houseId;

	// 售价单位元
	private double price;

	// 每平米售价
	private double perPrice;

	// 户型 1.一室 2.二室 3.三室4.四室5.五室6.五室以上
	private String huxing;

	// 厅 0.0厅,1.1厅 ,2.2厅, 3.3厅, 4.多厅
	private String ting;

	// 对房子各方面的说明
	private String remark;

	// 房子面积
	private String houseArea;

	// 朝向，0.朝东，1.朝南，2.朝西，3.朝北，4.南北
	private String orientation;

	// 房子标签，0.满5年，1.满2年，2.近地铁，3.新上，4.随时看房，5.不看商业类
	private String houseLabel;

	// 房子建筑日期，存储1993,1994等
	private String houseDate;

	// 房子具体楼层
	private String floorLevel;

	// 房子所属商圈
	private String tradeId;
	
	// 商圈名称
	private String tradeName;

	// 房子所属小区
	private String cooId;
	
	// 小区名称
	private String cooName;

	// 是否有电梯，0.没有，1.有
	private String elevator;

	// 房子用途，0.普通住宅，1.办公楼
	private String purpose;

	// 房子属权0.央产权
	private String power;

	// 首付预算，可以为数字可以为说明
	private String prePay;

	// 装修类型，0.简装修，1.精装修，2.豪华装修
	private String renovation;

	// 房源介绍
	private String houseDes;
	
	// 推荐人
	private String childId;
	
	// 房源标题
	private String houseTitle;
	
	// 图片路径
	private String housePic;
	
	// 小区地址
	private String cooAddress;
	
	public String getCooAddress() {
		return cooAddress;
	}

	public void setCooAddress(String cooAddress) {
		this.cooAddress = cooAddress;
	}

	public String getHousePic() {
		return housePic;
	}

	public void setHousePic(String housePic) {
		this.housePic = housePic;
	}

	public String getHouseTitle() {
		return houseTitle;
	}

	public void setHouseTitle(String houseTitle) {
		this.houseTitle = houseTitle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPerPrice() {
		return perPrice;
	}

	public void setPerPrice(double perPrice) {
		this.perPrice = perPrice;
	}

	public String getHuxing() {
		return huxing;
	}

	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}

	public String getTing() {
		return ting;
	}

	public void setTing(String ting) {
		this.ting = ting;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getHouseLabel() {
		return houseLabel;
	}

	public void setHouseLabel(String houseLabel) {
		this.houseLabel = houseLabel;
	}

	public String getHouseDate() {
		return houseDate;
	}

	public void setHouseDate(String houseDate) {
		this.houseDate = houseDate;
	}

	public String getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(String floorLevel) {
		this.floorLevel = floorLevel;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getCooId() {
		return cooId;
	}

	public void setCooId(String cooId) {
		this.cooId = cooId;
	}

	public String getElevator() {
		return elevator;
	}

	public void setElevator(String elevator) {
		this.elevator = elevator;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getPrePay() {
		return prePay;
	}

	public void setPrePay(String prePay) {
		this.prePay = prePay;
	}

	public String getRenovation() {
		return renovation;
	}

	public void setRenovation(String renovation) {
		this.renovation = renovation;
	}

	public String getHouseDes() {
		return houseDes;
	}

	public void setHouseDes(String houseDes) {
		this.houseDes = houseDes;
	}

	public String getChildId() {
		return childId;
	}

	public void setChildId(String childId) {
		this.childId = childId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getCooName() {
		return cooName;
	}

	public void setCooName(String cooName) {
		this.cooName = cooName;
	}
}
