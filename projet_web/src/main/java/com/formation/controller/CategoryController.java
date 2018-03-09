package com.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.service.IServiceBook;

@Controller
public class CategoryController {

	@Autowired
	IServiceBook iServiceBook;
	
	@RequestMapping(value = "/sciencefiction", method = RequestMethod.GET)
	private String sciencefiction(Model model) {
		// Recupere la liste complète des livres
		model.addAttribute("listeLivres", iServiceBook.findAll());
		model.addAttribute("category", "Sciences Fictions");
		return "category";
	}
	
	@RequestMapping(value = "/fantasy", method = RequestMethod.GET)
	private String fantasy(Model model) {
		// Recupere la liste complète des livres
		model.addAttribute("listeLivres", iServiceBook.findAll());
		model.addAttribute("category", "Fantasy");
		return "category";
	}
	
	@RequestMapping(value = "/thriller", method = RequestMethod.GET)
	private String thriller(Model model) {
		// Recupere la liste complète des livres
		model.addAttribute("listeLivres", iServiceBook.findAll());
		model.addAttribute("category", "Thriller");
		return "category";
	}
}
