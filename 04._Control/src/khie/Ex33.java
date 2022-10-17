package khie;

/*
 * 1 ~ 100까지의 합을 구하는데 합이 200이 되는 순간까지만 합을 구하여 화면에 출력해 보세요.
 */
public class Ex33 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1;i<=200;i++) {
			sum+=i;
			
			if (sum>=200) {
				break;
			}
				
		}
		
		System.out.println("hap >>" + sum);
		
		System.out.println("su >>"+ i);
	}

}
