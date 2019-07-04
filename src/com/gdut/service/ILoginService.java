package com.gdut.service;

import com.gdut.entity.Student;

public interface ILoginService {
	
	Student queryStudent(long studentID);
	
	public void deletStudent(Student student);
	
	public void insertStudent(Student student); 
}
