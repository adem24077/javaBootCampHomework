package javaWeeks3;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " g�ncellendi.");
	}
	
	//Bulk insert 
	public void addMultiple(User[] users) {
		for(User user : users) {
			System.out.println(user.getFirstName() + " eklendi.");
		}
	}
}
