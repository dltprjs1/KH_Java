package Polymorphism;

public class Mccree implements OverWatch {	//OverWatch 인터페이스 상속

	//OverWatch 인터페이스의 멤버 메서드 점부 재정의
	
	@Override
	public void name() {
		System.out.println("이 름 : 맥크리");
	}

	@Override
	public void leftClick() {
		System.out.println("왼쪽버튼 : 피스키퍼");
	}

	@Override
	public void rightClick() {
		System.out.println("오른쪽버튼 : 모든 총알 발사");
	}

	@Override
	public void shiftButton() {
		System.out.println("shift버튼 : 구르기");
	}

	@Override
	public void eButton() {
		System.out.println("e버튼 : 섬광탄");
	}

	@Override
	public void qButton() {
		System.out.println("q버튼 : 황야의 무법자");
	}

}
