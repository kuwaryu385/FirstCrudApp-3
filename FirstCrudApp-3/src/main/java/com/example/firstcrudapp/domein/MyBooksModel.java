package com.example.firstcrudapp.domein;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MyBooksModel {

	private Integer id;
	@NotBlank(message = "タイトルを入力してください")
	private String title;
	@NotBlank(message = "調子にのらないでください")
	private String author;

}
