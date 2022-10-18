package Exam;

public abstract class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Employee() {}
	public Employee(String name) {
		this.name=name;
		
	}
	
	abstract int getPays();
}
