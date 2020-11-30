package com.example.firstcrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstcrudapp.domein.MyBooksModel;
import com.example.firstcrudapp.service.MyBooksService;

@Controller
@RequestMapping("/")
public class MyBooksController {

	@Autowired
	private MyBooksService myBooksService;

	//テーブル一覧画面の表示
	@GetMapping
	public String index(Model model) {
		model.addAttribute("myBooks", myBooksService.selectAll());
		return "index";
	}

	//新規作成画面の表示

	@GetMapping("new")
	public String getBooksNew(Model model) {
		MyBooksModel mybooks = new MyBooksModel();
		model.addAttribute("myBook", mybooks);
		return "new";
	}

	//新規作成画面の挿入処理

	@PostMapping
	public String postBooksCreate(@ModelAttribute("myBook") @Validated MyBooksModel myBooksModel,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "new";
		}
		myBooksService.insert(myBooksModel);
		return "redirect:/";
	}

}
