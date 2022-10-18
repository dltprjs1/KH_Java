package inheritance;

public class Ex03_Person {

	public static void main(String[] args) {
		
		Student st = new Student();
		//Person클래스를 상속받은 Student클래스의 참조변수 
		
		//st.name = "홍길동";		//Person클래스의 멤버변수 name의 초기값 설정
		//st.age = 27;			//Person클래스의 멤버변수 age의 초기값 설정
		//st.job = "대학생";		//Person클래스의 멤버변수 job의 초기값 설정
		//st.major = "컴퓨터공학과";	//Student클래스의 멤버변수 major의 초기값 설정
		Student student =new Student("홍길동", 27,"대학생","기계공학과");
		//st.getStudentInfo();  	//Student클래스의 멤버메서드 getStudentInfo 호출
		
		System.out.println();
		System.out.println();
		
		Employee em = new Employee();
		//Person 클래스를 상속받은 Employee 클래스의 참조변수
		
		em.name = "임정훈";		//Person 클래스의 멤버변수 name의 초기값 설정
		em.age = 38;			//Person 클래스의 멤버변수 age의 초기값 설정
		em.job = "IT학원 강사";	//Person 클래스의 멤버변수 job의 초기값 설정
		em.salary = 5000;		//Employee 클래스의 멤버변수 salary의 초기값 설정
		
		em.getEmployeeInfo();	//Employee 클래스의 멤버메서드 getEmployeeInfo 호출
		
	}

}