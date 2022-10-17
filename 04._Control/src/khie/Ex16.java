package khie;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("달(월)을 입력해주십시오. : ");
		
		int month = scan.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("마지막 날은 31일입니다.");
			break;
		case 2:
			System.out.println("마지막 날은 28일입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("마지막 날은 30일입니다.");
			break;
		default: 
			System.out.println("달(월)을 입력해주십시오.");
		}
		
		
	}

}
