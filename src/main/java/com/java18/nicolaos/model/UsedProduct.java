package com.java18.nicolaos.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Entity
@Table(name = "used_product")
public class UsedProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private String name;
	private Integer price;
	private String content;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "memberId")
	private Members member;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryId")
	private UsedCategory category;

	private String cover;
	private String status;

	public UsedProduct() {

	}

	public UsedProduct(Integer id, Timestamp createTime, String name, Integer price, String content, Members memberId,
			UsedCategory categoryId, String cover, String status) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.name = name;
		this.price = price;
		this.content = content;
		this.member = memberId;
		this.category = categoryId;
		this.cover = cover;
		this.status = status;
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
	public Members getMemberId() {
		return member;
	}

	public void setMemberId(Members memberId) {
		this.member = memberId;
	}

	@Column(name = "categoryId")
	public UsedCategory getCategoryId() {
		return category;
	}

	public void setCategoryId(UsedCategory categoryId) {
		this.category = categoryId;
	}

	@Column(name = "cover")
	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UsedProduct [id=" + id + ", createTime=" + createTime + ", name=" + name + ", price=" + price
				+ ", content=" + content + ", memberId=" + member + ", categoryId=" + category + ", cover=" + cover
				+ ", status=" + status + "]";
	}

}
