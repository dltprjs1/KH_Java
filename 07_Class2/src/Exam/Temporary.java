package Exam;

public class Temporary {

	//멤버변수
	String name;
	int time;
	int pay;
	int a = time*pay;
	double b=a*0.03;
	double c=a-b;
	public Temporary() {	}
	public Temporary(String name, int time, int pay) {	
		this.name=name;
		this.time=time;
		this.pay=pay;
	}
	
	void getPayInfo() {
		System.out.println("-----------------------------------");
		int total = time*pay;
		System.out.printf("총급여액 : %,d원\n",total);
		double amount =(int)(total * 0.03);
		System.out.printf("공제액 : %,.0f원\n",amount);
		System.out.printf("총급여액 : %,.0f원",total-amount);
	}
	//멤버메서드
}
