package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("home")

//	public String home(HttpServletRequest req) {
	
	
//	public String home(@RequestParam("Myname") String name, HttpSession session) {

//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
		
//		System.out.println("It works!" + name);
//		session.setAttribute("name", name);
//		return "home";
	
	public ModelAndView home(@RequestParam("name") String Myname) {


		ModelAndView mv = new ModelAndView();
		mv.addObject("name",Myname);
		mv.setViewName("home");
		
		return mv;
		
		

	}

}
