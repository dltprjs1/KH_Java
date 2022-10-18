package Exam;

public class Circle implements Shape{

	int half;
	public Circle() {	}
	public Circle(int half) {	
		this.half=half;
	}
	
	
	@Override
	public double findArea() {
		double won =3.14*half*half;
	return won;
	}
}
