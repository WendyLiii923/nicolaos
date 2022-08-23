package com.java18.nicolaos.model.service;

import java.sql.Timestamp;

public class BasicVO {
	private Integer id = null;
	private String name = "";
	private boolean isActive = false;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	
	public BasicVO() {
		
	}

	public BasicVO(Integer id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public BasicVO(Integer id, String name, boolean isActive, Timestamp createTime) {
		this.setId(id);
		this.setName(name);
		this.setActive(isActive);
		this.setCreateTime(createTime);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "BasicVO [id=" + id + ", name=" + name + ", isActive=" + isActive + ", createTime=" + createTime + "]";
	}
	
}
