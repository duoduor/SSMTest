package wdd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import wdd.dto.Customer;



@Controller
public class FilmController {
	
//	filmSelect
	@RequestMapping("/filmSelect")
	public String filmSelect(Customer customer){
		
		
		return "login";
		
		
	}
	
	
}
	
	



