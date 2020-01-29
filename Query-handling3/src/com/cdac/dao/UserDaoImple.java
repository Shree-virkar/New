package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.cdac.model.Login;
import com.cdac.model.User;

@Repository
public class UserDaoImple implements UserDao {
	
	@Autowired
	DataSource datasource;
	
	@Autowired
	  JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int register(User user) {
		String sql="insert into users values(?,?,?,?,?,?)" ;
		
		return jdbcTemplate.update(sql, new Object[] { user.getUser_id(), user.getUsername(),user.getPassword(), user.getContact(), user.getEmail(),
		        user.getUserRole()});
		  
	}

	@Override
	public User validateUser(Login login) {
		String sql = "select * from users where userName='" + login.getUserName() + "' and password='" + login.getPassWord()
        + "'and userRole='" + login.getUserRole()+ "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
		
	}

}
class UserMapper implements RowMapper<User> {

	  public User mapRow(ResultSet rs, int arg1) throws SQLException {	    User user = new User();

	  	user.setUser_id(rs.getInt("user_id"));
	    user.setUsername(rs.getString("userName"));
	    user.setPassword(rs.getString("password"));
	    user.setContact(rs.getString("contact"));
	    user.setEmail(rs.getString("email"));
	    user.setUserRole(rs.getString("userRole"));
	    
	   

	    return user;
	  }
	}
