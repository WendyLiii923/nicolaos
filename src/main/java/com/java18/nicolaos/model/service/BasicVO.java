package com.java18.nicolaos.model.service;

import java.sql.Timestamp;

public class BasicVO {
	Integer id;
	String name;
	boolean isActive;
	Timestamp createTime;
	
	public BasicVO() {
		
	}

	public BasicVO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public BasicVO(Integer id, String name, boolean isActive, Timestamp createTime) {
		this.id = id;
		this.name = name;
		this.isActive = isActive;
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
