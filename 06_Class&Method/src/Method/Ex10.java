package Method;

import java.util.Scanner;

/*
 * 메서드 다중정의(Method overloading)
 * - 동일한 클래스에서 동일한 이름의 메서드가 여러 개 정의되는 자바 문법
 * - 일관된 이름을 정의할 수 있어서 개발자(사용자)에게 코드의 직관성을 제공
 * 
 *  [메서드 다중정의 규칙]
 *  1. 메서드 이름이 동일해야 한다
 *  2. 반드시 매게변수의 갯수가 같은 경우에는 매게변수의 자료형이 달라야 한다, 또는 매게변수의 갯수가 달라한다
 *  3. 리턴타입(반환형)은 무관하다
 */
public class Ex10 {

	private static int sum(int kor, int eng, int mat,int java) {
		int hap4 = kor+eng+mat+java;
		return hap4;
	}
	
	private static int sum(int kor, int eng, int mat) {
		int hap3 = kor+eng+mat;
		return hap3;
	}
	
	private static int sum(int kor, int eng) {
		int hap2 = kor+eng;
		return hap2;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		int mat = scan.nextInt();
		
		System.out.println("자바 점수 입력 : ");
		int java = scan.nextInt();
		
		System.out.println();
		System.out.println(sum(kor,eng));
		System.out.println("2과목 총점 >>>" +sum(kor,eng));
		System.out.println("3과목 총점 >>>" +sum(kor,eng,mat));
		System.out.println("4과목 총점 >>>" +sum(kor,eng,mat,java));
		
		scan.close();
		
	}

}
