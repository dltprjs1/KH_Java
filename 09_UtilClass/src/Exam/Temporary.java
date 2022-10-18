package Exam;

public class Temporary extends Employee{
	
	private int time;
	private int pay;
	
	
	public int getTime() {
		return time;
	}
	public int getPay() {
		return pay;
	}
	
	public Temporary() {	}
	public Temporary(int time,int pay) {
		this.time=time;
		this.pay=pay;
		
	}
	@Override
	int getPays() {
		
		return time*pay;
	}
	
	
	
}
