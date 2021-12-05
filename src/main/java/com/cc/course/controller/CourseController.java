package com.cc.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.course.bean.Course;
import com.cc.course.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping("/allcourses")
	public List<Course> getAllCourses(){
	System.out.println("---CourseController---getAllCourses()-----");
	return courseService.getAllCourses();
	} 
	
	@GetMapping("/course/{cid}")
	public  Course getCourseById(@PathVariable int cid) {
		System.out.println("---CourseController---getCourseById()-----");
		return courseService.getCourseById(cid);
	}
	
	@PostMapping("addCourse")
	public  void addCourse(@RequestBody Course cou) {
		System.out.println("---CourseController---getCourseById()-----");
		courseService.addCourse(cou);
	}
	
	@PutMapping("updateCourse")
	public  void updateCourse(@RequestBody Course cou) {
		System.out.println("---CourseController---updateCourse()-----");
		courseService.updateCourse(cou);
	}
	@DeleteMapping("/deleteCourse/{cid}")
	public void deleteCourse(@PathVariable int cid) {
		System.out.println("---CourseController---updateCourse()-----");
		courseService.deleteCourse(cid);
	}

}
