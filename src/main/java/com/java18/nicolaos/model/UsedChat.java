package com.java18.nicolaos.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Entity
@Table(name = "used_chat")
public class UsedChat {
	private Timestamp createTime = new Timestamp(System.currentTimeMillis());
	private Integer fromId;
	private Integer toId;
	private String content;
	
	public UsedChat() {
		
	}

	public UsedChat(Timestamp createTime, Integer fromId, Integer toId, String content) {
		super();
		this.createTime = createTime;
		this.fromId = fromId;
		this.toId = toId;
		this.content = content;
	}

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	@Column(name = "createTime")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "fromId")
	public Integer getFromId() {
		return fromId;
	}

	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}

	@Column(name = "toId")
	public Integer getToId() {
		return toId;
	}

	public void setToId(Integer toId) {
		this.toId = toId;
	}

	@Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "UsedChat [createTime=" + createTime + ", fromId=" + fromId + ", toId=" + toId + ", content=" + content
				+ "]";
	}
	
}
