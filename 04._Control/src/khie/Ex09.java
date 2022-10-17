package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력 받은 정수가 홀수인지 짝수인지 판별하여 화면에 출력해 보세요.
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. : ");
		
		int aa = scan.nextInt();
		
		if (aa % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		scan.close();
	}

}
