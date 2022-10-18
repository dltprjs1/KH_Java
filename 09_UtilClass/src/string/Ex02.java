package string;

public class Ex02 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Java";
		
		//identityHashCode() : 10진수를 이용한 주소값 출력 메서드 
		System.out.println("Str1 주소 >>> "+System.identityHashCode(str1));
		System.out.println("Str2 주소 >>> "+System.identityHashCode(str2));
		System.out.println();
		
		//문자열 연산(결합)
		
		str1 = str1+str2;
		
		System.out.println("Str1 주소 >>> "+System.identityHashCode(str1));  //새로운 주소값
		
		
	}

}
