package com.cource.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cource.model.Topic;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hi";
	}
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic(1, "Java", "java core"),
				new Topic(2, "Spring", "Spring Framework" ),
				new Topic(3, "Rubi", "Rubi framework")
				
				);
	}
}
