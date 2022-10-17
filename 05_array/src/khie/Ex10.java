package khie;

/*
 * 다차원 배열의 가변 배열
 * - java의 다차원 배열은 행마다 서로 다른 열을 가질 수 있음. 
 * - 행의 크기를 먼저 결정을 하고, 열의 크기는 가변적으로 할당하는 배열
 * - 가변 배열을 사용하는 이유 : 메모리 손실을 최소화시켜 주기 위함.
 */
public class Ex10 {

	public static void main(String[] args) {
		// 1.다차원 배열의 가변배열 선언 및 메모리 생성.
		// 행 : 4행, 열 :미지정
		int aa [][] = new int [4][];
		
		//2. 가변배열의 열 메모리 생성
		
		aa[0] = new int[3]; // 1행은 3열
		aa[1] = new int[2]; // 2행은 2열
		aa[2] = new int[1]; // 3행은 1열
		aa[3] = new int[4]; // 4행은 4열
		
		int count = 10;
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j] = count;
				System.out.print(aa[i][j] + "\t");
				
				count += 10;
			}
		System.out.println();
		}
		
	}

}
