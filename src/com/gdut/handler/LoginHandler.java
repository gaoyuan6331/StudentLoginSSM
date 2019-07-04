package com.gdut.handler;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdut.entity.Student;
import com.gdut.service.impl.LoginServiceImpl;
import com.mysql.cj.util.StringUtils;

@Controller
public class LoginHandler {
	@Autowired
	HttpServletRequest request;

	@Autowired
	LoginServiceImpl loginService;

	@RequestMapping("")
	public String index() {
		return "index";
	}

	@RequestMapping("login")
	public String welcome(@RequestParam String studentID, @RequestParam String password, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("执行handler层,调用Service层");
		Cookie[] cookies = request.getCookies();
		if (!cookies.equals(null)) {
			System.out.println(studentID + "cookie不为空");
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("studentID")) {
					response.addCookie(cookie);
					break;
				}
			}
		}
		if (cookies.equals(null)) {
			System.out.println(studentID + "cookie为空");
			Cookie cookie = new Cookie("studentID", studentID);
			cookie.setMaxAge(0);
			cookie.setPath("/");
			response.addCookie(cookie);
		}
		
		
		
		
		try {
			Long.parseLong(studentID);
		} catch (NumberFormatException e) {
			return "false";
		}
		Student student = loginService.queryStudent(Long.parseLong(studentID));
		if (student.equals(null)) {
			return "false";
		} else if (password.equals(student.getPassword())) {
			return "welcome";
		}
		return "fasle";
	}

	@RequestMapping("regist")
	public String regist() {
		return "regist";
	}

	@RequestMapping(value = "insertStudent")
	public String regist(@RequestParam long studentID, @RequestParam String studentName, @RequestParam String password,
			@RequestParam String phoneNum) {
		System.out.println("--------------");
		if (!phoneNum.matches("^1[3|4|5|7|8][0-9]{9}$")) {
			return "wrong";
		} else {
			Student student = new Student(studentID, studentName, password, phoneNum);
			loginService.insertStudent(student);
			System.out.println("***********");
			return "registed";
		}
	}
}
