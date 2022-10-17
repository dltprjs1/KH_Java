package khie;

public class Ex08 {

	public static void main(String[] args) {
		
		// 키보드를 이용하여 두 개의 숫자를 입력 받아 보자.
		String su1 = args[0];
		
		String su2 = args[1];
		
		System.out.println(su1+su2); // run configurations >> arguments를 통해 실행
		
		int num1 = Integer.parseInt(su1); // 문자열 변수인 su1을 정수형 변수로 변환시켜줌 Integer.parseInt()
		int num2 = Integer.parseInt(su2); 
		
		System.out.println(num1+num2);
	
	}	

}
