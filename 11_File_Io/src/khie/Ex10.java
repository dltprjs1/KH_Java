package khie;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10 {

	public static void main(String[] args) {
		
		File temp = new File("C:/Windows/Temp");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a  HH:mm");   // y : 연도/ M : 월/ d : 일/a : 오전오후/ H : 시/m : 분 
		
		
		// listFiles() : 디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 확인하여 File 객체 배열로 반환해 주는 메서드
		
		File contents [] = temp.listFiles();
		
		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("-----------------------------------------------");
		
		//lastModified() : 마지막 수정날짜 및 시간 반환해주는 메서드
		//getName() : 파일의 이름을 반환해주는 메서드
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+ file.getName());
			}else {
				System.out.print("\t\t"+file.length()+"\t"+file.getName());
			}
			
			System.out.println();
		}
	}

}
