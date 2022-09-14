package com.java18.nicolaos.model.dao;

import java.util.List;

import com.java18.nicolaos.model.UsedCartDetail;

public interface CartDetailDao {
	public List<UsedCartDetail> getProductsFromCart(Integer id);
	
}
