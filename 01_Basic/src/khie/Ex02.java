package khie;

// " 두 번쨰 java 프로그램입니다. 콘솔 화면에 출력하고 있습니다."라는 문자열을 화면에 출력하는 방법

public class Ex02 {

	public static void main(String[] args) {
		
		//첫번째 방법
		System.out.println("두 번째 java프로그램입니다. 콘솔 화면에 출력하고 있습니다.");
		System.out.println(); // 콘솔에 빈줄 추가
		System.out.println("두 번째 java프로그램입니다. 콘솔 화면에 출력하고 있습니다.");
		
		
		//두번째 방법
		System.out.print("두 번째 java프로그램입니다.");
		System.out.println(" 콘솔 화면에 출력하고 있습니다.");
		System.out.println();
		
		
		//세번째 방법
		System.out.println("두 번째 java프로그램입니다." + " 콘솔 화면에 출력하고 있습니다."); // "+" 연사자를 이용한 연결
		
	}

}
