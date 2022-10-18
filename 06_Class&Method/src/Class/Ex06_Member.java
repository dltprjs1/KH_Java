package Class;

import java.util.Scanner;

public class Ex06_Member {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("회원의 아이디, 이름, 나이 , 연락처, 직업을 입력해주십시오. ");
		
		Member member = new Member(scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.next());
		
		member.getMemberInfo();
		
		scan.close();
	}

}
