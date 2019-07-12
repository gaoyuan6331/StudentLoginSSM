package com.gdut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdut.entity.Course;
import com.gdut.mapper.CourseMapper;
import com.gdut.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseMapper courseMapper;

	public void setCourseMapper(CourseMapper courseMapper) {
		this.courseMapper = courseMapper;
	}

	@Override
	public List<Course> queryAllCourse() {
		return courseMapper.queryAllCourse();
	}

	@Override
	public void deleteCourse(String courseID) {
	}

	@Override
	public void AddCourse(String courseID,String courseName) {
		courseMapper.addCourse(courseID,courseName);		
	}

}
