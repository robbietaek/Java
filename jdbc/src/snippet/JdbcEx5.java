package snippet;

import java.sql.*;

public class JdbcEx5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");

		PreparedStatement pstmt = conn.prepareStatement("select * from emp");
		ResultSet rs = pstmt.executeQuery();	
		//조회된 내용의 정보 전달 객체
		ResultSetMetaData rsmt = rs.getMetaData();
		for(int i=1;i<=rsmt.getColumnCount();i++) {			//조회된 컬럼의 갯수
			System.out.print(rsmt.getColumnName(i) + "\t");	//조회된 컬럼의 순서에 맞는 컬럼명 전달
		}
		
		System.out.println();
		while(rs.next()) {
			for(int i=1; i<=rsmt.getColumnCount();i++) {
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}

}
