package 연습장;

public class Airplane extends Fly {

	@Override
	void takeOff() {
		System.out.println("비행기가 이륙하다.");
	}
	@Override
	void fly() {
		System.out.println("비행기가 하늘을 날고있다");
	}
	@Override
	void landing() {
		System.out.println("비행기가 착륙하다");
	}
}
