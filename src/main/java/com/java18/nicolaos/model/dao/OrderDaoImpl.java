package com.java18.nicolaos.model.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java18.nicolaos.model.UsedOrder;

@Repository
public class OrderDaoImpl implements OrderDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	private final String selectOrderByMemberId = "FROM com.java18.nicolaos.model.UsedOrder WHERE MEMBERID=:MEMBERID";
	
	public OrderDaoImpl() {
		
	}
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public UsedOrder createOrder(Integer memberId, Integer totalPrice, Integer shippingFee) {
		UsedOrder usedOrder = new UsedOrder();
		try {
			usedOrder.setMemberId(memberId);
			usedOrder.setTotalPrice(totalPrice);
			usedOrder.setShippingFee(shippingFee);
			getSession().save(usedOrder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usedOrder;
	}

	@Override
	public List<UsedOrder> getOrderList(Integer memberId) {
		Query<UsedOrder> check = getSession().createQuery(selectOrderByMemberId, UsedOrder.class);
		check.setParameter("MEMBERID", memberId);
		List<UsedOrder> list = check.list();
		return list;
	}


	

}
