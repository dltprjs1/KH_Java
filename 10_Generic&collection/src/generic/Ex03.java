package generic;

class Generic<T>{				// <> : 참조자료형만 사용가능 int (X)
	
	T arr[];					//선언만 가능, 기본 자료형이 필요한 레터럴(데이터 값)이 들어가게 되면 제네릭 기법을 사용할 수 없다.
	T var;
	
	void setArr(T arr[]) {		//자료형이 필요한 구간에는 T로 갈음
		this.arr=arr;
	}
	
	void setvar(T var) {		//자료형이 필요한 구간에는 T로 갈음
		this.var=var;
	}
	
	void output() {
		for(T k : arr) {		//자료형이 필요한 구간에는 T로 갈음
			System.out.println("arr 배열 요소 >>> "+ k);
		}
		System.out.println("var >>> "+ var);
	}
}
public class Ex03 {

	public static void main(String[] args) {
		
		//String 타입의 클래스 객체 생성
		Generic<String> st= new Generic<String>();		//클래스명 <T를 대용할 기본자료형> 참조변수명 =new 클래스명<T를 대용할 기본자료형>();
		
		
		String arr[] = {"홍길동","이순신","유관순"};			//변수 선언 및 생성
		
		String var = "김연아";							//변수 선언 및 생성
			
		st.setArr(arr);									//참조변수.메인메서드에 생성한 변수를 참조변수의 클래스 메서드에 값을 저장
		st.setvar(var);									//참조변수.메인메서드에 생성한 변수를 참조변수의 클래스 메서드에 값을 저장
		st.output();									//참조변수의 클래스 메서드 호출
		System.out.println();
		
		//Integer 타입의 클래스 객체 생성
		Generic<Integer> it= new Generic<Integer>();	//클래스명 <T를 대용할 기본자료형> 참조변수명 =new 클래스명<T를 대용할 기본자료형>();	
		
		Integer iarr[] = {10,20,30,40,50};				//변수 선언 및 생성
		Integer ivar = 500;								//변수 선언 및 생성
		
		it.setArr(iarr);								//참조변수.메인메서드에 생성한 변수를 참조변수의 클래스 메서드에 값을 저장
		it.setvar(ivar);								//참조변수.메인메서드에 생성한 변수를 참조변수의 클래스 메서드에 값을 저장
		it.output();									//참조변수의 클래스 메서드 호출
	}
}