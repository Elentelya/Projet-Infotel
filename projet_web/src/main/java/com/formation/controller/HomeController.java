package com.formation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(path={"/", "/accueil"})
    public String welcome(Model model) {
        return "accueil";
    }

}