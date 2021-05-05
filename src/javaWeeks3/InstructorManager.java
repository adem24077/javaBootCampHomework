package javaWeeks3;

public class InstructorManager extends UserManager {
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getFirstName() +" " + instructor.getLastName() +" ev ödevi ekledi.");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getGivenCourses() + " kursu eklendi.");
	}

}
