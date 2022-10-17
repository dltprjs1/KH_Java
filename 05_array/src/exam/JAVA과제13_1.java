package exam;

import java.util.Scanner;

public class JAVA과제13_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요. : ");
		
		String name [] = new String[scan.nextInt()];
		int kor [] = new int [name.length];
		int eng [] = new int [name.length];
		int mat [] = new int [name.length];
		int sum [] = new int [name.length];
		double avg [] = new double [name.length];
		String grade [] = new String [name.length];
		int rank [] = new int [name.length];
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요. : ");
			name[i] = scan.next();
			
			System.out.println("국어 점수 입력 : ");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수 입력 : ");
			eng[i] = scan.nextInt();
			System.out.println("수학 점수 입력 : ");
			mat[i] = scan.nextInt();
			
			sum[i] =kor[i]+eng[i]+mat[i];
			avg[i] =sum[i]/3.0;
			if(avg[i] >= 90) {
				grade[i] = "A학점";
			}else if (avg[i] >= 80) {
				grade[i] = "B학점";
			}else if (avg[i] >= 70) {
				grade[i] = "C학점";
			}else if (avg[i] >= 60) {
				grade[i] = "D학점";
			}else if (avg[i] < 60) {
				grade[i] = "F학점";
			}
			rank[i] = 1;
		}
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name.length;j++) {
				if(sum[j]>sum[i]) {
					rank[i]++;    //내 등수를 1 증가
				}
			}
		}
		for(int i=0;i<name.length;i++) {
			System.out.println("___________________________________________________________________________");
			System.out.printf("이름 : %s\t총점 : %d\t평균 : %f\t 학점 : %s\t 순위 : %d등\n",name[i],sum[i],avg[i],grade[i],rank[i]);
		}
	}

}
