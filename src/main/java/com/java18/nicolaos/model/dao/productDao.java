package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import com.java18.nicolaos.model.UsedProduct;

public interface ProductDao {
	// 新增商品
	public UsedProduct createProduct(String name, Integer price, String content, Integer memberId, Integer categoryId);
	
	// 查單項商品資料
	public UsedProduct getProduct(Integer id);
	// 查所有商品清單
	public List<UsedProduct> getProductList();
	// 查父層分類商品清單
	public List<UsedProduct> getProductListByParentId(Integer categoryId);
	public List<UsedProduct> getProductListByEarly();
	public List<UsedProduct> getProductListByLate();
	public List<UsedProduct> getProductListOrderByLowPrice();
	public List<UsedProduct> getProductListOrderByHighPrice();
	public List<UsedProduct> getProductListByPriceZone(Integer start, Integer end);
	
	// 查子層分類商品清單
	public List<UsedProduct> getProductListByCategoryId(Integer categoryId);
	public List<UsedProduct> getProductListByCategoryIdOrderByEarly(Integer categoryId);
	public List<UsedProduct> getProductListByCategoryIdOrderByLate(Integer categoryId);
	public List<UsedProduct> getProductListByCategoryIdOrderByLowPrice(Integer categoryId);
	public List<UsedProduct> getProductListByCategoryIdOrderByHighPrice(Integer categoryId);
	public List<UsedProduct> getProductListByPriceZoneAndCategoryId(Integer start, Integer end, Integer categoryId);
	
	// 刪除商品
	public HashMap<String, String> deleteProduct(Integer id);
	// 修改商品
	public UsedProduct updateProduct(UsedProduct usedProduct);

}
