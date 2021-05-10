package com.cource.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cource.model.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{

	public List<Course> findByTopicId(int topicId);
}
