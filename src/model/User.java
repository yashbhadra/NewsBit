package model;

public class User {
	public int id;
	String name;
	String password;
	String number;
	String email;
	public User(){}
	
	User(int id,String name,String password,String number,String email){
		this.id=id;
		this.name=name;
		this.password=password;
		this.number=number;
		this.email=email;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPassword() {
		return this.name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getNumber() {
		return this.number;
	}
	public void setNumber(String string) {
		this.number=string;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.name=email;
	}

}
