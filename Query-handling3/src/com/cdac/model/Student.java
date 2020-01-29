package com.cdac.model;

public class Student extends Login{
	
	 private int student_id;
	 private String userName;
	 private String first_name;
	 private String last_name;
	 
	 
	 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", userName=" + userName + ", first_name=" + first_name
				+ ", last_name=" + last_name + "]";
	}
	
	
}
