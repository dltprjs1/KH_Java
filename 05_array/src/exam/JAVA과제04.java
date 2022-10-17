package exam;

import java.util.Scanner;

public class JAVA과제04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("임의의 숫자 4자리를 입력해주십시오. : ");
		int aaa = scan.nextInt();
		int bbb = aaa / 5000;
		int ccc = (aaa-(bbb*5000)) / 1000;
		int ddd = (aaa-(bbb*5000)-(ccc*1000)) / 500;
		int eee = (aaa-(bbb*5000)-(ccc*1000)-(ddd*500)) / 100;
		int fff = (aaa-(bbb*5000)-(ccc*1000)-(ddd*500)-(eee*100)) / 50 ;
		int ggg = (aaa-(bbb*5000)-(ccc*1000)-(ddd*500)-(eee*100)-(fff*50)) / 10 ;
		int hhh = (aaa-(bbb*5000)-(ccc*1000)-(ddd*500)-(eee*100)-(fff*50)-(ggg*10)) / 1;
		
		System.out.println("입력받은 숫자 : "+aaa);
		System.out.println("오천원 지폐 : "+bbb);
		System.out.println("천원 지폐 : "+ccc);
		System.out.println("오백원 동전 : "+ddd);
		System.out.println("백원 동전 : "+eee);
		System.out.println("오십원 동전 : "+fff);
		System.out.println("십원 동전 : "+ggg);
		System.out.println("일원 동전 : "+hhh);
		
	}

}
