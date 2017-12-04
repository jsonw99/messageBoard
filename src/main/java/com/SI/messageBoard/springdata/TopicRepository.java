package com.SI.messageBoard.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SI.messageBoard.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>{
	@Query("select t from Topic t order by t.topicId desc")
	public List<Topic> findAllOrderByIdDsc();
}
