package com.dakichipathvariables.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Daikachi {
	
	@GetMapping("/daikichi/travel/{country}")
	public String country(@PathVariable("country")String country) {
		String msg = String.format("Congratulations! You will soon travel to %s !", country);
		return msg;
		
	}
	@GetMapping("/daikichi/lotto/{number}")
	public String journey(@PathVariable("number")int number) {
		if(number % 2 == 0) {
			String msg = "You will take a grand journey in the near future, but be weary of tempting offers!";
			return msg;
		}else {
			String msg = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			return msg;
		}
	}
	

}
