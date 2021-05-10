package com.cource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cource.model.Course;
import com.cource.model.Topic;
import com.cource.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable int id){
		return courseService.getAllCourses(id);
	}
	
	@GetMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		return courseService.getCourse(id);
	}
	
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable int topicId) {
		course.setTopic(new Topic(topicId,"", ""));
		courseService.addCourse(course);
	}
	
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable int id, @PathVariable int topicId) {
		course.setTopic(new Topic(topicId,"", ""));
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/topics/{topicId}/courses/{id}")
	public void deletCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	}
}
