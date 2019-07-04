package com.gdut.entity;

public class Student {
	long studentID;
	String password;
	String studentName;
	String phoneNum;

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public long getStudentID() {
		return studentID;
	}

	public Student() {
		super();
	}

	public void setStudentID(long studentID) {
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

	public Student(long studentID, String studentName,String password,  String phoneNum) {
		super();
		this.studentID = studentID;
		this.password = password;
		this.studentName = studentName;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", password=" + password + ", studentName=" + studentName + phoneNum
				+ "phoneNum" + "]";
	}

}
