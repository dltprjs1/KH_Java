package Exam;

import java.util.Scanner;

public class 과제_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("학생 수를 입력해 주십시오. : ");
		
		String name [] = new String[scan.nextInt()];
		int hakbun[] = new int[name.length];
		String  major[] = new String[name.length];
		String phone[] = new String[name.length];
		String result = "";
		while(true) {
			System.out.println("*** 학생관리 프로그램 ***");
			System.out.println("1. 학생 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 정보 수정");
			System.out.println("5. 프로그램 종료");
			
			System.out.println();
			
			System.out.println("학생관리 메뉴중 하나를 선택하십시오. : ");
			
			int menu = scan.nextInt();
			switch(menu) {
			case 1: // 학생 등록 메뉴
				// 학생 등록 메서드 호출
				input(name,hakbun,major,phone,scan);
				break;
			case 2: // 전체 출력 메뉴
				output(name,hakbun,major,phone,scan);
				break;
				// 전체 출력 메서드 호출
			case 3: // 학생 조회 메뉴
				search(name,hakbun,major,phone,scan);
				break;
				// 학생 조회 메서드 호출
			case 4: // 정보 수정 메뉴
				modify(name,hakbun,major,phone,scan);
				break;
				// 정보 수정 메서드 호출
			case 5: // 프로그램 종료 메뉴
				result = exit(scan);
				break;
				// 프로그램 종료 메서드 호출
			}//switch
			if(result.equalsIgnoreCase("Y")) {
				break;
			}
		}//while
	}
	
	public static String exit(Scanner scan) {
		System.out.print("프로그램을 종료 하시겠습니까?(Y:종료 / N:계속)");
		String exit =scan.next();
		return exit;
	}
	
	private static void modify(String[] name, int[] hakbun, String[]major, String[] phone, Scanner scan) {
		System.out.println("수정하실 학생의 학번을 입력해주십시오. : ");
		int search =scan.nextInt();
		for(int i=0;i<name.length;i++) {
			if(search==hakbun[i]) {
				System.out.println("학생의 학과를 수정해주십시오. : ");
				major[i] =scan.next();
				System.out.println("학생의 전화번호를 수정해주십시오. : ");
				phone[i] =scan.next();
			}
		}
	}
	private static void search(String[] name, int[] hakbun, String[] major, String[] phone, Scanner scan) {
		System.out.println("찾으시는 학생의 학번을 입력해주십시오. :");
		int search =scan.nextInt();
		String personname="";
		int personhakbun=0;
		String personmajor="";
		String personphone="";
		for(int i=0;i<name.length;i++) {
			if(search==hakbun[i]) {
				personname=name[i];
				personhakbun=hakbun[i];
				personmajor=major[i];
				personphone=phone[i];
			}
		}System.out.printf("이름 : %s\t학번 : %d\t학과 : %s\t연락처 : %s\t\n",personname,personhakbun,personmajor,personphone);
		
	}
	private static void output(String[] name, int[] hakbun, String[] major, String[] phone, Scanner scan) {
		
		for(int i=0;i<name.length;i++) {
			System.out.println("********************************************************");
			System.out.printf("이름 : %s\t학번 : %d\t학과 : %s\t연락처 : %s\t\n",name[i],hakbun[i],major[i],phone[i]);
		}
		
	}
	//학생 정보 저장 메서드
	public static void input(String[] name, int[] hakbun, String[] major, String[] phone, Scanner scan) {
		
		for(int i=0;i<name.length;i++) {
			System.out.println((i+1)+"번째 학생 정보 입력");
			
			System.out.println("학생 이름 입력 : ");
			name[i] = scan.next();
			System.out.println("학생 학번 입력 : ");
			hakbun[i] = scan.nextInt();
			System.out.println("학생 학과 입력 : ");
			major[i] = scan.next();
			System.out.println("학생 전화번호 입력 : ");
			phone[i] = scan.next();
		}
		
	}
}
