package khie;

public class Ex03 {

	public static void main(String[] args) {

		
		int x = 63;
		int y = 19;
		int tmp;
		System.out.println("x값은 "+ x + "입니다");
		
		System.out.println("y값은 "+ y + "입니다");

		System.out.println("두 수의 합은 " + (x+y) + "입니다");
		
		//값의 치환
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x값은 "+ x + "입니다");
		System.out.println("y값은 "+ y + "입니다");
		System.out.println("두 수의 합은 "+ (x+y) + "입니다");

	}

}
