package com.app17.beans;

public class Branch {

	private Student student;
	
	public Branch(Student student) {
		this.student = student;
	}
	
	public String getBranchName() {
		return "Science";
	}

}
