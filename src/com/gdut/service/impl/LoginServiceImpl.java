package com.gdut.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdut.entity.Student;
import com.gdut.mapper.StudentMapper;
import com.gdut.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	StudentMapper mapper;

	@Override
	public Student queryStudent(long studentID) {
		System.out.println("执行service层查找方法,调用Dao层");
		return mapper.queryStudent(studentID);
	}

	public void setMapper(StudentMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void deletStudent(Student student) {
		System.out.println("执行service层删除方法,调用Dao层");
	}

	@Override
	public void insertStudent(Student student) {
		System.out.println("执行service层插入方法,调用Dao层");
		mapper.regist(student);
		
	}

}
