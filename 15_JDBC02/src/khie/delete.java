package khie;

import java.sql.*;

import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 학생의 학번을 입력하세요.");
		String hakbun = scan.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web","@@Cwoo7848");
		PreparedStatement st = con.prepareStatement("delete from student where hakbun = ?");
		st.setInt(1,Integer.parseInt(hakbun));
		int res = st.executeUpdate();
		
		if(res>0) {
			System.out.println("delete 성공");
		}else {
			System.out.println("delete 실패");
		}
	}

}
