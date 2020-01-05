package chap10;

import java.sql.*;
import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("������ �Է��ϼ���.");
			String sql = scan.nextLine();



				if (sql.equals("exit")) {
					break;
				}

				else {

					Class.forName("org.mariadb.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott",
							"1234");
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = null;
					
					try {
					rs = pstmt.executeQuery();
					} catch (SQLException s) {
						System.out.println("�ùٸ� SQL �� �ƴմϴ�.");
						continue;
					}

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
