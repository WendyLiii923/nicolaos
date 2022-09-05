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
@Table(name = "used_cart")
public class UsedCart {
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Boolean status;
	private Integer member_id;
	
	public UsedCart() {
		
	}
	
	public UsedCart(Integer id, Timestamp createTime, Boolean status, Integer member_id) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.status = status;
		this.member_id = member_id;
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
	
	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Column(name = "member_id")
	public Integer getMember_id() {
		return member_id;
	}
	
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	
	@Override
	public String toString() {
		return "UsedCart [id=" + id + ", createTime=" + createTime + ", status=" + status + ", member_id=" + member_id
				+ "]";
	}
	
}
