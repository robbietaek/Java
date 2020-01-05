package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * �ֿܼ��� select ������ �Է¹޾� ȭ�鿡 ����ϱ�.
 * 
 * �̶� �÷���1 �÷��� 2 
 * ��1		 ��2
 */
public class problem3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		while (true) {

			System.out.println("������ �Է��ϼ���.");

			Scanner scan = new Scanner(System.in);
			String sql = scan.nextLine();

			if (sql.equals("exit")) {
				break;
			}

			else {

				Class.forName("org.mariadb.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				ResultSetMetaData rsmt = rs.getMetaData();

				System.out.println("==============================================================");
				System.out.println("��ȸ�� �÷� �� " + rsmt.getColumnCount());

				PreparedStatement pstmt1 = conn.prepareStatement("select count(*) from (" + sql + ") a");
				ResultSet rs1 = pstmt1.executeQuery();
				rs1.next();
				System.out.println("��ȸ�� ���ڵ� �� " + rs1.getInt(1));
				System.out.printf("%-10s%-15s%-10s\n", "�÷���", "�÷�Ÿ��", "NULL ���");
				for (int i = 1; i <= rsmt.getColumnCount(); i++) {
					System.out.printf("%-10s %-10s (%3d) %-10s\n", rsmt.getColumnName(i), rsmt.getColumnTypeName(i),
							rsmt.getColumnDisplaySize(i), (rsmt.isNullable(i) == 0 ? "NOT NULL" : "NULL"));
				}

				System.out.println("==============================================================");

				for (int i = 1; i <= rsmt.getColumnCount(); i++) { // ��ȸ�� �÷��� ����
					System.out.print(rsmt.getColumnLabel(i) + "\t"); // ��ȸ�� �÷��� ������ �´� �÷��� ����
				}

				System.out.println();
				while (rs.next()) {
					for (int i = 1; i <= rsmt.getColumnCount(); i++) {
						System.out.print(rs.getString(i) + "\t");
					}
					System.out.println();
				}

			}

		}
		System.out.println("���α׷� ����");
	}

}
