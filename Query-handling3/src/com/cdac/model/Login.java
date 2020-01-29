package com.cdac.model;

public class Login {

	private String userName;
	private String passWord;
	private String userRole;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", passWord=" + passWord + ", userRole=" + userRole + "]";
	}
	

}
