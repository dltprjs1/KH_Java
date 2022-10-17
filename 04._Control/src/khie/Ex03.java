package khie;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로 입력받은 정수가 5로 나누어 떨어지면
 * 		"이 정수는 5의 배수입니다." 라는 메세지를 
 * 		화면에 출력해 보세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		//int aa =Integer.parseInt(args[0]);
		
		int aa = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력해주세요"));
		if ((aa % 5) == 0) {
			System.out.println("이 정수는 5의 배수입니다.");
		}
		
		System.out.println("프로그램 종료");
		
		}
	}


