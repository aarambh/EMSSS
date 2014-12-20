package com.ems.application.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ems.application.entities.Employee;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return  "home";
	}
	
	@RequestMapping(value="/ajay",method=RequestMethod.POST)
	public ModelAndView test2(@ModelAttribute Employee emp ) {
		ModelAndView m1 = new ModelAndView("ajay");
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getMobile());
		System.out.println(emp.getSalary());
		
		m1.addObject("employee", emp);
		
		
		
		return m1;
		
		
	}
}
