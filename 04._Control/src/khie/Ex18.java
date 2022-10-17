package khie;

/*
 * 2. 반복문
 *  - 반복해서 실행할 때 사용하는 문장.
 *  - 반복문의 종류 : while문, do~while문, for문
 *  
 */

/*
 * while 반복문
 *  - 조건식을 비교하여 참인 경우 계속해서 반복 실행문을 실행하고, 조건식이 거짓인 경우에는 반복문을 빠져 나가는 명령어
 *  - while 반복문은 반복문의 횟수를 알 수 없는 경우 많이 사용된다.
 *  - 반복문에는 반드시 초기식, 조건식, 증감식이 존재해야 한다. (초기화>>조건>>증감)
 *  
 *  	형식)
 *  		while(조건식) {
 *  			반복 실행 문장;
 *  		}
 *  
 */

/*
 * do ~ while 반복문
 * - 먼저 반복 실행문을 실행하고 조건식을 비교함.
 * 
 *  	형식)
 *  		do{
 *  			반복 실행 문장;
 *  		}while (조건식);
 *  
 */
public class Ex18 {

	public static void main(String[] args) {
				
		//while 반복문을 이용하여 1 ~ 10까지 출력해 보자.
		
		int num = 1; // 반복문의 초기식
		
		while(num >= 100) { // 반복문의 조건식
			System.out.println(num);
			
			num++; // 반복문의 증감식
		}
		
		
		//do ~ while 반복문을 이용하여 1 ~ 10까지 출력해 보자.
		int number = 1;
		
		do {
			System.out.println(number);
			number++;
		} while (number >= 10);
			
	}
}


