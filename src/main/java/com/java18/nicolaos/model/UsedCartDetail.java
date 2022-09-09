package com.java18.nicolaos.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Entity
@Table(name = "used_cartDetail")
public class UsedCartDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Integer productId;
	private Integer productQty;
	
	public UsedCartDetail() {
		
	}

	public UsedCartDetail(Integer id, Timestamp createTime, Integer productId, Integer productQty) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.productId = productId;
		this.productQty = productQty;
	}


	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@Column(name = "createTime")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "productId")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "productQty")
	public Integer getProductQty() {
		return productQty;
	}

	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}

	@Override
	public String toString() {
		return "UsedCartDetail [id=" + id + ", createTime=" + createTime + ", productId=" + productId + ", productQty="
				+ productQty + "]";
	}
	
}
