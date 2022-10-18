package 연습장;
/*
 * 멤버변수
 * 멤버메서드
 * 기본생성자
 * 매게변수생성자
 */
public class Ex01_person_1 {
//멤버변수
String name;
int age;
int height;
int weight;
String job;
String movement;
boolean marriage;
boolean marriage1;
String marriage2;
//멤버메서드
void movement() {
	movement="programming";
	System.out.println("작업중입니다.");
}
void display1(String n,int a,int h, int w, String j, String m) {
	n=name;
	a=age;
	h=height;
	w=weight;
	j=job;
	m=movement;
}
void marriage1() {
	marriage1= !marriage1;
	String marri="";
	if(marriage) {
		System.out.println("미혼");
	}System.out.println("기혼");
}
void display() {
	marriage= !marriage;
	name="이세건";
	age=30;
	height=174;
	weight=87;
	job="student";
	System.out.printf("이름 : %s\n나이 : %s\n키 : %s\n몸무게 : %s\n직업 : %s\n",name,age,height,weight,job);
}
void marriage() {
	String marri="";
	if(marriage) {
		marri="미혼";
	}else {
		marri="기혼";
	}
	System.out.println(marri);
}
	



	public static void main(String[] args) {
		
		Ex01_person_1 ps=new Ex01_person_1();
		ps.display();
		//ps.marriage();
		//ps.marriage1();
		
		ps.movement();
		
		
	}

}
