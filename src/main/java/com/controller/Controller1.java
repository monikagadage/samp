package com.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;


import com.model.Admin;


@Controller
public class Controller1 {
	
	 @Autowired
	   private Admin admin;
	
	 @PostMapping("/dologin")
	   public String doLogin(@ModelAttribute("admin") Admin admin, Model model) {

	      // Implement your business logic
	      if (admin.getEmail().equals("mon@gmail.com") && admin.getPassword().equals("abc@123")) {
	         // Set admin dummy data
	         admin.setFname("Sunil");
	         admin.setMname("Singh");
	         model.addAttribute("admin",admin);
	         admin.setLname("Bora");
	         
	      } else {
	         model.addAttribute("message", "Login failed. Try again.");
	         return "index";
	      }
	      return "adminhome";
	   }
	
	
}
