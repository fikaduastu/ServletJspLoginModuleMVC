package com.fikadu.web.model;

public class Student {
	private String username;
	private String password;
	private String dept;
	private int year;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + ", dept=" + dept + ", year=" + year + "]";
	}
	
}
