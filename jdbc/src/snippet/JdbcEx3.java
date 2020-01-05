package snippet;

import java.sql.*;

/*
 * PreparedStatement 예제
 * 먼저 전달해줘서 번역을 미리 해둔다. 물음표를 쓸 수 있다.
 * Statement의 하위 인터페이스임
 */
public class JdbcEx3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		PreparedStatement pstmt = conn.prepareStatement("select * from student where grade =?");
		for(int i=1;i<=4;i++) {
		pstmt.setInt(1, i); //1 => 첫번째 물음표는  , 2=> 정수형 값으로 i를 입력해라.
		System.out.println("----------------------"+i+"학년--------------------------------");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("학번:%7s,이름:%5s,학년:%3d,키:%5.2f,몸무게:%5.2f,학과코드:%-5s\n",
					rs.getString("studno"),	//studno 컬럼을 String 타입으로 리턴
					rs.getString("name"),
					rs.getInt("grade"),	//grade 컬럼을 int 타입으로 리턴
					rs.getDouble("height"),	//height 컬럼을 double 타입으로 리턴
					rs.getDouble("weight"),
					rs.getString("major1"));
		}
		}

	}

}
