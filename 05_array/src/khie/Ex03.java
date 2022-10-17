package khie;

import java.util.Scanner;

/*
 * [문제] 내가 여행가고 싶은 5개 나라를 키보드로 입력 받아서 배열에 저장 후, 화면에 출력해 보자.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String aa[] = new String[5];
		int i;
		for(i=0;i<5;i++) {
			System.out.println("여행을 갈 "+(i+1) +"번째 지역을 입력해주세요.");
			aa[i] = scan.next();
		}
		for(i=0;i<=4;i++) {
		//System.out.println("당신이 "+(i+1)+"번째 로 선택한 지역은"+aa[i]+"입니다.");
		}
		
		//개선된 for문을 이용하여 출력을 해보자.

		for(String bb : aa) {
			System.out.println(bb);
		}
		
		
		/*
		 * for 반복문을 단축시킨 반복문 : 단축 for문(개선된 for문)
		 * 
		 * - java jdk 1.5 버전부터 추가된 기능.
		 * - 주로 배열의 요소(값)을 처리(출력)할 때 사용
		 * 
		 *  	형식)
		 *  		for(자료형 변수명 : 배열명) {
		 *  			반복 실행문;
		 *  		}
		 *  
		 * 	 실행방법)
		 * 		-배열의 첫번째 인덱스[0]에 있는 데이터를 좌변의 변수명에 저장을 하여 출력을 해줌.
		 * 		-데이터 수만을 자동으로 반복하여 출력을 함.
		 * 
		 * 		주의)
		 * 		-우변에 있는 배열명의 자료형과 좌변에 있는 변수명의 자료형이 반드시 일치해야 함.
		 * 		-만약 일치하지 않으면 에러발생
		 */
	}

}