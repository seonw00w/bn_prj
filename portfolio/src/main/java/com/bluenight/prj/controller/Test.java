package com.bluenight.prj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Test {
   @GetMapping("test")
   public String show(Model model) {
	   model.addAttribute("data", "Barnum is Coming");
	   return "test";
   }
   
	
}

