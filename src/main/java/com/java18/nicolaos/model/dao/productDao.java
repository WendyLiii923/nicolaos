package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import com.java18.nicolaos.model.UsedProduct;

public interface ProductDao {
	
	public UsedProduct createProduct(String name, Integer price, String content, Integer memberId, Integer categoryId);
	
	public List<UsedProduct> getProductList();
	public List<UsedProduct> getProductListByCategoryId(Integer categoryId);
	public List<UsedProduct> getProductListByEarly();
	public List<UsedProduct> getProductListByLate();
	public List<UsedProduct> getProductListOrderByLowPrice();
	public List<UsedProduct> getProductListOrderByHighPrice();
	public List<UsedProduct> getProductListByPriceZoneOrderByLowPrice(Integer start, Integer end);
	public List<UsedProduct> getProductListByPriceZoneOrderByHighPrice(Integer start, Integer end);
	
	
	public HashMap<String, String> deleteProduct(Integer id);
	
	public UsedProduct updateProduct(UsedProduct usedProduct);

}
