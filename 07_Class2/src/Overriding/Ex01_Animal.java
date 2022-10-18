package Overriding;

public class Ex01_Animal {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		dog.sound();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println();
		
		Tiger tiger = new Tiger();
		tiger.sound();
	}

}
