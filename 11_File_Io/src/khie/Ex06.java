package khie;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/*
 * 1. FileInputStream / FileOutputStream
 *    - 1바이트 단위로 파일을 처리하는 바이트 기반 입출력 파일
 *    - 그림(이미지),오디오 파일,비디오 파일 등 모든 종류의 파일 처리가 가능
 *    
 * 
 * 2. FileReader / FileWriter
 *    - 2바이트 단위로 파일을 처리하는 문자 기반 입출력 파일 처리가 가능
 *    - 문자 단위로 파일을 처리하기 떄문에 그림, 오디오 파일을 처리할 수 없다.
 */   

public class Ex06 {

	public static void main(String[] args) throws Exception {
		
		long start,end;
		
		// 1. 바이트 스트림만을 이용하여 데이터를 읽어 오기
		FileInputStream fis = new FileInputStream("C:/test/koala.jpg");		
		
		start = System.nanoTime();			//nanoTime() : nanosecond로 기록 
		
		while(fis.read() != -1) {	}		
		
		end = System.nanoTime();
		
		System.out.println("바이트 스트림 만을 이용한 경우 : "+(end-start));
		
		System.out.println();
		
		fis.close();
		// 2. 바이트 스트림에 보조 스트림을 이용하여 데이터를 읽어 오기
		FileInputStream fis1 = new FileInputStream("C:/test/koala.jpg");
		BufferedInputStream bi = new BufferedInputStream(fis1);
		
		start = System.nanoTime();
		
		while(bi.read() != -1) {	}
		
		end = System.nanoTime();
		
		System.out.println("보조 스트림을 이용한 경우 : "+(end-start));
		
		System.out.println();
		bi.close();
		fis1.close();
	}

}
