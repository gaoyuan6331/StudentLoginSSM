package com.gdut.handler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdut.entity.Student;
import com.gdut.service.impl.LoginServiceImpl;

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
	
	public Map<String ,String> sessionMap=new HashMap<String,String>();

	@RequestMapping("login")
	public String welcome(@RequestParam String studentID, @RequestParam String password, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("执行handler层,调用Service层");
		try {
			Long.parseLong(studentID);
		} catch (NumberFormatException e) {
			return "false";
		}
		Student student = loginService.queryStudent(Long.parseLong(studentID));
		if (student.equals(null)) {
			Cookie cookie = new Cookie("login_session", "");
			cookie.setPath("/");
			response.addCookie(cookie);
			return "false";
		} else if (password.equals(student.getPassword())) {
			String uuid = UUID.randomUUID().toString();
			Cookie cookie = new Cookie("login_session", uuid);
			cookie.setPath("/");
			response.addCookie(cookie);
			sessionMap.put(uuid, studentID);
			return "welcome";
		}
		return "fasle";
	}

	@RequestMapping("regist")
	public String regist() {
		return "regist";
	}

	@RequestMapping(value = "insertStudent")
	public String regist(HttpServletResponse response, @RequestParam long studentID, @RequestParam String studentName, @RequestParam String password,
			@RequestParam String phoneNum) {
		System.out.println("--------------");
		
		Cookie[] cookies = request.getCookies();
		String login_session = null;
		for(Cookie cookie : cookies){
			if("login_session".equals(cookie.getName())) {
				login_session = cookie.getValue();
			}
		}
		// 判断登录人必须是管理员
		String loginID = sessionMap.get(login_session);
		System.out.println("login_session=" + login_session + ", loginId=" + loginID);
		if(!"123456".equals(loginID)){
			return "index";
		}
		Cookie cookie = new Cookie("studentID", studentID+"");
		
		cookie.setPath("/");
		response.addCookie(cookie);
		
		if (!phoneNum.matches("^1[3|4|5|7|8][0-9]{9}$")) {
			return "false";
		} else {
			Student student = new Student(studentID, studentName, password, phoneNum);
			loginService.insertStudent(student);
			System.out.println("***********");
			return "registed";
		}
	}
}
