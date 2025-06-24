package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.bean.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list = new ArrayList<>();
	
	@Override
	public List<Course> getCourses() {
		
		list.add(new Course(10,"java","oops"));
		list.add(new Course(20,"spring","Framework"));
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) 
	{
		Course c=null;
		for(Course course : list)
		{
			if(course.getId()==courseId)
			{
				 c= course;
				 break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) 
	{
		list.add(course);
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) 
	{
		list.forEach(e -> {
			if(e.getId()==course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDesc(course.getDesc());
			}
		});
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) 
	{
		
		list = this.list.stream().filter(e -> e.getId()!=courseId).collect(Collectors.toList());
		return null ;
	}

}
