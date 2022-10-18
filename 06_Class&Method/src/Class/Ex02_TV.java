package Class;

/*
 * 클래스(Class)와 객체(Object)
 * - 클래스 :  객체를 정의해 놓은 것(추상화)
 * - 객체 : 클래스에 의해 만들어진 결과물(실체화)
 * 			예) 제품설계도(클래스) ==> 제품(객체)
 * - 인스턴스화 : 클래스를 이용하여 객체를 만들어 가는 과정
 * - 클래스(1) : 객체(N)
 */
public class Ex02_TV {

	//멤버변수 
	String color;			//TV 색상
	boolean power;			//TV 전원
	int channel; 			//TV 채널
	
	//멤버메서드 
	void power() {			//TV 전원을 누르는 메서드
		power = !power;
	}
	
	void channelUp() {		//TV 채널을 올리는 메서드
		if(power) {
			channel++;		//채널 하나 증가
		}
		
	}
	void channelDown() {		//TV 채널을 내리는 메서드
		if(power) {
			channel--; 		//채널 하나 감소
		}
		
	}
	
	void display() {
		String status = "";
		
		if(power) {
			status = "전원 on";
		}else {
			status = "전원 off";
		}
		System.out.println("TV 생상 >>> "+ color);
		System.out.println("TV 전원 >>> "+ status);
		System.out.println("Tv 채널 >>> "+ channel);
	}
	
	public static void main(String[] args) {
		
		// 1단계 + 2단계 : 클래스 선언 및 클래스 객체 생성
		Ex02_TV tv = new Ex02_TV();
		tv.display();
		System.out.println();
		
		tv.color = "검정색";
		tv.channel = 7;
		tv.channelUp(); 			//채널을 증가시키는 메서드 호출
		tv.display();
		System.out.println();
		
		//TV 작동
		tv.power();					// 전원 on 시키는 메서드
		tv.channelUp();
		tv.display();
		System.out.println();
		
		/*
		 *  [문제] TV 객체를 만들되 tv1이라는 참조변수를 이용하여 객체를 만들어 아래와 같이 정보를 변경하시오.
		 *  
		 *  조건 1. 색상:흰색, 전원:off, 채널:15
		 *  조건 2. tv1 정보를 화면에 출력 - display() 메서드
		 *  조건 3. tv1 정보를 다음과 같이 변경하여 화면에 출력해 보시오.
		 *  	   색상: 흰색, 전원: on, 채널: 28
		 */
		
		/*
		 *  [문제2] TV 객체를 만들되 tv1이라는 참조변수를 이용하여 객체를 만들어 아래와 같이 정보를 변경하시오.
		 *  
		 *  조건 1. 색상:흰색, 전원:off, 채널:32
		 *  조건 2. tv2 정보를 화면에 출력 - display() 메서드
		 *  조건 3. tv2 정보를 다음과 같이 변경하여 화면에 출력해 보시오.
		 *  	   색상: 검정색, 전원: on, 채널: 11
		 */
		Ex02_TV tv1 = new Ex02_TV();
		
		tv1.color = "흰색";
		tv1.channel = 15;
		tv1.display();
		System.out.println();
		
		
		tv1.power();
		
		for(int i=tv1.channel;i<28; i++) {
			tv1.channelUp();
		}
		tv1.display();
		System.out.println();
		
		Ex02_TV tv2 = new Ex02_TV();
		tv2.color = "흰색";
		tv2.channel = 32;
		tv2.display();
		
		System.out.println();
		
		tv2.power();
		
		tv2.color = "검정색";
		
		for(int i=tv2.channel;i>11;i--) {
			tv2.channelDown();
		}
		tv2.display();
				
		
		
	}
	
}
