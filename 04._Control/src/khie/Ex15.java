package khie;

import java.util.Scanner;

/*
 * switch ~ case문 - 분기문(조건문)
 *  - 식(정수 또는 char)를 사용해서 다중 분기하는 명령문
 *  - jdk 1.7버전부터는 식에 String 사용이 가능함.
 *  
 *  형식)
 *  	switch(식 또는 변수 또는 값) {
 *  		case 값1 :
 *  			값이 1일 경우 실행문;
 *  			break; // switch ~ case 블럭 탈출
 *          case 값2 :
 *     			값이 2일 경우 실행문;
 *  			break; // switch ~ case 블럭 탈출
 *          case 값3 :
 *  			값이 3일 경우 실행문;
 *  			break; // switch ~ case 블럭 탈출
 *  		default :
 *  			값이1 ~ 3 이외의 값이 들아온 경우 실행문
 *  			// default는 마지막에 자주 사용하기 때문에 마지막에 사용할 경우 break;문이 따로 필요하지 않다.(default 생략가능)
 *  
 */

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 숫자를 입력해주십시오. :");
		
		int aa = scan.nextInt();
		
		switch (aa) {
		case 1 :
			System.out.println("1번을 입력하셨습니다.");
			break;
		case 2 :
			System.out.println("2번을 입력하셨습니다.");
			break;
		case 3 :
			System.out.println("3번을 입력하셨습니다.");
			break;
		default : 
			System.out.println("1 ~ 3 사이의 숫자를 입력해주십시오.");
		}
		scan.close();
	}

}
