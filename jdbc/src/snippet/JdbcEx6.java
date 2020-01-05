package snippet;

import java.sql.*;


/*
 * Bean 클래스를 이용하여 데이터 저장 및 조회하기.
 */
public class JdbcEx6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		PreparedStatement pstmt = conn.prepareStatement("select count(*) from (select * from emp) a");
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		Emp[] emps = new Emp[count];
		pstmt.close();
		pstmt = conn.prepareStatement("select * from emp");
		rs = pstmt.executeQuery();
		int i = 0;
		while (rs.next()) {
			Emp e = new Emp();
			e.setEmpno(rs.getInt("empno"));
			e.setEname(rs.getString("ename"));
			e.setJob(rs.getString("job"));
			e.setMgr(rs.getString("Mgr"));
			e.setBirthday(rs.getTimestamp("Birthday"));
			e.setHiredate(rs.getTimestamp("Hiredate"));
			e.setSalary(rs.getInt("Salary"));
			e.setBonus(rs.getInt("Bonus"));
			e.setBonus(rs.getInt("deptno"));
			emps[i++] = e;
		}
		conn.close();
		for(Emp e : emps) {
			System.out.println(e);
		}
		
	}
}
