package com.java18.nicolaos.used.model;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Integer memberId;
	private Integer totalPrice;
	private Integer shippingFee;
	
	public UsedOrder() {
		
	}

	public UsedOrder(Integer id, Timestamp createTime, Integer memberId, Integer totalPrice,
			Integer shippingFee) {
		this.id = id;
		this.createTime = createTime;
		this.memberId = memberId;
		this.totalPrice = totalPrice;
		this.shippingFee = shippingFee;
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

	@Column(name = "memberId")
	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "totalPrice")
	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
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
		return "UsedOrder [id=" + id + ", createTime=" + createTime + ", memberId=" + memberId + ", totalPrice=" + totalPrice + ", shippingFee=" + shippingFee + "]";
	}
	
}
