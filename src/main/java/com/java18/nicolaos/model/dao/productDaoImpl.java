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
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	private String selectAllProduct = "FROM com.java18.nicolaos.model.UsedProduct";
	private String selectProductById = "FROM com.java18.nicolaos.model.UsedProduct WHERE ID=PRODUCTID";
	private String selectProductByEarly = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY CREATETIME";
	private String selectProductByLate = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY CREATETIME DESC";
	private String selectProductOrderByLowPrice = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY PRICE";
	private String selectProductOrderByHighPrice = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY PRICE DESC";
	private String selectProductByPriceZoneOrderByLowPrice = "FROM com.java18.nicolaos.model.UsedProduct WHERE PRICE BETWEEN START AND END ORDER BY PRICE";
	private String selectProductByPriceZoneOrderByHighPrice = "FROM com.java18.nicolaos.model.UsedProduct WHERE PRICE BETWEEN START AND END ORDER BY PRICE DESC";
	
	public ProductDaoImpl() {
		
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
	
	@Override
	public List<UsedProduct> getProductListById(Integer id) {
		Query<UsedProduct> check = getSession().createQuery(selectProductById, UsedProduct.class);
		check.setParameter("PRODUCTID", id);
		List<UsedProduct> list = check.list();
		return list;
	}
	
	@Override
	public List<UsedProduct> getProductListByEarly() {
		Query<UsedProduct> check = getSession().createQuery(selectProductByEarly, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByLate() {
		Query<UsedProduct> check = getSession().createQuery(selectProductByLate, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListOrderByLowPrice() {
		Query<UsedProduct> check = getSession().createQuery(selectProductOrderByLowPrice, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListOrderByHighPrice() {
		Query<UsedProduct> check = getSession().createQuery(selectProductOrderByHighPrice, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByPriceZoneOrderByLowPrice(Integer start, Integer end) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByPriceZoneOrderByLowPrice, UsedProduct.class);
		check.setParameter("PRICE", start);
		check.setParameter("PRICE", end);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByPriceZoneOrderByHighPrice(Integer start, Integer end) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByPriceZoneOrderByHighPrice,UsedProduct.class);
		check.setParameter("PRICE", start);
		check.setParameter("PRICE", end);
		List<UsedProduct> list = check.list();
		return list;
	}
	
	@Override
	public HashMap<String, String> deleteProduct(Integer id) {
		HashMap<String, String> status = new HashMap<String, String>();
		try {
			Query<UsedProduct> result = getSession().createQuery(selectProductById, UsedProduct.class);
			result.setParameter("PRODUCTID", id);
			List<UsedProduct> list = result.list();
			if (list.isEmpty() == false) {
				UsedProduct deleteItem = list.get(0);
				getSession().delete(deleteItem);
			} else {
				status.put("status", "fail to find");
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
