package khie;

import java.util.*;
import java.util.Scanner;

/*
 * 다중 catch문
 * - catch 문을 여러 개 사용하여 처리하는 방식
 * - catch 문은 순차적으로 위에서 아래로 실행이 된다.
 * - 주의) 예외를 처리하는 가장 최상위의 Exception 클래스는 맨 마지막 줄에 나와야 한다. <<<Exception클래스는 다른 예외처리 클래스의 부모클래스
 * 		  (만약 맨 첫 줄에 나오는 경우 error 발생)
 */
public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Scanner scan =  new Scanner(System.in);
		
		int num = 0;
		int num1 = 10;
		String str = null;
		
		int[] arr = {10,20,30,40,50};
		
		try {
			System.out.println(num1/num);
			System.out.println("임의의 정수를 입력해주세요. : ");
			num = scan.nextInt();    // 예외가 발생할 가능성이 있는 코드
			System.out.println("str 문자열의 길이 >>> "+str.length());
		}catch(InputMismatchException e) {
			System.out.println("예외정보 >>> "+ e);
		}catch(Exception e2) {
			System.out.println("모르는 예외 발생");
			System.out.println("예외정보 >>> "+ e2);
		}
		
		System.out.println("프로그램 종료");
		
	}

}
