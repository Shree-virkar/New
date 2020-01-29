package com.cdac.model;

public class Query {
	
	private int q_id;
	
	private String subject;
	
	private String query;
	
	

	@Override
	public String toString() {
		return "Query [q_id=" + q_id + ", subject=" + subject + ", query=" + query + "]";
	}

	public Query() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
