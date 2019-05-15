package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping(path="/mauaide")
public class IndexController {
	
	@RequestMapping(path="/", method = RequestMethod.GET)
	public String Index(Model model) {
		return "index";
	}

}
