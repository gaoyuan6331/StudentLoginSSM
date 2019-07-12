package com.gdut.entity;

public class Course {
	private String courseID;
	private String courseName;
	private String scroe;
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getScroe() {
		return scroe;
	}
	public void setScroe(String scroe) {
		this.scroe = scroe;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", scroe=" + scroe + "]";
	}
	public Course(String courseID, String courseName, String scroe) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.scroe = scroe;
	}
	public Course() {
		super();
	}
	
	
}
