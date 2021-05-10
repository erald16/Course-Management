package com.cource.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cource.model.Course;
import com.cource.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(int topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses :: add);
		return courses;
	}
	
	public Course getCourse(int id) {
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}
}
