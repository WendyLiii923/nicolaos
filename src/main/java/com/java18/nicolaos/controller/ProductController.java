package com.java18.nicolaos.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java18.nicolaos.model.UsedProduct;
import com.java18.nicolaos.model.service.CategoryService;
import com.java18.nicolaos.model.service.ProductService;

@Controller
@RequestMapping("/ProductService")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/showProducts")
	public String list(Model model, 
			@RequestParam(required = false) Integer categoryId, 
			@RequestParam(required = false) Integer parentId,
            @RequestParam(required = false) Integer start, 
            @RequestParam(required = false) Integer end, 
            @RequestParam(defaultValue = "") String status) {
		model.addAttribute("productList", productService.getProducts(categoryId, start, end, status, parentId));
		model.addAttribute("categoryList", categoryService.getCategoryList());
		return "/Category";
	}
	
	@RequestMapping("/showProduct")
	public String product(Model model, 
			@RequestParam(required = false) Integer productId,
			@RequestParam(required = false) Integer categoryId,
			@RequestParam(required = false) Integer parentId,
            @RequestParam(required = false) Integer start, 
            @RequestParam(required = false) Integer end, 
            @RequestParam(defaultValue = "") String status) {
		model.addAttribute("product", productService.getProduct(productId));
		model.addAttribute("productList", productService.getProducts(categoryId, start, end, status, parentId));
		model.addAttribute("categoryList", categoryService.getCategoryList());
		return "/Product";
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UsedProduct> getProducts(@RequestParam(required = false) Integer categoryId,
  										 @RequestParam(required = false) Integer parentId,
			                             @RequestParam(required = false) Integer start, 
			                             @RequestParam(required = false) Integer end, 
			                             @RequestParam(required = false) String status) {
		return productService.getProducts(categoryId, start, end, status, parentId);
	}
	
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	@ResponseBody
	public UsedProduct createProduct(@RequestBody UsedProduct body) {
		return productService.createProduct(body.getName(),body.getPrice(), body.getContent(), body.getMemberId(), body.getCategoryId());
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
