package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로 점수를 입력받아서 입력받은 점수가 60점 이상이면 "합격" 이라는 문자열을 화면에 출력하고,
 * 		 그렇지 않으면 "불합격" 이라는 문자를 화면에 출력해 보세요.
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요. : ");
		
		int aa = scan.nextInt();
		
		if (aa >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		scan.close();
	}

}
