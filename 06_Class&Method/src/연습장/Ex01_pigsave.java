package 연습장;

import java.util.Scanner;

public class Ex01_pigsave {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("저금할 횟수를 입력해 주십시오. : ");
		int depo[]= new int [scan.nextInt()];
		pigsave pig = new pigsave();
		
		for(int i=0;i<depo.length;i++) {
			pig.deposit();
		}
		System.out.println("출금할 횟수를 입력해 주십시오. : ");
		int with[] = new int [scan.nextInt()];
		for(int i=0;i<with.length;i++) {
			pig.withdraw();
		}
	}
}
