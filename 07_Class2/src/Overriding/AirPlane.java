package Overriding;

public class AirPlane extends Flyer {


	
	@Override
	void takeOff() {

		System.out.println("비행기가 하늘로 날아오르다.");
	}
	@Override
	void fly() {
		System.out.println("비행기가 하늘을 날아다니다.");
	}
	
	@Override
	void land() {
		System.out.println("비행기가 하늘에서 땅으로 착륙하다.");
	}
}

