package com.java18.nicolaos.model.dao;

import java.util.List;

import com.java18.nicolaos.model.UsedCartDetail;
import com.java18.nicolaos.model.UsedOrderDetail;

public interface OrderDetailDao {
//	產生一筆訂單細項
	UsedOrderDetail createOrderDetail(Integer orderId, UsedCartDetail usedCartDetail);
	UsedOrderDetail createOrderDetail(Integer orderId, Integer productId, Integer productQty);
//	檢視所有訂單
	List<UsedOrderDetail> getOrderDetailList(Integer orderId);
	
}
