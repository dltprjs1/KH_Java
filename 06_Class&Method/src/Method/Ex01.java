package Method;

import java.util.Scanner;

/*
 * 메서드(Method)?
 * 1. C언어에서의 함수(Function)와 같음
 * 2. 기능을 정의하는 단위(예: 덧셈기능, 뺄셈기능 등등)
 * 3. 하나의 기능만을 정의하는 것이 좋음
 * 4. 자주 반복되는 애용을 정의해 놓고, 필요할 때 호출하여 사용
 * 
 * 		형식)
 * 			[접근제한] 반환형 메서드(매개변수 혹은 인자) {
 * 				메서드 호출 시 실행형 문장;
 * 				}
 * 
 * 		 - 접근제한 : public > protected > default > private
 * 					(클래스, 메서드, 변수 앞에 사용)
 * 		 - 반환형 : - 메서드를 실행하고 특정 타입의 결과를 반환해 주겠다고 선언하는 것을 반환형(리턴타입)이라고 말한다.
 * 		 		  - 메서드에서 실행된 결과값을 돌려주는 자료형으로 생략이 불가능
 * 				  - 해당 메서드가 어떤 동작이나 기능을 실행한 후 결과를 알려주는 자료형
 *     			  - 만약 결과를 되돌려줄 필요가 없는 경우에는 void라는 키워드를 작성
 *     			  - 반환형이 void인 경우를 제외하고 결과를 되돌려주어야할 떄는 메서드 명령문 맨 마지막에 retrun이라는 키워드를 작성 후, 
 *     				앞에서 선언한 반환형과 같은 결과를 되돌려준다
 * 메서드이름 : - 식별자, 소문자로 시작, 두 개의 단어가 결합된 경우에는 두 번째 글자의 첫글자는 대문자로 작성하는 것이 관례임(CamelCase)
 * 매개변수 : - 외부에서 값을 넘겨받는 변수, 생략 가능
 * 		    - 메서드 호출 시 전달되는 값의 저장을 위한 용도로 사용
 *   		- 메서드 호출 시 전달되는 값의 자료형과 매개변수자료형은 반드시 일치시킬 것
 * 메서드 실행문 : - 해당 메서드가 호출된 경우에만 실핸된다.
 */
public class Ex01 {
	
	public static void add() {
		System.out.println("add() 메서드 호출");
	}
	
	public static void input() {
		
		Scanner scan=new Scanner(System.in);
		int arr[] =new int[3];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+" 번째 정수 입력 : ");
			arr[i]=scan.nextInt();
			}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] >>> "+arr[i]);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		//메서드를 호출해 보자.
		add();
		input();
		
		System.out.println("프로그램 종료");

		
	}

}
