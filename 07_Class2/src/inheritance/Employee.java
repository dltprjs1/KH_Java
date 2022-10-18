package inheritance;

public class Employee extends Person {
	
	int salary; 				//급여
	
	void getEmployeeInfo() {
		System.out.println("이름 >>> "+ name);		//Person 클래스의 멤버변수 name
		System.out.println("나이 >>> "+ age);			//Person 클래스의 멤버변수 age
		System.out.println("직업 >>> "+ job);			//Person 클래스의 멤버변수 job
		System.out.println("급여 >>> "+ salary);		//Employee 클래스의 멤버변수 salary

	}

}
