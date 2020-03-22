package com.app13.beans;

public class Student {
	
	private String sid;
	private String sname;
	private String saddr;
	private Course crs;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Course getCrs() {
		return crs;
	}
	public void setCrs(Course crs) {
		this.crs = crs;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("SID --"+sid);
		System.out.println("SNAME --"+sname);
		System.out.println("SADDRESS --"+saddr);
		System.out.println("Course Details");
		System.out.println("CID --"+crs.getCid());
		System.out.println("CNAME --"+crs.getCname());
	}
}
