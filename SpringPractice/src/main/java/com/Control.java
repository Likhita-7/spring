package com;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String home(Locale Locale,Model model) {
		return "home";
		
	}
	
	
	
	@RequestMapping(value="/user" , method=RequestMethod.GET)
	public String user(ModelUser user,Model model) {
		model.addAttribute("inputname",user.getInputName());
		System.out.println(user.getInputName());
		Jdbc j= new Jdbc();
		boolean c=j.meth1(user);
		System.out.println(c);
		if(c) {
		return "user";
		}else {
			return "error";
		}
	}


}
