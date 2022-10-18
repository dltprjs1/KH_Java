package Exam;

import java.util.Scanner;

public class Java_6차_과제_1 {
	
	public static final double Tax_Rate = 1.1;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ChineseFood chinese1=new ChineseFood();
		System.out.println("메뉴는 몇 개인가요?");
		ChineseFood chinese [] =new ChineseFood [scan.nextInt()] ;
		int gm[] =new int[chinese.length];
		int total = 0; int bu = 0; int gong = 0; int cung = 0;
		for(int i=0;i<chinese.length;i++) {
			System.out.println("메뉴의 품명,단가,수량을 입력해주세요.");
			chinese[i] = new ChineseFood(scan.next(),scan.nextInt(),scan.nextInt());
		}
		System.out.println("------------------------------------");
		System.out.printf("품명\t단가\t수량\t금액");
		for(int i=0;i<chinese.length;i++) {
			gm[i]=chinese[i].sale*chinese[i].count;
			System.out.printf("\n%s\t%d\t%d\t%d원\n",chinese[i].food,chinese[i].sale,chinese[i].count,gm[i]);
			total += gm[i];
		}
			gong =(int) (total/Tax_Rate);
			bu = total-gong;
			cung = gong+bu;
		System.out.println("------------------------------------");
		System.out.printf("공급가액 \t\t\t%,d원\n",gong);
		System.out.printf("부가세 \t\t\t%,d원\n",bu);
		System.out.println("------------------------------------");
		System.out.printf("청구금액 \t\t\t%,d원\n",cung);
	}
		
	

}
