package fr.soat.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.soat.model.Accommodation;
import fr.soat.model.SearchAccommodationParams;
import fr.soat.service.AccommodationService;

@Controller
public class ListController {

	@Autowired
	private AccommodationService accommodationService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String listAccommodations(Model model, @Valid @ModelAttribute("searchAccommodationParams") SearchAccommodationParams searchParams, BindingResult result) {

		List<Accommodation> accommodations = accommodationService.find(searchParams);

		model.addAttribute("accommodations", accommodations);

		// Handle validation errors (e.g. wrong date format, elevator=2, etc...)
		if(result.hasErrors()) {
			// TODO Display nice message
			return "listAccommodations";
		}
		
		return "listAccommodations";
	}

}
