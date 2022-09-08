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
@Table(name ="used_product")
public class UsedProduct {
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private String name;
	private Integer price;
	private String content;
	private Integer memberId;
	private Integer categoryId;
	
	public UsedProduct() {
		
	}

	public UsedProduct(Integer id, Timestamp createTime, String name, Integer price, String content, Integer memberId,
			Integer categoryId) {
		this.id = id;
		this.createTime = createTime;
		this.name = name;
		this.price = price;
		this.content = content;
		this.memberId = memberId;
		this.categoryId = categoryId;
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

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price")
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "memberId")
	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "categoryId")
	public Integer getCategoryid() {
		return categoryId;
	}

	public void setCategoryid(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "UsedProduct [id=" + id + ", createTime=" + createTime + ", name=" + name + ", price=" + price
				+ ", content=" + content + ", memberId=" + memberId + ", categoryId=" + categoryId + "]";
	}
	
}