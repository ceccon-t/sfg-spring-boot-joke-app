package com.example.sfgspringbootjokeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sfgspringbootjokeapp.service.Joker;

@Controller
public class JokesController {
	
	private Joker joker;
	
	public JokesController(Joker joker) {
		this.joker = joker;
	}
	
	@RequestMapping("/")
	public String getJoke(Model model) {
		model.addAttribute("joke", joker.getJoke());
		return "chucknorris";
	}

}
