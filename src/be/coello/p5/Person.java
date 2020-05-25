package be.coello.p5;

public class Person {
	public String name; 
	public String lastname;
	
	public Person() {
		super();
		this.name = "Desconocido";
		this.lastname = null;
	}
	
	
	public Person(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + "]";
	}
	
	
	
}
