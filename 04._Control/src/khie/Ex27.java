package khie;

/*
 * [문제] for 반복문을 이용하여 1 ~ 100까지의 홀수의 합과 짝수의 합을 구하여 화면에 출력해 보세요.
 */
public class Ex27 {

	public static void main(String[] args) {
		int oddSum = 0; // main메서드에서 선언된 변수는 전역변수
		int evenSum = 0;
		
		for(int i=1;i<=100;i++) { //for문 안에 있는 변수는 지역변수
			if (i % 2 == 0) {
				evenSum += i;
			}else if (i % 2 == 1) {
				oddSum += i;
			}
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
		
	}

}
