package khie;

/*
 * 3. 기타(보조제어문)
 * - continue 명령어
 * - 반복문에서만 사용되는 명령어
 * - 반본문을 탈출하는 것이 아니라, 다음 증감식으로 가는 명령어
 */
public class Ex34 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			
			if(i % 2 == 1) {
				continue; // i가 홀수일 때 바로 다음 증감식(i++)으로 이동한다
			}
			System.out.println("i>>> "+i); // 짝수 출력
		}
		System.out.println();
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum>>> "+sum);
	}

}
