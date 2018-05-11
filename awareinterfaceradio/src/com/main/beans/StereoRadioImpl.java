package com.main.beans;

public class StereoRadioImpl implements IReceiver {

	@Override
	public void receiver(Double frequency) {
		System.out.println("from Stereo Impl.."+frequency);
	}

	
	
}
