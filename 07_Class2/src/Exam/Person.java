package Exam;

public class Person {
	//멤버변수
	 String name;
	 String gender;
	 int age;
	 public Person() {  }
	 
	 public Person(String name,String gender, int age) {
		 this.name=name;
		 this.gender=gender;
		 this.age=age;
	 }
 
	 //멤버메서드
	 void getPersonInfo() {
		 System.out.println("이 름 >>> "+name);
		 if(gender.equalsIgnoreCase("male")) {
		 System.out.println("성 별 >>> 남자");
		 }else {
			 System.out.println("성 별 >>> 여자 ");
		 }
		 System.out.println("나 이 >>> "+age);
	 }
}
