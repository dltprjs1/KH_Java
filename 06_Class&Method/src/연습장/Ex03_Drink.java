package 연습장;

import java.util.Scanner;

public class Ex03_Drink {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("음료의 갯수를 입력해주십시오. : ");
		Drink drink[]=new Drink[scan.nextInt()];
		Drink drink1=new Drink();
		
		
		for(int i=0;i<drink.length;i++) {
			System.out.println("음료의 이름과 가격을 입력해 주십시오. : ");
			drink[i]=new Drink(scan.next(),scan.nextInt());	
		}	
		
		System.out.println("자판기에 투입할 금액을 입력해주십시오.");
		
		drink1.money=scan.nextInt();
		for(int i=0;i<drink.length;i++) {
			if(drink1.money>=drink[i].price) {
				System.out.println(drink[i].drink+"\t");
			}
		}
		scan.close();
	}
}
