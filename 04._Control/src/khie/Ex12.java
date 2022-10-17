package khie;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로 점수를 입력 받아서 90점 이상이면 "A학점", 80~89점이면 "B학점",70~79점이면 "C학점"
 * 		 60~69점이면 "D학점" 60점 이하면 "F학점" 이라고 화면에 출력해 보세요.
 */

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("점수를 입력해 주세요 : ");
		
		//int aa = scan.nextInt();
		
		int aa = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력해 주세요"));
		
		if (aa >= 90) {
			System.out.println("A학점");
		} else if (aa >= 80) {
			System.out.println("B학점");
		} else if (aa >= 70) {
			System.out.println("C학점");
		} else if (aa >=60) {
			System.out.println("D학점");
		} else if (aa < 60) {
			System.out.println("F학점");
		}
		scan.close();
	}

}
