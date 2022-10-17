package khie;

import java.util.Scanner;

/*
 * 키보드로 두 개의 정수를 입력 받아서 그 중에 큰 수를 화면에 출력해 보자.
 */

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력 : ");
		
		int su1 = scan.nextInt();
		
		System.out.print("두번째 정수를 입력 : ");

		int su2 = scan.nextInt();
		
		int max;
		
		if (su1 > su2) {
			//첫번째 입력 받은 정수값이 큰 값이다.
			//System.out.println("큰 값은" + su1 + "입니다.");
			max = su1;
		}else {
			//두번째 입력 받은 정수값이 큰 값이다.
			//System.out.println("큰 값은" + su2 + "입니다.");
			max = su2;
		}
		//scan.close();
		System.out.println("큰 값은 " + max + "입니다.");
	}

}
