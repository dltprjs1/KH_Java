package khie;

import java.util.Scanner;

//입력받은 수만큼 별을 찍어 보자.

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("별의 최대 갯수를 입력하세요. :");
		
		int aa =scan.nextInt();
		
		System.out.println();
		
		int count = 1;
		int bb = 1;
		while (count <= aa) {
			System.out.print("*");
			count++;
			
			
		}
		scan.close();
	}

}
