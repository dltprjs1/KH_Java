package khie;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("한 줄을 입력하세요.");

		try {
			while(true) {

				int num = System.in.read();			//read() : int타입으로 반환

				if(num == '\n') {
					break;
				}
				System.out.println((char)num);		//한글은 입력이 안된다. byte스트림이기 때문에 한글 : 2~3byte
			}
		}
				catch (Exception e) {
				e.printStackTrace();
			}

	}

}
