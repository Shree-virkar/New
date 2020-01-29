package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.QueryDao;
import com.cdac.model.Query;

@Service
public class QueryServiceImple implements QueryService{

	@Autowired
	private QueryDao queryDao;
	
	@Override
	public boolean insert(Query query) {
		
		return queryDao.insert(query);
	}

	@Override
	public List<Query> selectAll() {
	
		return queryDao.selectAll();
	}
	
	
}
