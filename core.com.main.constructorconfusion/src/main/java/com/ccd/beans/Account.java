package com.ccd.beans;

public class Account {
	private int accountNo;

	public Account(int accountNo) {
		this.accountNo = accountNo;
	}

	private String uniqueIdentificationNumber;

	public Account(String uniqueIdentificationNumber) {
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", uniqueIdentificationNumber=" + uniqueIdentificationNumber + "]";
	}

}
