package Overriding;

public class Rectangle extends Shape {
 
	@Override
	void draw() {
		System.out.println("사각형을 그리다");
		//부모(Shape)클래스에서 draw메서드를 자식(Rectangle)클래스에서 재정의
	}
}
