package com.dpp.rent.app.api.model.request.user;

import com.dpp.rent.app.api.model.CommonForm;

/**
 * className:UserRentHouseForm.java 
 * description: 用户新增求租房源form date: 2018年7月7日
 * author:jpg
 */
public class UserRentHouseForm extends CommonForm {

	private static final long serialVersionUID = -6100905566676177501L;

	// 期望租金（单位元）
	private String expectPrice;

	// 户型,0.不限1.一居2.二居3.三居4.四居5.五局6.别墅
	private String huxing;

	// 业主电话，即求租人手机号或者电话
	private String housePhone;

	// 补充说明，即对房子的各方面情况说明
	private String remark;

	// 姓名，求租者
	private String name;

	// 求租时区域类型，0.商圈 1.地铁
	private String areaType;

	// 所选区域的下级地点，例如：选0时，下级为武昌，选1时传东湖高新
	private String area1;

	// area1的下级，为积玉桥或者关山地铁站
	private String area2;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
