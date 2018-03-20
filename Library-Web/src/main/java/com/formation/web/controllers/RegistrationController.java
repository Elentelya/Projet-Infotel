package com.formation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.formation.service.interfaces.IMemberService;

@RestController
public class RegistrationController {
    
    @Autowired
    private IMemberService memberService;
    
//    @Autowired
//    PasswordEncoder passwordEncoder;

//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    private String register(Model model) {
//        return "register";
//    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    private String addMember(@ModelAttribute("newMembre") Member member, Model model, @RequestParam("password") String password, @RequestParam("confirm") String confirm, @RequestParam("email") String email, HttpServletRequest request)  {
//      
//    	HttpSession session = request.getSession();	
      // Test mail unique
//      if(memberService.findByEmail(member.getEmail()) == true) {
//    	  session.setAttribute("message", "Erreur : Cet email a d�j� �t� utilis�");
//         return "register";
//      }
//      // Test passwords identiques
//      else if(!password.equals(confirm)) {
//    	  session.setAttribute("message", "Erreur : Mot de passe diff�rents");
//         return "register";
//      }
      // Test mail regex
//      else if(memberService.emailIsCorrect(email) == false) {
//    	  session.setAttribute("message", "Erreur : Adresse Email non conventionnelle");
//         return "register";
//      }
		// else {
		// String encryptedPassword = passwordEncoder.encode(member.getPassword());
		// member.setPassword(encryptedPassword);
		// session.setAttribute("message", "Bienvenue " + member.getFirstname());
		// memberService.insert(member);
		// return "redirect:/";
		// }
// }
}