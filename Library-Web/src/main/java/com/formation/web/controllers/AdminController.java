package com.formation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.formation.service.interfaces.IBookService;
import com.formation.service.interfaces.IMemberService;

@RestController
public class AdminController {

	@Autowired
	IBookService bookService;

	@Autowired
	IMemberService memberService;

//	@Autowired
//	PasswordEncoder passwordEncoder;

	private static boolean adminExist = false;


}