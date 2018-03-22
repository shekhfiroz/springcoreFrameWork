package com.autowire.beans;

public class Chip {
	private int chip_id;
	private String manufacturer;

	public void setChip_id(int chip_id) {
		this.chip_id = chip_id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Chip [chip_id=" + chip_id + ", manufacturer=" + manufacturer + "]";
	}

}
