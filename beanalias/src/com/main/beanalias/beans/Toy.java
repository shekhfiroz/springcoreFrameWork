package com.main.beanalias.beans;

import java.beans.ConstructorProperties;

public class Toy {
	private int toyId;
	private String toyName;
	private String description;
	private int ageGroup;
	
//@ConstructorProperties({"toyId","toyName","description","ageGroup"})
	public Toy(int toyId, String toyName, String description, int ageGroup) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
		this.description = description;
		this.ageGroup = ageGroup;
	}

	@Override
	public String toString() {
		return "Toy [toyId=" + toyId + ", toyName=" + toyName + ", description=" + description + ", ageGroup="
				+ ageGroup + "]";
	}

}
