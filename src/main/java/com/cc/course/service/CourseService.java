package com.cc.course.service;

import java.util.List;

import com.cc.course.bean.Course;

public interface CourseService {
	public List<Course> getAllCourses();
	public   Course getCourseById(int cid);
	 public   void   addCourse(Course cou);
	 public void updateCourse(Course cou);
	 public void deleteCourse(int cid);
}
