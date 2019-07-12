package com.gdut.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public Map<String, String> sessionMap = new HashMap<String, String>();
	
	public void keepSession(String sessionId, String studentId) {
		this.sessionMap.put(sessionId, studentId);
	}
	
	public String getLoginId(String sessionId){
		return sessionMap.get(sessionId);
	}
	
	public String getLoginId(HttpServletRequest request){
		return sessionMap.get(getLoginCookie(request));
	}
	
	public String getLoginCookie(HttpServletRequest request) {
		String login_session = null;
		for (Cookie cookie : request.getCookies()) {
			if ("login_session".equals(cookie.getName())) {
				login_session = cookie.getValue();
			}
		}
		return login_session;
	}
}
