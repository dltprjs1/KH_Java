package inheritance;

public class Sonata extends car{  //car클래스를 상속 받아서 cc,door멤버변수를 가지고 있다.

	String model;			//차량 모델명
	
	void output() {
		System.out.println("모델명 >>>"+model);
		System.out.println("배기량 >>>"+cc);
		System.out.println("문의 갯수 >>>"+door);
	}
}
