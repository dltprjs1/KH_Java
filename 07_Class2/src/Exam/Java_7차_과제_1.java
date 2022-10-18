package Exam;

import java.util.Scanner;

public class Java_7차_과제_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Permanent per = new Permanent();
		ttemporary tem = new ttemporary();
		
		System.out.println("고용형태-정규직<p>,임시적<t>를 입력하세요.");
		String a=scan.next();
		if(a.equalsIgnoreCase("p")) {
			System.out.println("이름,기본급,보너스를 입력하세요.");
			per.setName(scan.next());
			per.setPay(scan.nextInt());
			per.setBonus(scan.nextInt());
			System.out.println("-------------------------");
			System.out.println("고용형태 : 정규직");
			System.out.println("이름 : "+per.getName());
			System.out.println("급여 : "+per.getPays());
		}else if(a.equalsIgnoreCase("t")) {
			System.out.println("이름,기본급,보너스를 입력하세요.");
			tem.setName(scan.next());
			tem.setPay(scan.nextInt());
			tem.setTime(scan.nextInt());
			System.out.println("-------------------------");
			System.out.println("고용형태 : 임시직");
			System.out.println("이름 : "+tem.getName());
			System.out.println("급여 : "+tem.getPays());
		}
		
	}

}
