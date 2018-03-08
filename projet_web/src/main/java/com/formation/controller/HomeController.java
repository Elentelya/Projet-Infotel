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
    
//    @Autowired
//    private SessionBean sessionBean;
//	
//    @RequestMapping(path={"/", "/accueil"})
//    public String welcome(HttpSession session) {
//    	sessionBean.setMessage("Time : " + now());
//    	session.setAttribute("sessionBean", sessionBean);
//        return "accueil";
//    }
//
//    private String now() {
//	    return new SimpleDateFormat("HH:mm:ss").format(new Date());
//	}

}