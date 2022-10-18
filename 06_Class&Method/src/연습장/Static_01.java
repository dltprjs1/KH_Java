package 연습장;

public class Static_01 {

	public static void main(String[] args) {
		
		Static st=new Static(); //객체생성
		
		st.num3=100;			//인스턴스변수 초기값설정
		st.num4=150;			//인스턴스변수 초기값설정
		Static.num1=200; 		//스태틱변수 초기값 설정
		Static.num2=250;		//스태틱변수 초기값 설정
		
		System.out.println(Static.sum(st.num1, st.num2));	
		//스태틱 메서드sum을 이용한 Static클래스 참조변수의 스태틱 변수의 합
		
		System.out.println(Static.sum(st.num3, st.num4));
		//스태틱 메서드sum을 이용한 Static클래스 참조변수의 인스턴스 변수의 합
		
		System.out.println(Static.sum(Static.num1, st.num2));
		//스태틱 메서드sum을 이용한 스태틱 변수num1과 Static클래스의 참조변수st의 스태틱변수 num2의 합 
		
		System.out.println(st.sum(Static.num1, st.num4));
		//Static클래스의 참조변수st를 이용한 Static변수 num1과 인스턴스변수 num4의 합
	}

}
