package com.java18.nicolaos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java18.nicolaos.model.UsedCategory;
import com.java18.nicolaos.model.service.CategoryService;

@Controller
@RequestMapping("/CategoryService")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UsedCategory> getCategoryList() {
		return categoryService.getCategoryList();
	}
	

}
