package com.dpp.rent.app.api.model.response;

import java.io.Serializable;
import java.util.List;

public class TradeAreaResponse implements Serializable{

	private static final long serialVersionUID = 5510701764239483726L;
	
	private List<TradeAreaDto> tradeAreaResponse;

	public List<TradeAreaDto> getTradeAreaResponse() {
		return tradeAreaResponse;
	}

	public void setTradeAreaResponse(List<TradeAreaDto> tradeAreaResponse) {
		this.tradeAreaResponse = tradeAreaResponse;
	}
}
