package generic;

class Generic12 <T> { 			//미리 자료형을 정해줄 수 없을 경우 Type의 약자로 T를 "<>"안에 선언해준다.
								//무조건 T가 들어갈 필요는 없고 S,E 등 다른 약자들이 들어가도 된다.
	
	 // T a = 10;	:에러 발생, 데이터값(레터럴)에 기본자료형이 필요한 값을 넣게되면 제네릭을 사용할 수 없다.
	 T a;
	 T arr [];
	
	 
	public void setA(T a) {
		this.a = a;
	}
	public void setArr(T[] arr) {
		this.arr = arr;
	}
	void output() {
		for(T B:arr) {
			System.out.println("arr 배열 요소 : "+B);
		}System.out.println("a : "+a);
	}
	
	
}
public class 연습 {

	public static void main(String[] args) {
		Generic12 <String> str=new Generic12<String>();
		String aa []= {"홍길동","이순신","유관순"};
		String bb = "이세건";
		
		str.setA(bb);
		str.setArr(aa);
		str.output();
		
		Generic12 <Integer> it = new Generic12 <Integer>();
		Integer ab [] = {10,20,30,40,50};
		Integer bc = 157;
		
		it.setA(bc);
		it.setArr(ab);
		it.output();
		
	}

}
