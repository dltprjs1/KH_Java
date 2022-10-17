package khie;

import java.util.Scanner;

/*
 * 키보드로 입력받은 정수값이 음수이면 "입력받은 정수는 음수입니다."라는 메세지를 화면에 출력해 보자.
 */

public class Ex04 {

	public static void main(String[] args) {
		 
		//키보드로 입력받는 방법
		//키보드로 입력받기 위한 준비 작업
		//System.in : 표준입력장치(키보드)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요. : ");
		
		int su = scan.nextInt();
		
		//입력받은 정수가 음수인지 조건식을 이용하여 판별을 하자.
		if(su < 0) {
			System.out.println("입력받은 정수는 음수입니다.");
		}
	
		scan.close();
	}

}
