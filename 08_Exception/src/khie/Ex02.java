package khie;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		String str1 = "korea";
		String str2 = null;    //null : 값이 없는 상태
		
		System.out.println("str1 문자열의 길이 >>> "+ str1.length());		//length() : 문자열의 길이 출력
		
		System.out.println("str2 문자열의 길이 >>> "+ str2.length());		//에러 발생
		
		System.out.println("프로그램 종료");
	}

}