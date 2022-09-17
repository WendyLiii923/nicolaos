package com.java18.nicolaos.model.dao;

import com.java18.nicolaos.model.UsedCart;

public interface CartDao {
	
	public UsedCart createCart(Integer memberId);
	
	public UsedCart getUncheckOutCart(Integer memberId);
	
	public UsedCart updateStatus(Integer id);
	
}
