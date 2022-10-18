package inheritance;

public class Ex04_Point {

	public static void main(String[] args) {
		
		Point3D point = new Point3D(2,3); //참조변수 첫글자 숫자(X)
		
		//Point 클래스를 상속받은 Point3D의 인자생성자의 참조변수
		
		point.x= 12; //Point클래스의 멤버변수 x의 초기값 설정
		point.setZ(4); //Point3D클래스의 private 멤버변수z의 값을 setter를 활용한 초기값설정
		//setZ의 매개변수에 초기값설정!! 인자에 값 넣어야한다 setZ.z=4;(X)
		point.output();
		
	}

}
