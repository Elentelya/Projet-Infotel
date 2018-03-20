package com.formation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.IMemberService;
import com.formation.web.identifiantsviewmodel.InformationViewModel;

@RestController
public class LoginController {

	@Autowired
	IMemberService memberService;

	@PostMapping(value="/login", consumes=  MediaType.APPLICATION_JSON_VALUE)
	private Resultat connexionMembre(@RequestBody InformationViewModel identifiants) {
		
		Resultat resultat = new Resultat();
		try {
			memberService.login(identifiants.getEmail(), identifiants.getPassword());
			
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
}