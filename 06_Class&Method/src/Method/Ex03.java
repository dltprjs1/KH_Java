package Method;

import java.util.Scanner;

/*
 * 매개변수가 있는 메서드 정의
 * 
 * 형식) [접근제한] 반환형 메서드이름(type 변수1, type 변수2){
 * 				메서드 호출 시 실행문장;
 * 		}
 * 
 * - 실인수와 가인수
 * 	* 실인수 : 매개변수에 전달할 실체 값 ==> 메서드 호출 시 사용
 *  * 가인수 : 매개변수(가인수) ==> 메서드에 정의
 *  * 실인수와 가인수는 반드시 type, 순서, 갯수가 일치해야한다.(중요!) ==> 인수 명은 일치시키지 않아도 된다.
 */
public class Ex03 {
	
	public static void total(int aa) {
		
		int sum = 0;
		for(int i=0;i<=aa;i++) {
			sum+=i;
		}System.out.println(sum);
	}
	
	public static void total(int k, int a, int b) { 
		//가인수를 입력 (자료형 생략 불가!) ==> int k=95 ,int a=88, int b=92
		
		
		System.out.println("sum >> "+ (k + a + b));
	}

	public static void main(String[] args) {
		
		total(95, 88, 92); //실인수를 입력
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주십시오. : ");
		
		total(scan.nextInt()); // 이름이 같은 메서드지만 인자값이 달라지면서 다른 메서드(인자값이 1개)를 호출 <==overloading
		
		scan.close();
	}

}
