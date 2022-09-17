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
	
	private String selectProductById = "FROM com.java18.nicolaos.model.UsedProduct WHERE ID=:PRODUCTID";
	private String selectAllProduct = "FROM com.java18.nicolaos.model.UsedProduct";
	private String selectProductByParentId= "FROM com.java18.nicolaos.model.UsedCategory, UsedProduct AS P AS G "
			+ "WHERE P.CATEGORYID=G.CATEGORYID "
			+ "AND G.PARENTID=:CATEGORYID";
	private String selectProductByEarly = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY CREATETIME";
	private String selectProductByLate = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY CREATETIME DESC";
	private String selectProductOrderByLowPrice = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY PRICE";
	private String selectProductOrderByHighPrice = "FROM com.java18.nicolaos.model.UsedProduct ORDER BY PRICE DESC";
	private String selectProductByPriceZone = "FROM com.java18.nicolaos.model.UsedProduct WHERE PRICE BETWEEN :START AND :END";
	
	private String selectProductByCategoryId = "FROM com.java18.nicolaos.model.UsedProduct WHERE CATEGORYID=:CATEGORYID";
	private String selectProductByCategoryIdOrderByEarly = "FROM com.java18.nicolaos.model.UsedProduct WHERE CATEGORYID=:CATEGORYID ORDER BY CREATETIME";
	private String selectProductByCategoryIdOrderByLate = "FROM com.java18.nicolaos.model.UsedProduct WHERE CATEGORYID=:CATEGORYID ORDER BY CREATETIME DESC";
	private String selectProductByCategoryIdOrderByLowPrice = "FROM com.java18.nicolaos.model.UsedProduct WHERE CATEGORYID=:CATEGORYID ORDER BY PRICE";
	private String selectProductByCategoryIdOrderByHighPrice = "FROM com.java18.nicolaos.model.UsedProduct WHERE CATEGORYID=:CATEGORYID ORDER BY PRICE DESC";
	private String selectProductByPriceZoneAndCategoryId = "FROM com.java18.nicolaos.model.UsedProduct WHERE CATEGORYID=:CATEGORYID"
			+ "AND PRICE BETWEEN :START AND :END";
	
	public ProductDaoImpl() {
		
	}
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	

	@Override
	public UsedProduct createProduct(String name, Integer price, String content, Integer memberId, Integer categoryId) {
		UsedProduct usedProduct = new UsedProduct();
		try {
			usedProduct.setName(name);
			usedProduct.setPrice(price);
			usedProduct.setContent(content);
			usedProduct.setMemberId(memberId);
			usedProduct.setCategoryId(categoryId);
			getSession().save(usedProduct);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return usedProduct;
	}
	
	@Override
	public UsedProduct getProduct(Integer id) {
		Query<UsedProduct> check = getSession().createQuery(selectProductById, UsedProduct.class);
		check.setParameter("PRODUCTID", id);
		List<UsedProduct> list = check.list();
		UsedProduct getItem = list.get(0);
		return getItem;
	}

	@Override
	public List<UsedProduct> getProductList() {
		Query<UsedProduct> check = getSession().createQuery(selectAllProduct, UsedProduct.class);
		List<UsedProduct> list = check.list();
		return list;
	}
	
	@Override
	public List<UsedProduct> getProductListByParentId(Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByParentId, UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		List<UsedProduct> list = check.list();
		System.out.println(list);
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
	public List<UsedProduct> getProductListByPriceZone(Integer start, Integer end) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByPriceZone, UsedProduct.class);
		check.setParameter("START", start);
		check.setParameter("END", end);
		List<UsedProduct> list = check.list();
		return list;
	}

	
	@Override
	public List<UsedProduct> getProductListByCategoryId(Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByCategoryId, UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		List<UsedProduct> list = check.list();
		return list;
	}
	
	@Override
	public List<UsedProduct> getProductListByCategoryIdOrderByEarly(Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByCategoryIdOrderByEarly, UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByCategoryIdOrderByLate(Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByCategoryIdOrderByLate, UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByCategoryIdOrderByLowPrice(Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByCategoryIdOrderByLowPrice, UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByCategoryIdOrderByHighPrice(Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByCategoryIdOrderByHighPrice, UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		List<UsedProduct> list = check.list();
		return list;
	}

	@Override
	public List<UsedProduct> getProductListByPriceZoneAndCategoryId(Integer start, Integer end, Integer categoryId) {
		Query<UsedProduct> check = getSession().createQuery(selectProductByPriceZoneAndCategoryId,UsedProduct.class);
		check.setParameter("CATEGORYID", categoryId);
		check.setParameter("START", start);
		check.setParameter("END", end);
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
