package khie;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {


	public static Connection getConnection() throws Exception {
		Connection con = null; //DB와 연결하는 객체
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.40.80:1521:xe";
		String user = "web";
		String password = "@@Cwoo7848";
		
		// 1단계 : 오라클 드라이버를 로딩
		// ==> 동적으로 로딩 : 프로그램을 실행 시에 오라클 드라이버를 로딩한다는 의미.
		Class.forName(driver);
		System.out.println("오라클 드라이버 로딩 성공!!!");
		
		// 2단계 : 오라클 데이터베이스와 연결 시도
		con = DriverManager.getConnection(url, user, password);
		
		return con;
		
	}
	
}
