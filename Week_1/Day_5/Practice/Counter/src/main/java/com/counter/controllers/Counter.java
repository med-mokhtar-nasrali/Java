package com.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Counter {
@RequestMapping("/")
public String index(HttpSession session) {
	Integer counter = (Integer) session.getAttribute("counter");
	if(counter == null) {
		counter = 0;
	}
	counter ++;
	session.setAttribute("counter", counter);
	return "index.jsp";
}


@RequestMapping("/counter")
public String counter(HttpSession session) {
	if(session.getAttribute("counter") == null) {
		session.setAttribute("counter", 0);
	}
	int counter = 0;
	return "counter.jsp";
}

@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("counter", 0);
		return "counter.jsp";
	}
@RequestMapping("/reset/double")
public String resetDouble(HttpSession session) {
	session.setAttribute("counter", 0);
	return "counterDouble.jsp";
}

@RequestMapping("/double")
public String counterDouble(HttpSession session) {
	Integer counter = (Integer) session.getAttribute("counter");
	if(counter == null) {
		counter = 0;
	}
	counter +=2;
	session.setAttribute("counter", counter);
	return "counterDouble.jsp";
}

}
