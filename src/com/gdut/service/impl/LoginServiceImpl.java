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
		System.out.println("ִ��service����ҷ���,����Dao��");
		return mapper.queryStudent(studentID);
	}

	public void setMapper(StudentMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void deletStudent(Student student) {
		System.out.println("ִ��service��ɾ������,����Dao��");
	}

	@Override
	public void insertStudent(Student student) {
		System.out.println("ִ��service����뷽��,����Dao��");
		mapper.regist(student);
		
	}

}
