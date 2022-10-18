package Polymorphism;

public class Ex01_Animal {

	public static void main(String[] args) {
		
		Animal dog = new Dog();		// 형식) 부모클래스명 참조변수명 = new 자식클래스 생성자
		dog.sound();				// 형식) 자식클래스.부모 클래스or부모 인터페이스의 메서드 호출 
		//dog.output(); 			// Animal 클래스에 있는 멤버만 호출 가능하다.
		//Dog dog2 = new Animal();	// 자식클래스를 객체로 부모 클래스or부모 인터페이스를 생성자 호출 불가능 
		
	}

}
