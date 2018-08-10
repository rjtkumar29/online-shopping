package net.rjt.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.rjt.shoppingbackend.dao.CatagoryDAO;
import net.rjt.shoppingbackend.dto.Catagory;

@Controller
public class PageController {
	@Autowired
	private CatagoryDAO catagoryDAO;
	@RequestMapping(value ={"/", "/index", "/home"})
	public ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		
		//passing list of catagories
		mv.addObject("catagories", catagoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value ="/about")
	public ModelAndView about(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}

	@RequestMapping(value ="/contact")
	public ModelAndView contact(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	/*
	 * Mapping to show all products and based on catagory
	 */
	@RequestMapping(value ="/show/all/products")
	public ModelAndView showAllProducts(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//passing list of catagories
		mv.addObject("catagories", catagoryDAO.list());
		mv.addObject("userClicksAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value ="/show/catagory/{id}/products")
	public ModelAndView showCatagoryProducts(@PathVariable("id") int id){
		
		ModelAndView mv=new ModelAndView("page");
		//Catagory DAO to fetch single catagory
		
		Catagory catagory=null;
		catagory=catagoryDAO.get(id);
		mv.addObject("title",catagory.getName());
		
		//passing list of catagories
		mv.addObject("catagories", catagoryDAO.list());
		//passing single catagory object
		mv.addObject("catagory", catagory);
		
		mv.addObject("userClicksCatagoryProducts",true);
		return mv;
	}
}
