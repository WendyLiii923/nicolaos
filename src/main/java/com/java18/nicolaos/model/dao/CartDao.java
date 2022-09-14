package com.java18.nicolaos.model.dao;

import com.java18.nicolaos.model.UsedCart;

public interface CartDao {
	public UsedCart getCartByMemberId(Integer memberId);
}
