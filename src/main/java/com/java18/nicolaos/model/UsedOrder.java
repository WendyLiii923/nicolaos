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
@Table(name = "used_order")
public class UsedOrder {
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Integer member_id;
	private Integer productQty;
	private Integer price;
	private Integer shippingFee;
	
	public UsedOrder() {
		
	}

	public UsedOrder(Integer id, Timestamp createTime, Integer member_id, Integer productQty, Integer price,
			Integer shippingFee) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.member_id = member_id;
		this.productQty = productQty;
		this.price = price;
		this.shippingFee = shippingFee;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Column(name = "member_id")
	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	@Column(name = "productQty")
	public Integer getProductQty() {
		return productQty;
	}

	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}
	
	@Column(name = "price")
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Column(name = "shippingFee")
	public Integer getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(Integer shippingFee) {
		this.shippingFee = shippingFee;
	}

	@Override
	public String toString() {
		return "UsedOrder [id=" + id + ", createTime=" + createTime + ", member_id=" + member_id + ", productQty="
				+ productQty + ", price=" + price + ", shippingFee=" + shippingFee + "]";
	}
	
}
