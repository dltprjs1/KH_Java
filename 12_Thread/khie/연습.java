package khie;

class aa extends Thread {
	
	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			System.out.println("i : "+i);
			i++;
			
			if(i>100) {
				break;
			}
		}
		
	}
	
}
class bb extends Thread {
	
	@Override
	public void run() {
		int j = 1;
		
		while(true) {
			System.out.println("j : "+j);
			j++;
			
			if(j>100) {
				break;
			}
		}
	}
}

public class 연습 {

	public static void main(String[] args) {
		
		aa a = new aa();
		
		bb b = new bb();
		
		a.start();
		b.start();
		
	}

}
