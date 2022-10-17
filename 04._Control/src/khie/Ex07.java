package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로부터 입력받은 정수값을 5의 배수이면 "이 정수는 5의 배수입니다."라고 화면에 출력을 하고,
 * 		 그렇지 않으면 "이 정수는 5의 배수가 아닙니다."라고 화면에 출력해 보자.
 * 		 단, 입력 받은 정수가 음수이면 "음수 값이 입력되었습니다."라고 화면에 출력해 보자.
 */
public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. : ");
		
		int aa = scan.nextInt();
		
		if (aa > 0) {
			
			if (aa % 5 == 0) {
				System.out.println("이 정수는 5의 배수입니다.");
			} else {
				System.out.println("이 정수는 5의 배수가 아닙니다");
			}
		}else {
			System.out.println("음수 값이 입력되었습니다.");
		}
		
		scan.close();
	}

}
