package com;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Control {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(ModelUser user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		System.out.println(user.getUserName());
		return "user";
	}

}
