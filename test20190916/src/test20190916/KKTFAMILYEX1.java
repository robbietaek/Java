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
			System.out.println("===========�޴��� �����ϼ���===========");
			System.out.println("1 : ����ȸ���߰�");
			System.out.println("2 : ����ȸ������");
			System.out.println("3 : ����ȸ��Ż��");
			System.out.println("4 : ����ȸ�������ȸ");
			System.out.println("9 : ���α׷� ����");
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
		System.out.println("���α׷� ����");
	}

	private static void select() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("select * from KKTFAMILY");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			System.out.printf("���� ��ȣ : %-3d , ���� �̸� : %-4s , ���� ���� : %-3d , ���� ���� : %-4s , ���� ���� : %-4s \n",
					rs.getInt("no"), 
					rs.getString("name"), 
					rs.getInt("age"), 
					rs.getString("job"),
					(rs.getInt("gender")) == 1 ? "����" : "����");
		}
	}

	private static void delete() throws SQLException {
		select();
		System.out.println("ȸ��Ż���� ����ȸ����ȣ�� �Է��ϼ���. : ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		PreparedStatement pstmt = conn.prepareStatement("delete from KKTFAMILY where no = ?");
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
	}

	private static void update() throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ����ȸ���� ��ȣ�� �Է��ϼ���. : ");
		int no = scan.nextInt();

		PreparedStatement pstmt = conn.prepareStatement("select * from KKTFAMILY where no = ?");
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			KKTFAMILY kkt = new KKTFAMILY(rs.getInt("no"), rs.getString("name"), rs.getInt("age"), rs.getString("job"),
					rs.getInt("gender"));
			Scanner Scan = new Scanner(System.in);

			select();

			System.out.print("���� �̸� : " + kkt.getName() + " �����Ͻðڽ��ϱ�? (Y/N)");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("������ �̸��� �Է� : ");
				String name = scan.next();
				kkt.setName(name);
			}

			System.out.print("���� ���� : " + kkt.getAge() + " �����Ͻðڽ��ϱ�? (Y/N)");
			yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("������ ���̸� �Է� : ");
				int age = scan.nextInt();
				kkt.setAge(age);
			}

			System.out.print("���� ���� : " + kkt.getJob() + " �����Ͻðڽ��ϱ�? (Y/N)");
			yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("������ ������ �Է� : ");
				String job = scan.next();
				kkt.setJob(job);
			}

			System.out.print("���� ���� : " + (kkt.getGender() == 1 ? "����" : "����") + " �����Ͻðڽ��ϱ�? (Y/N)");
			yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				System.out.print("������ ������ �Է� (1 : ���� , 2 : ����) : ");
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

			System.out.println("����ȸ�� ���� �Ϸ�");
		}

	}

	private static void insert() throws SQLException {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �̸� : ");
		String name = scan.next();

		System.out.print("���� ���� : ");
		int age = scan.nextInt();

		System.out.print("���� ���� : ");
		String job = scan.next();

		System.out.print("���� ����(1:����,2:����) : ");
		int gender = scan.nextInt();

		PreparedStatement pstmt = conn.prepareStatement("insert into KKTFAMILY (name,age,job,gender) values (?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setInt(2, age);
		pstmt.setString(3, job);
		pstmt.setInt(4, gender);
		pstmt.executeUpdate();

		System.out.println("���� �߰� �Ϸ�");

	}

}
