package com.example.firstcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstcrudapp.domein.MyBooksModel;
import com.example.firstcrudapp.mapper.MyBooksMapper;

@Controller
@RequestMapping("/")
public class MyBooksController {

	@Autowired
	MyBooksMapper myBooksMapper;

	@GetMapping
	public String index(Model model) {
		List<MyBooksModel> list = myBooksMapper.selectAll();
		model.addAttribute("myBooks", list);
		model.addAttribute("greet", "Mybooks");
		return "index";
	}

}
