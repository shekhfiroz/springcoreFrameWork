package com.main.core.ci.beans;

public interface Wallet {
	boolean pay(String FromMobile,String ToMobile,String Description,Double Amount);
}
