package fr.soat.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.soat.model.SearchAccommodationParams;

@Controller
public class HomeController {

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("searchAccommodationForm", new SearchAccommodationParams()); 
		 
		return "home";
	}
	
	@RequestMapping(value = "home", method = RequestMethod.POST)
	public String searchAccommodation(@Valid @ModelAttribute("searchAccommodationParams") SearchAccommodationParams form, BindingResult result) {
		
		System.out.println(form.getCity());

		return "redirect:list.html";
	}
	
}
