package Polymorphism;

public class Mei implements OverWatch { //OverWatch 인터페이스를 상속 

	//OverWatch 인터페이스의 멤버 메서드 전부 재정의
	
	@Override	
	public void name() {
		System.out.println("이 름 : 메이");
	}

	@Override
	public void leftClick() {
		System.out.println("왼쪽버튼 : 냉각총");
	}

	@Override
	public void rightClick() {
		System.out.println("오른쪽버튼 : 고드름");
	}

	@Override
	public void shiftButton() {
		System.out.println("shift 버튼: 급속빙결");
	}

	@Override
	public void eButton() {
		System.out.println("e버튼 : 빙벽");
	}

	@Override
	public void qButton() {
		System.out.println("q버튼 : 눈보라");
	}

}
