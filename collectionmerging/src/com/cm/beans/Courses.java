package com.cm.beans;

import java.util.List;

public class Courses {
	private List<String> subjects;
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Courses [subjects=" + subjects + "]";
	}

}
