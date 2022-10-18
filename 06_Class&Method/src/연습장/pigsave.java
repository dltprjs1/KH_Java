package 연습장;

import java.util.Scanner;

public class pigsave {
	Scanner scan=new Scanner(System.in);
	//멤버변수
	int deposit;
	int withdraw;
	int pig=0;
	
	void deposit() {
		System.out.print("저금할 금액을 입력해주십시오. : ");
		deposit=scan.nextInt();
		pig+=deposit;
		System.out.println("현재 돼지저금통 안에 저축된 금액은 "+pig+"원 입니다.");
	}
	void withdraw() {
		System.out.print("출금할 금액을 입력해주십시오. : ");
		withdraw=scan.nextInt();
		pig-=withdraw;
		System.out.println("현재 돼지저금통 안에 저축된 금액은 "+pig+"원 입니다.");
	}
}
