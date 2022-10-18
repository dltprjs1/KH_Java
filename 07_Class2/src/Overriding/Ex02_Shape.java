package Overriding;



public class Ex02_Shape {

	public static void main(String[] args) {
		Line line = new Line();			
		//Line클래스의 참조변수 line 선언
		
		line.draw();					
		//Shpape클래스를 상속받은 Line클래스의 draw메서드 호출
		
		Circle circle = new Circle();
		//Circle클래스의 참조변수 circle 선언
		
		circle.draw();
		//Shape클래스를 상속받은 Circle클래스의 draw메서드 호출
		
		Rectangle rectangle = new Rectangle();
		//Rectangle클래스의 참조변수 rectagle선언
		
		rectangle.draw();
		//Shape클래스를 상속받은 Rectagle클래스의 draw메서드 호출
		
		
	}

}
