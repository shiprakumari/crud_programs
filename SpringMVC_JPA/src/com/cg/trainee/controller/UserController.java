package com.cg.trainee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String onSubmit(@RequestParam("userName")String userName,@RequestParam("password")String password,Model model){
		model.addAttribute("userName",userName);
		model.addAttribute("password",password);
		if(userName.equals("Admin") && password.equals("Admin")){
			return "success";
		}
		return "fail";
		
	}

}
