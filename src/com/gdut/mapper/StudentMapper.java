package com.gdut.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gdut.entity.Student;


//Dao²ã
public interface StudentMapper {
	public Student queryStudent(String studentID);
	
	public void deletStudent(Student student);
	
	public void regist(Student student);
	
	public List<Student> queryAllStudent(@Param("startIndex") int startIndex,@Param("pageSize")int pageSize);
	
	
	}
