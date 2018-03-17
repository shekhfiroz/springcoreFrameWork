package com.main.core.ci.beans;

public class MobikwikWalletImpl implements Wallet {

	@Override
	public boolean pay(String FromMobile, String ToMobile, String Description, Double Amount) {
		System.out.println("Mobikwik Wallet Transiction is processed!");
		return true;
	}

}
