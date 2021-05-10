package com.cource.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cource.model.Topic;
import com.cource.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "Java", "Java Core"),
			new Topic(2, "Spring", "Spring Framework"),
			new Topic(3,"Javascript", "Javascript language")
			));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics:: add);
		return topics;
	}
	
	public Topic getTopicById(int id) {
		//return topics.stream().filter(t ->t.getId() == id).findFirst().get();
	 return	topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void update(Topic topic , int id) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(int id) {
		topicRepository.deleteById(id);
	}
}
