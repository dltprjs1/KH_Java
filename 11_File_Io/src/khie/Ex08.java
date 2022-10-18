package khie;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 *  - 파일 및 디렉토리(폴더)를 만들어 주는 클래스
 *  - 파일 입출력 시에 사용이 된다.
 *  - 파일 디렉토리에 대한 경로명, 크기, 타입, 수정 날짜 등의 속성을 제공하고 파일 삭제, 디렉토리 생성, 파일 이름 변경
 *    디렉토리 내의 파일 리스트 제공 등 다양한 파일 관리 작업을 지원한다.
 */
public class Ex08 {

	public static void main(String[] args) throws Exception {
		
		// C:/test 폴더가 있다.
		// C:/test/sample 폴더를 만들어 보자
		// C:/test/sample/sample.txt 파일을 만들어 보자
		File fi = new File("C:/test/sample");		//File클래스로 폴더 만들기 : File(경로+만들고자하는 폴더 이름)
		
		if(!fi.exists()) {
			fi.mkdir();  // mkdir() :  실제로 폴더를 만들어 주는 메서드
		}
		System.out.println("폴더 생성 완료 !!!");
		
		// 2. //C:/test/sample/sample.txt 파일을 만들기
		// 형식) new File(폴더경로, "파일명");
		
		File fi1 = new File("C:/test/sample","sample.txt");	//File클래스로 파일 만들기 : File(경로 , 만들고자하는 파일이름.타입 )
		
		if(!fi1.exists()) {
			fi1.createNewFile();	//createNewFile() : 실제로 파일을 만들어 주는 메서드
		}
		System.out.println("파일 생성 완료 !!!");
	}

}
