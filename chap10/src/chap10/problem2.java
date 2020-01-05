package chap10;

import java.sql.*;
import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("쿼리를 입력하세요.");
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
						System.out.println("올바른 SQL 이 아닙니다.");
						continue;
					}

					ResultSetMetaData rsmt = rs.getMetaData();

					System.out.println("==============================================================");
					System.out.println("조회된 컬럼 수 " + rsmt.getColumnCount());

					PreparedStatement pstmt1 = conn.prepareStatement("select count(*) from (" + sql + ") a");
					ResultSet rs1 = pstmt1.executeQuery();
					rs1.next();
					System.out.println("조회된 레코드 수 " + rs1.getInt(1));
					System.out.printf("%-10s%-15s%-10s\n", "컬럼명", "컬럼타입", "NULL 허용");
					for (int i = 1; i <= rsmt.getColumnCount(); i++) {
						System.out.printf("%-10s %-10s (%3d) %-10s\n", rsmt.getColumnName(i), rsmt.getColumnTypeName(i),
								rsmt.getColumnDisplaySize(i), (rsmt.isNullable(i) == 0 ? "NOT NULL" : "NULL"));
					}

					System.out.println("==============================================================");

					for (int i = 1; i <= rsmt.getColumnCount(); i++) { // 조회된 컬럼의 갯수
						System.out.print(rsmt.getColumnLabel(i) + "\t"); // 조회된 컬럼의 순서에 맞는 컬럼명 전달
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
		System.out.println("프로그램 종료");
	}
}
