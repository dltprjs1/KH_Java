package khie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 학생의 학번 입력 : ");
		String hakbun = scan.nextLine();
		System.out.println("학과 수정 입력 : ");
		String major = scan.nextLine();
		System.out.println("나이 수정 입력 : ");
		String age = scan.nextLine();
		System.out.println("연락처 수정 입력 : ");
		String phone = scan.nextLine();
		System.out.println("주소 수정 입력 : ");
		String addr = scan.nextLine();
		
		Connection conn =null;
		
		conn = DBconnection.getConnection();
		
		PreparedStatement st = conn.prepareStatement("update student set major = ?,age = ?, phone = ?, addr = ? where hakbun = ?");
		
		st.setString(1,major);
		st.setInt(2,Integer.parseInt(age));
		st.setString(3,phone);
		st.setString(4,addr);
		st.setString(5, hakbun);
		
		int res = st.executeUpdate();
		
		if(res>0) {
			System.out.println("update 성공");
		}else {
			System.out.println("update 실패");
		}
		
		conn.close();
		st.close();
		scan.close();
	}

}
