package com.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.service.IServiceBook;

@Controller
public class PopularController {

	@Autowired
	IServiceBook iServiceBook;
	
	@RequestMapping(value = "/bestseller", method = RequestMethod.GET)
	private String login(Model model) {
		// Recupere la liste complète des livres
		model.addAttribute("listeLivres", iServiceBook.findAll());
		return "bestseller";
	}
}
