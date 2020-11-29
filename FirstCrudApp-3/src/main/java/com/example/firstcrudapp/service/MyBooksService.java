package com.example.firstcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.firstcrudapp.domein.MyBooksModel;
import com.example.firstcrudapp.mapper.MyBooksMapper;

@Service
public class MyBooksService {

	@Autowired
	private MyBooksMapper myBooksMapper;

	@Transactional
	public List<MyBooksModel> selectAll() {
		return myBooksMapper.selectAll();

	}

}
