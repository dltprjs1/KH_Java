package Overriding;

public class Ex03_Flyer {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		AirPlane airplane = new AirPlane();
		
		bird.takeOff();
		bird.fly();
		bird.land();
		
		System.out.println();
		
		airplane.takeOff();
		airplane.fly();
		airplane.land();
		
	}

}
