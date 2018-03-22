package com.main.nbf.beans;

public class ChainParent {
	private int chain_id;
	private String chainType;

	public void setChain_id(int chain_id) {
		this.chain_id = chain_id;
	}

	public void setChainType(String chainType) {
		this.chainType = chainType;
	}

	@Override
	public String toString() {
		return "ChainParent [chain_id=" + chain_id + ", chainType=" + chainType + "]";
	}

}
