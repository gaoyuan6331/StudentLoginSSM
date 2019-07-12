package com.gdut.handler;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdut.entity.Page;
import com.gdut.entity.Student;
import com.gdut.service.impl.LoginService;
import com.gdut.service.impl.StudentServiceImpl;

@Controller
public class StudentHandler {
	@Autowired
	HttpServletRequest request;

	@Autowired
	StudentServiceImpl studentService;

	@Autowired
	LoginService loginService;

	@RequestMapping("")
	public String index() {

		return "index";
	}

	@RequestMapping(value = "login", produces = "text/plain;charset=utf-8")
	public String welcome(@RequestParam String studentID, @RequestParam String password, HttpServletResponse response,
			Model model) {
		if (studentID == null || "".equals(studentID)) {
			model.addAttribute("errors", "�˺Ų���Ϊ��");
			return "index";
		}
		Student student = studentService.queryStudent(studentID);
		if (student == null) {
			model.addAttribute("error", "���˺�δע��");
			return "index";
		} else if (password != null && password.equals(student.getPassword())) {
			String uuid = UUID.randomUUID().toString();
			Cookie cookie = new Cookie("login_session", uuid);
			cookie.setPath("/");
			response.addCookie(cookie);
			loginService.keepSession(uuid, studentID);
			return "welcome";
		}
		model.addAttribute("error", "�������");
		return "index";

	}

	@RequestMapping("regist")
	public String regist() {
		return "regist";
	}

	@RequestMapping(value = "insertStudent", produces = "text/plain;charset=utf-8")
	public String regist(HttpServletResponse response, HttpServletRequest request, @RequestParam String studentID,
			@RequestParam String studentName, @RequestParam String password, @RequestParam String password2,
			@RequestParam String phoneNum, Model model) {
		// �жϵ�¼�˱����ǹ���Ա
		String loginId = loginService.getLoginId(request);
		if (StringUtils.isEmpty(loginId)) {
			model.addAttribute("error", "���ȵ�¼����Ա�˺�");
			return "index";
		}
		if (!"123456".equals(loginId)) {
			model.addAttribute("error", "���˻����ǹ���Ա");
			return "index";
		}
		Cookie cookie = new Cookie("studentID", studentID + "");
		cookie.setPath("/");
		response.addCookie(cookie);

		String formatErrors = "";
		if (studentName.length() == 0 || studentName.length() > 4) {
			formatErrors = "������4�����ڵ�����! ";
		}
		try {
			Long.parseLong(studentID);
		} catch (NumberFormatException e) {
			formatErrors = formatErrors + "�˺Ÿ�ʽ���� ";
		}
		if (password.length() == 0) {
			formatErrors = formatErrors + "���벻��Ϊ��!  ";
		}
		if (password.length() > 12) {
			formatErrors = formatErrors + "�������!   ";
		}
		if (!password2.equals(password)) {
			formatErrors = formatErrors + "��������ͬ������ ��   ";
		}
		if (!phoneNum.matches("^1[3|4|5|7|8][0-9]{9}$")) {
			formatErrors = formatErrors + "�绰�����ʽ����!  ";
		}
		if (!(formatErrors.length() == 0)) {
			model.addAttribute("formatErrors", formatErrors);
			return "regist";
		}
		System.out.println(studentID);
		Student student = new Student(studentID, studentName, password, phoneNum);
		studentService.insertStudent(student);
		return "registed";

	}

	/*
	 * 
	 * ��ѯ����ѧ����Ϣ��������ҳ
	 * 
	 */
	@RequestMapping("queryAllStudent")
	public String queryAllStudent(@RequestParam(defaultValue = "1") Integer pageNo,
			@RequestParam(defaultValue = "5") Integer pageSize,Model model) {
		String loginID = loginService.getLoginId(request);
		int totalCount = (studentService.queryAllStudent(0, Integer.MAX_VALUE)).size();
		if (StringUtils.isEmpty(loginID)) {
			return "index";
		}
		int prePage = pageNo - 1;
		int nextPage = pageNo + 1;
		int startIndex = (pageNo - 1) * pageSize;
		if (prePage == 0) {
			startIndex = 0;
			pageNo=1;
			prePage=1;
		}
		if (pageNo == totalCount / pageSize && totalCount % pageSize == 0) {
			System.out.println(pageNo);
			startIndex = totalCount - pageSize;
			nextPage= pageNo ;
		}
		if (pageNo > totalCount / pageSize  && totalCount % pageSize > 0) {
			startIndex = totalCount - (totalCount % pageSize);
			nextPage = totalCount / pageSize;
			pageNo=nextPage;
		}
		List<Student> studentList = studentService.queryAllStudent(startIndex, pageSize);
		Page page = new Page(startIndex, pageSize, pageNo, prePage, nextPage, totalCount,studentList.size() / pageSize);
		model.addAttribute(page);
		model.addAttribute(studentList);
		return "studentList";
	}

}
