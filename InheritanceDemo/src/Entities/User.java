package Entities;

public class User {
	int Id;
	String fullName;
	
	public User(int id, String fullName) {
		super();
		Id = id;
		this.fullName = fullName;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
