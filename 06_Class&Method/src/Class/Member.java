package Class;

public class Member {

	//멤버변수
	String id;			// 회원 ID
	String name;		// 회원 이름
	int age;			// 회원 나이
	String phone;		// 회원 연락처
	String job; 		// 회원 직업
	
	public Member() {		//기본 생성자
	
	}
	public Member(String i,String n, int a, String p,String j) {
		
		id = i;
		name = n;
		age = a;
		phone = p;
		job = j;
		
	}
	
	//멤버메서드
	
	void getMemberInfo() {
		System.out.println("회원 아이디 >>> " + id);
		System.out.println("회원 이름 >>> " + name);
		System.out.println("회원 나이 >>> " + age);
		System.out.println("회원 연락처 >>> " + phone);
		System.out.println("회원 직업 >>> " + job);
	}
}