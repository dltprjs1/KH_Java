package khie;

import java.sql.*;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.40.80:1521:xe";
		String user = "web";
		String password = "@@Cwoo7848";
		
		System.out.println("수정할 메모 글 번호 : ");
		String num = scan.nextLine();		//nextLine() 메서드는 String자료형만 들어갈 수 있다. 출력할 시에 Integer.parseInt로 형변화 하여 사용 해야한다.
		
		System.out.println("메모 수정 제목 : ");
		String retitle = scan.nextLine();
		
		System.out.println("메모 수정 내용");
		String recont = scan.nextLine();
		
		Class.forName(driver);
		
		con = DriverManager.getConnection(url, user, password);
		String sql ="update memo set title = ?, cont = ? where bunho = ?";
		st = con.prepareStatement(sql);
		st.setString(1,retitle);
		st.setString(2,recont);
		//st.setInt(3,String.valueOf(num));
		st.setInt(3,Integer.parseInt(num));
		
		/*
		 * - sql문이 select sql문인 경우에는 executequery() 메서드를 이용하게 된다.
		 *  ==> ResultSet 반환
		 * 
		 * - sql문이 select가 아니느 insert,update,delete sql문인 경우에는 executeupdate() 메서드를 이용한다
		 *  ==> 반환형은 int형
		 *  ==> 반환형이 int인 이유: 행 삽입, 행 수정, 행 삭제 갯수를 표현한 것
		 *  ==> sql문이 정상적으로 실행이 되면 반환되는 값은 1이라는 값이 반환이 된다.
		 */
		
		int check =st.executeUpdate();
		
		if(check>0) {
			System.out.println("메모 수정 성공");
		}else {
			System.out.println("메모 수정 실패");
		}
		
	}

}
