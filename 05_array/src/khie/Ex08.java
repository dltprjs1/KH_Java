package khie;

import java.util.Scanner;

/*
 * 배열의 정수 데이터를 저장
 * - 내림차순으로 정렬
 * 	예) 19, 43, 6, 97, 65
 * 	==>97, 65, 43, 19, 6
 */
public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수형 배열의 크기 입력해주십시오. : ");
		
		int arr [] = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번째 정수 입력해주십시오. : ");
			arr[i]= scan.nextInt();
			
		//내림차순으로 정렬을 진행해 보자.
		int tmp = 0;
		
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1; k<arr.length;k++) {
				if(arr[k] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[k];
					arr[k] = tmp;
				}
			}
			
		}
		//내림차순으로 정렬된 배열을 화면에 출력해 보자.
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
	}
		
	}

}
