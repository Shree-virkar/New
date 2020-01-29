package com.cdac.dao;

import java.util.List;

import com.cdac.model.Query;

public interface QueryDao {
	
	boolean insert(Query query);
	
	List<Query> selectAll();

}
