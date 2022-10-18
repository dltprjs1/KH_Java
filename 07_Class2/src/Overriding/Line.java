package Overriding;

public class Line extends Shape {

	@Override
	void draw() {
		System.out.println("선을 그리다");
		//부모(Shape)클래스의 draw메서드를 자식(Line)클래스에서 draw메서드 재정의
	}
}
