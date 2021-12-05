package com.cc.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CourseDetailsApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CourseDetailsApplication.class, args);
	}

}
