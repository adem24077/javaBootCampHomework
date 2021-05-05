package javaWeeks3;

public class StudentManager extends UserManager {
	
	public void buyCourse(Student student) {
		System.out.println(student.getTakenCourses() + " Kurs satın alındı.");
	}

}
