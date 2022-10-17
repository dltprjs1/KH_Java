package khie;

/*
 * 실수자료형 : 소수점이 존재하는 자료형
 *  - float : 소수점 이하 6 ~ 7자리까지 포현이 가능함.
 *  - double(기본형) : 소수점 이하 15~16 자리까지 표현이 가능함.
 *  - float 자료형의 변수에 실수 값을 저장시에는 반드시 실수 값 뒤에 f를 붙여 주어야 함(생략하면 오류 발생)
 *  
 *  오류 발생 이유 : 실수형의 기본 자료형은 double 형이기 떄문임.
 *
 * - 실수 자료형에서 명시적 형변환을 진행 하더라도 자료의 손실은 거의 발생하지 않음.
 *
 */

public class Ex05 {

	public static void main(String[] args) {
		double dNum = 123.45678;
		System.out.println("dNum>>>" + dNum);
		
		float fNum = 123.45678f;
	
		float fNum1 = (float)123.45678;
		
		System.out.println(fNum);
		System.out.println(fNum1);
	}

}
