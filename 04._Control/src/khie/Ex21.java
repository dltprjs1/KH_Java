package khie;

public class Ex21 {

	public static void main(String[] args) {
		
		//ABCD~XYZ까지 문자를 출력해 보자.
		
		char alpha = 'A';
		
		while (alpha <= 'Z') {
			System.out.println(alpha);
			alpha++;
			
		}
		System.out.println();
		
		
		char RevAlpha = 'Z';
		
		while (RevAlpha >= 'A') {
			System.out.println(RevAlpha);
			RevAlpha--;
		}
	}

}
