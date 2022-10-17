package khie;

import java.util.Scanner;

/*
 * 1 ~ 100 사이의 정수 중에서 키보드로 5개의 정수를 입력을 받아서 5개의 정수 중 최대값을 화면에 출력해 보자.
 */
public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력해주십시오.");
		
		int i = 1; // 초기식
		int max = 0; // 최대값이 저장될 변수
		while(i<=5) { //조건식
			System.out.print(i + "번째 정수 입력 :");
			int aa = scan.nextInt(); //키보드로 정수를 입력하기위한 변수
			if (aa > max) { 
				max = aa;
			}
			i++; //증감식
		}
		
		System.out.println(max);
		scan.close();
	}

}