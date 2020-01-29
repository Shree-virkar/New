package com.cdac.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.model.Login;
import com.cdac.service.LoginService;

@Controller
public class LoginController{
	
	@Autowired
	private LoginService loginService;

	
	public LoginService getLoginService() {
		return loginService;
	}


	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}



	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord, @RequestParam("userRole") String userRole, HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		Login log = new Login();
		log.setUserName(userName);
		log.setPassWord(passWord);
		log.setUserRole(userRole);
		
		Login log1= loginService.userLogin(log);	
		
		try {
		if(log1.getUserRole().equals("student"))
		{
			mv.setViewName("home");
			addUserInSession(log1, session);
		}
		
		else if(log1.getUserRole().equals("admin"))
		{
			mv.setViewName("admin");
			addUserInSession(log1, session);
			
		}else  if(log1.getUserRole().equals("faculty"))
		
		{	
			mv.setViewName("faculty");
			addUserInSession(log1, session);
			
		}else
		{
			mv.addObject("msg", "Inavlid user Id");
			mv.setViewName("login");
		}
		}catch (Exception e) {
			return mv;
		}
		return mv;
	}
	
	private void addUserInSession(Login l, HttpSession session)
	{
		session.setAttribute("uname", l.getUserName());
		session.setAttribute("pass", l.getPassWord());
		session.setAttribute("role", l.getUserRole());
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "login";
	}

}
