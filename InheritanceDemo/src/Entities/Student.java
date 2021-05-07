package Entities;

public class Student extends User{
	
	private int studentNumber;
	private String email;
	private String password;
	private int status;
	
	
	public Student(int id, String fullName, int studentNumber, String email, String password) {
		super(id, fullName);
		this.studentNumber = studentNumber;
		this.email = email;
		this.password = password;
	}
	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return "%"+ status;
	}
}
