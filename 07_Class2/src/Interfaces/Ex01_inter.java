package Interfaces;

public class Ex01_inter {

	public static void main(String[] args) {
		
		
		//Inter inter= new Inter(); <<< interface는 객체 생성 불가능!
		
		Sub sub = new Sub();		//인터페이스의 자식클래스는 객체 생성 가능
		
		sub.output1();
		sub.output2();
		
		// sub.num=150; <<<interface 클래스의 멤버변수는 무조건 상수(static final)이다

	}

}
