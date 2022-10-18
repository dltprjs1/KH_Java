package string;

/*
 * String 클래스의 단점
 *  - 빈번하게 문자열 연산을 실행할 경우 메모리(heap)를 많이 차지하게 된다.
 *  - 매번 연산 시마다 새로운 객체를 생성하게 된다.
 *  ==> 힙(heap) 영역의 과부하가 발생할 가능성이 많다.
 *  - 이러한 단점을 개선한 클래스 : StringBuffer 클래스
 */
public class Ex04 {
	
	

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java"); 		//StringBuffer 객체를 이용한 참조변수 선언			
		
		// 1. append() : 문자열을 추가해 주는 메서드
		System.out.println("문자열 추가 후 >>> "+ sb.append("programming"));
		System.out.println();
		
		// 2. replace() : 문자열을 교체하는 메서드
		// 		형식) replace(시작 index , 끝 index, "교체할 문자열");	//end index는 자신의 index를 포함되지 않는다.
		sb.replace(0, 4, "c++ ");		
		System.out.println(sb);
		System.out.println();
		
		// 3. substring() : 문자열을 추출하는 메서드
		// 		형식1) substring(시작 index)
		//		형식2) substring(시작 index, 끝 index) //end index는 자신의 index를 포함하지 않는다.
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(0, 3));
	}

}
