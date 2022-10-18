package accessTwo;

import accessOne.Super;

public class Sub extends Super{

	public static void main(String[] args) {

		Sub sub = new Sub();
		
		// 해당 클래스에서만 접근이 가능 - private
		// System.out.println("num1 >>> " + sub.num1)
		
		// 해당 패키지 내에서만 접근이 가능 - default
		// System.out.println("num2 >>> " + sub.num2)
		
		// 다른 패키지의 상속 관계에있는 멤버변수까지 접근가능 - protected
		System.out.println("num3 >>>" + sub.num3);
		
		// 모든 클래스에서 접근이 가능 - public
		System.out.println("num4 >>> "+ sub.num4);
	}

}
