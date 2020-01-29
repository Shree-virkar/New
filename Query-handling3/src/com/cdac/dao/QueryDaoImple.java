package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cdac.model.Query;

@Repository
public class QueryDaoImple implements QueryDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean insert(Query query) {
		
		String sql = "insert into tech_queries(subject,tech_quest) values(?,?)";
		
		int i = jdbcTemplate.update(sql, new Object[] {
			
			query.getSubject(),
			query.getQuery()
		});
		
		if(i==1) {
			return true;
		}else {
			return false;

		}
	}

	@Override
	public List<Query> selectAll() {
		
		String sql = "select techq_id, subject,tech_quest from tech_queries";
		System.out.println("listttttttt");
		List<Query> qlist = jdbcTemplate.query(sql, new RowMapper<Query>() {

			@Override
			public Query mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Query q = new Query();
				q.setQ_id(rs.getInt("techq_id"));
				q.setSubject(rs.getString("subject"));
				q.setQuery(rs.getString("tech_quest"));
				System.out.println(q.toString());
				System.out.println("hjhhhhhhhhhh");

				return q;
			}

			
			
		});
		System.out.println(qlist.toString());
		System.out.println("fffffffffffffffffffffff");

		return qlist;
		
	}
	
	

}
