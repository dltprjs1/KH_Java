package khie;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1부터 어디까지 홀수의 합과 짝수의 합을 구하시겠습니까? :");
		
		int aa = 0;
		int bb = scan.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		
		while (aa <= bb) {
			if (aa % 2 == 0) {
				evenSum += aa;
			}else if (aa % 2 == 1) {
				oddSum += aa;
			}
			aa++;
		}
		System.out.println("짝수의 합은 "+evenSum+"입니다.");
		System.out.println("홀수의 합은"+oddSum+"입니다");
	}

}