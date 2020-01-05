package snippet;
/*
 * PreparedStatement ����
 */

import java.sql.*;

public class JdbcEx4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");

		String sql = "create table login (id varchar(10) primary key, password varchar(10))";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate();	//login ���̺��� �����Ǿ���.
		System.out.println("login ���̺� create :"+ result);
		
		pstmt.close();	//�Ѿ sql ������ �����ع�����. preparedstatement�� ������ ����.
		
		sql = "insert into login (id, password) values(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "hongkd");
		pstmt.setString(2, "ȫ�浿");
		result = pstmt.executeUpdate();	//insert ���� ����
		System.out.println("ȫ�浿 insert : "+result);
		
		pstmt.setString(1, "sagatk");
		pstmt.setString(2, "���");
		result = pstmt.executeUpdate();	//insert ���� ����
		System.out.println("��� insert : "+result);
		
		pstmt.setString(1, "monglee");
		pstmt.setString(2, "�̸���");
		result = pstmt.executeUpdate();	//insert ���� ����
		System.out.println("�̸��� insert : "+result);
		
		pstmt.close();	//�Ѿ sql ������ �����ع�����.
		
		sql = "select * from login";
		pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("���̵� : %-12s, �̸� : %-12s\n",
			rs.getString(1),rs.getString(2));
		}
		
		pstmt.close(); //����� �ʿ����.
		
		sql = "drop table login";
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeUpdate();
		
		System.out.println("login ���̺� drop : "+ result);
		conn.close(); //�̰� ���ִ°� ����.
		// ���Ŀ� ���ҷ�
	}

}
