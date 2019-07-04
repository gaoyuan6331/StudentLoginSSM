package com.gdut.mapper;

import com.gdut.entity.Student;


//Dao²ã
public interface StudentMapper {
	public Student queryStudent(long studentID);
	
	public void deletStudent(Student student);
	
	public void regist(Student student);
	}
