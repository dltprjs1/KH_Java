package khie;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주세요. : ");
		
		int su = scan.nextInt();
		
		System.out.println("입력받은 수 >>>"+ su);
		
		System.out.println("프로그램 종료");

		scan.close();
	}

}
