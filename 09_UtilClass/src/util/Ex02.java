package util;

/*
 * 2. Math 클래스
 *  - 수학과 관련된 메서드를 제공해 주는 클래스
 *  - Math 객체를 이용한 참조변수 선언 (X)  = Math 참조변수명 = new Math();  <<<(X)
 */

public class Ex02 {

	public static void main(String[] args) {
		
		
		// 1.max() : 최대값을 구해 주는 메서드  - 두 수를 비교
		// 2.min() : 최소값을 구해 주는 메서드  - 두 수를 비교
		int num1 = 78 , num2 = 91;
		
		System.out.println("최대값 >>> " + Math.max(num1, num2));
		System.out.println("최소값 >>> " + Math.min(num1, num2));
		
		System.out.println();
		// 3.round() : 반올림이 적용되는 메서드
		System.out.println("125.5124 반올림 >>> " + Math.round(125.5124));
		
		System.out.println();
		// 4.abs() : 절대값을 구해 주는 메서드.
		System.out.println("-125.34 절대값 >>> " + Math.abs(-125.34));
		
		System.out.println();
		// 5.ceil() : 무조건 올림 처리해주는 메서드
		System.out.println("12.123 올림 >>> " + (int)(Math.ceil(12.123)));
	}

}
