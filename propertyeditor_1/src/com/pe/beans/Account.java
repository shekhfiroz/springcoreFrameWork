package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class Account {
	private int account_no;
	private String account_holder_name;
	private Date registered_date;
	private File profile_image;
	private URL stackoverflow;
	private String[] interest;

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getAccount_holder_name() {
		return account_holder_name;
	}

	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public Date getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}

	public File getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(File profile_image) {
		this.profile_image = profile_image;
	}

	public URL getStackoverflow() {
		return stackoverflow;
	}

	public void setStackoverflow(URL stackoverflow) {
		this.stackoverflow = stackoverflow;
	}

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Account [account_no=" + account_no + ", account_holder_name=" + account_holder_name
				+ ", registered_date=" + registered_date + ", profile_image=" + profile_image + ", stackoverflow="
				+ stackoverflow + ", interest=" + Arrays.toString(interest) + "]";
	}
}
