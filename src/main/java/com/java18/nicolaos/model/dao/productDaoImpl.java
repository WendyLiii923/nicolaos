package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java18.nicolaos.model.UsedProduct;

@SuppressWarnings("deprecation")
@Repository
public class productDaoImpl implements productDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	private String selectAllProduct = "FROM com.java18.nicolaos.model.UsedProduct";
	private String selectProductById = "FROM com.java18.nicolaos.model.UsedProduct WHERE ID=PRODUCTID";
	private String selectProductByHighPrice = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY PRICE";
	private String selectProductByLowPrice = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY PRICE DESC";
	
	public productDaoImpl() {
		
	}
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	

	@Override
	public UsedProduct createProduct(String name, Integer price, String content) {
		UsedProduct usedProduct = new UsedProduct();
		try {
			usedProduct.setName(name);
			usedProduct.setPrice(price);
			usedProduct.setContent(content);
			getSession().save(usedProduct);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return usedProduct;
	}

	@Override
	public List<UsedProduct> getProductList() {
		Query<UsedProduct> check = getSession().createQuery(selectAllProduct, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}
	
	//待完成
	@Override
	public List<UsedProduct> getProductListByPrice(Integer lowPrice, Integer highPrice) {
		Query<UsedProduct> check = getSession().createQuery(selectAllProduct, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public HashMap<String, String> deleteProduct(Integer id) {
		HashMap<String, String> status = new HashMap<String, String>();
		try {
			Query<UsedProduct> result = getSession().createQuery(selectProductById, UsedProduct.class);
			result.setParameter("CATEGORYID", id);
			List<UsedProduct> list = result.list();
			list.isEmpty();
			if (list.isEmpty() == false) {
				UsedProduct deleteItem = list.get(0);
				getSession().delete(deleteItem);
			} else {
				status.put("status", "fail to fing");
				System.out.println(status);
			}
		} catch (Exception e) {
			e.printStackTrace();
			status.put("status", "fail");
			System.out.println(status);
		}
		status.put("status", "success");
		System.out.println(status);
		return status;
	}

	@Override
	public UsedProduct updateProduct(UsedProduct usedProduct) {
		try {
			Query<UsedProduct> find = getSession().createQuery(selectProductById, UsedProduct.class);
			find.setParameter("PRODUCTID", usedProduct.getId());
			List<UsedProduct> list = find.list();
			UsedProduct updateItem = list.get(0);
			updateItem.setPrice(usedProduct.getPrice());
			getSession().save(updateItem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usedProduct;
	}

	
	
	
	
	


}
