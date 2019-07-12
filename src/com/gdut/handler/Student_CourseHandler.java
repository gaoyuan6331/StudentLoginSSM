package com.gdut.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdut.entity.Student_Course;
import com.gdut.service.impl.LoginService;
import com.gdut.service.impl.Student_CourseServiceImpl;

@Controller
public class Student_CourseHandler {

	@Autowired
	Student_CourseServiceImpl student_courseService;

	@Autowired
	LoginService loginService;
	

	@RequestMapping("addCourse")
	public String addCourse(HttpServletRequest request, String courseID, Model model) {
		String studentID = loginService.getLoginId(request);
		Student_Course sc = student_courseService.queryCourse(studentID, courseID);
		if (sc == null) {
			student_courseService.addCourse(studentID, courseID);
			model.addAttribute("tips", "课程加入成功");
			return "result";
		}
		model.addAttribute("tips", "该课程已存在");
		return "result";
	}
}
