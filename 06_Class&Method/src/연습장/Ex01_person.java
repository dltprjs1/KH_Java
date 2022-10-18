package 연습장;
/*
 * 매게변수를 가진 생성자를 만들고 기본생성자와 매게변수를 가진 생성자를 호출해보자.
 */
		
//참조변수 형식)
//			 	클래스명 참조변수명 = new 생성자();
//				참조변수명.참조변수클래스의 멤버변수or멤버메서드
//생성자 = 클래스

/*
 * 생성자가 클래스와 같지 않은경우
 * - 매게변수를 가진 생성자를 만들었을 때
 */
public class Ex01_person{

String name="이세건";
int age=30;
int weight=87;
int height=174;

//public Ex01_person() {
	//j="student";
	//m="programming";
//	System.out.println(j);

	public static void main(String[] args) {
		Ex01_person p=new Ex01_person();
		p.age=100;
		System.out.println(p.age);
		int age=p.age;
		System.out.println(age);
		
		
		
		
	}
}
