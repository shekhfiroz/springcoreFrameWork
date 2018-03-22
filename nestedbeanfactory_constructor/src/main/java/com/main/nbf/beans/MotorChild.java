package com.main.nbf.beans;

public class MotorChild {
	private ChainParent chain;

	public MotorChild(ChainParent chain) {
		super();
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "MotorChild [chain=" + chain + "]";
	}

}
