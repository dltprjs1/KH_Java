package khie;

/*
 * [ATM Ŭ���� ���輭]
 * - �Աݰ� ����� ���� �ŷ��� ������ ATM ���� Ŭ���� ����
 * - ���� �ܾ� : private int balance;
 * - ������ : ���� �ܾ�(balance) �ʱ�ȭ
 * - deposit() : �ܺ� Ŭ�������� �Ա��ϴ� �޼���
 * 	 ��) balance = balance + money; //�ܾ׿� �Աݾ�
 * 	  ��¹� : OO,OOO���� �Ա��Ͽ� OO,OOO���� ����
 * - withdraw() : �ܺ� Ŭ�������� ����ϴ� �޼���
 * 	 ��) balance = balance - money; //�ܾ׿��� ���
 * 	  ��¹� : 00,000���� ����Ͽ� 00,000�� ����
 * 		(��, balance < money �� ��� "�ܾ��� �����մϴ�."��� �޼��� ���
 */

/*
 * synchronized Ű����
 * - ������ ����ȭ�� ������ ��ɾ�.
 * - �ָ� �����忡 ���ؼ� ������ �޼��峪 Ŭ������ ������� �Ӱ� ����(critical section)�� ����
 * - �Ӱ� �������� ������ �޼��忡���� ���� ���� ������ ������
 *   ������ ����� ������ ������ ������� ����ϴ� ��ɾ�
 * - �����Ǵ� �ڿ��� ��κ� static Ű���带 ���� ��ü�� ���Ѵ�.
 */

class ATM{
	private int balance;

	public ATM() { }
	public ATM(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int money) {
		balance +=money;
		System.out.println(Thread.currentThread().getName()+"����"+money+"���� �Ա��Ͽ� "+balance+"���� ���ҽ��ϴ�.");
	}
	public synchronized void withdraw(int money) {
		if(balance < money) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;		//if�� ���� return : ���� �������� �޼��带 �����Ű�� ��ɾ�
		}
		balance -=money;
		System.out.println(Thread.currentThread().getName()+"����"+money+"���� ����Ͽ� "+balance+"���� ���ҽ��ϴ�.");
	}

}

//�����带 ���� �� Ŭ���� 
class User extends Thread{
	
	ATM atm;
	
	public User() { 	}
	public User(ATM atm, String name) {
		super(name);
		this.atm = atm;
	}
	@Override
	public void run() {
		this.atm.deposit(20000);
		this.atm.withdraw(30000);
	}
}

public class Ex07 {


	public static void main(String[] args) {

		ATM atm = new ATM(0);
		
		//User Ŭ������ ������� ��Ƽ ������ ��ü ����
		
		User user1 = new User(atm,"ȫ�浿");
		User user2 = new User(atm,"�̼���");
		User user3 = new User(atm,"������");
		User user4 = new User(atm,"�̰�");
		User user5 = new User(atm,"������");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
	}
}
