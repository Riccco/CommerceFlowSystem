package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.UserRepository;

@Controller
public class hellowordt {
	
	@GetMapping("/inputForm")
	public String inputForm(Model model) {
		model.addAttribute("data",new UserRepository());
		return "inputForm";
	}

}
