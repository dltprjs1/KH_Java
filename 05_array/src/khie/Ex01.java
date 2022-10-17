package khie;

/*
 * 배열(Array)?
 * - 하나의 이름으로 동일한 자료형의 데이터를 여러 개 연속적으로 저장할 수 있는 메모리 공간을 할당받는 것을 말함
 * - 변수는 하나의 값 안을 저장하지만, 배열은 여러 개의 값을 저장할 수 있음. 
 * - 같은 자료형의 데이터들이 순차적으로 저장이 됨
 * - 배열은 선언과 동시에 저장할 수 있는 자료형의 타입이 결정이 됨,만약 다른 자료형의 데이터를 저장하려면 타입 불일치 컴파일 에러가 발생
 * - 배열 방의 이름은 0 이라는 인덱스부터 시작
 * - 배열의 단점 : 배열은 한 번 크기가 정해지면 크기를 늘리거나 줄일 수 없음.
 * 
 * [배열을 사용하는 방법]
 * - 1단계 : 배열 선언
 * 			형식) 자료형 + [] + 배열명(배열이름)// 또는 //자료형 + 배열명 + []
 * - 2단계 : 배열 메모리 생성(메모리 할당)
 * 			형식) 배열명 = new 자료형[배열의 크기]
 * - 3단계 : 배열 초기화 - 할당된 메모리 영역에 데이터를 저장
 * - 4단계 : 배열을 이용 - 데이터 처리(연산, 출력 등)
 * 
 * [배열을 생성하는 방법 - 2가지]
 * 1. new 키워드를 사용하여 배열 생성.
 * 2. 배열의 초기값을 이용하여 배열 생성.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		//1단계 : 배열 선언
		
		int [] arr;
		
		//2단계 : 배열 메모리 생성
		
		arr = new int [5];
		
		System.out.println(arr); // heap 메모리의 주소
		
		//1단계 + 2단계(배열 선언 및 메모리 생성)
		
		int [] aaa = new int[5];
		
		//3단계 : 배열 초기화 : 할당된 메모리 영역에 데이터를 저장
		
		aaa[0] = 10;
		aaa[1] = 20;
		aaa[2] = 30;
		aaa[3] = 40;
		aaa[4] = 50;
		
		aaa[2] += 100;
		//4단계 : 배열 출력
		
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		System.out.println(aaa[3]);
		System.out.println(aaa[4]);
		
		//배열 선언 방법(3가지) 
		
		int [] abc = new int[10];
		
		int bca [] = new int[10];
		
		int aa[] = {10,20,30,40,50};
		
		
		System.out.println();
		
		//반복문을 이용하야 배열을 출력해 보자.
		
		for(int i=0;i<5;i++) {
			System.out.println("aaa["+i+"] >>> " + aaa[i]);
		}
		
		
	}

}
