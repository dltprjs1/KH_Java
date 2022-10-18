package Method;

import java.util.Scanner;

public class Ex02 {
	
	public static void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주십시오.");
		int aa=scan.nextInt();
		int sum=0;
		
		for(int i=1;i<=aa;i++) {
			sum+=i;
		}
		System.out.println(sum);	
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		
		//[문제] 1부터 키보드로 받은 수까지의 합을 구하는 메서드를 호출해 보자.
		
		input();
		
		System.out.println("프로그램 종료");

	}

}
