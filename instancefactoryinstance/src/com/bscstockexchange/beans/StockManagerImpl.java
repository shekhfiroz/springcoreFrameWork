package com.bscstockexchange.beans;

public class StockManagerImpl implements IStockManager {
	@Override
	public float getStockPrice(String stockname) 
	{
		System.out.println("I am in getStockPrice Methods....");
		return 230.5f;	
	}

}
