package Exam;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Java_5차_과제_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("이름,전화번호,주소,직급을 입력하세요.");
		//NameCard namecard = new NameCard(scan.next(),scan.next(),scan.next(),scan.next());
		NameCard namecard = new NameCard();
		namecard.name = JOptionPane.showInputDialog("이름을 입력하세요.");
		namecard.phone = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		namecard.address = JOptionPane.showInputDialog("주소를 입력하세요.");
		namecard.job = JOptionPane.showInputDialog("직급을 입력하세요.");
		
		
		namecard.getNameCardInfo();
		
		
	}

}

