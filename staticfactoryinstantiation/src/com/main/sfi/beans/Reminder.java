package com.main.sfi.beans;

import java.util.Calendar;

public class Reminder {
	/*
	 * calender class is abstract class so multiple implementation is there like
	 * gegeorian calender static factory method are there inside the calender class
	 */
	private Calendar schedule;
	private String notes;
	private Boolean snooze;

	public void setSchedule(Calendar schedule) {
		this.schedule = schedule;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setSnooze(Boolean snooze) {
		this.snooze = snooze;
	}

	@Override
	public String toString() {
		return "Remainder [schedule=" + schedule + ", notes=" + notes + ", snooze=" + snooze + "]";
	}

	public void schedulemeeting() {
		System.out.println("meeting will be on" + notes);

	}
}
