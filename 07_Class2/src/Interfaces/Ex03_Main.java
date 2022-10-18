package Interfaces;

interface camera{
	//사진을 찍는 기능
	void photo();
}

interface DMB{
	//TV를 보는 기능
	void viewTv();
}

interface MP3{
	//음악을 듣는 기능
	void playMP3();
}

class MyPhone implements camera,DMB,MP3{	
	//기본클래스는 인터페이스를 상속받을 때 implements키워드 사용(extends X)

	@Override
	public void playMP3() {
		System.out.println("핸드폰으로 음악을 틀어요.");
	}

	@Override
	public void viewTv() {
		System.out.println("핸드폰으로 Tv를 봐요.");
	}

	@Override
	public void photo() {
		System.out.println("핸드폰으로 사진을 찍어요.");
	}
	
}
public class Ex03_Main {

	public static void main(String[] args) {
		
		MyPhone myphone = new MyPhone();	
		//인터페이스를 상속(implements)받은 일반클래스의 객체 생성 
		
		myphone.playMP3();
		myphone.photo();
		myphone.viewTv();
		
	}

}
