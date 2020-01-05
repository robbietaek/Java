package snippet;
/*
 * Java 와 DBMS(Mariadb 사용) 연결하기
 * 1. 드라이버 파일(mariadb-java-client-2.4.2.jar) class path 연결. 사용도구 설정
 * 2. JDBC 관련 패키지 : java.sql.*
 * 3. 드라이버 클래스를 로드하기
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3. 드라이버 클래스를 로드하기
		Class.forName("org.mariadb.jdbc.Driver");
		//4. db와 Java를 연결하는 객체 생성하기
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		//문자열로 지정된 클래스를 메모리에 로드.
		
		//5. SQL 명령문을 DB에 전달하기 위한 객체 생성
		Statement stmt = conn.createStatement();
		//6. Statement 객체를 이용하여 Sql 구문 실행. 결과 얻기
//		ResultSet rs = stmt.executeQuery("select * from student");
		//7. 결과 조회
//		while(rs.next()){ //한개의 레코드씩 조회
//			System.out.print("학번  : "+rs.getString("studno"));
//			System.out.print(", 이름  : "+rs.getString("name"));
//			System.out.print(", 학년  : "+rs.getString("grade"));
//			System.out.print(", 키  : "+rs.getString("height"));
//			System.out.print(", 몸무게 : "+rs.getString("weight"));
//			System.out.println(", 학과코드  : "+rs.getString("major1"));
//		}
		
		ResultSet pp = stmt.executeQuery("select no,name,id,hiredate,salary,bonus,deptno from professor");
		while(pp.next()){ //한개의 레코드씩 조회
			System.out.print("교수번호  : "+pp.getString("no"));
			System.out.print(", 이름  : "+pp.getString("name"));
			System.out.print(", id  : "+pp.getString("id"));
			System.out.print(", 입사일  : "+pp.getString("hiredate"));
			System.out.print(", 급여 : "+pp.getString("salary"));
			System.out.print(", 보너스 : "+pp.getInt("bonus"));
			System.out.println(", 학과코드  : "+pp.getString("deptno"));		
	}

}
}
