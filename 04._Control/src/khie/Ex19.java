package khie;

//while 반복문을 이용하여 1 ~ 10까지 합을 출력해 보자.

public class Ex19 {

	public static void main(String[] args) {
		
		int aa = 1; // 반복문의 초기식
		
		int sum = 0; // 1~10까지의 합을 저장할 변수
		
		while (aa <= 100) { // 반복문의 조건식
			
			sum += aa; // sum = sum + aa;
	
			aa++;// 반복문의 증감식
		}
		
		System.out.println(sum);
	}

}
