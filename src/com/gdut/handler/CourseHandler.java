package com.gdut.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdut.entity.Course;
import com.gdut.service.impl.CourseServiceImpl;

@Controller
public class CourseHandler {
	
	@Autowired
	CourseServiceImpl courseService;
	
	@RequestMapping("queryAllCourse")
	public String queryAllCourse(Model model){
		List<Course> courseList=courseService.queryAllCourse();
		model.addAttribute("courseList", courseList);
		return "courseList";
	}
	
}
