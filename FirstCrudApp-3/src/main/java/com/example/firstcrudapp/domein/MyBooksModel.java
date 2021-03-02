package com.example.firstcrudapp.domein;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MyBooksModel {

	private Integer id;
	@NotBlank(message = "タイトルを入力してください")
	private String title;
	@NotBlank(message = "作者を入力してください")
	private String author;

}
