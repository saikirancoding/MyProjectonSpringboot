package com.symbiosis.springmvcspringbootapp;

import java.util.Arrays;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.symbiosis.model.Actor;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("Home page request");
		return "index.jsp";
	}
	
	
	/*
	@RequestMapping("add")
	public ModelAndView sum(@RequestParam("num1")int i,@RequestParam("num2")int j)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		
		int num3=i+j;
		mv.addObject("num3", num3);
		return mv;
		
	}
	
	*/
	
	/*
	@RequestMapping("add")
	public String sum(@RequestParam("num1")int i,@RequestParam("num2")int j,Model m)
	{
		
		
		int num3=i+j;
		m.addAttribute("num3", num3);
		return "result.jsp";
		
	}
	*/
	
	
	
	@PostMapping(value="addActor")
	public String addA(@RequestParam("aid") int aid,@RequestParam("name") String name,Model m)
	{
		Actor a=new Actor();
		a.setAid(aid);
		a.setName(name);
		m.addAttribute("r", a);
		return "show.jsp";
	}
	
	
	
	
	
	//@RequestMapping("addActor")
	@PostMapping(value="addActor")
	public String add(@RequestParam("aid")int id,@RequestParam("name")String name,Model m)
	{
		Actor a=new Actor();
		a.setAid(id);
		a.setName(name);
		m.addAttribute("actor", a);
		return "result.jsp" ;
		
	}
	
	@GetMapping(value="getActor")
	public String getActors(Model m)
	{
		List<Actor> list=Arrays.asList(new Actor(101,"Ajay"),new Actor(102,"Sanjay"),new Actor(103,"Vijay"));
	
		m.addAttribute("r", list);
		return "show.jsp";
	}
	
	
}
