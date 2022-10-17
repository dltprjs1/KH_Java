package exam;

import java.util.Scanner;

public class JAVA과제13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수를 입력해주십시오. :");
		int st =scan.nextInt();
		int qqq [] = new int[st];
		String name[] = new String[st];
		int kor[]= new int[st];; 
		int eng[]= new int[st];;
		int mat[]= new int[st];;
		int sum[]= new int[st];;
		double avg[]= new double[st];;
		String grade[]= new String[st];;
		int rank[] = new int [st];
		int tmp = 0;
		
		for(int i=0;i<qqq.length;i++) {
			System.out.print("이름 입력 :");
			name[i]=scan.next();
			System.out.print("국어점수 입력 :");
			kor[i]=scan.nextInt();
			System.out.print("영어점수 입력 :");
			eng[i]=scan.nextInt();
			System.out.print("수학점수 입력 :");
			mat[i]=scan.nextInt();
			sum[i] = kor[i]+eng[i]+mat[i];
			avg[i] = sum[i]/ (double)4.0;
			grade[i] = "";
			if(avg[i] >= 90) {
				grade[i] = "A학점";
			}else if (avg[i] >=80) {
				grade[i] = "B학점";
			}else if (avg[i] >=70) {
				grade[i] = "C학점";
			}else if (avg[i] >=60) {
				grade[i] = "D학점";
			}else if (avg[i] <60) {
				grade[i] = "F학점";
			}
				
		}
		for(int i=0;i<qqq.length;i++) {
		System.out.println("=============================================");
		System.out.println("이름 : "+name[i]+"\t총점 : "+sum[i]+"\t 평균 : "+avg[i]+"학점 : "+grade[i]);
		}
	}

}
