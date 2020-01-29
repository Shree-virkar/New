package com.cdac.dao;

import com.cdac.model.Login;
import com.cdac.model.User;

public interface UserDao {
	
	int register(User user);

	  User validateUser(Login login);

}