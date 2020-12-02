package com.example.firstcrudapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.firstcrudapp.domein.MyBooksModel;

@Mapper

public interface MyBooksMapper {

	//テーブルのデータ全件取得
	List<MyBooksModel> selectAll();

	//IDでテーブル情報の取得
	MyBooksModel selectOne(Integer id);

	//指定したmy_booksテーブルのデータを追加
	//@Insert("insert into my_books
	void insert(MyBooksModel myBooksModel);

	//登録された本の情報を更新
	void update(MyBooksModel myBooksModel);

}
