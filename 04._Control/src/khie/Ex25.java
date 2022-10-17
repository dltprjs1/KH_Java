package khie;

/*
 *  [문제] 업/다운 게임 만들기 
 */

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" *** UP / DOWN 게임 *** ");
		
		int com = (int)(Math.random()* 100 + 1);
		
		System.out.println("1 ~ 99 사이 숫자 중에서 하나의 숫자를 입력해주십시오. :");
		
		int input = 0;
		int count = 0; // 몇번만에 숫자를 맞추는지 카운드 변수
		
		while (input != com) {
			System.out.print("숫자 입력 >>> ");
			
			input = scan.nextInt(); // 키보드로 내가 입력한 숫자
			
			if(input > com) {
				System.out.println("더 작은 숫자입니다!");
			}else if(input < com) {
				System.out.println("더 큰 숫자입니다!");
			}
			count++;
		}
		System.out.println();
		System.out.println("축하드립니다! 정답입니다.");
		System.out.println("정답 숫자는 "+ com);
		System.out.println("정답 소요 횟수는 "+ count);
	}

}
