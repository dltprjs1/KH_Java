package khie;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String str1 = "korea";
		String str2 = null;
		
		System.out.println("str1 >>> "+ str1.length());
		
		try {	
		System.out.println("str2 >>> "+ str2.length());				//에러가 발생할 가능성이 있는 코드
		}catch(Exception e) {										//예외처리 참조변수
			System.out.println("에러 발생");							//에러가 발생했을 때 실행되는 코드
			System.out.println(e);
		}
		
		System.out.println("프로그램 종료");
	}

}
