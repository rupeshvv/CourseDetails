package com.cc.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.course.bean.Course;
import com.cc.course.dao.CourseDAO;
@Service 
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseDAO courseDAO;
	@Override
	public List<Course> getAllCourses() {
	System.out.println("---CourseServiceImpl---getAllCourses()-----");
	return courseDAO.getAllCourses();
	}
	@Override
	public Course getCourseById(int cid) {
		System.out.println("---CourseServiceImpl---getCourseById()-----");
		return courseDAO.getCourseById(cid);
	}
	@Override
	public void addCourse(Course cou) {
		System.out.println("---CourseServiceImpl---addCourse()-----");
		courseDAO.addCourse(cou);
		
	}
	@Override
	public void updateCourse(Course cou) {
		System.out.println("---CourseServiceImpl---updateCourse()-----");
		courseDAO.updateCourse(cou);
		
	}
	@Override
	public void deleteCourse(int cid) {
		System.out.println("---CourseServiceImpl---deleteCourse()-----");
		courseDAO.deleteCourse(cid);
		
	} 

}
