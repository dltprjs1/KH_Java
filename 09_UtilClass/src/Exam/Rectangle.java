package Exam;

public class Rectangle implements Shape {
	int weith;
	int height;
	public Rectangle() { }
	public Rectangle(int weith,int height) {
		this.weith=weith;
		this.height=height;
	}
	@Override
	public double findArea() {
		double myeon =weith*height; 
		return myeon;
	}
	
	
}
