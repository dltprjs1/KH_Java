package khie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("C:\\NCS\\workspace(java)\\11_File_Io\\src\\khie\\Ex03.java");
			
			//Reader 클래스는 추상클래스 이므로 다형성을 통해 FileReader라는 생성자(파일경로) 호출
			
			while(true) {
				int readByte = reader.read();	//File경로의 파일을 읽어오기(read() : int타입으로 반환)
			if(readByte == -1) {				//if 읽어올게 더 이상 없다면(readByte == -1) while문 탈출
				break;
			}
			System.out.print((char)readByte);	// char자료형을 통해 int 타입의 readByte를 형변환시켜 반환
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
