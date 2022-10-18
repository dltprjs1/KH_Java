package khie;

import java.sql.*;


public class Select {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.40.80:1521:xe";
		String user = "web";
		String password = "@@Cwoo7848";
	
		try {
			// 1단계 : 오라클 드라이버를 로딩
			// ==> 동적으로 로딩 : 프로그램을 실행 시에 오라클 드라이버를 로딩한다는 의미.
			Class.forName(driver);
			System.out.println("오라클 드라이버 로딩 성공!!!");
			
			// 2단계 : 오라클 데이터베이스와 연결 시도
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("오라클 데이터베이스 연결 성공!!!");
			}
			
			// 3단계 : 데이터베이스에 SQL문을 전송하기 위한 쿼리문을 작성
			String sql = "select * from memo order by bunho desc";
			pstmt = con.prepareStatement(sql);
			
			// 4단계 : 데이터베이스에 SQL문을 전송 및 실행
			// ResultSet은 select문의 결과를 저장하는 객체이다.
			rs=pstmt.executeQuery();
			
			// 5단계 : 데이터를 가져와서 출력
			while(rs.next()) {
				//int deptno = rs.getInt("deptno");
				//String dname = rs.getString("dname");
				//String loc = rs.getString("loc");
				
				int bunho = rs.getInt("bunho");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regdate = rs.getString("regdate").substring(0,10);
				String cont = rs.getString("cont");
				
				System.out.println(bunho+"\t"+title+"\t"+writer+"\t"+cont+"\t\t"+regdate);
			}
			// 6단계 : 연결되어 있던 객체를 종료시키기
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
