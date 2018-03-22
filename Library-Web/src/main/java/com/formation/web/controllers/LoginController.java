package com.formation.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.dao.entities.Member;
import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.IMemberService;
import com.formation.web.controller.dto.MemberDto;
import com.formation.web.identifiantsviewmodel.InformationViewModel;

@RestController
public class LoginController {

	@Autowired
	IMemberService memberService;

	@PostMapping(value="/login", consumes=  MediaType.APPLICATION_JSON_VALUE)
	private Resultat login(@RequestBody InformationViewModel identifiants, HttpServletRequest req) {
		
		Resultat resultat = new Resultat();
		
		try {
			Member member = memberService.login(identifiants.getEmail(), identifiants.getPassword());
			MemberDto memberDto = new MemberDto(member.getFirstname(), member.getLastname(), member.getEmail(), member.getPhone(), member.getAddress(), member.isAdmin());
			memberDto.setMemberId(member.getMemberId());
			memberDto.setActive(member.isActive());

//			HttpSession session = req.getSession();
//			session.setAttribute("SessionUser", member);
//			if(member.isAdmin()) session.setAttribute("access", "admin");
//			else session.setAttribute("access", "user");
			
			resultat.setPayload(memberDto);
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.LOGIN_SUCCESS);
		} catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		} catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.LOGIN_ERRORS);

			e.printStackTrace();
		}
		return resultat;
	}
	
	@PostMapping(value="/logout", consumes=  MediaType.APPLICATION_JSON_VALUE) 
	private Resultat logout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		
		Resultat resultat = new Resultat();
		String message = "logout";
		resultat.setPayload(message);
		resultat.setSuccess(true);
		resultat.setMessage(ConstantsController.LOGOUT_SUCCESS);
		return resultat;
	}
}