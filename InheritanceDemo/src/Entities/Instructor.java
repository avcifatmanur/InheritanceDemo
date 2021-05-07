package Entities;

public class Instructor extends User{
	
	private String description;

	public Instructor(int id, String fullName, String description) {
		super(id, fullName);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
