package test20190916;

import java.sql.*;
import java.util.Scanner;

public class KKTFAMILYEX1 {

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
			System.out.println("===========메뉴를 선택하세요===========");
			System.out.println("1 : 가족회원추가");
			System.out.println("2 : 가족회원변경");
			System.out.println("3 : 가족회원탈퇴");
			System.out.println("4 : 가족회원목록조회");
			System.out.println("9 : 프로그램 종료");
			System.out.println("==================================");

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
		System.out.println("프로그램 종료");
	}

	private static void select() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("select * from KKTFAMILY");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			System.out.printf("가족 번호 : %-3d , 가족 이름 : %-4s , 가족 나이 : %-3d , 가족 직업 : %-4s , 가족 성별 : %-4s \n",
					rs.getInt("no"), 
					rs.getString("name"), 
					rs.getInt("age"), 
					rs.getString("job"),
					(rs.getInt("gender")) == 1 ? "남자" : "여자");
		}
	}

	private static void delete() throws SQLException {
		select();
		System.out.println("회원탈퇴할 가족회원번호를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		PreparedStatement pstmt = conn.prepareStatement("delete from KKTFAMILY where no = ?");
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
	}

	private static void update() throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("변경할 가족회원의 번호를 입력하세요. : ");
		int no = scan.nextInt();

		PreparedStatement pstmt = conn.prepareStatement("select * from KKTFAMILY where no = ?");
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			KKTFAMILY kkt = new KKTFAMILY(rs.getInt("no"), rs.getString("name"), rs.getInt("age"), rs.getString("job"),
					rs.getInt("gender"));
			Scanner Scan = new Scanner(System.in);

			select();

			System.out.print("가족 이름 : " + kkt.getName() + " 변경하시겠습니까? (Y/N)");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 이름을 입력 : ");
				String name = scan.next();
				kkt.setName(name);
			}

			System.out.print("현재 나이 : " + kkt.getAge() + " 변경하시겠습니까? (Y/N)");
			yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 나이를 입력 : ");
				int age = scan.nextInt();
				kkt.setAge(age);
			}

			System.out.print("현재 직업 : " + kkt.getJob() + " 변경하시겠습니까? (Y/N)");
			yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 직업을 입력 : ");
				String job = scan.next();
				kkt.setJob(job);
			}

			System.out.print("현재 성별 : " + (kkt.getGender() == 1 ? "남자" : "여자") + " 변경하시겠습니까? (Y/N)");
			yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("변경할 성별을 입력 (1 : 남자 , 2 : 여자) : ");
				int gender = scan.nextInt();
				kkt.setGender(gender);
			}

			pstmt.close();
			pstmt = conn.prepareStatement("update KKTFAMILY set name =?, age = ?, job = ?, gender = ?");
			pstmt.setString(1, kkt.getName());
			pstmt.setInt(2, kkt.getAge());
			pstmt.setString(3, kkt.getJob());
			pstmt.setInt(4, kkt.getGender());
			pstmt.executeUpdate();

			System.out.println("가족회원 변경 완료");
		}

	}

	private static void insert() throws SQLException {
		Scanner scan = new Scanner(System.in);

		System.out.print("가족 이름 : ");
		String name = scan.next();

		System.out.print("가족 나이 : ");
		int age = scan.nextInt();

		System.out.print("가족 직업 : ");
		String job = scan.next();

		System.out.print("가족 성별(1:남자,2:여자) : ");
		int gender = scan.nextInt();

		PreparedStatement pstmt = conn.prepareStatement("insert into KKTFAMILY (name,age,job,gender) values (?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setInt(2, age);
		pstmt.setString(3, job);
		pstmt.setInt(4, gender);
		pstmt.executeUpdate();

		System.out.println("가족 추가 완료");

	}

}
