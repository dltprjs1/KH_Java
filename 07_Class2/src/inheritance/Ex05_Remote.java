package inheritance;

import java.util.Scanner;


public class Ex05_Remote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Tv tv = new Tv();							//Volume 클래스를 상속받은 Tv클래스의 참조변수
		Radio radio = new Radio();					//Volume 클래스를 상속받은 Radio클래스의 참조변수
		Computer computer = new Computer();			//Volume 클래스를 상속받은 Computer클래스의 참조변수
		
		while(true) {
			System.out.println("1. TV / 2. Radio 3.Computer / 4. 종료");
			
			int menu =scan.nextInt();
			
			if(menu == 4) {
				break;								//if문밖에 있는 while문 탈출 명령어 *** return; : 메서드 탈출명령어 ***
			}
			System.out.print("1. 볼륨Up / 2. 볼륨Down");
			
			int volume = scan.nextInt();
			
			switch(menu) {
			case 1:
				if(volume == 1) { //볼륨 Up 선택한 경우
					tv.VolumeUp();					//Volume클래스의 멤버메서드 VolumeUp메서드 호출
				}else {
					tv.VolumeDown();				//Volume클래스의 멤버메서드 VolumeDown메서드 호출
				}
				break;
			case 2:
				if(volume == 1) { //볼륨 Up 선택한 경우
					radio.VolumeUp();				//Volume클래스의 멤버메서드 VolumeUp메서드 호출
				}else {
					radio.VolumeDown();				//Volume클래스의 멤버메서드 VolumeDown메서드 호출
				}
				break;
			case 3:
				if(volume == 1) { //볼륨 Up 선택한 경우
					computer.VolumeUp();			//Volume클래스의 멤버메서드 VolumeUp메서드 호출
				}else {
					computer.VolumeDown();			//Volume클래스의 멤버메서드 VolumeDown메서드 호출
				}
				break;
				
			}//swtich ~ case
			System.out.println();
			
			System.out.println("==========================================");
			
			System.out.println(" TV Volume : " + tv.getVol() +" Radio Volume : " + radio.getVol()+" Computer Volume : " + computer.getVol());
		}//while 
		
		System.out.println();
		System.out.println("수고 많이 하셨습니다 ~~");
		scan.close();
		
	}

}
