package Abstracts;

public class Ex01_Super extends Sub {

	public static void main(String[] args) {
		
		/* ****************************
		 * 추상클래스는 객체 생성 불가능
		 * Super super = new Super();
		 * ****************************
		 */

		Sub sub = new Sub();	
		//추상클래스 Super를 상속받은 자식클래스 Sub 객체 생성
		
		sub.num1=135;
		//추상클래스 Super의 인스턴스 멤버변수는 재정의하지 않아도 된다.
		
		System.out.println("clac() 메서드 호출 >>> "+sub.calc());
		
		sub.output(); //추상메서드 재정의 호출
		
	}

}
