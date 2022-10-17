package khie;

import java.util.Scanner;

/*[문제]
 * 정수를 저장할 배열을 만들기 
 * 반복문으로 배열의 인덱스를 만들기
 * 해당 배열의 데이터를 난수 메서드를 이용하여 화면에 출력해 보자. 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		//반복문을 이용하여 5개의 정수를 입력해 보자
		
		for(int i=0;i<5;i++) {
			
			System.out.println((i+1)+"번째 정수 입력 : ");
			
			arr[i] = (int)(Math.random()*100 +1);		
			
			System.out.println(arr[i]);
		}
		//5개의 정수가 저장된 arr 배열을 반복문을 이용하여 출력해보자.
		for(int j=0;j<=4;j++) {
			System.out.println((j+1)+"번째 데이터의 정수는 "+ arr[j]+"입니다.");
		}
	
	}
	
		

}
