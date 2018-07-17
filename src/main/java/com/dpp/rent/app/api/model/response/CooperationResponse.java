package com.dpp.rent.app.api.model.response;

import java.io.Serializable;
import java.util.List;

import com.dpp.rent.app.api.domain.Cooperation;

/**
 * className:CooperationResponse.java
 * description: 小区对象
 * date: 2018年7月12日
 * author:jpg
 */
public class CooperationResponse implements Serializable{

	private static final long serialVersionUID = 765451294414159357L;
	
	List<Cooperation> cooperation;

	public List<Cooperation> getCooperation() {
		return cooperation;
	}
	public void setCooperation(List<Cooperation> cooperation) {
		this.cooperation = cooperation;
	}
}
