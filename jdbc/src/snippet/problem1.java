package snippet;

import java.sql.*;
/*
 * 1.dept 테이블을 이용하여 서울 지역의 레코드만 detp_seoul 테이블로 생성하기
 * 2.dept_seoul 테이블에
 * deptno : 60, dname : 특수영업부, loc : 서울 레코드 추가
 * 3.dept_seoul 테블에
 * deptno : 60 레코드의 dname:특수영업1부 수정하기.
 * 4.dept_seoul 테이블의 모든 컬럼의 내용을 화면에 출력하기
 */


public class problem1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3. 드라이버 클래스를 로드하기
		Class.forName("org.mariadb.jdbc.Driver");
		//4. db와 Java를 연결하는 객체 생성하기
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		//문자열로 지정된 클래스를 메모리에 로드.
		
		//5. SQL 명령문을 DB에 전달하기 위한 객체 생성
		Statement stmt = conn.createStatement();

		String sql = "create table dept_seoul as select * from dept where loc = '서울'";
		int result = stmt.executeUpdate(sql);	//추가된 레코드 4개
		System.out.println("1. 결과 : "+result);
		
		sql = "insert into dept_seoul (deptno, dname, loc) values (60, '특수영업부', '서울')";
		result = stmt.executeUpdate(sql); //추가된 레코드 1개
		System.out.println("2. 결과 : "+result);
		
		sql = "Update dept_seoul set dname = '특수영업1부' where deptno = 60";
		result = stmt.executeUpdate(sql); //변경된 레코드 1개
		System.out.println("3. 결과 : "+result);
		
		ResultSet pp = stmt.executeQuery("select * from dept_seoul");
		while(pp.next()){ //한개의 레코드씩 조회
			System.out.print("번호  : "+pp.getString("deptno"));
			System.out.print(", 직급  : "+pp.getString("dname"));
			System.out.println(", 지역  : "+pp.getString("loc"));		
	}

}
}
