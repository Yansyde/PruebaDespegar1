package net.com.despegar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.com.despegarbackend.dao.CategoryDAO;
import net.com.despegarbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categorydao;

	@RequestMapping(value = {"/","/home","/index"})
	 public ModelAndView index() {
		ModelAndView obj = new ModelAndView("page");
		obj.addObject("title","Home");
		obj.addObject("categories",categorydao.list());
		obj.addObject("userClickHome",true);
		return obj;
	
	}
	
	@RequestMapping(value = {"/about"})
	 public ModelAndView about() {
		ModelAndView obj = new ModelAndView("page");
		obj.addObject("title","About us");
		obj.addObject("userClickAbout",true);
		return obj;
	
	}
	
	@RequestMapping(value = {"/contact"})
	 public ModelAndView contact() {
		ModelAndView obj = new ModelAndView("page");
		obj.addObject("title","Contact us");
		obj.addObject("userClickContact",true);
		return obj;
	
	}
	
	@RequestMapping(value = {"/show/all/Products"})
	 public ModelAndView showAllProducts() {
		ModelAndView obj = new ModelAndView("page");
		obj.addObject("title","All Products");
		obj.addObject("userClickAllProducts",true);
		return obj;
	
	}
	
	@RequestMapping(value = {"/show/category/{id}/products"})
	 public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView obj = new ModelAndView("page");
		Category cat = null;
		cat = categorydao.get(id);
		obj.addObject("title",cat.getName());
		
		obj.addObject("categories",categorydao.list());
		
		obj.addObject("category",cat);
		obj.addObject("userClickCategoryProducts",true);
		return obj;
	
	}
}
