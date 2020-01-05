package snippet;
/*
 * PreparedStatement 예제
 */

import java.sql.*;

public class JdbcEx4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");

		String sql = "create table login (id varchar(10) primary key, password varchar(10))";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate();	//login 테이블이 생성되었다.
		System.out.println("login 테이블 create :"+ result);
		
		pstmt.close();	//넘어간 sql 구문을 종료해버린다. preparedstatement가 쓸일이 없다.
		
		sql = "insert into login (id, password) values(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "hongkd");
		pstmt.setString(2, "홍길동");
		result = pstmt.executeUpdate();	//insert 구문 실행
		System.out.println("홍길동 insert : "+result);
		
		pstmt.setString(1, "sagatk");
		pstmt.setString(2, "김삿갓");
		result = pstmt.executeUpdate();	//insert 구문 실행
		System.out.println("김삿갓 insert : "+result);
		
		pstmt.setString(1, "monglee");
		pstmt.setString(2, "이몽룡");
		result = pstmt.executeUpdate();	//insert 구문 실행
		System.out.println("이몽룡 insert : "+result);
		
		pstmt.close();	//넘어간 sql 구문을 종료해버린다.
		
		sql = "select * from login";
		pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("아이디 : %-12s, 이름 : %-12s\n",
			rs.getString(1),rs.getString(2));
		}
		
		pstmt.close(); //사실은 필요없다.
		
		sql = "drop table login";
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeUpdate();
		
		System.out.println("login 테이블 drop : "+ result);
		conn.close(); //이걸 해주는게 좋다.
		// 오후에 뭐할래
	}

}
