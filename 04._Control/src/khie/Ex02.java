package khie;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		//int jumsu = Integer.parseInt(args[0]);
		
		int jumsu =Integer.parseInt(JOptionPane.showInputDialog("점수를 입력해주세요"));
		
		if(jumsu >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("A학점입니다");
		}
		
		System.out.println("프로그램 종료");

		
	}

}
