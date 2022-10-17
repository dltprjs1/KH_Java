package exam;

import java.util.Scanner;

public class JAVA과제03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("지불한 금액을 입력해주십시오. : ");
		int bb = scan.nextInt();
		System.out.println("상품단가를 입력해주십시오. : ");
		int cc = scan.nextInt();
		System.out.println("수량을 입력해주십시오. : ");
		int dd = scan.nextInt();
		double ee = (cc*dd) * (double)0.1;
		double ff = (cc*dd) + ee;
		
		System.out.println("지불한 금액 : " + bb+"원");
		System.out.println("제품단가 : " + cc+"원");
		System.out.println("수량 : "+ dd+"원");
		System.out.printf("부가세 : %.0f원\n",ee );
		System.out.printf("상품총액 : %.0f원\n ",ff);
		System.out.printf("거스름 돈 : %.0f원\n",Math.abs(ff-bb));//abs() = 절대값
	}
}
	


