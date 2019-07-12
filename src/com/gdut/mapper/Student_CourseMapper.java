package com.gdut.mapper;

import org.apache.ibatis.annotations.Param;

import com.gdut.entity.Student_Course;

public interface Student_CourseMapper {
	
	//��ӿγ�
	public void addCourse(@Param("studentID")String studentID, @Param("courseID") String courseID);
	
	//У��γ��Ƿ��Ѿ�����
	public Student_Course queryCourse(@Param("studentID")String studentID, @Param("courseID") String courseID);
	
	//ɾ����ѡ�γ�
	public void deleteCourse(@Param("studentID")String studentID, @Param("courseID") String courseID);
	
	
}
