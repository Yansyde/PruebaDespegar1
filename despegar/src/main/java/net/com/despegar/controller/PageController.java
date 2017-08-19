package net.com.despegar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","/index"})
	 public ModelAndView index() {
		ModelAndView obj = new ModelAndView("page");
		obj.addObject("object","Hello World");
		return obj;
	
	}
	
	@RequestMapping(value = {"/test/{greeting}"})
	 public ModelAndView test(@PathVariable("greeting")String greeting) {
		ModelAndView obj = new ModelAndView("page");
		obj.addObject("object",greeting);
		return obj;
	
	}
}
