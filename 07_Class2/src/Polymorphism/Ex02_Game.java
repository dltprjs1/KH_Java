package Polymorphism;

import java.util.Scanner;

public class Ex02_Game {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		OverWatch watch = null;		//참조변수 OverWatch인터페이스 선언
		
		System.out.print("플레이할 캐릭터 선택 (1.메이 / 2.겐지 / 3.맥크리) : ");
		
		int bunho = scan.nextInt();
		
		if(bunho == 1) {
			watch = new Mei();   	 //다형성:  Overwatch 인터페이스의 자식클래스를 생성자로 설정
		}else if(bunho == 2) {		 //      -참조변수는 OverWatch인터페이스
			
			watch = new Genji();	 //다형성:  Overwatch 인터페이스의 자식클래스를 생성자로 설정
		}else if(bunho == 3) {		 //      -참조변수는 OverWatch인터페이스
			
			watch = new Mccree();	 //다형성:  Overwatch 인터페이스의 자식클래스를 생성자로 설정
		}else {						 //      -참조변수는 OverWatch인터페이스
			System.out.println("잘못된 번호입니다.");
		}
		//자식클래스에서 재정의된 OverWatch 인터페이스의 멤버메서드 호출
		watch.name();
		watch.leftClick(); watch.rightClick();
		watch.shiftButton();watch.eButton();watch.qButton();
		scan.close();
	}

}
