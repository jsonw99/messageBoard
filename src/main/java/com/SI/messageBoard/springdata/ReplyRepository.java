package com.SI.messageBoard.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.SI.messageBoard.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
	@Query("select r from Reply r where r.topicId = ?1")
	List<Reply> findByTopicId(int topicId);
}
