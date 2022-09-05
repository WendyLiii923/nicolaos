package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import com.java18.nicolaos.model.UsedProduct;

public interface productDao {
	
	public UsedProduct createProduct(String name, Integer price, String content);
	
	public List<UsedProduct> getProductList();
	public List<UsedProduct> getProductListByPrice(Integer lowPrice, Integer highPrice);
	
	public HashMap<String, String> deleteProduct(Integer id);
	
	public UsedProduct updateProduct(UsedProduct usedProduct);

}
