package khie;

import java.util.Scanner;

/*
 * 다중 if~else문 - 분기문(조건문)
 *  - 여러개의 조건중에 맞는 조건에 해당하는 문장을 실행하는 구조
 *  
 *  형식)
 *  		if(조건식1) {
 *  			조건식1이 참인 경우 실행 문장;
 *  		}else if (조건식2) {
 *  			조건식 1은 거짓이고 조건식2가 참인 경우 실행 문장;
 *  		}else if (조건식3) {
 *  			조건식 1,2는 거짓이고 조건식 3이 참인 경우 실행 문장;
 *  		} else {
 *  			조건식 1,2,3은 거짓일때 실행 문장;
 *  		}
 *  		
 */

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 숫자 중 하나 선택 : ");
		
		int aa = scan.nextInt();
		
		if(aa == 1) {
			System.out.println("입력 받은 숫자는 1 입니다.");
		}else if (aa == 2) {
			System.out.println("입력 받은 숫자는 2 입니다.");
		}
		else if (aa == 3) {
			System.out.println("입력 받은 숫자는 2 입니다.");
		}
		else {
			System.out.println("입력 받은 숫자는 1~3 이외의 숫자입니다.");
		}
		scan.close();
	}

}
