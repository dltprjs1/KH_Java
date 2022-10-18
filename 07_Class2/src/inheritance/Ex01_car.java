package inheritance;

public class Ex01_car {

	public static void main(String[] args) {
		
		/*
		 * Sonata 클래스의 객체 생성 과정
		 * Sonata 클래스의 객체 생성 시에 JVM이 우선적으로 Car 부모클래스의 객체를 
		 * 생성한 후 Sonata 클래스의 객체 생성
		 */
		
		// 상속 후에는 자식클래스로 객체를 생성
		
		Sonata sonata = new Sonata(); 
		//car 클래스를 상속받은 Sonata클래스를 객체로 삼은 참조변수 생성
		
		sonata.output();
		
		System.out.println();
		
		sonata.model = "소나타";
		sonata.cc = 2000;
		sonata.door = 4;
		
		sonata.output();
		
	}

}
