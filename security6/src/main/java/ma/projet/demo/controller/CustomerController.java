package ma.projet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ma.projet.demo.model.Customer;



@Controller
public class CustomerController {
	
	@GetMapping("/")
	public String register(Model model){
		Customer customer = new Customer(); 
		model.addAttribute("customer",customer);
		return "register";	
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer);
		return "home";
	}

}
