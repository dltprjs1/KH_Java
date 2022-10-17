package khie;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로부터 입력받은 점수가 60점 이상이면 "합격입니다."라는 메세지를 화면에 출력해 보세요.
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("점수를 입력해주세요: ");
		
		int aa = scan.nextInt();
		
		//int aa = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력해주세요"));
		
		//int aa = Integer.parseInt(args[0]);
		
		if (aa >= 60) {
			System.out.println("합격입니다.");
		}
		//scan.close();
	}

}
