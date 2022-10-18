package Class;

public class Ex07_Static {

	public static void main(String[] args) {
		
		System.out.println("num >>>" + Static.num); //클래스명.스태틱변수
		
		System.out.println("adder() 메서드 호출 >>>" + Static.adder(150, 36)); //클래스명.스태틱메서드
		
		System.out.println();
		
		Static st = new Static();	//참조변수(객체)생성
		
		System.out.println("su1 >>> "+st.su1); //인스턴스 변수
		
		System.out.println("su2 >>> "+st.su2); //인스턴스 변수
		
		st.sum();
	}

}
