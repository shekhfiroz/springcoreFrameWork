package com.main.nbf.beans;

public class MotorChild {
	private ChainParent chain;
	public void setChain(ChainParent chain) {
		this.chain = chain;
	}
	@Override
	public String toString() {
		return "MotorChild [chain=" + chain + "]";
	}

}
