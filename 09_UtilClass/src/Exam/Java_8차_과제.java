package Exam;

import java.util.Scanner;

public class Java_8차_과제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Permanent per1 = new Permanent();
		Temporary tem1 = new Temporary();
		System.out.println("고용형태-정규직<p>,임시직<t>를 입력하세요");
		String select = scan.next();
		if (select.equalsIgnoreCase("p")) {
			System.out.println("이름,기본급,보너스를 입력하세요.");
			per1.setName(scan.next());
			Permanent per = new Permanent(scan.nextInt(), scan.nextInt());		
			System.out.println("------------------------------");
			System.out.println("고용형태 : 정규직");
			System.out.println("이름 : "+per1.getName());
			System.out.println("급여 : "+per.getPays()+"원");
		}else if(select.equalsIgnoreCase("t")) {
			System.out.println("이름,작업시간,시간당 급여를 입력하세요.");
			tem1.setName(scan.next());
			Temporary tem = new Temporary(scan.nextInt(),scan.nextInt());
			System.out.println("------------------------------");
			System.out.println("고용형태 : 임시직");
			System.out.println("이름 : "+tem1.getName());
			System.out.println("급여 : "+tem.getPays()+"원");
			}
		
		
	}

}
