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

	public List<UsedProduct> getProducts(Integer categoryId, Integer start, Integer end, String status) {
		
		if (categoryId == null) {
			switch (status) {
			case "低到高":
				if (end != null) {
					return productDao.getProductListByPriceZoneOrderByLowPrice(start, end);
				} else {
					return productDao.getProductListOrderByLowPrice();
				}
			case "高到低":
				if (end != null) {
					return productDao.getProductListByPriceZoneOrderByHighPrice(start, end);
				} else {
					return productDao.getProductListOrderByHighPrice();
				}
			case "新到舊":
				return productDao.getProductListByLate();
			case "舊到新":
				return productDao.getProductListByEarly();
			default: 
				return productDao.getProductList();
			}
		} else {
			return productDao.getProductListByCategoryId(categoryId);
		}
	}



	public HashMap<String, String> deleteProduct(Integer id) {
		return productDao.deleteProduct(id);
	}

	public UsedProduct updateProduct(UsedProduct usedProduct) {
		return productDao.updateProduct(usedProduct);
	}

}
