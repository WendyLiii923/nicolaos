package com.java18.nicolaos.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java18.nicolaos.model.UsedProduct;
import com.java18.nicolaos.model.service.ProductService;

@Controller
@RequestMapping("/ProductService")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	@ResponseBody
	public UsedProduct createProduct(@RequestBody UsedProduct body) {
		return productService.createProduct(body.getName(),body.getPrice(), body.getContent());
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UsedProduct> getProducts(@RequestParam Integer categoryId, @RequestParam Integer start, @RequestParam Integer end, @RequestParam String status) {
		return productService.getProducts(categoryId, start, end, status);
	}
	
	@DeleteMapping
	@ResponseBody
	public HashMap<String, String> deleteProduct(@RequestParam Integer id) {
		return productService.deleteProduct(id);
	}
	
	@PutMapping
	@ResponseBody
	public UsedProduct updateProduct(@RequestBody UsedProduct body) {
		return productService.updateProduct(body);
	}
	

}
