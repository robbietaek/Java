package snippet;

import java.sql.*;
//1번. 교수들의 학과 조회하여, 각 학과별 교수를 구하라
//public class problem2 {
//
//	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Class.forName("org.mariadb.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
//
//		PreparedStatement pstmt1 = conn.prepareStatement("select distinct deptno from professor where deptno is not null");
//		PreparedStatement pstmt = conn.prepareStatement("select * from professor where deptno = ?");
//		
//		ResultSet rs1 = pstmt1.executeQuery();
//		while (rs1.next()) {
//			pstmt.setInt(1, rs1.getInt(1));		//rs1에 조회된 컬럼 중 첫번째 컬럼
//			System.out.println("=========================" + rs1.getInt(1));
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				System.out.printf("이름:%-5s,아이디:%-7s,포지션:%5s,연봉:%-4d,입사일:%-10s,보너스:%-4d,학과번호:%-5d,이메일:%-15s,URL:%-20s\n",
//						rs.getString("name"), rs.getString("id"), rs.getString("position"), rs.getInt("salary"),
//						rs.getString("hiredate"), rs.getInt("bonus"), rs.getInt("deptno"), rs.getString("email"),
//						rs.getString("url"));
//			}
//		}
//	}
//}

//2번. 교수들의 학과 조회하여, 인원수가 2명이상인 학과의 교수를 구하라.
public class problem2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");

		PreparedStatement pstmt1 = conn.prepareStatement("select distinct deptno from professor group by deptno having count(*)>=2");
		PreparedStatement pstmt = conn.prepareStatement("select * from professor where deptno = ?");
		
		ResultSet rs1 = pstmt1.executeQuery();
		while (rs1.next()) {
			pstmt.setInt(1, rs1.getInt(1));		//rs1에 조회된 컬럼 중 첫번째 컬럼
			System.out.println("=========================" + rs1.getInt(1));
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("이름:%-5s,아이디:%-7s,포지션:%5s,연봉:%-4d,입사일:%-10s,보너스:%-4d,학과번호:%-5d,이메일:%-15s,URL:%-20s\n",
						rs.getString("name"), rs.getString("id"), rs.getString("position"), rs.getInt("salary"),
						rs.getString("hiredate"), rs.getInt("bonus"), rs.getInt("deptno"), rs.getString("email"),
						rs.getString("url"));
			}
		}
	}
}