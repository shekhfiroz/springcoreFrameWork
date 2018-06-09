package com.ep.beans;

import org.springframework.context.ApplicationListener;

public class ReloadEventListner implements ApplicationListener<ReloadEvent> {

	@Override
	public void onApplicationEvent(ReloadEvent event) {
		System.out.println("Reloading data from table" + event.getTableName());
	}

}
