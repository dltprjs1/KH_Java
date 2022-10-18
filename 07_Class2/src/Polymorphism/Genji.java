package Polymorphism;

public class Genji implements OverWatch {	//OverWatch 인터페이스 상속

	//OverWatch 인터페이스의 모든 멤버메서드 재정의
	
	@Override
	public void name() {
		System.out.println("이 름 : 겐지");
	}

	@Override
	public void leftClick() {
		System.out.println("왼쪽버튼 : 표창 던지기");
	}

	@Override
	public void rightClick() {
		System.out.println("오른쪽버튼 : 표창 3개 던지기");
	}

	@Override
	public void shiftButton() {
		System.out.println("shift버튼 : 돌진");
	}

	@Override
	public void eButton() {
		System.out.println("e버튼 : 칼로 막기");
	}

	@Override
	public void qButton() {
		System.out.println("q버튼 : 칼로 죽이기");
	}

}
