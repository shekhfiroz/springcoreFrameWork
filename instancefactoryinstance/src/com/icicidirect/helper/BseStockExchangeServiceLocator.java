package com.icicidirect.helper;

import com.bscstockexchange.beans.IStockManager;
import com.bscstockexchange.beans.StockManagerImpl;

public class BseStockExchangeServiceLocator {

	public StockManagerImpl stockmanagerlocatestockmanager() {
		/* jndi and look up logic will be written here */
		
	
		

		return new StockManagerImpl();
	}

}
