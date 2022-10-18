package inheritance;

/*
 * 1. super 키워드
 * - 부모의 멤버를 호출하는 명령어
 *   형식) super.부모클래스멤버(멤버변수,멤버메서드)
 *   
 * 2. this 키워드
 * - 현재 클래스에 소속된 멤버를 호출하는 명령어
 * - this 키워드는 현재 객체 자기 자신을 의미함
 *   형식) this.자식클래스멤버(멤버변수, 멤버메서드)
 */

public class Avante extends car2{
	
	String color = "흰색";
	
	void output() {
		System.out.println("엔진 : "+cc+" 문의 갯수 : "+door+" 색상 : "+color);
												   //Avante클래스의 멤버변수 color호출
		System.out.println("엔진 : "+cc+" 문의 갯수 : "+door+" 색상 : "+super.color);
													//car2클래스의 멤버변수 color 호출
		System.out.println("엔진 : "+cc+" 문의 갯수 : "+door+" 색상 : "+this.color);
	}											   //Avante클래스의 멤버변수 color호출

}
