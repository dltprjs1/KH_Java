package Overriding;

/*
 * 메서드 재정의(Method Overridng)
 * - 부모 클래스에서 정의한 메서드를 자식 클래스에서 다시 작성(재정의) 하는 것을 말한다
 * 
 * [메서드 재정의 틍징]
 * 1. 반드시 상속관계에서만 발생한다(메서드 다중 정의(overloading) - 동일한 클래스에서 발생)
 * 2. 부모 클래스의 원형메서드를 자식 클래스에서 재정의(다시 작성)
 * 
 * ****************************************************************
 * [메서드 재정의 조건]
 * 1. 반드시 리턴타입(반환형), 매개변수 모두 일치해야한다
 * 	  (메서드 다중 정의(overloading) - 매개변수의 갯수가 다르던지, 갯수가 같다면 자료형이 다르던지 해야한다.)
 * 2. 접근지정자는 확장은 되지만 축소는 불가능하다.
 *    [ public>protected>default>private ]
 */
public class Dog extends Animal{

	//void sound() {         // 접근제한이 보이지 않는 메서드는 default 접근제한
	//	System.out.println("멍멍멍");
	//}
	
	
	//부모(Animal)클래스의 메서드 오버라이딩 : ctrl+space bar ->override하고싶은 메서드 선택
	
	@Override
	void sound() {
		System.out.println("멍멍멍");
	}
}