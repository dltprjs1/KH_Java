package Interfaces;

interface Inter1{
	void aa();
	
}

interface Inter2{
	void bb();
}

interface Inter3 extends Inter1,Inter2{					
//인터페이스가 인터페이스를 상속 받을때는 extends로 상속받아야한다.
//일반적으로 클래스에서 상속은 단일 상속만 가능하다.
//하지만 인터페이스는 다중 상속이 가능하다.
	
	void cc();
}

class Total implements Inter1,Inter2,Inter3{					
//클래스가 인터페이스를 상속 받을떄는 Implements로 상속받아야한다.
//한 클래스 페이지에는 하나의 클래스만 public으로 선언이 가능하다

	@Override
	public void aa() {
		System.out.println("aa() 추상 메서드 재정의");
	}						

	@Override
	public void bb() {
		System.out.println("bb() 추상 메서드 재정의");

	}

	@Override
	public void cc() {
		System.out.println("cc() 추상 메서드 재정의");
	}
	
}

public class Ex02_Main {

	public static void main(String[] args) {
	
		Total total = new Total();	//인터페이스의 자식클래스 객체 생성 가능
		
		total.aa();
		total.bb();
		total.cc();
		
	}

}
