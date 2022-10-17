package khie;

/*
 * 다중 for 반복문을 이용하여 구구단을 화면에 출력해 보자.
 */
public class Ex30 {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
			
		}
		
		
	}

}
