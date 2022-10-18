package Class;

//음료 자판기

//음료(6개) - 콜라, 사이다, 환타, 캔커피, 탄산수, 레몬에이드 

public class Drink {

	//멤버변수
	String name; 			//음료 이름
	int price;				//음료 가격
	
	
	public Drink() {  }		//기본 생성자
	
	public Drink(String name, int price) { //인자 생성자
		
		this.name = name;
		this.price = price;
		
	}						
	
	//Drink drink[]=new Drink[6]; 객체 배열 - class명 배열명 [] = new 클래스명[배열갯수]
}
