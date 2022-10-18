package khie;

import java.sql.*;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 메모 번호 : ");
		int memonum = scan.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "@@Cwoo7848");
		PreparedStatement st = con.prepareStatement("delete from memo where bunho = ?");
		st.setInt(1,memonum);
		int result = st.executeUpdate();
		
		if(result>0) {
			System.out.println("메모 삭제 성공");
		}else {
			System.out.println("메모 삭제 실패");
		}
		
		con.close();
		st.close();
		scan.close();

	}

}
