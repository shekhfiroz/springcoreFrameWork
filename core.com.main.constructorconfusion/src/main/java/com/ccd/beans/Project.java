package com.ccd.beans;

import java.beans.ConstructorProperties;

//using constructor properties annotation to resolve the ambugity

public class Project {
	private int project_no;
	private String name;
	private double budget;

	//@ConstructorProperties({ "project_no", "budget" })
	public Project(double budget, int project_no) {
		this.project_no = project_no;
		this.budget = budget;
	}

	//@ConstructorProperties({ "project_no", "name" })
	public Project(int project_no, String name) {
		this.project_no = project_no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Project [project_no=" + project_no + ", name=" + name + ", budget=" + budget + "]";
	}

}