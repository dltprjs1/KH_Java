package Interfaces;

public class Sub implements Inter {	//interface상속은 implements키워드 사용


	@Override
	public void output1() {
		System.out.println("인터페이스 output1() 추상메서드 재정의");
	}
	@Override
	public void output2() {
		System.out.println("인터페이스 output2() 추상메서드 재정의");

	}
}
