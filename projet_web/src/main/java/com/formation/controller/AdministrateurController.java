package com.formation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.service.IServiceBook;
import com.formation.service.IServiceMember;

@Controller
public class AdministrateurController {
	
	@Autowired
	IServiceBook iServiceBook;
	
	@Autowired
	IServiceMember iServiceMember;
	
	private static boolean adminExist = false;
	
	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	private String addBook(Model model, HttpServletRequest request) {
		 isAdmin(request);
		 if (adminExist) {
			 model.addAttribute("listeLivres", iServiceBook.findAll());
			return "listbook";
		 }
		 else return "redirect:/";
	}
	
	@RequestMapping(value = "/listBook", method = RequestMethod.GET)
	private String listBook(Model model, HttpServletRequest request) {
		 isAdmin(request);
		 if (adminExist) {
			 model.addAttribute("listeLivres", iServiceBook.findAll());
			return "listbook";
		 }
		 else return "redirect:/";
	}
	
	// Test si c'est un admin ou non, pour empecher qu'un user utilise le chemin et accede a l'administration
	private void isAdmin(HttpServletRequest request) {
		 HttpSession session = request.getSession();	
		 adminExist = (boolean) session.getAttribute("isAdmin");
	}
	
//	@RequestMapping(value = "/listMember", method = RequestMethod.GET)
//	private String addMember(Model model, HttpServletRequest request) {
//		model.addAttribute("listeMembres", iServiceMember.findAll());
//		return "listemembres";
//	}
}
