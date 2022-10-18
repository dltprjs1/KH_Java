package Abstracts;

public class Ex03_SmartPhone {

	public static void main(String[] args) {
		
		Iphone iphone =new Iphone();
		Gallaxy gallaxy = new Gallaxy();
		
		iphone.spec();
		iphone.purpose();
		System.out.println();
		gallaxy.spec();
		gallaxy.purpose();
	}

}
