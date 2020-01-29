package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.LoginDao;
import com.cdac.model.Login;

@Service
public class LoginServiceImple implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public Login userLogin(Login user) {
		
		return loginDao.userLogin(user);
	}

}
