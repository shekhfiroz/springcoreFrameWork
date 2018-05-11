package com.main.beans;

public class Area {
	private String geocooridnate;
	public Area(String geocooridnate) {
		super();
		this.geocooridnate = geocooridnate;
	}
	@Override
	public String toString() {
		return "Area [geocooridnate=" + geocooridnate + "]";
	}

}
