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

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	private String addMember(@ModelAttribute("newMember") Member member, Model model,
			@RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request) {

		member = iServiceMember.passwordRecovery(email);

		String encryptedPassword = passwordEncoder.encode(member.getPassword());

		// Test mail dans la BDD et comparatif password encodés
		if ((iServiceMember.findByEmail(email) == true) && (passwordEncoder.matches(member.getPassword(), encryptedPassword))) {    

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", member.getFirstname());

			model.addAttribute("msg", "Bienvenue " + member.getFirstname());
			return "welcome";
		} else {
			model.addAttribute("msg", "Username or Password is wrong");
			return "welcome";
		}
	}
}