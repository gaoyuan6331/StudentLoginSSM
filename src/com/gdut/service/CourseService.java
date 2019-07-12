package com.gdut.service;

import java.util.List;

import com.gdut.entity.Course;

public interface CourseService {
	public List<Course> queryAllCourse();
	
	public void AddCourse(String courseID,String courseName);
	
	public void deleteCourse(String courseID);
	
	}
