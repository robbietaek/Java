package snippet;

import java.sql.*;
/*
 * 1.dept ���̺��� �̿��Ͽ� ���� ������ ���ڵ常 detp_seoul ���̺�� �����ϱ�
 * 2.dept_seoul ���̺�
 * deptno : 60, dname : Ư��������, loc : ���� ���ڵ� �߰�
 * 3.dept_seoul �׺�
 * deptno : 60 ���ڵ��� dname:Ư������1�� �����ϱ�.
 * 4.dept_seoul ���̺��� ��� �÷��� ������ ȭ�鿡 ����ϱ�
 */


public class problem1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3. ����̹� Ŭ������ �ε��ϱ�
		Class.forName("org.mariadb.jdbc.Driver");
		//4. db�� Java�� �����ϴ� ��ü �����ϱ�
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		//���ڿ��� ������ Ŭ������ �޸𸮿� �ε�.
		
		//5. SQL ��ɹ��� DB�� �����ϱ� ���� ��ü ����
		Statement stmt = conn.createStatement();

		String sql = "create table dept_seoul as select * from dept where loc = '����'";
		int result = stmt.executeUpdate(sql);	//�߰��� ���ڵ� 4��
		System.out.println("1. ��� : "+result);
		
		sql = "insert into dept_seoul (deptno, dname, loc) values (60, 'Ư��������', '����')";
		result = stmt.executeUpdate(sql); //�߰��� ���ڵ� 1��
		System.out.println("2. ��� : "+result);
		
		sql = "Update dept_seoul set dname = 'Ư������1��' where deptno = 60";
		result = stmt.executeUpdate(sql); //����� ���ڵ� 1��
		System.out.println("3. ��� : "+result);
		
		ResultSet pp = stmt.executeQuery("select * from dept_seoul");
		while(pp.next()){ //�Ѱ��� ���ڵ徿 ��ȸ
			System.out.print("��ȣ  : "+pp.getString("deptno"));
			System.out.print(", ����  : "+pp.getString("dname"));
			System.out.println(", ����  : "+pp.getString("loc"));		
	}

}
}
