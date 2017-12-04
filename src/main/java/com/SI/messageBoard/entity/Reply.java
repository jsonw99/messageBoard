package com.SI.messageBoard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reply")
public class Reply {
	@Id
	@Column(name = "response_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int responseId;

	@Column(name = "topic_id")
	private int topicId;
	@Column(name = "name")
	private String name;
	@Column(name = "content")
	private String content;
	@Column(name = "create_date")
	private Date createDate;

	public Reply() {
	}

	public Reply(int topicId, String name, String content, Date createDate) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
	}
	
	public Reply(int responseId, int topicId, String name, String content, Date createDate) {
		super();
		this.responseId = responseId;
		this.topicId = topicId;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
	}

	public int getResponseId() {
		return responseId;
	}

	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Reply [responseId=" + responseId + ", topicId=" + topicId + ", name=" + name + ", content=" + content
				+ ", createDate=" + createDate + "]";
	}

	
}
