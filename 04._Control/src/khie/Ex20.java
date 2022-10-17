package khie;

/*
 * [문제] 1 ~ 100까지 홀수의 합과 짝수의 합을 구하시오.
 */
public class Ex20 {

	public static void main(String[] args) {
		
		int aa = 1; //초기화
		
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		while (aa <= 100) { //조건
			if(aa % 2 == 1) { //홀수를 구하는 방법
				oddSum += aa;	
			}else if (aa % 2 == 0) {// 짝수를 구하는 방법
				evenSum += aa; 
			}
			sum += aa;
			aa++;
			
	}	
		System.out.println(sum);
		System.out.println(oddSum);
		System.out.println(evenSum);
		
	}
}