package 연습장;

public class Ex01_Fly {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		Airplane airplane = new Airplane();
		
		bird.takeOff();
		bird.fly();
		bird.landing();
		
		System.out.println();
		
		airplane.takeOff();
		airplane.fly();
		airplane.landing();
	}

}
