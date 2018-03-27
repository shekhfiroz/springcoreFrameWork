package com.irefbeans;

public class YamahaEngineImpl implements IEngine {

	@Override
	public void accelerate(String speed) {
		System.out.println("car running with  YamahaEngine.." + speed);
	}

}
