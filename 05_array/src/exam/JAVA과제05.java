package exam;

import java.util.Scanner;

public class JAVA과제05 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("지방의 그램을 입력해주십시오. :");
		int f = scan.nextInt();
		System.out.print("탄수화물의 그램을 입력해주십시오. :");
		int c = scan.nextInt();
		System.out.print("단백질의 그램을 입력해주십시오. :");
		int p = scan.nextInt();
		
		int fat = f*9;
		int car = c*4;
		int pro = p*4;
		
		System.out.printf("총칼로리 : %d cal%n",fat+car+pro);
	}
}
