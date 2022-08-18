package com.java18.nicolaos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java18.nicolaos.model.UsedCategory;
import com.java18.nicolaos.model.dao.CategoryDao;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	public List<UsedCategory> getCategoryList() {
		return categoryDao.getCategoryList();
	}

}
