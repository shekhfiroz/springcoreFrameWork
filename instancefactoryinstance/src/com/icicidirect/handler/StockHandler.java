package com.icicidirect.handler;

import com.bscstockexchange.beans.StockManagerImpl;

public class StockHandler {
	private StockManagerImpl manager = null;

	public String getstockprice(String stockname) {
		System.out.println(manager.getStockPrice(stockname));
		return stockname;
	}

	public void setManager(StockManagerImpl manager) {
		this.manager = manager;
	}

}
