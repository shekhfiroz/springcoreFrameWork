package com.main.beans;

public class MonoRadioImpl implements IReceiver {
	@Override
	public void receiver(Double frequency) {
		System.out.println("Mono Radio Impl...."+frequency);
	}

}
