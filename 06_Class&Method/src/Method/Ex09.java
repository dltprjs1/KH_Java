package Method;

import java.util.Scanner;

public class Ex09 {

	private static int sum4(int kor, int eng, int mat,int java) {
		int hap4 = kor+eng+mat+java;
		return hap4;
	}
	
	private static int sum3(int kor, int eng, int mat) {
		int hap3 = kor+eng+mat;
		return hap3;
	}
	
	private static int sum2(int kor, int eng) {
		int hap2 = kor+eng;
		return hap2;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		int mat = scan.nextInt();
		
		System.out.println("자바 점수 입력 : ");
		int java = scan.nextInt();
		
		System.out.println();
		
		System.out.println("2과목 총점 >>>" +sum2(kor,eng));
		System.out.println("3과목 총점 >>>" +sum3(kor,eng,mat));
		System.out.println("4과목 총점 >>>" +sum4(kor,eng,mat,java));
		
	}


}
