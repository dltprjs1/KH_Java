package Method;

//메서드 호출 시 반환형

public class Ex07 {
	// 값이 반환되는 경우
	public static int method1() { //void가 없을 경우 무조건 return값을 입력해야한다.
		return 10;
	}
	
	
	// 변수명이 반환되는 경우
	public static int method2(int i, int j) {
		
		int sum = (i * 2) + (j * 2);
		
		return sum;
	}
	
	
	//수식이 반환되는 경우
	private static int method3(int i, int j) {
		
		return i+j;
	}
	
	
	public static void main(String[] args) {
		
		int su = method1(); // method1의 return값 10을 가진다
		System.out.println("method1의 값 : "+su);
		System.out.println("method1의 값 : "+method1());
		System.out.println("method2의 값 : "+method2(10,10));
		System.out.println("method3의 값 : "+method3(100,100));
	
	}
}
