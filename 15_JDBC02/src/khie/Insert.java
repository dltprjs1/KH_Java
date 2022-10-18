package khie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement st = null;
		//ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번 입력 : ");
		String hakbun = scan.nextLine();
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("학과 입력 : ");
		String major = scan.nextLine();
		System.out.println("나이 입력 : ");
		String age = scan.nextLine();
		System.out.println("전화번호 입력 : ");
		String phone = scan.nextLine();
		System.out.println("주소 입력 : ");
		String addr = scan.nextLine();
		
		conn = DBconnection.getConnection();
		st = conn.prepareStatement("insert into student values(?,?,?,?,?,?,sysdate)");
		st.setString(1,hakbun);
		st.setString(2,name);
		st.setString(3,major);
		st.setInt(4,Integer.parseInt(age));
		st.setString(5,phone);
		st.setString(6,addr);
		
		int student = st.executeUpdate();
		if(student>0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
		
	}

}
