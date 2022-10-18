package inheritance;

public class Student extends Person {

	String major;		//학과
	public Student() {	} //기본생성자
	public Student(String name, int age, String job, String major) { //인자 생성자
		
		this.name=name;		//Person 클래스의 멤버변수 name = Student 생성자의 매개변수 name
		this.age=age;		//person 클래스의 멤버변수 age = Student 생성자의 매개변수 age
		this.job=job;		//person 클래스의 멤버변수 job = Student 생성자의 매개변수 job
		this.major=major;	//Student 클래스의 멤머변수 major = Student 생성자의 매개변수 major
		
		//System.out.println("이름 >>>" + this.name); //person 클래스의 멤버변수 name
		//System.out.println("나이 >>>" + this.age);	  //person 클래스의 멤버변수 age
		//System.out.println("직업 >>>" + this.job);	  //person 클래스의 멤버변수 job
		//System.out.println("학과 >>>" + this.major);//Student 클래스의 멤버변수 major
		
	}
	
	void getStudentInfo() {
		
		System.out.println("이름 >>>" + name); //person 클래스의 멤버변수 name
		System.out.println("나이 >>>" + age);	  //person 클래스의 멤버변수 age
		System.out.println("직업 >>>" + job);	  //person 클래스의 멤버변수 job
		System.out.println("학과 >>>" + major);//Student 클래스의 멤버변수 major
		
	}
}
