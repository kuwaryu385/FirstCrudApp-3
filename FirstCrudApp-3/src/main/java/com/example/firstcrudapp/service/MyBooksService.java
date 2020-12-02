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
	public MyBooksMapper myBooksMapper;

	@Transactional
	public List<MyBooksModel> selectAll() {
		return myBooksMapper.selectAll();
	}

	@Transactional
	public MyBooksModel selectOne(Integer id) {
		return myBooksMapper.selectOne(id);
	}

	@Transactional
	public void insert(MyBooksModel myBooksModel) {
		myBooksMapper.insert(myBooksModel);
	}

	@Transactional
	public void update(MyBooksModel myBooksModel) {
		myBooksMapper.update(myBooksModel);
	}

	@Transactional
	public void delete(Integer id) {
		myBooksMapper.delete(id);
	}

}
