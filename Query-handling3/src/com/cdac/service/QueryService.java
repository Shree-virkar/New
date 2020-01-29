package com.cdac.service;

import java.util.List;

import com.cdac.model.Query;

public interface QueryService {
	
	boolean insert(Query query);
	
	List<Query> selectAll();

}
