package com.gdut.entity;

public class Student {
	String studentID;
	String password;
	String studentName;
	String phoneNum;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Student(String studentID, String password, String studentName, String phoneNum) {
		super();
		this.studentID = studentID;
		this.password = password;
		this.studentName = studentName;
		this.phoneNum = phoneNum;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", password=" + password + ", studentName=" + studentName
				+ ", phoneNum=" + phoneNum + "]";
	}
	
}
