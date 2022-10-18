package string;

// String 클래스의 주요 메서드

public class Ex03 {

	public static void main(String[] args) {		 
		// 1. toUpperCase() : 소문자를 대문자로 바꾸는 메서드 
		String str = "java programming";
		System.out.println(str.toUpperCase());
		System.out.println();
		
		// 2. toLowerCase(): 대문자를 소문자로 바꾸는 메서드 
		System.out.println((str.toUpperCase()).toLowerCase());
		System.out.println();
		
		// 3. length() : 문자열의 길이를 정수값으로 반환해 주는 메서드
		System.out.println("str 문자열의 길이 >>> " + str.length());
		System.out.println();
		
		// 4. concat() : 문자열을 결합하는 메서드 << 새로운 heap 주소값에 저장이 된다.
		String str1 = "Java ";
		String str2 = str1.concat("Programming");
		System.out.println("문자열 결합 결과 >>> " + str2);
		System.out.println();
		
		// 5. equalsIgnoreCase() : 대소문자를 구분하지 않는 메서드.
		if(str2.equalsIgnoreCase("java programming")) {
			System.out.println("같은 문자열이다.");
		}else {
			System.out.println("다른 문자열이다.");
		}
		System.out.println();
		
		// 6. charAt(index): 문자열에서 특정 단일 문자를 추출하는 메서드
		String identitycode = "931019-1234567";
		if(identitycode.charAt(7)=='1') {
			System.out.println("남자");
		}else if(identitycode.charAt(7)=='2') {
			System.out.println("여자");
		}else if(identitycode.charAt(7)=='3') {
			System.out.println("남자");
		}else if(identitycode.charAt(7)=='4') {
			System.out.println("여자");
		}		
	}
}

