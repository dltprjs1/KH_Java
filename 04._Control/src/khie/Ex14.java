package khie;

public class Ex14 {

	public static void main(String[] args) {
		
		//주사위를 굴려서 임의의 숫자를 하나 받아 보자.
		
		int com  = (int)(Math.random() * 6 + 1); 
		
		if(com == 1) {
			System.out.println("주사위의 1번이 나왔습니다.");
		}else if (com == 2) {
			System.out.println("주사위의 2번이 나왔습니다.");
		}else if (com == 3) {
			System.out.println("주사위의 3번이 나왔습니다.");
		}else if (com == 4) {
			System.out.println("주사위의 4번이 나왔습니다.");
		}else if (com == 5) {
			System.out.println("주사위의 5번이 나왔습니다.");
		}else if (com == 6) {
			System.out.println("주사위의 6번이 나왔습니다.");
		}
	}
}
