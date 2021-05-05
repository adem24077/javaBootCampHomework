package javaWeeks3;

public class Student extends User {
	
	private String takenCourses;
	private String schoolName;
	
	public Student() {
		
	}
	
	public Student(String takenCourses, String schoolName) {
		super();
		this.takenCourses = takenCourses;
		this.schoolName = schoolName;
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
