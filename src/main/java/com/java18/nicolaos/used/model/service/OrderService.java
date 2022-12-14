package com.java18.nicolaos.used.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java18.nicolaos.used.model.UsedCartDetail;
import com.java18.nicolaos.used.model.UsedOrder;
import com.java18.nicolaos.used.model.UsedOrderDetail;
import com.java18.nicolaos.used.model.dao.OrderDao;
import com.java18.nicolaos.used.model.dao.OrderDetailDao;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	OrderDao orderDao;
	@Autowired
	OrderDetailDao orderDetailDao;
	
	public UsedOrder createOrder(Integer memberId, Integer totalPrice, Integer shippingFee) {
		return orderDao.createOrder(memberId, totalPrice, shippingFee);
	}
	
	public List<UsedOrder> getOrderList(Integer orderId) {
		return orderDao.getOrderList(orderId);
	}
	
//	εΎθη
//	public UsedOrderDetail createOrderDetail(Integer orderId, UsedCartDetail aCartDetail) {
//		
//	}

}
