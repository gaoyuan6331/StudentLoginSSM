package com.gdut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdut.entity.Student;
import com.gdut.mapper.StudentMapper;
import com.gdut.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentMapper studentmapper;
	
	public void setMapper(StudentMapper mapper) {
		this.studentmapper = mapper;
	}

	@Override
	public Student queryStudent(String studentID) {
		return studentmapper.queryStudent(studentID);
	}


	@Override
	public void deletStudent(Student student) {
		studentmapper.deletStudent(student);
	}

	@Override
	public void insertStudent(Student student) {
		studentmapper.regist(student);
		
	}

	@Override
	public List<Student> queryAllStudent(int startIndex,int pageSize) {
		return studentmapper.queryAllStudent(startIndex, pageSize);
	}


}
