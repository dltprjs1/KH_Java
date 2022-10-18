package Abstracts;

public class Professor extends Person{		//추상클래스 Person을 상속받은 Professor클래스

	String major;				// 교수 과목
	
	public Professor() {	}	//기본 생성자
	public Professor(String name,String major) {	//인자 생성자
		this.name = name;
		this.major=major;
	}
	
	
	@Override
	void output() {				//추상 클래스Person의 추상메서드는 반드시 재정의 해야한다.
		
		System.out.println(name+"교수입니다.");
		System.out.println(major+"과목을 가르치고 있습니다.");
		
	}

}