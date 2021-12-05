package com.cc.course.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cc.course.bean.Course;
@Repository
@Transactional
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	HibernateTemplate htemp;
	@Override
	public List<Course> getAllCourses() {
	System.out.println("---CourseDAOImpl---getAllCourses()-----");
	return htemp.loadAll(Course.class);
	}
	
	@Override
	public Course getCourseById(int cid) {
		System.out.println("---CourseDAOImpl---getCourseById()-----");
		return htemp.load(Course.class, cid, LockMode.READ);
	}
	@Override
	public void addCourse(Course cou) {
		System.out.println("---CourseDAOImpl---addCourse()-----");
		htemp.save(cou);
	}
	@Override
	public void updateCourse(Course cou) {
		System.out.println("---CourseDAOImpl---addCourse()-----");
		htemp.update(cou);
		
	}
	@Override
	public   void deleteCourse(int cid) {
		System.out.println("---CourseDAOImpl---deleteCourse()-----");
		 Course cou = htemp.get(Course.class,cid, LockMode.READ);
		 htemp.delete(cou);
		
	} 
	

}
