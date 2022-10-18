package Method;

import java.util.Scanner;

public class Ex08 {

	private static int total(int kor, int eng, int mat) {
		
		int sum = kor+eng+mat;
		
		return sum;
	}
	
	private static double avg(int sum) {
		
		double avg = sum/3.0;
		
		return avg;
		
		
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
	public static void main(String[] args) {
		
		//1. 메인 메서드에서는 키보드로 이름, 국어점수, 수학점수, 영어점수를 입력 받아 보자
		Scanner scan=new Scanner(System.in);
		
		System.out.println("이름을 입력해 주십시오. : ");
		String name = scan.next();
		
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		int mat = scan.nextInt();
		
		//2. 총점 구하기  ==> 총점 메서드를 호출
		int sum = total(kor,eng,mat); //변수 sum 선언 후 total메서드를 sum변수로 지정
		
		//3. 평균 구하기  ==> 평균 메서드를 호출
		double avg = avg(sum);//sum 변수를 실인자로 지정 
		
		//4. 학점 구하기  ==> 학점 메서드를 호출
		String grade= grade(avg);
		
		System.out.println("이름 : " +name);
		System.out.println("국어점수 : " +kor);
		System.out.println("영어점수 : " +eng);
		System.out.println("수학점수 : " +mat);
		System.out.println("총점수 : " +sum);
		System.out.printf("평균점수 : %.2f\n", avg);
		System.out.println("학점 : " +grade);
	}



}
