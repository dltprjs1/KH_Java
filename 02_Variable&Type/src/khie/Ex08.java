package khie;

// 두 개의 변수에 있는 값을 서로 교환을 해 보자.

public class Ex08 {

	public static void main(String[] args) {
		
		//변수 선언 및 변수 초기화.
		
		int su1 = 47,su2 = 82; // ,를 통해서 여러개의 변수 선언 가능
		
		System.out.println("변경 하기 전.......");
		System.out.println("su1 >>>" + su1);
		System.out.println("su2 >>>" + su2);
		System.out.println();
		
		//방법
		
		int aa;
		
		aa = su1;
		su1 = su2;
		su2 = aa;
		
		System.out.println("변경 한 후.......");
		System.out.println("su1 >>>" + su1);
		System.out.println("su2 >>>" + su2);
		
		
	}

}
