package com.formation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.formation.service.interfaces.IBookService;

@RestController
public class HomeController {
    
	@Autowired
	IBookService bookService;
	
//	@RequestMapping("/")
//    public String welcome(Model model, HttpServletRequest request) {
//    	HttpSession session = request.getSession();	
//    	session.setAttribute("isAdmin", false);
//    	model.addAttribute("listeLivres", bookService.popular());
//        return "accueil";
//    }
//	
//    @RequestMapping("/accueil")
//    public String welcome(Model model) {
//    	model.addAttribute("listeLivres", bookService.popular());
//        return "accueil";
//    }
}