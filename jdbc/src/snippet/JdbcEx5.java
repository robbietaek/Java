package snippet;

import java.sql.*;

public class JdbcEx5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");

		PreparedStatement pstmt = conn.prepareStatement("select * from emp");
		ResultSet rs = pstmt.executeQuery();	
		//��ȸ�� ������ ���� ���� ��ü
		ResultSetMetaData rsmt = rs.getMetaData();
		for(int i=1;i<=rsmt.getColumnCount();i++) {			//��ȸ�� �÷��� ����
			System.out.print(rsmt.getColumnName(i) + "\t");	//��ȸ�� �÷��� ������ �´� �÷��� ����
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
