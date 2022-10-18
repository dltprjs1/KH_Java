package Exam;

import java.util.Scanner;

public class Java_8차_과제_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("도형을 선택하세요.(1.원형, 2.사각형)");
		int select = scan.nextInt();
		
		if(select == 1) {
			System.out.println("도형 선택 >>> 1");
			System.out.println("반지름을 입력해주세요.");
			Shape cir=new Circle(scan.nextInt());
			System.out.println("----------------------------");
			System.out.println("원의 면적 : "+cir.findArea());
		}else if(select == 2) {
			System.out.println("도형 선택 >>> 2");
			System.out.println("가로,세로의 길이를 입력하세요. : ");
			Shape rect = new Rectangle(scan.nextInt(), scan.nextInt());
			System.out.println("----------------------------");
			System.out.println("사각형의 면적 : "+rect.findArea());
		}
		
		
	}

}
