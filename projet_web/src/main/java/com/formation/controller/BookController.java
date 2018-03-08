package com.formation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.dao.IDaoBook;
import com.formation.entity.Book;

@Controller
public class BookController {

	@Autowired
	IDaoBook iDaoBook;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	private String login(Model model) {
		List<Book> listeLivres = new ArrayList<Book>();
		listeLivres = iDaoBook.findAll();
		
		model.addAttribute("listeLivres", listeLivres);
		return "books";
	}
}
