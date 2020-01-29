package com.cdac.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cdac.model.Faculty;
import com.cdac.model.NontechnicalQuery;
import com.cdac.model.User;
import com.cdac.service.AdminService;
import com.cdac.service.LoginService;
import com.mysql.cj.Query;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	public AdminService getAdminService() {
		return service;
	}


	public void AdminService(AdminService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/registerStudent", method = RequestMethod.POST)
	public String registerStudent(User user)
	{
		System.out.println("In Admin Controller");
		if(service.registerStudent(user))
		{
			return "/admin";
		}
		
		return "/error";
	}
	
	@RequestMapping(value="/registerFaculty", method = RequestMethod.POST)
	public String registerFaculty(User user)
	{
		System.out.println("In Admin Controller");
		if(service.registerFaculty(user))
		{
			return "/admin";
		}
		
		return "/error";
	}
	
	@RequestMapping(value="/getQueries")
	public String getQueries(Model map)
	{
		ArrayList<NontechnicalQuery> list = service.getQueries();
		
		System.out.println("List" + list);
		
		map.addAttribute("nonTechnicalQuery",list);
		return "non-techquery";
	}
	
	  @RequestMapping(value="resolveNonTechQuerry") 
	 public String resolveNontechQuery(@RequestParam int id,Model map) 
	  {
		  boolean result = service.updateStatus(id);
		  if(result == false)
		  {
			  return "error";
		  }
		  ArrayList<NontechnicalQuery> list = service.getQueries();
			
			System.out.println("List" + list);
			
			map.addAttribute("nonTechnicalQuery",list);
	  
	  return "non-techquery"; 
	  }
	  
	  @RequestMapping(value="/getQueries2")
		public String getQueries2(Model map)
		{
			ArrayList<NontechnicalQuery> list = service.getQueries2();
			
			System.out.println("List" + list);
			
			map.addAttribute("nonTechnicalQueries",list);
			return "listnontech";
		}
	
	  @RequestMapping(value="listNonTechQuerry") 
		 public String listNontechQuery(@RequestParam int id,Model map) 
		  {
			  boolean result = service.updateStatus(id);
			  if(result == false)
			  {
				  return "error";
			  }
			  ArrayList<NontechnicalQuery> list = service.getQueries2();
				
				System.out.println("List" + list);
				
				map.addAttribute("nonTechnicalQueries",list);
		  
		  return "listnontech"; 
		  }
	  
	  @RequestMapping(value="/deleteFaculty")
	  public String getAllFaculty(Model map)
	  {
		  ArrayList<Faculty> list = service.getFaculty();
			
			System.out.println("List" + list);
			
			map.addAttribute("facultyList",list);
		  return "facultyList";
	  }
	  @RequestMapping(value="/removeFaculty")
	  public String removeFaculty(int faculty_id)
	  {
		  boolean result= service.removeFaculty(faculty_id);
		  return "admin";
	  }
}
