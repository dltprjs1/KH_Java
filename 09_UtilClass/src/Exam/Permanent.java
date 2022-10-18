package Exam;

public class Permanent extends Employee{
	
	
	private int salary;
	private int bonus;
	
	
	public int getSalary() {
		return salary;
	}
	public int getBonus() {
		return bonus;
	}
	
	public Permanent() { }
	public Permanent(int salary,int bonus) {
		this.salary=salary;
		this.bonus=bonus;	
	}
	
	
	@Override
	int getPays() {
		
		return salary+bonus;
	}
	
}
