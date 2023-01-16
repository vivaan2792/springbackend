package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.Course;
import com.springrestapi.springrestapi.services.CourseService;

@RestController
public class Mycontroller {
	@Autowired
	private CourseService coursey;
	@GetMapping("/home")
	public String home() {
		return "aaja";
		}
	@GetMapping("/courses")
	public List<Course>getCourses(){
		return this.coursey.getCourses();}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.coursey.getCourses(Long.parseLong(courseId));
	}

	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.coursey.addCourse(course);
	}}
	
	
	