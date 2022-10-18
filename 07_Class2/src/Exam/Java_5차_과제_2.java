package Exam;

import java.util.Scanner;

public class Java_5차_과제_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형의 가로,세로를 입력하세요.");
		Rectangle rectangle = new Rectangle(scan.nextInt(),scan.nextInt());
		System.out.println("------------------------------------");
		rectangle.c();
		rectangle.d();
		
	}

}
