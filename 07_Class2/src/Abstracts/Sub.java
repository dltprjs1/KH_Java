package Abstracts;

public class Sub extends Super{ 	//추상 클래스 Super를 상속받음

	@Override
	void output() {					//Super클래스의 추상 메서드를 Sub클래스에서 반드시 재정의 해야한다.
									
		System.out.println("추상 메서드 재정의 했습니다.");
		
	}
									//추상클래스 Super의 인스턴스 멤버변수(num1)는 재정의하지 않아도 된다.
}									//추상클래스 Super의 인스턴스 멤버메서드(clac)는 재정의 하지 않아도 된다.
