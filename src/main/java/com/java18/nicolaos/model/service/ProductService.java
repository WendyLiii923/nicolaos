package com.java18.nicolaos.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java18.nicolaos.model.UsedProduct;
import com.java18.nicolaos.model.dao.ProductDao;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public UsedProduct createProduct(String name, Integer price, String content) {
		return productDao.createProduct(name, price, content);
	}
	
	public List<UsedProduct> getProductList() {
		return productDao.getProductList();
	}
	
	public List<UsedProduct> getProductListById(Integer id) {
		return productDao.getProductListById(id);
	}
	
	public List<UsedProduct> getProductListByEarly(){
		return productDao.getProductListByEarly();
	}
	
	public List<UsedProduct> getProductListByLate(){
		return productDao.getProductListByLate();
	}
	
	public List<UsedProduct> getProductListOrderByLowPrice(){
		return productDao.getProductListOrderByLowPrice();
	}
	
	public List<UsedProduct> getProductListOrderByHighPrice(){
		return productDao.getProductListOrderByHighPrice();
	}
	
	public List<UsedProduct> getProductListByPriceZoneOrderByLowPrice(Integer start, Integer end){
		return productDao.getProductListByPriceZoneOrderByLowPrice(start, end);
	}
	
	public List<UsedProduct> getProductListByPriceZoneOrderByHighPrice(Integer start, Integer end){
		return productDao.getProductListByPriceZoneOrderByHighPrice(start, end);
	}
	
	public HashMap<String, String> deleteProduct(Integer id) {
		return productDao.deleteProduct(id);
	}
	
	public UsedProduct updateProduct(UsedProduct usedProduct) {
		return productDao.updateProduct(usedProduct);
	}

}
