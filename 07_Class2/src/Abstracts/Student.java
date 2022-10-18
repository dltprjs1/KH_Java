package Abstracts;

public class Student extends Person{

	String major;		   //학생 학과
	
	public Student() {  }  //기본 생성자
	public Student(String name,String major) {		//인자 생성자
		this.name=name;
		this.major=major;
	}
		
	@Override
	void output() {			//추상 메서드 재정의
		System.out.println(name + "학생입니다.");
		System.out.println(major + "과목을 수강 중입니다.");
		
	}

}