package khie;

/*
 * 3. 논리연산자
 * - 논리곱(&&) : 주어진 조건이 모두 참일 때 결과가 true가 됨, 그 나머지는 모두 false가 됨.
 * - 논리합(||) : 주어진 조건중에 하나라도 참이면 결과는 true가 됨, 그 나머지는 모두 false가 됨.
 * - 부정(!) : true는 false가 되고, false는 true가 됨
 * - 논리연산자는 우선적으로 관계연산자를 실행한 후에 그 결과값을 가지고 논리연산을 수행하게 됨. 
 */

public class Ex03 {

	public static void main(String[] args) {
		
		int su1 = 10, su2 = 7;
		
		//논리 곱인 경우
		
		boolean test = (su1 >= su2) && (su1 >= 5); // T && T = T
		System.out.println("test 결과 = " + test);
		
		boolean test1 = (su1 >= su2) && (su1 <= 5);// T && F = F
		System.out.println("test1 결과 = " + test1);
		
		boolean test2 = (su1 <= su2) && (su1 >= 5);// F && T = F
		System.out.println("test2 결과 = " + test2);
		
		//논리 합인 경우
		
		boolean test3 = (su1 >= su2) || (su1 >= 5); // T || T = T
		System.out.println("test3 결과 = " + test3);
		
		boolean test4 = (su1 >= su2) || (su1 <= 5); // T || F = T
		System.out.println("test4 결과 = " + test4);
		
		boolean test5 = (su1 <= su2) || (su1 <= 5); // F || F = F
		System.out.println("test5 결과 = " + test5);
		
	}

}
