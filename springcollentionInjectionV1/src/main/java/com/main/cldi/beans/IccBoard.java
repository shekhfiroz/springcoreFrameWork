package com.main.cldi.beans;

import java.util.Map;
import java.util.Properties;

public class IccBoard {
	private Map<String, String> members;

	private Properties schedule;

	public void setMembers(Map<String, String> members) {
		this.members = members;
	}

	public IccBoard(Properties schedule) {
		super();
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "IccBoard [members=" + members + ", schedule=" + schedule + "]";
	}

}
