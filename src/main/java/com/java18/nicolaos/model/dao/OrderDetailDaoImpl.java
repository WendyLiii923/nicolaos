package com.java18.nicolaos.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java18.nicolaos.model.UsedCartDetail;
import com.java18.nicolaos.model.UsedOrderDetail;

@Repository
public class OrderDetailDaoImpl implements OrderDetailDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	private final String selectOrderDetailListByOrderId = "FROM com.java18.nicolaos.model.UsedOrderDetail WHERE ORDERID=:ORDERID";
	
	public OrderDetailDaoImpl() {
		
	}
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public UsedOrderDetail createOrderDetail(Integer orderId, UsedCartDetail usedCartDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsedOrderDetail createOrderDetail(Integer orderId, Integer productId, Integer productQty) {
		UsedOrderDetail usedOrderDetail = new UsedOrderDetail();
		try {
			usedOrderDetail.setOrderId(orderId);
			usedOrderDetail.setProductId(productId);
			usedOrderDetail.setProductQty(productQty);
			getSession().save(usedOrderDetail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usedOrderDetail;
	}

	@Override
	public List<UsedOrderDetail> getOrderDetailList(Integer orderId) {
		Query<UsedOrderDetail> check = getSession().createQuery(selectOrderDetailListByOrderId, UsedOrderDetail.class);
		check.setParameter("ORDERID", orderId);
		List<UsedOrderDetail> list = check.list();
		return list;
	}


	

}
