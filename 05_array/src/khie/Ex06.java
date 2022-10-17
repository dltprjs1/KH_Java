package khie;

import java.util.Scanner;

// 키보드로 배열의 크기를 입력을 받아 보자.

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("arr 배열의 크기를 입력해주십시오. : ");
		
		//int size = scan.nextInt();
		
		String arr[] = new String[scan.nextInt()]; //배열 선언,배열 메모리 지정(scanner) 
		
		System.out.println("arr 배열의 크기 >>> "+arr.length);
		
		//문자열 배열에 키보드로 데이터 입력하기.
		for(int i=0; i<arr.length;i++) {
			System.out.println((i+1) + "번째 문자열 입력 >>>");
			
			arr[i] = scan.next();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] >>>" +arr[i]);
		}
		//문자열 배열에 저장된 문자열을 검색해 보자.
		System.out.println("검색할 문자열을 입력하세요. >>> ");
		String search = scan.next();
		
		for(int i=0;i<arr.length;i++) {
			if(search.equals(arr[i])) {
				System.out.println("찾은 문자열 >>> " + arr[i]);
				System.out.println("찾은 인덱스 >>> " + "arr["+i+"]");
			}else {
				System.out.println("찾으시는 문자열이 존재하지 않습니다.");
				break;
			}
		}
		
	scan.close();
	}

}
