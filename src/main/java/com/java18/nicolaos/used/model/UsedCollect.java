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
@Table(name ="used_collect")
public class UsedCollect {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Integer memberId;
	private Integer productId;
	
	public UsedCollect() {
		
	}

	public UsedCollect(Integer id, Timestamp createTime, Integer memberId, Integer productId) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.memberId = memberId;
		this.productId = productId;
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

	@Column(name = "productId")
	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "UsedCollect [id=" + id + ", createTime=" + createTime + ", memberId=" + memberId + ", productId="
				+ productId + "]";
	}
	
}
