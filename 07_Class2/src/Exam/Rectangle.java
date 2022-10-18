package Exam;

public class Rectangle {
	//멤버변수
	int a;
	int b;
	
	public Rectangle() {  }
	public Rectangle(int a, int b) { 
		this.a=a;
		this.b=b;
	}
	
	//멤버메서드
	void c() {
		System.out.println("사각형의 넓이 : "+(a*b));
	}
	void d() { 
		System.out.println("사각형의 둘레 : "+(a+b)*2);
	}
}
