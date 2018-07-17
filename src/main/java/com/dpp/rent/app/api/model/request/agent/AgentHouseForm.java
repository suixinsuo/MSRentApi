package com.dpp.rent.app.api.model.request.agent;

import com.dpp.rent.app.api.model.CommonForm;

/**
 * className:AgentHouseForm.java
 * description: 房源查询bean
 * date: 2018年7月13日
 * author:jpg
 */
public class AgentHouseForm extends CommonForm{

	private static final long serialVersionUID = 5310651413277363102L;
	// 房源状态 0.发布1.带看，2.签约中心，3.签订合同，4.过户，5.银行放款，6.成交，7.买卖双方评价
	private String status;
	//  房子类型 0.出售，1.出租
	private String type;
	// 查询某个经纪人订单
	private String mobile;
	// 商圈id
	private String tradeId;
	
	// 户型 1.一室 2.二室 3.三室4.四室5.五室6.五室以上
	private String huxing;
	
	// 查询房子总售价区间
	private String beginPrice;
	
	private String endPrice;
	
	// 房子总面积区间
	private String beginHouseArea;
	
	private String endHouseArea;
	
	// 朝向 0.朝东，1.朝南，2.朝西，3.朝北，4.南北
	private String orientation;
	
	// 楼龄 houseDateType,0.5年以内，1.10年以内，2.15年以内  3. 20年以内  4.20年以上
	private String houseDateType;
	
	// 楼层区间
	private String beginFloorLevel;
	
	private String endFloorLevel;
	
	// 下级
	private String childId;
	
	// 小区名称模糊查询
	private String cooName;
	
	public String getCooName() {
		return cooName;
	}

	public void setCooName(String cooName) {
		this.cooName = cooName;
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

	public String getChildId() {
		return childId;
	}

	public void setChildId(String childId) {
		this.childId = childId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getHuxing() {
		return huxing;
	}

	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}

	public String getBeginPrice() {
		return beginPrice;
	}

	public void setBeginPrice(String beginPrice) {
		this.beginPrice = beginPrice;
	}

	public String getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}

	public String getBeginHouseArea() {
		return beginHouseArea;
	}

	public void setBeginHouseArea(String beginHouseArea) {
		this.beginHouseArea = beginHouseArea;
	}

	public String getEndHouseArea() {
		return endHouseArea;
	}

	public void setEndHouseArea(String endHouseArea) {
		this.endHouseArea = endHouseArea;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getHouseDateType() {
		return houseDateType;
	}

	public void setHouseDateType(String houseDateType) {
		this.houseDateType = houseDateType;
	}

	public String getBeginFloorLevel() {
		return beginFloorLevel;
	}

	public void setBeginFloorLevel(String beginFloorLevel) {
		this.beginFloorLevel = beginFloorLevel;
	}

	public String getEndFloorLevel() {
		return endFloorLevel;
	}

	public void setEndFloorLevel(String endFloorLevel) {
		this.endFloorLevel = endFloorLevel;
	}
	
	
	
	
}
