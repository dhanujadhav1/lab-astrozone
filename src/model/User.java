package model;

public class User{
	String Name;
	String Email;
	String Dob;
	String Gender;
	public User(String name, String gender, String dob, String email) {
		super();
		Name = name;
		Email = email;
		Dob = dob;
		Gender = gender;
	}
	public User(String name, String gender, String dob) {
		// TODO Auto-generated constructor stub
		Name = name;
		Dob = dob;
		Gender = gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
}
