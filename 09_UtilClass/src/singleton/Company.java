package singleton;

public class Company {
	
/*
 * 싱클톤(singleton)- 객체의 주소값을 동일한 값으로 불러오기
 * 
 * 		형식) 	private static 클래스명 변수명;						<<<클래스명을 자료형(?)으로한 멤버변수 선언
 * 								
 * 				private 클래스명() {	};							<<<기본생성자를 private으로 하여 다른 클래스 내에 객체생성 불가능!
 * 
 *  			public static 클래스명 멤버메서드명(){					<<<반환값을 갖은 클래스명을 자료형(?)으로한 멤버메서드 생성
 *  			
 *  			if(변수명 == null){								<<<if(true) if문 실행한 후 접근제어가 private(같은 클래스 내에서만 사용가능)인 생성자를  멤버변수(클래스명을 자료형으로 한)에 대입  
 *  			변수명 = new 기본생성자();
 *  			} return 변수명;									<<<클래스명이 자료형인 경우 반환값을 가지는 메서드를 만들기 때문에 반환값으로 멤버변수(기본생성자를 대입 받은)를 반환값으로 선언
 *  			} 												
 *  															***다른 클래스에서 싱글톤(객체들의 주소값이 동일한) 객체를 호출 : 호출할 클래스명 참조변수명 = 클래스명.기본생성자를 대입받은 멤버변수가 있는 메서드() 
 */				
	private static Company a;
	private Company() {
		
	}
	public static Company b() {
		a=new Company();
		return a;
	}
}
