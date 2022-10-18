package packages;

import java.util.Scanner;

import model.MemberDTO;

/*
 * [문제] 회원 수를 키보드로 입력을 받고, 회원 수만큼 회원의 정보를 객체 배열에 저장을 하여 화면에
 * 		 회원의 정보를 출력해 보자.
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("멤버 회원 수를 입력해 주십시오. : ");
		MemberDTO member [] = new MemberDTO[scan.nextInt()];
		
		for(int i=0;i<member.length;i++) {
			System.out.println("멤버 id,pwd,이름,나이,연락처,주소를 입력해 주십시오. : ");
			member[i] = new MemberDTO(scan.next(),scan.next(),scan.next(),scan.nextInt(),scan.next(),scan.next());
		}
		for(int i=0;i<member.length;i++) {
			System.out.println("----------------------------------------");
			System.out.println("회원의 id : "+member[i].getId());
			System.out.println("회원의 pwd : "+member[i].getPwd());
			System.out.println("회원의 name : "+member[i].getName());
			System.out.println("회원의 age : "+member[i].getAge());
			System.out.println("회원의 phone : "+member[i].getPhone());
			System.out.println("회원의 address : "+member[i].getAddress());
		}
	}
}
