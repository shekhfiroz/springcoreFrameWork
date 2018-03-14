package com.main.core.ci.beans;

public class PaytmWalletImpl implements Wallet {

	@Override
	public boolean pay(String FromMobile, String ToMobile, String Description, Double Amount) {
		System.out.println("Paytm Wallet Transiction is processed");
		return true;
	}
}
