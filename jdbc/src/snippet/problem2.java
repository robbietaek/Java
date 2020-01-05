package snippet;

import java.sql.*;
//1��. �������� �а� ��ȸ�Ͽ�, �� �а��� ������ ���϶�
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
//			pstmt.setInt(1, rs1.getInt(1));		//rs1�� ��ȸ�� �÷� �� ù��° �÷�
//			System.out.println("=========================" + rs1.getInt(1));
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				System.out.printf("�̸�:%-5s,���̵�:%-7s,������:%5s,����:%-4d,�Ի���:%-10s,���ʽ�:%-4d,�а���ȣ:%-5d,�̸���:%-15s,URL:%-20s\n",
//						rs.getString("name"), rs.getString("id"), rs.getString("position"), rs.getInt("salary"),
//						rs.getString("hiredate"), rs.getInt("bonus"), rs.getInt("deptno"), rs.getString("email"),
//						rs.getString("url"));
//			}
//		}
//	}
//}

//2��. �������� �а� ��ȸ�Ͽ�, �ο����� 2���̻��� �а��� ������ ���϶�.
public class problem2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");

		PreparedStatement pstmt1 = conn.prepareStatement("select distinct deptno from professor group by deptno having count(*)>=2");
		PreparedStatement pstmt = conn.prepareStatement("select * from professor where deptno = ?");
		
		ResultSet rs1 = pstmt1.executeQuery();
		while (rs1.next()) {
			pstmt.setInt(1, rs1.getInt(1));		//rs1�� ��ȸ�� �÷� �� ù��° �÷�
			System.out.println("=========================" + rs1.getInt(1));
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("�̸�:%-5s,���̵�:%-7s,������:%5s,����:%-4d,�Ի���:%-10s,���ʽ�:%-4d,�а���ȣ:%-5d,�̸���:%-15s,URL:%-20s\n",
						rs.getString("name"), rs.getString("id"), rs.getString("position"), rs.getInt("salary"),
						rs.getString("hiredate"), rs.getInt("bonus"), rs.getInt("deptno"), rs.getString("email"),
						rs.getString("url"));
			}
		}
	}
}