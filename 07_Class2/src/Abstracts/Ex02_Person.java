package Abstracts;

public class Ex02_Person {

	public static void main(String[] args) {
		
		Student student = new Student();
		student=new Student("홍길동","자바");
		
		Professor professor = new Professor();
		professor = new Professor("이순신","해양학과");
		
		student.output();
		professor.output();
	}

}
