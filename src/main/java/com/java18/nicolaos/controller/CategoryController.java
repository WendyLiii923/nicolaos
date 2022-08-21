package com.java18.nicolaos.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	@ResponseBody
	public UsedCategory createCategory(@RequestBody UsedCategory body) {
		return categoryService.createCategory(body.getName(),body.getParentId());
	}
	
	@DeleteMapping
	@ResponseBody
	public HashMap<String, String> deleteCategory(@RequestParam Integer id) {
		return categoryService.deleteCategory(id);
	}

}
