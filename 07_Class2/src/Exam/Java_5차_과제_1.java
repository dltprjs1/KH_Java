package Exam;

import java.util.Scanner;

public class Java_5차_과제_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름,성별(male/female),나이를 입력하세요.");
		Person person = new Person(scan.next(),scan.next(),scan.nextInt());
		System.out.println("--------------------------------------------");
		person.getPersonInfo();
		
		
	}

}
