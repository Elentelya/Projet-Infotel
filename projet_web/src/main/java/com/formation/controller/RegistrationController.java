package com.formation.controller;

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
public class RegistrationController {
    
    @Autowired
    private IServiceMember iServiceMember;
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    private String register(Model model) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    private String addMember(@ModelAttribute("newMembre") Member member, Model model, @RequestParam("password") String password, @RequestParam("confirm") String confirm, @RequestParam("email") String email)  {
      
      // Test mail unique
      if(iServiceMember.findByEmail(member.getEmail()) == true) {
          model.addAttribute("msg", "Erreur : Cet email est déjà utilisé");
         return "welcome";
      }
      // Test passwords identiques
      else if(!password.equals(confirm)) {
          model.addAttribute("msg", "Erreur : Mot de passe différents");
         return "welcome";
      }
      // Test mail regex
      else if(iServiceMember.emailIsCorrect(email) == false) {
          model.addAttribute("msg", "Erreur : Adresse Email non conventionnelle");
         return "welcome";
      }
      else {
          String encryptedPassword = passwordEncoder.encode(member.getPassword());
          member.setPassword(encryptedPassword);
          model.addAttribute("msg", "Bienvenue " + member.getFirstname());
          iServiceMember.insert(member);
          return "welcome";
      }
 }
}