package khie;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열 배열의 크기 입력 : ");
		
		String arr[] = new String[scan.nextInt()];
	
		/* 
		 * *****중요*****
		 * 배열의 이름은 heap 영역의 시작 주소값을 저장하고 있기 때문에
		 * 아래 문장은 시작 주소값을 다른 배열의 배열명에 복사해 주는 명령문이다. 즉, 배열의 공유가 이루어지게 된다.
		 */
		
		String [] arrCopy = arr;
		System.out.println("arr 배열 주소값 >> " + arr);
		
		System.out.println("arrCopy 배열 주소값 >> " + arrCopy);
		
		//arrCopy 배열에 초기값을 할당해 보자.
		for(int i=0;i<arrCopy.length;i++) {
			System.out.println((i+1)+ "번쨰 문자열 입력 >>>");
			arr[i] = scan.next();
		}
		
		//arr 배열을 출력해 보자.
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"째 문자열은 : "+arr[i]);
		}
	
	
		/*
		 * 배열을 내림차순으로 정렬 후 출력해 보자.
		 */
		System.out.println("배열의 크기를 입력해주십시오. : ");
		int aaa[] = new int[scan.nextInt()];
		int tmp = 0;
		
		for(int i=0;i<aaa.length;i++) {
			System.out.println((i+1)+"번쨰 배열을 입력해주십시오. :");
			aaa[i] = scan.nextInt();
		}
		for(int i=0;i<aaa.length;i++) {
			for(int j=i+1;j<aaa.length;j++) {
				if(aaa[i]<aaa[j]) {
					tmp = aaa[i];
				}
			}
		}
	}	

}
