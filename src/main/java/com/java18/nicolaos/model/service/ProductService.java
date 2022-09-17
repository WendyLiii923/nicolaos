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

	public UsedProduct createProduct(String name, Integer price, String content, Integer memberId, Integer categoryId) {
		return productDao.createProduct(name, price, content, memberId, categoryId);
	}
	
	public UsedProduct getProduct(Integer id) {
		return productDao.getProduct(id);
	}

	public List<UsedProduct> getProducts(Integer categoryId, Integer start, Integer end, String status, Integer parentId) {

		if (categoryId == null) {
			switch (status) {
			case "低到高":
				return productDao.getProductListOrderByLowPrice();
			case "高到低":
				return productDao.getProductListOrderByHighPrice();				
			case "新到舊":
				return productDao.getProductListByLate();
			case "舊到新":
				return productDao.getProductListByEarly();
			case "價格區間":
				if (start != null && end != null) {
					return productDao.getProductListByPriceZone(start, end);
				}
			default: 
				return productDao.getProductList();
			}
		} else {
			switch (status) {
			case "低到高":
				return productDao.getProductListByCategoryIdOrderByLowPrice(categoryId);
			case "高到低":
				return productDao.getProductListByCategoryIdOrderByHighPrice(categoryId);
			case "新到舊":
				return productDao.getProductListByCategoryIdOrderByLate(categoryId);
			case "舊到新":
				return productDao.getProductListByCategoryIdOrderByEarly(categoryId);
			case "價格區間":
				if (start != null && end != null) {
					return productDao.getProductListByPriceZoneAndCategoryId(start, end, categoryId);
				}
			default: 
//				if (parentId == null) {
//					return productDao.getProductListByParentId(categoryId);
//				}else {
					return productDao.getProductListByCategoryId(categoryId);
//				}
			}
			
		}
	

	}

	public HashMap<String, String> deleteProduct(Integer id) {
		return productDao.deleteProduct(id);
	}

	public UsedProduct updateProduct(UsedProduct usedProduct) {
		return productDao.updateProduct(usedProduct);
	}

}
