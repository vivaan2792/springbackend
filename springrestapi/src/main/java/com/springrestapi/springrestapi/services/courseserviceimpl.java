package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.entities.Course;
@Service
public class courseserviceimpl implements CourseService{
	List<Course> list;
	public courseserviceimpl() {
		list=new ArrayList<>();
		list.add(new Course(764,"jj","kkk"));
		list.add(new Course(768,"jjjjj","kkksjk"));
		list.add(new Course(769,"jlll","ksksksk"));
		

		
	}
	@Override

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourses(long courseId){
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {c=course;
			break;}
		}
		return c;
		
	}
	@Override

	public Course addCourse(Course course) {
		list.add(course);
	
		// TODO Auto-generated method stub
		return course;
	}


}
