package khie;

import java.util.Scanner;

/*
 * length 속성
 * - 배열의 크기(길이)를 알려주는 명령어
 * - 배열의 크기(길이)를 정수값으려 알려줌.
 * 		형식) 배열명.length
 * 		예) int size = arr.length;
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr [] = new int [3];
		
		System.out.println("arr 배열의 크기 >>>> "+ arr.length);
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 >>>");
			
			arr[i] = scan.nextInt();
			
		}
		System.out.println();
		
		for (int i = 0; i<arr.length;i++) {
			System.out.println("arr[" +i+"] >>> " + arr[i]);
		}
		scan.close();
	}

}
