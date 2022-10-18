package khie;

import java.io.*;

/*
 * 파일 복사
 *  - Koala.jpg : 원본 이미지 파일
 *  - copied.jpg : 복사 이미지 파일
 */
public class Ex07 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/test/Koala.jpg");		//FileInputStream : 이미지 파일을 가져오기
		
		FileOutputStream fos = new FileOutputStream("C:/test/Koala(1).jpg");//FileoutputStream : 이미지 파일을 출력하기
		
		while(true) { 
			int readByte = fis.read();			//FileInputStream을 통해 읽어온 파일을 readByte에 담기
			
			if(readByte == -1) {
				break;
			}
			
			fos.write(readByte);				//FileoutStream을 통해 readByte에 담겨 있는 데이터를 읽어오기 
		}
		
		//입출력 닫기
		fis.close();
		fos.close();
		
		System.out.println("이미지 복사 완료");
	}

}
