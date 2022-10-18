package Class;

import java.util.Scanner;

public class Ex08_Drink {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자판기 음료 갯수를 입력 해주십시오. : ");
		
		// 객체 배열을 만들어 보자. 
		
		Drink drinks [] = new Drink[scan.nextInt()];	//drinks 객체배열 생성
		
		for(int i=0;i<drinks.length;i++) {
			
			System.out.println("음료의 이름과 가격을 입력해주십시오. :");
			System.out.println("=====================================");
			drinks[i]=new Drink(scan.next(),scan.nextInt());
			
		}
		
		//Drink drink1 = new Drink("콜라" , 2000);			//참조변수 drink1
		//Drink drink2 = new Drink("사이다" , 2000);		//참조변수 drink2
		//Drink drink3 = new Drink("환타" , 2000);			//참조변수 drink3
		//Drink drink4 = new Drink("캔커피" , 1000);		//참조변수 drink4
		//Drink drink5 = new Drink("탄산수" , 1500);		//참조변수 drink5
		//Drink drink6 = new Drink("레몬에이드" , 1700);		//참조변수 drink6
		
		//drinks[0] = drink1;			//drinks 객체배열 0번쨰 인덱스 = 참조변수 drink1
		//drinks[1] = drink2;			//drinks 객체배열 1번쨰 인덱스 = 참조변수 drink2
		//drinks[2] = drink3;			//drinks 객체배열 2번쨰 인덱스 = 참조변수 drink3
		//drinks[3] = drink4;			//drinks 객체배열 3번쨰 인덱스 = 참조변수 drink4
		//drinks[4] = drink5;			//drinks 객체배열 4번쨰 인덱스 = 참조변수 drink5
		//drinks[5] = drink6;			//drinks 객체배열 5번쨰 인덱스 = 참조변수 drink6
		
		//System.out.println("drinks[0]>>> "+drinks[0]);
		//System.out.println("drinks[1]>>> "+drinks[1]);
		//System.out.println("drinks[2]>>> "+drinks[2]);
		//System.out.println("drinks[3]>>> "+drinks[3]);
		//System.out.println("drinks[4]>>> "+drinks[4]);
		//System.out.println("drinks[5]>>> "+drinks[5]);
		
		System.out.println("돈을 넣어주십시오. : ");
		
		int coin = scan.nextInt();
		
		//입력을 받은 coin(돈)과 객체배열에 저장된 Drink 클래스의 멤버변수인 
		//price(음료 가격)를 비교해서 coin보다 가격이 같거나 작은 금액의 음료를 선택
		
		for(int i=0;i<drinks.length;i++) {
			if(coin>=drinks[i].price) {
				System.out.print(drinks[i].name + "\t");
			}
		}
		
	}

}
