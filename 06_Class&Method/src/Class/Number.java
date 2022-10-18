package Class;

/*
 *  *******************************중요******************************
 *  캡슐화(encapsulation)?
 *  - 객체지향 프로그램 4대 특징 중 하나
 *  - 데이터를 감추기, 데이터를 외부에서 함부로 접근하지 못하므로 외부의 접근을 제한하는 방법
 *  - 정보 은닉 : 클래스 멤버 접근 제어 기법
 *    * private : 외부에서 직접 접근 차단
 *    * public : 누구나 접근 가능
 *  -  setter() / getter() 메서드로 접근 가능
 *  		  ==> setter() : 지정자 메서드
 *  						 멤버변수에 변경할 값을 전달 받아서 멤버변수에 값을 변경하는 메서드
 *  		  ==> getter() : 획득자 메서드
 *  						 멤버변수의 값을 읽어 와서 호출한 곳으로 읽은 값을 넘겨주는 메서드
 *  *****************************************************************
 */

public class Number {

	
	//멤버변수
	private int num1; //다른 클래스에서 호출 / 출력 불가능
	private int num2; //다른 클래스에서 호출 / 출력 불가능
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;     			
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/*
	 * this.num1 = num1;
	 *             ******                 ***
	 * Number클래스의 멤버변수 num1 = setNum1의 인자(매개변수) num1
	 *             ******   
	 *             
	 * this.num2 = num2;
	 *             ******                 ***
	 * Number클래스의 멤버변수 num2 = setNum2의 인자(매개변수) num2
	 *             ******                 ***
	 */
	
	/*
	 * this 키워드 : 객체(Number 클래스) 자기 자신을 의미한다.
	 * - 주로 멤버변수와 메서드 또는 생성자의 매개변수 이름이 동일할 떄 객체의 멤버임을 명확하게
	 * 	 하기위해 사용되는 키워드
	 * - 매개변수(지역변수)의 이름과 멤버변수(전역변수)의 이름이 같을 때 멤버변수(전역변수)앞에 this라는 
	 *   키워드를 붙여서 구분하는 방법
	 * - 지역변수와 전역변수의 이름이 같으면 지역변수의 우선순위가 더 높다.
	 */
	
	
	
	/*
	 * setter() 메서드로 멤버변수에 초기값을 설정
	 * - private 멤버변수에 값을 지정하는 역할을 하는 메서드
	 * 
	 * 형식) 
	 * 		public void set멤버변수명(자료형 매개변수) {
	 * 			멤버변수 = 매개변수;
	 * 		}
	 */

	//public void setNum1(int n1) {  //setter메서드는 접근이 가능해야하므로 접근제어 = public
	//	num1=n1;
		
	//}
	//public void setNum2(int n2) {  //setter메서드는 접근이 가능해야하므로 접근제어 = public
	//	num2=n2;
	//}
	
	/*
	 * getter() 메서드를 멤버변수에 할당된 값을 가져오는 메서드
	 * - private 멤버변수에 할당된 값을 가져오는 역할을 하는 메서드
	 * 
	 * 형식)
	 * 		public 멤버변수 자료형 get멤버변수명(){
	 * 				return 멤버변수명;	
	 * 		}
	 */
	
	//public int getNum1() {			//getter메서드는 접근이 가능해야하므로 접근제어 = public
	//	return num1;
	//}
	//public int getNum2() {			//getter메서드는 접근이 가능해야하므로 접근제어 = public
	//	return num2;
	//}
	
	//setter
	// 형식) public void set멤버변수명 (자료형 변수명){ 
	//		멤버변수명 = 변수명(다른 클래스에 변수명 호출하기);
	//}
	
	//getter
	// 형식) public 멤버변수자료형 get멤버변수명 (자료형 변구명){
	//		return 변수명;
	//		}
	
	
	
	
}
