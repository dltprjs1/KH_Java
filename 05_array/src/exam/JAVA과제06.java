package exam;

import java.util.Scanner;

public class JAVA과제06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해주십시오. : ");
		int aa =scan.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for(int i=0;i<=aa;i++) {
			if(i % 2 == 0) {
				evenSum+=i;
			}else if (i % 2 ==1) {
				oddSum+=i;
			}
			
		}
		System.out.println("수 입력 : "+aa);
		System.out.println("홀수합계 : "+oddSum);
		System.out.println("짝수합계 : "+evenSum);
		System.out.println();
	}

}
