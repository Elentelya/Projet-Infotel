package com.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formation.service.IServiceBook;

@Controller
public class HomeController {
    
	@Autowired
	IServiceBook iServiceBook;
	
    @RequestMapping(path={"/", "/accueil"})
    public String welcome(Model model) {
    	model.addAttribute("listeLivres", iServiceBook.popular());
        return "accueil";
    }

}