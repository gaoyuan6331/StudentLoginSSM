package com.gdut.mapper;

import org.apache.ibatis.annotations.Param;

import com.gdut.entity.Student_Course;

public interface Student_CourseMapper {
	
	//添加课程
	public void addCourse(@Param("studentID")String studentID, @Param("courseID") String courseID);
	
	//校验课程是否已经存在
	public Student_Course queryCourse(@Param("studentID")String studentID, @Param("courseID") String courseID);
	
	//删除已选课程
	public void deleteCourse(@Param("studentID")String studentID, @Param("courseID") String courseID);
	
	
}
