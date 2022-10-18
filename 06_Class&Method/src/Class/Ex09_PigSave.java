package Class;

public class Ex09_PigSave {

	public static void main(String[] args) {
		
		//돼지 저금통 객체 생성
		
		PigSave save = new PigSave(0);
		
		save.deposit(30000); 		//입금 메서드 호출
		save.withdraw(40000); 		//출금 메서드 호출
		save.deposit(10000); 		//입금 메서드 호출
		save.deposit(20000); 		//입금 메서드 호출
		save.withdraw(50000); 		//출금 메서드 호출
		
		
		// error 발생 = 멤버변수 balnace를 private으로 접근제한
		//save.balance = 100000;		//이렇게 접근을 하면 안됨.
	}

}
