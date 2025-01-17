package com.Travels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.Travels.models.Travel;
import com.Travels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	@Autowired
	TravelService travelService;
	
	@GetMapping("/expenses")
	public String index(Model model,@ModelAttribute("travel")Travel travel) {
		model.addAttribute("travels",travelService.AllTravels());
		return "index";
	}
	
	@PostMapping("/expenses")
	public String createTravel(Model model,@Valid @ModelAttribute("travel")Travel travel,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("travels",travelService.AllTravels());
			return "index";
		}
		travelService.createTravel(travel);
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String updateTravel(@PathVariable("id")Long id,@ModelAttribute("travel")Travel travel,Model model) {
		model.addAttribute("travel",travelService.getOneTravel(id));
		return "editTravel";
	}
	
	@PutMapping("/expenses/edit/{id}")
	public String update(@PathVariable("id")Long id,@Valid @ModelAttribute("travel")Travel travel,BindingResult result) {
		if(result.hasErrors()) {
			return "editTravel";
		}
		travelService.updateTravel(id, travel);
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses/{id}")
	public String ShowoneTravel(@PathVariable("id")Long id,Model model) {
		model.addAttribute("travel",travelService.getOneTravel(id));
		return "showOne";
	}
	
	
	@DeleteMapping("/expenses/delete/{id}")
	public String deleteTravel(@PathVariable("id")Long id) {
		travelService.delete(id);
		return "redirect:/expenses";
	}
}
