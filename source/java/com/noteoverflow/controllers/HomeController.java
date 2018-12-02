package com.noteoverflow.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="index", method = RequestMethod.GET)
	public String renderHomeView(ModelMap model) {
	      return "index";
	   }
}
