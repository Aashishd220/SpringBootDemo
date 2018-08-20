package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.pojo.Topics;
import io.javabrains.springbootstarter.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService service;

	@RequestMapping("/topics")
	public List<Topics> getAllTopic() {
		return service.viewAll();
	}

	@RequestMapping("/topics/{id}")
	public Topics viewById(@PathVariable String id) {

		return service.viewById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topics topic) {
		service.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topics topic, @PathVariable String id) {
		service.updateTopic(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/topics/{id}")
	public void delete(@PathVariable String id) {

		 service.delete(id);
	}
}
