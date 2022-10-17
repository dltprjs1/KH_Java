package khie;

public class Ex06 {

	public static void main(String[] args) {
		
		//system.out.printf() ==>format의 약자
		//형식(양식)에 맞춰 출력하는 메서드.
		System.out.printf("%d + %d = %d\n",10,20,(10+20)); // %d == 10진수
		
		System.out.printf("%o\n",10); // %o == 8진수
		
		System.out.printf("%x\n",15); // %x == 16진수(0123456789abcdef)
		
		System.out.printf("%s\n","문자열 출력"); // %s == 문자열 출력
		
		System.out.printf("%f\n",10.123); // %f == 소수점 출력(float)
		
		System.out.printf("%.2f\n",10.127); //%.2f == 소수점 두 번째 자리까지만 출력 (소수점 세 번째 자리 반올림)

		// 형식(" %정수.소수점자릿수f
		// ==> 정수는 숫자 만큼 출력이 되고, 소수점 아래는 소수점자리수까지만 출력이 됨.
		
		System.out.printf("%4.2f\n",123412123.12334); //정수값은 그냥 그대로 출력
		
		System.out.printf("%d\n",100000000);
		
		System.out.printf("%,d\n",100000000); // 천단위로 "," 출력

	
	}

}
