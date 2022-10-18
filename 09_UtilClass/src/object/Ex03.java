package object;

public class Ex03 {

	public static void main(String[] args) {
		
		// String 배열 객체 생성
		String str[] = new String [4];
		str[0] = "홍길동";
		str[1] = "hong";
		str[2] = "서울시 중구 남대문로";
		//str[3] = 123;
		str[3] = "010-7777-7777";
		
		for(String s : str) {
			System.out.println("str 배열 요소 >>> "+ s);
		}
		System.out.println();
		
		//Object 배열 객체 생성
		Object obj [] =new Object[4];  		//모든 자료형을 다 작성 가능
		obj[0] = "이순신";					//String 
		obj[1] = 150;						//Integer
		obj[2] = true;						//boolean
		obj[3] = 3.14;						//double
		
		for(Object o : obj) {
			System.out.println("obj 배열 요소 >>> "+ o );
		}
	}

}
