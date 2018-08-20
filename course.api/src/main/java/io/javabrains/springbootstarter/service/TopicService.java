package io.javabrains.springbootstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.dao.TopicsDao;
import io.javabrains.springbootstarter.pojo.Topics;

@Service
public class TopicService {
	@Autowired
	private TopicsDao dao;

	public List<Topics> viewAll() {
		return dao.viewAll();
	}

	public Topics viewById(String id) {

		return dao.viewById(id);
	}
public void addTopic(Topics topic) {
		
		dao.addTopic(topic);
	}

public void updateTopic(String id, Topics topic) {
dao.updateTopic(id,topic);
	
}

public void delete(String id) {
	dao.delete(id);
}
}
