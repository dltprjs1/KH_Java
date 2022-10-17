package khie;

import java.util.Scanner;

/*
 * [문제]이름과 국어점수, 영어점수, 수학점수, 자바점수를 키보드로 입력 받아서 성적을 처리해 보자.
 * 	 	각 과목의 점수와 총점, 평균, 학점을 화면에 출력해 보세요.
 */

public class Ex13 {

	public static void main(String[] args) {
		
		/*
		 * 1. 키보드로 정보를 입력 받자
		 * 1-1 이름을 입력 받자
		 * 1-2 국어 점수를 입력 받자
		 * 1-3 영어 점수를 입력 받자
		 * 1-4 수학 점수를 입력 받자
		 * 1-5 자바 점수를 입력 받자
		 * 
		 * 2. 입력 받은 국어, 영어, 수학, 자바 점수를 더하여 총점 변수에 저장을 하자.
		 * 
		 * 3. 총점을 과목 수로 나누면 평균이 구해진다.
		 * 
		 * 4. 학점은 다중 if~else문을 이용한다.
		 * 
		 * 5. 화면에 출력을 해보자.
		 * 	  출력 내용 : 이름, 국어점수, 영어점수, 수학점수, 자바점수, 총점, 평균, 학점
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요. : ");
		String name = scan.next();
		
		System.out.print("국어점수를 입력해주세요. : ");
		int korean = scan.nextInt();
		
		System.out.print("영어점수를 입력해주세요. : ");
		int english = scan.nextInt();
		
		System.out.print("수학점수를 입력해주세요. : ");
		int math = scan.nextInt();
		
		System.out.print("자바점수를 입력해주세요. : ");
		int java = scan.nextInt();
		
		int sum = korean + english + math + java;
		System.out.println("점수합계 : " + sum);
		
		double avg = sum / (double)4.0;
		System.out.printf("평균 : %.2f%n", avg);
		
		if (avg >= 90) {
			System.out.println("A학점입니다.");
		} else if (avg >= 80) {
			System.out.println("B학점입니다.");
		} else if (avg >= 70) {
			System.out.println("C학점입니다.");
		} else if (avg >= 60) {
			System.out.println("D학점입니다.");
		} else if (avg < 60) {
			System.out.println("F학점입니다.");
		}
		scan.close();
	}

}