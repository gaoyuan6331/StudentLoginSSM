package com.gdut.mapper;

import com.gdut.entity.Student;


//Dao��
public interface StudentMapper {
	public Student queryStudent(long studentID);
	
	public void deletStudent(Student student);
	
	public void regist(Student student);
	}
