package object;

/*
 * Object 클래스
 * 1. java의 모든 클래스의 조상 클래스
 * 		==> java의 가장 최상위 조상클래스 Object 클래스이다
 * 2. 사용자가 정의한 클래스에 자동으로 상속이 된다
 * 		==> 단, extends 키워드를 사용하지 않은 클래스에만 상속이 됨.   <<< 상속은 단일 상속만 가능하기때문에
 * 
 * [Object 클래스의 주요 메서드]
 * 
 * - toString() : - 객체 자신의 정보를 문자열로 반환하는 메서드
 * 				  - 인스턴스에 대한 정보를 문자열로 제공할 못적으로 사용이 된다.
 * - getClass() : - 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환하는 메서드
 * - hashCode() : - 객체 자신의 해쉬 코드를 반환하는 메서드
 * - equals() : - 객체 자신과 또 다른 객체가 같은 객체인지 알려주는 메서드
 * - clone() : - 객체 자신의 복사본을 만드는 메서드
 */
public class Ex01 {

	
	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01();
		
		System.out.println("toString() >>> "+ ex01.toString()); //주소값
		
		System.out.println("getClass() >>> "+ ex01.getClass()); //클래스파일의 위치
		
		System.out.println("hashcode() >>> "+ ex01.hashCode()); //주소값을 정수로 반환
	}

}
