package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import com.java18.nicolaos.model.Members;
import com.java18.nicolaos.model.UsedCategory;
import com.java18.nicolaos.model.UsedProduct;

public interface ProductDao {
	// 新增商品
	public UsedProduct createProduct(String name, Integer price, String content, Members memberId, UsedCategory categoryId);
	
	// 查單項商品資料
	public UsedProduct getProduct(Integer id);
	// 查所有商品清單
	public List<UsedProduct> getProductList();
	// 查父層分類商品清單
	public List<UsedProduct> getProductListByParentId(Integer parentId);
	// 用分類或排序或價格區間 查詢商品清單
	public List<UsedProduct> getProductListByQuery(Integer categoryId, Integer start, Integer end, String sortField, String sort);
	
	// 刪除商品
	public HashMap<String, String> deleteProduct(Integer id);
	// 修改商品
	public UsedProduct updateProduct(UsedProduct usedProduct);

}
