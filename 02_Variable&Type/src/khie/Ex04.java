package khie;

public class Ex04 {

	public static void main(String[] args) {

		//변수 선언 및 변수 초기화
		byte su = 127;
		
		System.out.println("su >>>" + su);
		
		int su1 = su;//자료형의 형변환 작업(묵시적 형변환)
		
		System.out.println("su1>>>" + su1);
		
		int su2 = 150;
		
		System.out.println("su2>>>"+ su2);
		
		//byte su3 = su2;
		//1.byte 범위(-128~127)초과
		//2.int(4바이트)형의 데이터를 byte(1바이트)형의 데이터에 넣으려고 해서
		//3.예외로 byte형 데이터이나 short형데이터는 int형 데이터에 들어갈 수 있다.
		
		byte su4 = (byte) su2; //자료형의 형변환 작업(명시적 형변환)
		
		
		/*
		 * su4 변수의 값이 -106이 나온 이유
		 * byte 자료형의 범위(-128~127)를 벗어났기 때문에 쓰레기 값이 나오게 됨
		 */
		System.out.println("su4>>>" + su4);//자료의 손실 발생
		
		/*
		 * 형변환(casting) : 해당 데이터 값의 자료형을 다른 타입의 자료형으로 변환하는 것을 말함.
		 * 
		 * - 형변환은 boolean형을 제외한 7가지 자료형은 서로 형변환이 가능함.
		 * 
		 * 1. 묵시적 형변환
		 * ==> 자료형의 크기가 작은 데이터를 큰 자료형의 데이터에 저장. 이 때는 형변환 작업을 안해주어도 됨.
		 * 2. 명시적 형변환
		 * ==> 자료형의 크기가 큰 데이터를 작은 자료형의 데이터에 저장. 이 때는 반드시 형변환 작업을 해 주어야 됨. 형변환 작업 시 자료의 손실이 발생할 수 있음. 
		 * 
		 */
	
	
	
	}
}
