package exam;

import java.util.Scanner;

public class JAVA과제01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력해주십시오. :");
		int korean = scan.nextInt();
		System.out.println("영어점수를 입력해주십시오. :");
		int english = scan.nextInt();
		System.out.println("수학점수를 입력해주십시오. :");
		int math = scan.nextInt();
		System.out.println("자바점수를 입력해주십시오. :");
		int java = scan.nextInt();
		
		int sum = korean+english+math+java;
		double avg = (korean+english+math+java) / 4.0;// 4로 적으면 출력시 소수점 자리는 무조건 0으로 처리
		
		System.out.println("국어점수 : "+korean);
		System.out.println("영어점수 : "+english);
		System.out.println("수학점수 : "+math);
		System.out.println("자바점수 : "+java);
		System.out.println("총   점 : "+sum);
		System.out.printf("평   균 : %.2f%n",avg);
		
	}

}
