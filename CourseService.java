package com.springrestapi.springrestapi.services;

import java.util.List;

import com.springrestapi.springrestapi.bean.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Course deleteCourse(long courseId);
	
	

}
