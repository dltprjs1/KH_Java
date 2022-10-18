package Class;

public class Person {

	//멤버변수
	String name;
	int age;
	boolean marriage;
	
	//멤버메서드
	void display() {
		String marri = "";
				
		if(marriage) {
			marri = "기혼";
		}else {
			marri = "미혼";
		}
		
		System.out.println("이   름 >>> "+ name);
		System.out.println("나   이 >>> "+ age);
		System.out.println("결혼여부 >>> "+ marri);
	}
}
