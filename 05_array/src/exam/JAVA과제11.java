package exam;

import java.util.Scanner;

public class JAVA과제11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력해주십시오. :");
		int a =scan.nextInt(); 
		
		int aa [] = new int [a];
		int max=0;
		int min=1000000000;
		
		for(int i=0;i<a;i++) {
			System.out.println((i+1)+"번째 값 입력: ");
			aa[i] = scan.nextInt();
			if (aa[i] >= max) {
				max=aa[i];
			}
			if (aa[i] <= min) {
				min=aa[i];
			}
		}
		System.out.println("배열크기:" +a);
		System.out.println();
		for(int i=0;i<a;i++) {
			System.out.println((i+1)+"번째 값 입력 : "+aa[i]);
		
		}
		System.out.print("max : " +max);
		System.out.println(",min : " +min);
	}

}
