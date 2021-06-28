package fr.eql.al35.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eql.al35.entity.Cart;
import fr.eql.al35.entity.Command;
import fr.eql.al35.entity.User;
import fr.eql.al35.iservice.AccountIService;
import fr.eql.al35.iservice.CommandIService;

@Controller
public class PaymentController {
	
	static Logger log = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	CommandIService cmdService;

	@Autowired
	AccountIService accountService;

	@GetMapping("/payment")
	public String displayPayment(Model model, HttpSession session) {
		Command command = new Command();
		model.addAttribute("command", command);
		return "payment";
	}

	@PostMapping("/newCommand") 
	public String createNewCommand(Model model, HttpSession session,
			@ModelAttribute("command") Command command) {
		Cart sessionCart = (Cart) session.getAttribute("sessionCart");
		User sessionUser = (User) session.getAttribute("sessionUser");
	
		//Floriane : nouvelle méthode pour créer une command, plus simple :
		command = cmdService.createCommand(sessionCart, sessionUser); 
		System.out.println("command : post Service : " + command.toString());
		cmdService.saveUser(sessionUser); 
		//Floriane : modif méthode service : à priori ne sert plus, tester avec le front
			//	cmdService.saveCommand(command); //stocker en BDD command et addresses
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			log.error(e.getMessage());
			Thread.currentThread().interrupt();
		}
		return "redirect:home";
	}


}