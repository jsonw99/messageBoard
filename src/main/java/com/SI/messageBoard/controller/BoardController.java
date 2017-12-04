package com.SI.messageBoard.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SI.messageBoard.entity.Reply;
import com.SI.messageBoard.entity.Topic;
import com.SI.messageBoard.springdata.ReplyRepository;
import com.SI.messageBoard.springdata.TopicRepository;



@Controller
@SessionAttributes("name")
public class BoardController {
	
	@Autowired
	ReplyRepository replyRepository;
	
	@Autowired
	TopicRepository topicRepository;
	
	private String getLoggedInUserName(ModelMap model) {
		return (String) model.get("name");
	}	
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		model.put("topics", topicRepository.findAllOrderByIdDsc());
		model.put("repos", replyRepository);	
		return "board";
	}
	
	@RequestMapping(value = "/add-topic", method = RequestMethod.GET)
	public String showAddTopicPage(ModelMap model) {
		model.addAttribute("topic", new Topic(getLoggedInUserName(model), "I have a question on ...", new Date()));
		return "topic";
	}
	
	@RequestMapping(value = "/add-topic", method = RequestMethod.POST)
	public String addTopic(ModelMap model, @Valid Topic topic, BindingResult result) {
		if (result.hasErrors()) {
			return "topic";
		}
		topicRepository.save(new Topic(getLoggedInUserName(model), topic.getContent(), new Date()));
		return "redirect:/board";
	}
	
	@RequestMapping(value = "/reply-topic", method = RequestMethod.GET)
	public String showAddReplyPage(@RequestParam int id, ModelMap model) {
		model.addAttribute("reply", new Reply(id, getLoggedInUserName(model), "One possible solution is ...", new Date()));
		return "reply";
	}
	
	@RequestMapping(value = "/reply-topic", method = RequestMethod.POST)
	public String addTopic(ModelMap model, @Valid Reply reply, BindingResult result) {
		if (result.hasErrors()) {
			return "reply";
		}
		replyRepository.save(new Reply(reply.getTopicId(), getLoggedInUserName(model), reply.getContent(), new Date()));
		return "redirect:/board";
	}
}
