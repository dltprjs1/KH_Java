package generic;

/*
 * 제네릭(generic)?
 * - 포괄적인, 총괄적인
 * - 특정한 클래스에 원하는 객체 타입을 지정하여 지정된 객체만 저장하게하는 자바 문법
 * - 다양한 타입의 객체들을 다루는 메서드나 다음에 학습할 컬렉션에서 컴파일할 때 타입을
 *   확인 해 주는 기능
 * 		==> 즉, 다루어질 객체의 타입을 미리 명시해 줌으로써 번거로운 형변환 작업을 
 * 			줄여 준다는 장점이 있다. 또한 객체의 타입을 컴파일 시에 체크하여 주기
 * 			때문에 객체의 타입 안정성을 높여주는 장점도 가지고 있다.
 * - 여기서의 타입의 안정성을 높여준다는 것은 의도하지 않은 타입의 객체가 저장되는 것을
 *   방지하고 저장된 객체를 꺼내올 때 원래의 타입과 다른 타입으로 잘못 형변환 되어 발생할 수 있는
 *   오류를 줄여 준다는 것이다.
 * - JDK 1.5 버젼부터 추가된 기능.
 * - 클래스 내부에서 사용할 데이터를 외부에서 지정하는 방법
 * - 데이터의 명확성과 안정성을 보장해 준다.
 * 		==> 다른 데이터 타입의 데이터가 들어올 경우 컴파일 시점에서 ERROR 발생 
 */
class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

/*
 * Object 타입으로 선언된 변수에 데이터가 들어가는 경우 반드시 형변환 작업을 해 주어야한다.
 * 이러한 형변환 작업이 자주 일어나게 되면 프로그램 성능이 저하가 된다.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		Box box=new Box();
		
		box.setObj("제네릭");   	//String 자료형
		String str = (String)box.getObj();   
		//getObj는 Object 타입이라 String 자료형에 들어가기 위해서는 형변환이 필요하다.	
	}
}
