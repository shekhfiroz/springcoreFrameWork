package com.autowire.beans;

public class Robot {
	private Chip chip;
	private String bottle;

	public Robot(Chip chip) {
		this.chip = chip;
		System.out.print("1- con-robot");
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
