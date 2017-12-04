package com.SI.messageBoard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic {
	@Id
	@Column(name = "topic_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topicId;

	@Column(name = "name")
	private String name;
	@Column(name = "content")
	private String content;
	@Column(name = "create_date")
	private Date createDate;

	public Topic() {
	}

	public Topic(String name, String content, Date createDate) {
		super();
		this.name = name;
		this.content = content;
		this.createDate = createDate;
	}

	public Topic(int topicId, String name, String content, Date createDate) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.content = content;
		this.createDate = createDate;
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
		return "Topic [topicId=" + topicId + ", name=" + name + ", content=" + content + ", createDate=" + createDate
				+ "]";
	}
}
