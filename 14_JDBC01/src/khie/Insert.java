package khie;

import java.sql.*;

import java.util.Scanner;


public class Insert {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		System.out.println("메모 제목 : ");
		String title = scan.nextLine();
		
		System.out.println("메모 작성자 : ");
		String writer = scan.nextLine();
		
		System.out.println("메모 내용 : ");
		String cont = scan.nextLine();
		
		String sql ="insert into memo values(memo_seq.nextval, ?, ?, ?,sysdate)";  // ? : nextline() 메소드에서 처리한다.
		//String sql = "insert into memo values("memo_seq.nextvalues,"+title+","+writer+","+con",sysdate);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,"web","@@Cwoo7848");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,title);               //?에 값을 넣어주는 메서드 setString(물음표 위치, 변수)
			st.setString(2,writer);              //?에 값을 넣어주는 메서드 setString(물음표 위치, 변수)
			st.setString(3,cont);                //?에 값을 넣어주는 메서드 setString(물음표 위치, 변수)
			//st.setInt(parameterIndex, x);      Int도 들어갈 수 있다.
			//ResultSet rs = st.executeQuery(); << update,insert,delete는 ResultSet 클래스를 사용하지 않는다.
			
			/*
			 * - sql문이 select sql문인 경우에는 executequery() 메서드를 이용하게 된다.
			 *  ==> ResultSet 반환
			 * 
			 * - sql문이 select가 아니느 insert,update,delete sql문인 경우에는 executeupdate() 메서드를 이용한다
			 *  ==> 반환형은 int형
			 *  ==> 반환형이 int인 이유: 행 삽입, 행 수정, 행 삭제 갯수를 표현한 것
			 *  ==> sql문이 정상적으로 실행이 되면 반환되는 값은 1이라는 값이 반환이 된다.
			 */
			
			int res = st.executeUpdate();
			
			if(res>0) {
				System.out.println("메모 추가 성공 !!!");
			}else {
				System.out.println("메모 추가 실패");
			}
			
			con.close();
			st.close();
			
	}

}
