package exam;

import java.util.Scanner;

public class JAVA과제02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주십시오. :");
		int aa = scan.nextInt();
		
		System.out.println("입력받은 정수 ==> " +aa );
		System.out.println(aa+"의 제곱근 ==> " +aa*aa);
		System.out.println(aa+"의 세제곱근 ==> " +(aa*aa*aa));
		System.out.println();
		
	}

}
