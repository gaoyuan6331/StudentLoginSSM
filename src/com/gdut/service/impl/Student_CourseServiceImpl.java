package com.gdut.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdut.entity.Student_Course;
import com.gdut.mapper.Student_CourseMapper;
import com.gdut.service.Student_CourseService;

@Service
public class Student_CourseServiceImpl implements Student_CourseService {
	
	@Autowired
	Student_CourseMapper student_courseMapper;

	public void setStudent_courseMapper(Student_CourseMapper student_courseMapper) {
		this.student_courseMapper = student_courseMapper;
	}

	@Override
	public void addCourse(String studentID,String courseID) {
		student_courseMapper.addCourse(studentID,courseID);
	}

	@Override
	public void deleteCourse(String studentID, String courseID) {
		student_courseMapper.deleteCourse(studentID, courseID);		
	}

	@Override
	public Student_Course queryCourse(String studentID, String courseID) {
		 return student_courseMapper.queryCourse(studentID, courseID);		
	}

}
