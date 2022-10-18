package Class;

public class Ex04_Student {
	
	public static void main(String[] args) {
		
		// 기본 생성자로 객체를 생성.
		Student student=new Student(); 						//Student Class에 기본생성자(=student())를 이용한 참조변수
		
		student.hakbun=2022001;
		student.name="홍길동";
		student.major="경제학과";
		student.phone="010-1111-1234";
		student.address="서울시 남대문로";
		
		student.getStudentInfo();
		System.out.println();
		
		//인자 생성자로 객체를 생성.
		Student student1 =new Student(2022002, "유관순", "회계학과", "010-2222-2222", "서울시 회기역"); //Student Class에 인자생성자(=student(int h, String n, String m, String p, String a))를 이용한 참조변수
		student1.getStudentInfo();
	}

}
