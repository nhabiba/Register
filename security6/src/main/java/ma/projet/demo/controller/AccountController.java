package ma.projet.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AccountController {
	
	@GetMapping("/myAccount")
	public String getAccountDetails(Model model, Authentication authentication) {
	    // Récupérer le nom d'utilisateur et l'e-mail de l'utilisateur connecté à partir de l'objet Authentication
	    String username = authentication.getName();

	    // Ajouter les détails du compte dans le modèle pour les rendre disponibles dans la vue
	    model.addAttribute("username", username);

	    // Renvoyer la vue "myAccount.html"
	    return "/myAccount";
	}


}
