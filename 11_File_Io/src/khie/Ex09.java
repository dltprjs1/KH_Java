package khie;

import java.io.*;

public class Ex09 {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:/test/sample/sample.txt");	//FileWriter클래스 : FileWriter(파일경로) 작성할 파일의 지정한다.
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("================================================");
		bw.newLine(); 	//다음줄로 이동
		
		bw.write("kh정보교육원 종로지점");
		bw.newLine();
		
		bw.write("스마트웹&콘텐츠 웹어플리케이션 개발자 양성과정 - D강의실");
		bw.newLine();
		
		bw.write("여러분 모두 취업합시다!!! 화이팅!!!!");
		bw.newLine();
		
		bw.write("================================================");
		bw.newLine();
		
		bw.flush();  	//버퍼에 있는 데이터를 모두 출력시키는 메서드
		
		//입출력 객체를 닫아주기
		bw.close();fw.close();
		System.out.println("파일 저장 완료");
		
	}

}
