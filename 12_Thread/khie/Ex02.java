package khie;

/*
 * ������(Thread)?
 * - process�� ���� ������ �ɰ��� ���� �۾� ����
 *   ==> ���� ���α׷��� ����Ǵ� �۾��� �ּ� ����
 * - ������� ���� ó���� �����Ѵ�.(��Ƽ�׽�ŷ)
 * - ����о� : ����, ä��, ��� 
 */

/*
 * [������ Ŭ���� �ۼ��ϴ� ��� - 2����]
 * 1. Thread ��� Ŭ������ ���(extends) �Ͽ� ����ϴ� ���
 * 2. Runnable �������̽��� ����(Implements)�Ͽ� ����ϴ� ���
 */

/*
 * 1. Thread��� Ŭ������ ���(extends)�Ͽ� ����ϴ� ���
 *  1) Thread��� Ŭ������ ���(extends)�� ����
 *  2) run() �޼��带 ������ - ������ ����
 *  3-1) ������ Ŭ���� ��ü ����
 *  3-2) �������� .start() �޼��� ȣ�� ==> run() �޼��� 
 */

class Thread1 extends Thread{   //ThreadŬ���� extendsŰ����� ��ӹޱ�
	@Override
	public void run() {			//run �޼��� �������̵� ���ֱ�
		int i = 1;
		
		while(true) {
			System.out.println("i : "+i);
			i++;
		}
		
		
	}
	
}
class Thread2 extends Thread{
	
	@Override
	public void run() {
	int j = 1;
		
		while(true) {
			System.out.println("j : "+j);
			j++;
		}
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();			// run�޼��带 ȣ���Ѵ�.
		t2.start();			// run�޼��带 ȣ���Ѵ�.
		
	}

}
