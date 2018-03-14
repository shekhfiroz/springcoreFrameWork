package com.main.core.ci.beans;

public class PaymentService {
	 Wallet wallet;
	
	
	
	/*public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
*/

	public PaymentService(Wallet wallet) {
		super();
		this.wallet = wallet;
	}


	public String bill(String description, String ToAccount, float amount) {
		wallet.pay("dd", "dfsfd", "dsd", 225.0d);
		return "Hello We are in Payment Service...";

	}

}
