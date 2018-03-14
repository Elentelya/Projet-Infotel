package com.formation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formation.service.IServiceBook;

@Controller
public class HomeController {
    
	@Autowired
	IServiceBook iServiceBook;
	
	@RequestMapping("/")
    public String welcome(Model model, HttpServletRequest request) {
    	HttpSession session = request.getSession();	
    	session.setAttribute("isAdmin", false);
    	model.addAttribute("listeLivres", iServiceBook.popular());
        return "accueil";
    }
	
    @RequestMapping("/accueil")
    public String welcome(Model model) {
    	model.addAttribute("listeLivres", iServiceBook.popular());
        return "accueil";
    }
}