package com.bpp.beans;

public class ConnectionFactory {
	private String drivername;
	private String username;
	private String passward;
	private String url;

	public ConnectionFactory(String drivername, String username, String passward, String url) {
		super();
		this.drivername = drivername;
		this.username = username;
		this.passward = passward;
		this.url = url;
	}

	@Override
	public String toString() {
		return "ConnectionFactory [drivername=" + drivername + ", username=" + username + ", passward=" + passward
				+ ", url=" + url + "]";
	}

}
