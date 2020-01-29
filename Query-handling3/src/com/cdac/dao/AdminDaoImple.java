package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cdac.model.Faculty;
import com.cdac.model.Login;
import com.cdac.model.NontechnicalQuery;
import com.cdac.model.Query;
import com.cdac.model.Student;
import com.cdac.model.User;
@Repository
public class AdminDaoImple implements AdminDao
{
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerStudent(User user) {
		System.out.println("In admin Dao");
		String sql ="insert into users(userName,password,contact,email,userRole) values(?,?,?,?,?)";
		int validate = jdbcTemplate.update(sql, new Object[] {user.getUsername(),user.getPassword(), user.getContact(), user.getEmail(),
		        user.getUserRole()});
		Student student = new Student();
		student.setStudent_id(user.getUser_id());
		student.setUserName(user.getUsername());
		student.setFirst_name(user.getFirst_name());
		student.setLast_name(user.getLast_name());
		if(user.getUserRole().equalsIgnoreCase("student"))
		{
			String sql1 = "insert into student(student_id,userName,first_name,last_name) values(?,?,?,?)";
			int result2 = jdbcTemplate.update(sql1,new Object[] {student.getStudent_id(),student.getUserName(),student.getFirst_name(),student.getLast_name()});
		}
		if(validate>0)
		{
			return true;
		}
	 
		return false;
	}

	@Override
	public boolean registerFaculty(User user) {
		System.out.println("In admin Dao");
		
		String sql ="insert into users(userName,password,contact,email,userRole) values(?,?,?,?,?)";
		int validate = jdbcTemplate.update(sql, new Object[] { user.getUsername(),user.getPassword(), user.getContact(), user.getEmail(),
		        user.getUserRole()});
			
		User u1= getUserId(user);
		 
		 Faculty faculty = new Faculty();
		 faculty.setFaculty_id(u1.getUser_id());
		System.out.println(faculty.getFaculty_id());
		faculty.setUserName(user.getUsername());
		faculty.setFirst_name(user.getFirst_name());
		faculty.setLast_name(user.getLast_name());
		
		if(user.getUserRole().equalsIgnoreCase("faculty"))
		{
			String sql2 = "insert into faculty(faculty_id,userName,first_name,last_name) values(?,?,?,?)";
			int result2 = jdbcTemplate.update(sql2,new Object[] {faculty.getFaculty_id(),faculty.getUserName(),faculty.getFirst_name(),faculty.getLast_name()});
			
		}
		
		if(validate>0)
		{
			return true;
		}
		return false;
	}

	 
	 
	
	@Override
	public ArrayList<NontechnicalQuery> getQueries() {
		System.out.println("In admin Dao for get Queries");
		String sql="select * from nontech_queries";
		return (ArrayList<NontechnicalQuery>) jdbcTemplate.query(sql, new BeanPropertyRowMapper(NontechnicalQuery.class));
	}

	@Override
	public ArrayList<NontechnicalQuery> getQueries2() {
		System.out.println("In admin Dao for get Queries2");
		String sql="select * from nontech_queries";
		return (ArrayList<NontechnicalQuery>) jdbcTemplate.query(sql, new BeanPropertyRowMapper(NontechnicalQuery.class));
	}

	
	@Override
	public boolean updateStatus(int id) {
		System.out.println("In admin Dao for update Queries");
		String sql="update nontech_queries set status='Yes' where id=?";
		int status = jdbcTemplate.update(sql, id);
		if(status>0)
		{
			return true;
		}
		
		return false;
	}

public User getUserId(User user)
{
	String sql = "select * from users where email = ?";
	try {
		System.out.println("in try of admin dao");
	User log1 = jdbcTemplate.queryForObject(sql, new Object[] {user.getEmail()} ,new RowMapper<User>() {
		
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println(user.getUserRole().toString());
			
			User u = new User();
			u.setUser_id(rs.getInt("user_id"));
			
			System.out.println(u.toString());
			
			return u;
		
		
		}
		
	});
	
	return log1;
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return null;
}

@Override
public ArrayList<Faculty> getFaculty() {
	System.out.println("In admin Dao for get Queries");
	String sql="select * from Faculty";
	return (ArrayList<Faculty>) jdbcTemplate.query(sql, new BeanPropertyRowMapper(Faculty.class));
}

@Override
public boolean removeFaculty(int faculty_id) {
	String sql = "delete from faculty where faculty_id=?";
	int status = jdbcTemplate.update(sql, faculty_id);
	
	String sql1 = "delete from users where user_id=?";
	int status1 = jdbcTemplate.update(sql1, faculty_id);
	if(status>0 && status1>0)
	{
		return true;
	}
	
	return false;
}
}
