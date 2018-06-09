package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

//role-source 
public class EditCityHandler implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void updateCity(int cityId, String cityName) {
		System.out.println("updated tblcities table");
		ReloadEvent event = new ReloadEvent(this, "tblcities");
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
