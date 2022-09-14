package com.java18.nicolaos.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java18.nicolaos.model.UsedCartDetail;

@SuppressWarnings("deprecation")
@Repository
public class CartDetailDaoImpl implements CartDetailDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private String selectProductsByCartId = "FROM com.java18.nicolaos.model.UsedCartDetail WHERE CARTID=:CARTID";
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	public CartDetailDaoImpl() {
	
	}
	
	@Override
	public List<UsedCartDetail> getProductsFromCart(Integer cartId) {
		Query<UsedCartDetail> check = getSession().createQuery(selectProductsByCartId, UsedCartDetail.class);
		check.setParameter("CARTID", cartId);
		List<UsedCartDetail> list = check.list();
		return list;
	}

}
