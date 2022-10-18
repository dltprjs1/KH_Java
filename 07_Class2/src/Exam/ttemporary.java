package Exam;

public class ttemporary extends Employee {
	
	int pay;
	int time;
	
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public ttemporary() {	}
	public ttemporary(int pay,int time) {	
	
	this.pay=pay;
	this.time=time;
	
	}
	
	@Override
	int getPays() {
		return pay*time;
	}
}
