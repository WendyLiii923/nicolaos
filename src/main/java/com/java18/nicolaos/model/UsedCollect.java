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
@Table(name ="used_collect")
public class UsedCollect {
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Integer member_id;
	private Integer product_id;
	
	public UsedCollect() {
		
	}

	public UsedCollect(Integer id, Timestamp createTime, Integer member_id, Integer product_id) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.member_id = member_id;
		this.product_id = product_id;
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

	@Column(name = "product_id")
	public Integer getProduct_id() {
		return product_id;
	}


	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "UsedCollect [id=" + id + ", createTime=" + createTime + ", member_id=" + member_id + ", product_id="
				+ product_id + "]";
	}
	
}
