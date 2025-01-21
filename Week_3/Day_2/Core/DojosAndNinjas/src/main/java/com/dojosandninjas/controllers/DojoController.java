package com.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired
	DojoService dojoService;
	
	//Create dojo display page
	@GetMapping("/dojos/new")
	public String dojoDisplay(@ModelAttribute("dojo")Dojo dojo) {
		return "dojo";
	}
	
	//Create Dojo action method
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos",dojoService.getDojos());
			return "dojo";
		}
		dojoService.createDojo(dojo);
		return "redirect:/ninjas/new";
	}
	
}
