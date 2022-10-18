package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;

/*
 * [문제] Ex04 클래스처럼 키보드로 학생 수를 입력을 받고
 * 		 입력받은 학생 수만큼의 학생 정보를 키보드로 입력을
 * 		 받아서 ArrayList에 저장 후 화면에 출력해 보자.
 * 		 (조건 - 학생 정보는 학번, 이름, 학과, 연락처, 주소)
 */

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();	//제네릭 자료형으로 클래스명 삽입
		System.out.println("학생 수를 입력하세요. :");
		int studentCount = scan.nextInt();
		
		for(int i=0;i<studentCount;i++) {
			System.out.println("학생의 학번,이름,학과,연락처,주소를 입력하세요. : ");
			Student st = new Student(scan.nextInt(), scan.next(), scan.next(), scan.next(),scan.next());
			//list.add st변수 를 삽입 st변수에는 Student 인자생성자의 값(학과 학번 이름 연락처 주소)이 들어있다
			list.add(st);		
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int i=0;i<list.size();i++) {
			Student st=list.get(i);
			System.out.println((i+1)+ "번째 학생의 학번 : "+ st.getUnicode());
			System.out.println((i+1)+ "번쨰 학생의 이름 : "+ st.getName());
			System.out.println((i+1)+ "번쨰 학생의 학과 : "+ st.getMajor());
			System.out.println((i+1)+ "번째 학생의 연락처 : "+ st.getPhone());
			System.out.println((i+1)+ "번째 학생의 주소 : "+ st.getAddr());
			System.out.println("****************************");
		}	
	}
}
