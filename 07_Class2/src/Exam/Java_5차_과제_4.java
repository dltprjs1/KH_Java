package Exam;

import java.util.Scanner;

public class Java_5차_과제_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름,작업시간,시간당 급여를 입력하세요.");
		Temporary tem = new Temporary(scan.next(),scan.nextInt(),scan.nextInt());
		tem.getPayInfo();
		
		
	}

}
