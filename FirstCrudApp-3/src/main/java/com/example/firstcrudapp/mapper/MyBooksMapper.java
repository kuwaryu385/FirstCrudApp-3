package com.example.firstcrudapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.firstcrudapp.domein.MyBooksModel;

@Mapper

public interface MyBooksMapper {

	//テーブルのデータ全件取得
	List<MyBooksModel> selectAll();

	//指定したmy_booksテーブルのデータを追加
	//@Insert("insert into my_books
	void insert(MyBooksModel myBooksModel);

}
