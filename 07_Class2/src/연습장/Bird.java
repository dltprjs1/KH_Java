package 연습장;

public class Bird extends Fly{

	@Override
	void takeOff() {
		System.out.println("새가 하늘을 날아오르다");
	}
	@Override
	void fly() {
		System.out.println("새가 하늘을 날고 있다.");
	}
	@Override
	void landing() {
		System.out.println("새가 하늘에서 땅으로 내려 오다.");
	}
}
