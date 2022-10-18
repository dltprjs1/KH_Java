package string;

import java.util.StringTokenizer;

/*
 * StringTokenizer 클래스
 * - 특수 문자를 기준문자(delimiter)를 기준으로 문자열을 걸러주는 클래스(피싱)
 * - 기준 문자로 분리된 문자열을 토큰(token)이라고 한다.
 * - 웹에서 전화번호를 하이폰(-) 기준으로 앞자리, 중간자리, 뒷자리 형식으로
 * 	 구분해서 번호를 추출할 때 사용한다.
 * 	 (예 : 주민번호, 핸드폰 번호 등등)
 */
public class Ex05 {
	
	public static void main(String[] args) {
		
		String str = "id=hong&pwd=12345&name=홍길동&age=27&phone=010-1234-4567&주소=서울기회기동";
		
		// StringTokenizer() : 두번째 인자의 값을 기준으로 첫번째 인자의 데이터를 분리시켜주는 메서드
		StringTokenizer st = new StringTokenizer(str,"&");
		
		// countTokens() : 기준문자로 분리된 토큰의 갯수를 정수값으로 반환해주는 메서드 
		System.out.println("토큰 수 >>>" + st.countTokens());
		
		
		// hasMoreToken() : 반환할 다음 토큰이 있는지를 확인하는 메서드 (반환할 토큰이 있으면 true / 반환할 토큰이 없으면 false)
		// nextToken() : StringTokenizer로 분리된 토큰을 출력시켜주는 메서드
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
