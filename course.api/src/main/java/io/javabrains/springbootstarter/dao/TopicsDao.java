package io.javabrains.springbootstarter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.javabrains.springbootstarter.pojo.Topics;

@Component
public class TopicsDao {

	static List<Topics> topicList = new ArrayList<>();

	{
		topicList.add(new Topics("Java", "headfirs", "afd"));
		topicList.add(new Topics("2Java", "2headfirs", "2afd"));
		topicList.add(new Topics("3Java", "3headfirs", "3afd"));

	}

	public List<Topics> viewAll() {
		return topicList;
	}

	public Topics viewById(String id) {

		for (Topics topic : topicList) {
			if (topic.getId().equals(id)) {
				return topic;

			}
		}
		return null;
	}

	public void addTopic(Topics topic) {
		topicList.add(topic);

	}

	public void updateTopic(String id, Topics topic) {
		for(int i=0;i<topicList.size();i++) {
			Topics t=topicList.get(i);
			if(t.getId().equals(id)) {
				topicList.set(i, topic);
			}
		}

	}

	public void delete(String id) {
		for(Topics topic:topicList) {
			if(topic.getId().equals(id)) {
				topicList.remove(topic);
			}
		}

	}
}
