package com.example.firstcrudapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.firstcrudapp.domein.MyBooksModel;

@Mapper

public interface MyBooksMapper {
	List<MyBooksModel> selectAll();

}
