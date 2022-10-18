package Overriding;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("원을 그리다"); 
		//부모(Shape)클래스의 draw메서드를 자식(Circle)클래스에서 재정의
	}
}
