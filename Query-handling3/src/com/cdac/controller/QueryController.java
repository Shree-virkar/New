package com.cdac.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.model.Query;
import com.cdac.service.QueryService;

@Controller
public class QueryController {
	
	@Autowired
	private QueryService queryService;

	
	
	public QueryService getQueryService() {
		return queryService;
	}



	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}



	@RequestMapping (value = "/submitquery", method = RequestMethod.POST)
	public String save(@ModelAttribute("query") Query query, HttpSession session)
	{
		if(queryService.insert(query))
		{
			return "submitquery";
		}
		else
		{
			return "home";
		}	
	}
	
	@RequestMapping (value = "/submitquery", method = RequestMethod.GET)
	public ModelAndView listQuery(ModelAndView model) throws IOException
	{
		System.out.println("in controller");
		List<Query> listQuery = queryService.selectAll();
		System.out.println(listQuery.toString());
		model.addObject("listQuery", listQuery);
		model.setViewName("submitquery");
		
		return model;
		
	}
	
	

}
