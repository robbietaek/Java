package snippet;
/*
 * Java �� DBMS(Mariadb ���) �����ϱ�
 * 1. ����̹� ����(mariadb-java-client-2.4.2.jar) class path ����. ��뵵�� ����
 * 2. JDBC ���� ��Ű�� : java.sql.*
 * 3. ����̹� Ŭ������ �ε��ϱ�
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3. ����̹� Ŭ������ �ε��ϱ�
		Class.forName("org.mariadb.jdbc.Driver");
		//4. db�� Java�� �����ϴ� ��ü �����ϱ�
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		//���ڿ��� ������ Ŭ������ �޸𸮿� �ε�.
		
		//5. SQL ��ɹ��� DB�� �����ϱ� ���� ��ü ����
		Statement stmt = conn.createStatement();
		//6. Statement ��ü�� �̿��Ͽ� Sql ���� ����. ��� ���
//		ResultSet rs = stmt.executeQuery("select * from student");
		//7. ��� ��ȸ
//		while(rs.next()){ //�Ѱ��� ���ڵ徿 ��ȸ
//			System.out.print("�й�  : "+rs.getString("studno"));
//			System.out.print(", �̸�  : "+rs.getString("name"));
//			System.out.print(", �г�  : "+rs.getString("grade"));
//			System.out.print(", Ű  : "+rs.getString("height"));
//			System.out.print(", ������ : "+rs.getString("weight"));
//			System.out.println(", �а��ڵ�  : "+rs.getString("major1"));
//		}
		
		ResultSet pp = stmt.executeQuery("select no,name,id,hiredate,salary,bonus,deptno from professor");
		while(pp.next()){ //�Ѱ��� ���ڵ徿 ��ȸ
			System.out.print("������ȣ  : "+pp.getString("no"));
			System.out.print(", �̸�  : "+pp.getString("name"));
			System.out.print(", id  : "+pp.getString("id"));
			System.out.print(", �Ի���  : "+pp.getString("hiredate"));
			System.out.print(", �޿� : "+pp.getString("salary"));
			System.out.print(", ���ʽ� : "+pp.getInt("bonus"));
			System.out.println(", �а��ڵ�  : "+pp.getString("deptno"));		
	}

}
}
