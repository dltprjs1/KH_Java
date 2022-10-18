package Exam;

public class Permanent extends Employee {

	int pay;
	int bonus;
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public Permanent() {	}
	public Permanent(int pay, int bonus) {
		this.pay=pay;
		this.bonus=bonus;
	}
		
	@Override
	int getPays() {
		
		int pays = pay+bonus;
		return pays;
	}
	
		
	
	
}
