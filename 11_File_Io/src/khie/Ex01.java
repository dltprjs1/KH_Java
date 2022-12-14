package khie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * java에서의 입출력 방식
 * - 스트림이라는 방식을 이용한다.
 * - 스트림의 사전적 의미 : 시냇물이라는 뜻을 가지고 있다. 데이터가 물 흐르는 것처럼 흐른다고 생각하면 됨
 * - java에서의 스트림 : 순서가 있는 일련의 연속된 데이터
 * - 스트림의 종류
 *   1) 바이트 스트림 : 1바이트 단위로 데이터를 입출력(byte)
 *   2) 문자 스트림 : 2바이트 단위로 데이터를 입출력(char)
 * - java입출력 관련 클래스 : java.io 패키지에 존재한다.
 * 		==> 해당 패키지에 있는 클래스들을 이용하여 파일을 입출력한다
 * - checked방식의 예외 처리기 적용
 * - java의 입출력은 단방향성 ==> 한쪽으로만 입력되고 출력된다
 * - FIFO(First In First Out) : 먼저 입력되고 먼저 입력된 게 먼저 출력된다. 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		//바이트스트림 방식
		InputStream is = null;
		
		try {
			is = new FileInputStream("c:/test/text.txt");
			
			while(true) {
				int readByte = is.read();
				
				//read()메서드로 파일을 읽을 떄 더 이상 읽을 데이터가 없는 경우에는 -1이라는 값을 반환한다.
				if(readByte == -1) {
					return;
				}
				System.out.print((char)readByte);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
