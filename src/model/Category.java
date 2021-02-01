package model;

public class Category {
	
	int id;
	String name;
	
	Category(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
