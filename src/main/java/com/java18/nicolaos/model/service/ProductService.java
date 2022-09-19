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

	public List<UsedProduct> getProducts(Integer categoryId, Integer start, Integer end, String status) {
		String sortField1 = "PRICE";
		String sortField2 = "CREATETIME";
		String sort1 = "ASC";
		String sort2 = "DESC";
		if (categoryId != null) {
			switch (status) {
			case "低到高":
				return productDao.getProductListByQuery(categoryId, start, end, sortField1, sort1);
			case "高到低":
				return productDao.getProductListByQuery(categoryId, start, end, sortField1, sort2);
			case "新到舊":
				return productDao.getProductListByQuery(categoryId, start, end, sortField2, sort2);
			case "舊到新":
				return productDao.getProductListByQuery(categoryId, start, end, sortField2, sort1);
			case "價格區間":
				return productDao.getProductListByQuery(categoryId, start, end, null, null);
			default:
				return productDao.getProductListByQuery(categoryId, start, end, null, null);
			}
		}else {
			switch (status) {
			case "低到高":
				return productDao.getProductListByQuery(categoryId, start, end, sortField1, sort1);
			case "高到低":
				return productDao.getProductListByQuery(categoryId, start, end, sortField1, sort2);
			case "新到舊":
				return productDao.getProductListByQuery(categoryId, start, end, sortField2, sort2);
			case "舊到新":
				return productDao.getProductListByQuery(categoryId, start, end, sortField2, sort1);
			case "價格區間":
				return productDao.getProductListByQuery(categoryId, start, end, null, null);
			default:
				return productDao.getProductList();
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
