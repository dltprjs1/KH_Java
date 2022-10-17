package khie;


/*
 * 단일문자형 : char형(0 ~65535) == 2byte
 * - 자바에서는 유니코드(UTF-8) 체계로 단일문자가 처리가 됨.
 */
public class Ex06 {

	public static void main(String[] args) {

		
		char ch = 'A';
		
		System.out.println("ch >>> " + ch);
		
		
		System.out.println(ch + 1); // 66출력
		System.out.println((char)(ch + 1)); // 대문자 B 출력

		
	}

}
