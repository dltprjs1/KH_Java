package Method;

import java.util.Scanner;

// 개인별 성적 처리 - 무한반복

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//for문 무한반복 : for(;;)
		while(true) {  //무한반복
		
		//키보드로 이름하고 국어, 영어, 수학점수를 입력을 받자
			
			System.out.println("이름을 입력하십시오. : ");
			String name = scan.next();
			System.out.println("국어점수를 입력하십시오. : ");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하십시오. : ");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하십시오. : ");
			int mat = scan.nextInt();
			
			System.out.println();
			//총점을 구하는 메서드 호출
			int sum = total(kor,eng,mat);
			double avg = avg(sum);
			String grade = grade(avg);
			
			System.out.printf("이름 : %s\t국어점수 : %d\t영어점수 : %d\t수학점수 : %d\t총점 : %d\t평균 : %.2f\t학점 : %s\t\n\n",name,kor,eng,mat,sum,avg,grade);
			System.out.println("계속할까요?(Y:계속 / N:종료)");
			
			String result =scan.next();
			if(result.equalsIgnoreCase("N")) {
				break;
			}
		}
		
	}

	private static String grade(double avg) {
		String grade = "";
		if(avg>=90) {
			grade = "A학점";
		}else if(avg>=80) {
			grade = "B학점";
		}else if(avg>=70) {
			grade = "C학점";
		}else if(avg>=60) {
			grade = "D학점";
		}else if(avg<60) {
			grade = "F학점";
		}
		return grade;
	}

	private static double avg(int sum) {
		double avg = sum/3.0;
		return avg;
	}

	private static int total(int kor, int eng, int mat) {
		int sum =kor+eng+mat;
		return sum;
	}

}
