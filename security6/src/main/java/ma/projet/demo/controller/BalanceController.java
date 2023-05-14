package ma.projet.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	
	@PostMapping("/myBalance")
	public String getBalanceDetails(@RequestParam("input") String input) {
	    // Traitez la valeur du champ "input" ici
	    return "input";
	}
	
}
