package object;

import java.util.Scanner;

public class Ex02_Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생의 이름, 학번, 학과, 연락처, 주소를 입력하세요. : ");
		
		Student stu = new Student(scan.next(),scan.next(),scan.next(),scan.next(),scan.next());
		
//		stu.getStudentInfo();
		
		System.out.println(stu.toString());
		
		scan.close();
	}

}
