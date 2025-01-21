package com.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookclub.models.LoginUser;
import com.bookclub.models.User;
import com.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	//get the index page
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newLogin",new LoginUser());
		model.addAttribute("newUser",new User());
		return "index";
	}
	
	//Register
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser")User newUser, BindingResult result, HttpSession session, Model model) {
		// register from service
		User user = userService.register(newUser, result);
		// return / if we has errors
		if(result.hasErrors()) {
			model.addAttribute("newLogin",new LoginUser());
			return "index";
		}
		// else we will set the userId into session and redirect home
		session.setAttribute("userId", user.getId());
		return "redirect:/books";	
	}
	
	//login
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin")LoginUser newLogin, BindingResult result, HttpSession session, Model model) {
		User user = userService.login(newLogin, result);
		if(result.hasErrors()) {
			model.addAttribute("newUser",new User());
			return "index";
		}
		session.setAttribute("userId", user.getId());
		return "redirect:/books";	
	}
	
	
	// logOut
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			
				session.invalidate();
			     
			    return "redirect:/";
		}
	
}
