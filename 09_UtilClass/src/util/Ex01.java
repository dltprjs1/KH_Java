package util;

import java.util.Random;

/*
 * Util 패키기의 주요 클래스
 * 1. Random 클래스						>>>Random객체를 이용한 참조변수 선언
 * 	- 임의의 난수를 발생시키는 클래스
 * 2. Math 클래스							>>>참조변수 선언 (X)
 *  - 수학과 관련된 메서드를 제공해 주는 클래스
 *  - 유일하게 java.lang 패키지에 있는 클래스
 * 3. Calender 클래스						>>>싱글톤(singleton)을 이용한 참조변수 선언
 *  - 날짜 / 시간 관련 정보를 제공해 주는 클래스
 * 4. Arrays 클래스						>>>참조변수 선언 (X)
 *  - 배열 객체를 처리해 주는 클래스
 */

/*
 * 1.Random 클래스
 *  - 지정된 범위 내에서 임의의 난수를 발생시키는 클래스.
 *  - 활용 분야 : 게임, 확률 등에서 사용된다.
 *  - 형식) nextInt(가장 큰 수) + 시작 수
 */
public class Ex01 {

	public static void main(String[] args) {
		
		Random random = new Random(); 			//Random 객체로 참조변수 선언
		
		int su = 0;	
		
		//로또를 만들어 보자. - 중복 발생
		for(int i=1;i<=6; i++) {
			su = random.nextInt(45) + 1;
			System.out.print(su + "\t");
		}
		System.out.println();
		System.out.println();
		
		//중복이 발생되지 않게 로또를 만들어 보자.
		int arr[] = new int [6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=random.nextInt(45) + 1;
			
			if(i > 0) {
				for(int j=0;j<i;j++) {		 // j<i : j와 i의 값이 비교하기 위해
					if(arr[i] == arr[j]) {   //중복인 경우
						arr[i] = random.nextInt(45)+1;
						j= -1;
					}
				}
			} // if
			System.out.print(arr[i] +"\t");
		}
		
	}

}
