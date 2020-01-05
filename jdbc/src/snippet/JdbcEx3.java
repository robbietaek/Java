package snippet;

import java.sql.*;

/*
 * PreparedStatement ����
 * ���� �������༭ ������ �̸� �صд�. ����ǥ�� �� �� �ִ�.
 * Statement�� ���� �������̽���
 */
public class JdbcEx3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		PreparedStatement pstmt = conn.prepareStatement("select * from student where grade =?");
		for(int i=1;i<=4;i++) {
		pstmt.setInt(1, i); //1 => ù��° ����ǥ��  , 2=> ������ ������ i�� �Է��ض�.
		System.out.println("----------------------"+i+"�г�--------------------------------");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("�й�:%7s,�̸�:%5s,�г�:%3d,Ű:%5.2f,������:%5.2f,�а��ڵ�:%-5s\n",
					rs.getString("studno"),	//studno �÷��� String Ÿ������ ����
					rs.getString("name"),
					rs.getInt("grade"),	//grade �÷��� int Ÿ������ ����
					rs.getDouble("height"),	//height �÷��� double Ÿ������ ����
					rs.getDouble("weight"),
					rs.getString("major1"));
		}
		}

	}

}
