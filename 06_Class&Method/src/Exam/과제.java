package Exam;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("학생 수를 입력해 주십시오. : ");
		// String uni[] =new String[scan.nextInt()]; 
		String name[]=new String [scan.nextInt()];
		int num[]=new int [name.length];
		String sub[]=new String [name.length];
		String phone[]=new String [name.length];
		
		// String deung = deung(name,num,sub,phone);
		while(true) {
			System.out.printf("menu를 선택하여 주십시오. : \n1.학생등록\n2.전체출력\n3.학생조회\n4.정보수정\n5.프로그램 종료\n");
			int menu = scan.nextInt();
			switch(menu) {
				case 1: 
					deung(name,num,sub,phone); 
					System.out.println(2); 
					break;
				case 2: call(name,num,sub,phone); break;
				case 3: search(name,num,sub,phone);break;
				case 4: fix(name,num,sub,phone); break;
				case 5: exit(); break;
					}break;//switch
			}//while
	}//main



	private static void exit() {
		Scanner scan=new Scanner(System.in);
		System.out.println("계속할까요?(Y:계속 / N:종료)");
		String result =scan.next();
		if(result.equalsIgnoreCase("N")) {
			return;
		}
		
	}

	public static void fix(String[] name, int[] num, String[] sub, String[] phone) {
		Scanner scan=new Scanner(System.in);
		System.out.println("학번을 입력해주십시오. : ");
		int search= scan.nextInt();
		for(int i=0;i<name.length;i++) {
			if(search==num[i]) {
				System.out.println("수정할 학과을 입력해주세요. :");
				sub[i]=scan.next();
				System.out.println("수정할 전화번호를 입력해주세요. :");
				phone[i]=scan.next();
			}
		}
	}


	public static void search(String[] name, int[] num, String[] sub, String[] phone) {
		Scanner scan=new Scanner(System.in);
		System.out.println("학번을 입력해주십시오. : ");
		String personname="";
		int personnum=0;
		String personsub="";
		String personphone="";
		int search= scan.nextInt();
		for(int i=0;i<name.length;i++) {
			if(search==num[i]) {
				personname =name[i];
				personnum = num[i];
				personsub = sub[i];
				personphone = phone[i];
			}
		}
		System.out.printf("이름 : %s\t학번 : %s\t학과 : %s\t전화번호 : %s\t\n",personname,personnum,personsub,personphone);
		
	}


	public static void call(String[] name, int[] num, String[] sub, String[] phone) {
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("이름 : %s\t학번 : %s\t학과 : %s\t전화번호 : %s\t\n",name[i],num[i],sub[i],phone[i]);
		}
	}

	public static void deung(String[] name, int[] num, String[] sub, String[] phone) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
		System.out.println("이름을 입력해 주십시오. :");
		name[i]=scan.next();
		System.out.println("학번을 입력해 주십시오. :");
		num[i]=scan.nextInt();
		System.out.println("학과를 입력해 주십시오. :");
		sub[i]=scan.next();
		System.out.println("전화번호를 입력해 주십시오. :");
		phone[i]=scan.next();
		}
		System.out.println(1);
	}
}

