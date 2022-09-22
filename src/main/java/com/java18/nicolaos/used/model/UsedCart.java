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
@Table(name = "used_cart")
public class UsedCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@Column(name = "createTime")
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());

	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "memberId")
	private Integer memberId;
	
	public UsedCart() {
		
	}
	
	public UsedCart(Integer id, Timestamp createTime, Boolean status, Integer memberId) {
		this.id = id;
		this.createTime = createTime;
		this.status = status;
		this.memberId = memberId;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Timestamp getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Integer getMemberId() {
		return memberId;
	}
	
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
	@Override
	public String toString() {
		return "UsedCart [id=" + id + ", createTime=" + createTime + ", status=" + status + ", memberId=" + memberId
				+ "]";
	}
	
}
