package com.example.firstcrudapp.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

	@GetMapping("/")
	public String books(Model model) {
		model.addAttribute("greet", "Hello,books");
		return "index";
	}

}
