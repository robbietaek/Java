package snippet;

import java.sql.*;
import java.util.Scanner;

public class MenuEx1 {

	static Connection conn;
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요.");
			System.out.println("====================================================");
			System.out.println("1번 = 데이터 추가");
			System.out.println("2번 = 데이터 변경");
			System.out.println("3번 = 데이터 삭제");
			System.out.println("4번 = 데이터 조회");
			System.out.println("9번 = 끝내기");
			System.out.println("====================================================");
			int no = scan.nextInt();

			if (no == 9) {
				break;
			}

			switch (no) {
			case 1:
				insert();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				select();
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

	private static void select() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("select * from menu");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Menu m = new Menu(rs.getInt("no"), rs.getString("name"), rs.getInt("price"));
			System.out.println(m);
		}
	}

	private static void delete() throws SQLException {
		select();
		System.out.println("삭제할 주문번호를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		PreparedStatement pstmt = conn.prepareStatement("delete from menu where no = ?");
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
		System.out.println("데이터를 삭제했습니다.");

	}

	private static void update() throws SQLException {
		System.out.println("변경할 주문번호를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();

		PreparedStatement pstmt = conn.prepareStatement("select * from menu where no = ?");
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {

			Menu m = new Menu(rs.getInt("no"), rs.getString("name"), rs.getInt("price"));
			System.out.println(m);
			System.out.println(m.getName() + "번 메뉴를 바꾸시겠습니까? (y/n)");

			String ys = scan.next();
			if (ys.equalsIgnoreCase("y")) {
				System.out.println("변경할 이름을 입력하세요.");
				String name = scan.next();
				m.setName("name");
			}
			
			if (ys.equalsIgnoreCase("y")) {
				System.out.println("변경할 가격을 입력하세요.");
				int price = scan.nextInt();
				m.setName("price");
			}			
		}
		
		pstmt.close();
		pstmt.set

	}

	private static void insert() throws SQLException {
		Scanner scan = new Scanner(System.in);

		System.out.println("메뉴 이름을 입력하세요.");
		String name = scan.next();
		System.out.println("메뉴 가격을 입력하세요");
		int price = scan.nextInt();

		PreparedStatement pstmt = conn.prepareStatement("insert into menu (name, price) values (?,?)");
		pstmt.setString(1, name);
		pstmt.setInt(2, price);
		pstmt.executeUpdate();

		System.out.println("추가를 완료했습니다.");

	}

}
