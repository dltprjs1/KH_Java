package khie;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * java 스트림의 종류
 * 1. 바이트 스트림 관련 클래스
 * 	  - 바이트 스트림 방식으로 데이터를 입출력하는 클래스
 * 	  ==> xxxInputStream / xxxOutputStream
 * 
 * 2. 문자 스트림 관련 클래스
 *    - 문자 스트림 방식으로 데이터를 입출력하는 클래스
 *    ==> xxxReader / xxxWriter
 * 
 * 3. 바이트 스트림 -> 문자 스트림으로 변환 관련 클래스
 * 	  ==>InputStreamReader / OutputStreamWriter
 */

/*
 * 입출력 관련 클래스 !
 * 
 * InputStreamReader : 키보드로 쓰고 1바이트씩 읽어오기, 객체생성시 매개변수에 System.in넣어야 콘솔에 키보드 입력 가능 
 * Reader : 읽어오기 (추상클래스) 생성자는 xxxReader
 * bufferedxxx: 보조스트림 처리 시간 단축 목적
 * FileInputStream : 파일 읽어오기
 * FileOutputStream : 파일 출력하기(복사)
 * File : 파일 속성,날짜 등등 설정하기
 * FileWriter : 파일(메모장 등) 안에 값 넣기 
 */

/*
 * 입출력 클래스 관련 메서드
 * InputStreamReader : 참조변수.read(); <-실제로 파일을 읽어 오는메서드, int타입으로 반환한다
 * Reader : 추상클래스라 객체선언시 다형성 필요, 참조변수.read(); <-실제로 파일을 읽어 오는메서드, int타입으로 반환한다
 * Bufferedxxx : 객체생성시 생성자의 매개변수에 스트림 참조변수를 넣어야 한다.
 * FileINputStream : 참조변수.read();
 * FileOutputStream : 참조변수.write(); <- 매개변수에 복사하고 싶은 파일 입력
 * File : 객체 생성 시 매개변수로 경로 설정  mkdir()<- 실제로 폴더를 만들어 주는 메서드 , createfile<- 실제로 파일을 만들어 주는 메서드
 * FileWriter : 객체 생성 시 매개변수에 경로 입력 참조변수.write() <-값을 입력할때 쓰는 메서드,매개변수에 값을 입력, 참조변수.newline <- 줄바꿈
 */
public class Ex03 {

	public static void main(String[] args) {
			
		System.out.println("입력 후 끝 이라고 입력하세요.");
		
		InputStreamReader isr = new InputStreamReader(System.in); // 콘솔에 키보드로 입력 하게 해주는 기능
		

		try {
			while(true) {
				int readByte = isr.read();				//콘솔에 키보드로 입력한 바이트들을 읽어 오는 기능
				
				if(readByte == '끝') {					//if '끝'이 입력될 경우 while문 빠져나옴
					break;
				}
				System.out.print((char)readByte);		//read() : int타입으로 반환되기 때문에 명시적 형변환을 해야한다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				isr.close();			//InputStreamReader 닫기 (try~catch 필요)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
