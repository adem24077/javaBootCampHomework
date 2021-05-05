package javaWeeks3;

public class Instructor extends User {
	
	private String givenCourses;
	private String companyName;
	
	public Instructor() {
		
	}
	
	public Instructor(String givenCourses, String companyName) {
		super();
		this.givenCourses = givenCourses;
		this.companyName = companyName;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
