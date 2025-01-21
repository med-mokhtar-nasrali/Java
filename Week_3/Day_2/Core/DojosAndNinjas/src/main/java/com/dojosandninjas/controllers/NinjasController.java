package com.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosandninjas.models.Ninjas;
import com.dojosandninjas.services.DojoService;
import com.dojosandninjas.services.NinjasService;

import jakarta.validation.Valid;

@Controller
public class NinjasController {

	@Autowired
	NinjasService ninjasService;
	
	@Autowired
	DojoService dojoService;
	
	//Get Crate Display for ninja
	@GetMapping("/ninjas/new")
	public String displayPageNinja(@ModelAttribute("ninja")Ninjas ninja, Model model) {
		model.addAttribute("dojos", dojoService.getDojos());
		return "ninja";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninjas ninja, BindingResult result,Model model ) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", dojoService.getDojos());
			return "ninja";
		}
		ninjasService.createNinja(ninja);
		return "ninja";
	}
	
	@GetMapping("/dojos")
	public String allNinjas(Model model) {
		model.addAttribute("ninjas",ninjasService.getNinjas());
		return "show";
	}
}
