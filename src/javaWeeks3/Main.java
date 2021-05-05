package javaWeeks3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Adem");
		student1.setLastName("Kavuş");
		student1.setEmail("adem1544@gmail.com");
		student1.setPassword(123456);
		student1.setTakenCourses("Java ile Programlamaya Giriş");
		student1.setSchoolName("Yalova Üniversitesi");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engind@gmail.com");
		instructor1.setPassword(9874565);
		instructor1.setCompanyName("SolidTeam");
		instructor1.setGivenCourses("Java ile Programlamaya Giriş");
		
		
		UserManager userManager = new UserManager();
		
		User[] users = {student1, instructor1};
		
		userManager.addMultiple(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		instructorManager.addHomework(instructor1);
		
		
		
		
		
		
		
	}

}
