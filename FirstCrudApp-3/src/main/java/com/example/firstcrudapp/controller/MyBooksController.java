package com.example.firstcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstcrudapp.domein.MyBooksModel;
import com.example.firstcrudapp.mapper.MyBooksMapper;

@Controller
public class MyBooksController {

	@Autowired
	MyBooksMapper myBooksMapper;

	@RequestMapping("/")
	public String indes(Model model) {
		List<MyBooksModel> list = myBooksMapper.selectAll();
		model.addAttribute("mybooks", list);
		model.addAttribute("greet", "Hello,books");
		return "index";
	}

}
