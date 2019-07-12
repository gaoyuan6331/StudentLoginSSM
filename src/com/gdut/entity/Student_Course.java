package com.gdut.entity;

public class Student_Course {
	private String studentID;
	private String courseID;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public Student_Course(String studentID, String courseID) {
		super();
		this.studentID = studentID;
		this.courseID = courseID;
	}
	public Student_Course() {
		super();
	}
	@Override
	public String toString() {
		return "Student_Course [studentID=" + studentID + ", courseID=" + courseID + "]";
	}

	
	
}
