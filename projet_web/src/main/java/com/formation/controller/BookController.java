package com.formation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.service.IServiceBook;

@Controller
public class BookController {

	@Autowired
	IServiceBook iServiceBook;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	private String login(Model model) {
		model.addAttribute("listeLivres", iServiceBook.findAll());
		return "books";
	}
	
	@RequestMapping(value = "/recherche", method = RequestMethod.POST)
    private String resultatRecherche(HttpServletRequest request, Model model) {
        String motRecherche = request.getParameter("motRecherche");
        model.addAttribute("listeLivres", iServiceBook.search(motRecherche));
        return "books";
    }
	
	@RequestMapping(value = "/bestseller", method = RequestMethod.GET)
	private String popularBook(Model model) {
		 model.addAttribute("listeLivres", iServiceBook.popular());
		return "bestseller";
	}
}
