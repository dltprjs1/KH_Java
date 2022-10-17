package khie;

/*
 * 5. 배정연산자 / 단축배정연산자
 * 		- 배정연산자 (=)
 * 			형식) 변수 = 변수 or 수식 or 값;
 * 			- 좌변에는 항상 변수명이 와야한다.
 * 			- 우변에는 숫자, 변수명, 수식이 와야한다.
 * 
 * 		- 단축배정연산자
 * 			- 배정연산자를 간편하게 사용하는 연산자
 */

public class Ex05 {

	public static void main(String[] args) {
		
		// 배정연산자
		// 형식) 변수 = 값(데이터);
		int su1 = 10, su2 = 28, result = 0; //su1 = 10
		
		// 형식) 변수 = 변수;
		su1 = su2;                          // su1 = 28
		
		// 형식) 변수 = 수식;
		su1 = su2 +27;                      // su1 = 55
		
		System.out.println(su1);
		
		
		//단축배정연산자 ==> 누적변수 사용 시 
		result += 10; // result = result + 10
		result += 20; // result = result + 20
		result += 30; // result = result + 30
		
		System.out.println(result);
		System.out.println();
		
		int su = 15;
		
		System.out.println(su += 5);
		System.out.println(su -= 5);
		System.out.println(su *= 5);
		System.out.println(su /= 5);
		System.out.println(su %= 5);
		
	}

}
