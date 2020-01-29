package com.cdac.model;

public class Faculty {
	
	private int faculty_id;
	private String userName;
	private String first_name;
	private String last_name;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
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
		return "Faculty [faculty_id=" + faculty_id + ", userName=" + userName + ", first_name=" + first_name
				+ ", last_name=" + last_name + "]";
	}
	
	
	
}
