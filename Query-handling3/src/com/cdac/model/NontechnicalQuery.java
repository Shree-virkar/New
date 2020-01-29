package com.cdac.model;

public class NontechnicalQuery {
	
	private int id;
	private String nontech_ques;
	private String status;
	
	
	 
	 
	@Override
	public String toString() {
		return "NontechnicalQuery [id=" + id + ", nontech_ques=" + nontech_ques + ", status=" + status + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public NontechnicalQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNontech_ques() {
		return nontech_ques;
	}
	public void setNontech_ques(String nontech_ques) {
		this.nontech_ques = nontech_ques;
	}
	 
	 

	

}
