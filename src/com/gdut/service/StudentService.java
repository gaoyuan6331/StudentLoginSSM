package com.gdut.service;

import java.util.List;

import com.gdut.entity.Student;

public interface StudentService {
	
	Student queryStudent(String studentID);
	
	public void deletStudent(Student student);
	
	public void insertStudent(Student student); 
	
	public List<Student> queryAllStudent(int startIndex,int pageSize);
	
	
}
