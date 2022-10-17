package exam;

import java.util.Scanner;

public class JAVA과제10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원"); 
		
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		String a = scan.next();
		
		System.out.print("주문수량 >> ");
		int c = scan.nextInt();
		
		System.out.print("입금액 >> ");
		int  d = scan.nextInt();
		
		String b = "";
		int e = 0;
		
		switch (a) {
		case "1": 
			a = "아메리카노";	b = "3000원";	e = c*3000;
		break;
		case "2":
			a = "카페라떼";	b = "4,000원";	e = c*4000;
		break;
		case "3":
			a = "마키아또";	b = "4,500원";	e = c*4500;
		break;
		case "4":
			a = "바닐라라떼";	b = "4,500원";	e = c*4500;
		break;
		}
		int  f = d-e;
		System.out.println("주문한메뉴 : " +a);
		System.out.println("커피단가 : " +b);
		System.out.println("주문수량 : " +c);
		System.out.println("입금액 : "+d+"원");
		System.out.println("총금액 : "+e+"원");
		System.out.println("거스름 돈 : "+f+"원");
	}

}
