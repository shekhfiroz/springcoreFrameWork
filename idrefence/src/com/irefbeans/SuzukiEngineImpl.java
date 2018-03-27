package com.irefbeans;

public class SuzukiEngineImpl implements IEngine {

	@Override
	public void accelerate(String speed) {
		System.out.println("car running with suzkiengine.." + speed);
	}

}
