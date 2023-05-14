package ma.projet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String showLoginForm() {
    	System.out.println("login");
        return "login";
    }
    
    @PostMapping("/login")
    public String login() {
        // Traitement de la soumission du formulaire de login
    	System.out.println("ici");
        return "redirect:/myAccount";
    }
}
