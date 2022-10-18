package khie;

/*
 * [문제] 숫자(1~100)를 생성하는 스레드 클래스와 영문자(A~Z)를 생성하는 스레드 클래스를 각각 정의하고
 * 	     스레드가 수행되도록 해 보자. 
 * 	 	 - 숫자 생성 스레드 : NumberThread ==> Thread클래스를 상속하여 생성
 * 		 - 영문자 생성 스레드 : AlphaThread ==> Runnable 인터페이스를 구현하여 생성
 */

class NumberThread extends Thread{
	@Override
	public void run() {
		int i=1;
		while(true) {
			System.out.println("i : "+i);
			i++;
			if(i>100) {
				break;
			}
		}
		
	}
}

class AlphaThread implements Runnable {

	@Override
	public void run() {
		char j='A';
		while(true) {
			System.out.println("j : "+j);
			j++;
			if(j>'Z') {
				break;
			}
		}
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		NumberThread num = new NumberThread();
		AlphaThread al = new AlphaThread();
		Thread alpha = new Thread(al);
		num.start();
		alpha.start();
		
		
	}

}
