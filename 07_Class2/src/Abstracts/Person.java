package Abstracts;

public abstract class Person {	//추상 클래스
	
	String name;				//인스턴스 멤버변수

	public String getName() {	//접근제어자가 private이 아니더라도 setter/getter선언 가능
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// 사람의 정보를 출력하는 메서드
	
	abstract void output();  //추상 메서드
	
}