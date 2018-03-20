package com.formation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.formation.service.interfaces.IBookService;

@RestController
public class CategoryController {

	@Autowired
	IBookService bookService;
	
//	@RequestMapping(value = "/sciencefiction", method = RequestMethod.GET)
//	private String sciencefiction(Model model) {
//		// Recupere la liste compl�te des livres
//		//model.addAttribute("listeLivres", bookService.findBookByCategory("Science-Fiction"));
//		model.addAttribute("category", "Sciences Fictions");
//		return "category";
//	}
	
//	@RequestMapping(value = "/fantasy", method = RequestMethod.GET)
//	private String fantasy(Model model) {
//		// Recupere la liste compl�te des livres
//		model.addAttribute("listeLivres", bookService.findBookByCategory("Fantasy"));
//		model.addAttribute("category", "Fantasy");
//		return "category";
//	}
//	
//	@RequestMapping(value = "/thriller", method = RequestMethod.GET)
//	private String thriller(Model model) {
//		// Recupere la liste compl�te des livres
//		model.addAttribute("listeLivres", bookService.findBookByCategory("Thriller"));
//		model.addAttribute("category", "Thriller");
//		return "category";
//	}
}