package com.gdut.service;

import com.gdut.entity.Student_Course;

public interface Student_CourseService {
	
	public void addCourse(String studentID,String courseID);
	
	public void deleteCourse(String studentID,String courseID);
	
	public Student_Course queryCourse(String studentID,String courseID);
}
