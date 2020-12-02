package com.example.firstcrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstcrudapp.domein.MyBooksModel;
import com.example.firstcrudapp.service.MyBooksService;

@Controller
@RequestMapping("/")
public class MyBooksController {

	@Autowired
	private MyBooksService myBooksService;

	//テーブル一覧画面の表示　ReadAll処理
	@GetMapping
	public String index(Model model) {
		model.addAttribute("mybooks", myBooksService.selectAll());
		return "index";
	}

	//本のIDにて、本の内容を取得
	@GetMapping("{id}")
	public String show(@PathVariable Integer id, Model model) {
		model.addAttribute("mybook", myBooksService.selectOne(id));
		return "show";
	}

	//新規作成画面の表示
	@GetMapping("new")
	public String getBooksNew(@ModelAttribute("mybook") MyBooksModel myBooksModel, Model model) {
		//		MyBooksModel mybooks = new MyBooksModel();
		//		model.addAttribute("myBook", mybooks);
		return "new";
	}

	//変更画面の表示
	@GetMapping("{id}/edit")
	public String edit(@PathVariable Integer id, @ModelAttribute("mybook") MyBooksModel myBooksModel, Model model) {
		model.addAttribute("mybook", myBooksService.selectOne(id));
		return "edit";
	}

	//新規作成画面の挿入処理
	@PostMapping
	public String postBooksCreate(@ModelAttribute("mybook") @Validated MyBooksModel myBooksModel,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "new";
		}
		myBooksService.insert(myBooksModel);
		return "redirect:/";
	}

	@PutMapping("{id}")
	public String updateBooks(@PathVariable Integer id, @ModelAttribute("mybook") @Validated MyBooksModel myBooksModel,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("mybook", myBooksModel);
			return "edit";
		} else {
			myBooksModel.setId(id);
			myBooksService.update(myBooksModel);
			return "redirect:/";
		}
	}

}
