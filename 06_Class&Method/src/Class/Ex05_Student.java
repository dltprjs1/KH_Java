package Class;

import java.util.Scanner;

public class Ex05_Student {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		//System.out.println("학생의 학번 입력 : ");
		//int hakbun = scan.nextInt();
		//System.out.println("학생의 이름 입력 : ");
		//String name = scan.next();
		//System.out.println("학생의 학과 입력 : ");
		//String major = scan.next();
		//System.out.println("학생의 연락처 입력 : ");
		//String phone = scan.next();
		//System.out.println("학생의 주소 입력 : ");
		//String address = scan.next();
		
		Student student = new Student(scan.nextInt(), scan.next(),scan.next(),scan.next(),scan.next());   
		//Student Class의 인자를 가진 생성자를 이용한 참조변수 student
			
		student.getStudentInfo(); 			//Student Class의 멤버메서드 getStudentInfo(); 호출
	
		scan.close();
		
	}

}
