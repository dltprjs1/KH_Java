package khie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) throws Exception {
		
		Connection conn = null;	
		// 1단계 + 2단계 ==> 메서드 호출
		conn = DBconnection.getConnection();
		if(conn!=null) {
			System.out.println("데이터베이스 연결 성공");
		}else {
			System.out.println("데이터베이스 연결 실패");
		}
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "@@Cwoo7848");
		PreparedStatement st = conn.prepareStatement("select * from student order by hakbun desc");
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			String hakbun = rs.getString("hakbun");
			String name = rs.getString("name");
			String major = rs.getString("major");
			String phone = rs.getString("phone");
			String addr = rs.getString("addr");
			String regdate = rs.getString("regdate");
			int age = rs.getInt("age");
			
			System.out.println(hakbun+"\t"+name+"\t"+major+"\t\t"+age+"\t"+phone+"\t"+addr+"\t"+regdate.substring(0,10));
		}
		conn.close();
		st.close();
		rs.close();
	}

}
