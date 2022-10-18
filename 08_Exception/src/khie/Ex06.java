package khie;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해주세요.");
		
		try {
			int su = scan.nextInt();
		}catch(Exception e) {
			System.out.println("에러발생");
			System.out.println(e);
		}finally {
			//입출력과 관련된 데이터를 처리하는 코드
			scan.close();
		}
		
		System.out.println("프로그램 종료");
	}

}

