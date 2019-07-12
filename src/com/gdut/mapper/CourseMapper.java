package com.gdut.mapper;

import java.util.List;

import com.gdut.entity.Course;

public interface CourseMapper {
	public List<Course> queryAllCourse();
	
	public void addCourse(String courseID,String courseName);
	
	public void deleteCourse(String courseID);
}
