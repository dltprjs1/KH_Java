package inheritance;

public class Ex02_car2 {

	public static void main(String[] args) {
		
		Avante avante = new Avante();
		//car2클래스를 상속받은 Avante클래스의 참조변수 생성
		avante.cc=1500;
		avante.door = 4;
		avante.output();
	}
}

