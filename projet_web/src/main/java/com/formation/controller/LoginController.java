package com.formation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.formation.entity.Member;
import com.formation.service.IServiceMember;

@Controller
public class LoginController {

	@Autowired
	IServiceMember iServiceMember;

	@Autowired
	PasswordEncoder passwordEncoder;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String login(Model model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	private String addMember(@ModelAttribute("newMember") Member member, Model model,
			@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletRequest request) {

		member = iServiceMember.passwordRecovery(email);
		HttpSession session = request.getSession();		
		
		if (member == null) {
			model.addAttribute("msg", "Username or Password is wrong");
			return "login";
		} else {
			boolean userExist = (iServiceMember.findByEmail(email) == true)
					&& (passwordEncoder.matches(password, member.getPassword()));

			
			/**************** Session ****************/
			session.setAttribute("isAdmin", member.isAdmin());
			session.setAttribute("userExist", userExist);
			session.setAttribute("name", member.getFirstname());
			/****************************************/

			if (userExist) {
				model.addAttribute("msg", "Bienvenue " + member.getFirstname());
				return "redirect:accueil";
			} else {
				model.addAttribute("msg", "Username or Password is wrong");
				return "login";
			}
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	private String closeSession(HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
}