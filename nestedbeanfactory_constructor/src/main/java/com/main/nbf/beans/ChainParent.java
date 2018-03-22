package com.main.nbf.beans;

public class ChainParent {
	private int chain_id;
	private String chainType;

	public ChainParent(int chain_id, String chainType) {
		super();
		this.chain_id = chain_id;
		this.chainType = chainType;
	}

	@Override
	public String toString() {
		return "ChainParent [chain_id=" + chain_id + ", chainType=" + chainType + "]";
	}

}
