package com.java18.nicolaos.model.dao;

import java.util.List;

import com.java18.nicolaos.model.UsedCartDetail;

public interface CartDetailDao {
	public UsedCartDetail createCartDetail(Integer cartId, Integer productId, Integer productQty);
	
	public List<UsedCartDetail> getCartDetail(Integer cartId, Integer productId);
	
}
