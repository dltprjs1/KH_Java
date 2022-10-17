package khie;

import java.util.Scanner;

/*
 *  신장별 표준 체중 대용표를 만들어 보자.
 *  표시함 신장의 범위(시작값 / 종료값 / 증가값)는 정수로 할 예정이며, 키보드로 입력을 받을 예정.
 *  - 표준 체중 구하는 공식 : (신장 - 100) * 0.9
 */
public class Ex28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 cm부터 표시할까요? : ");
		int h = scan.nextInt(); // 시작값
		System.out.println("몇 cm까지 표시할까요? : ");
		int h2 = scan.nextInt(); // 종료값
		System.out.println("몇 cm 단위로 표시할까요? : ");
		int cm = scan.nextInt();// 증가값
		System.out.println();
		
		for(int i=h;i<=h2;i=i+cm) {
			System.out.printf("%dcm\t%.1fkg\n", i, (i-100)*0.9);
		}
		scan.close();
	}

}
