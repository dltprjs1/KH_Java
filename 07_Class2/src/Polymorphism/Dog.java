package Polymorphism;

public class Dog implements Animal{ //implements키워드를 사용한 상속

	@Override
	public void sound() {	//Animal 인터페이스의 sound메서드 재정의
		
		System.out.println("멍멍멍");
	}
	
	void output() {			//Dog클래스의 멤버메서드
		System.out.println("출력용 메서드입니다.");
	}

}
