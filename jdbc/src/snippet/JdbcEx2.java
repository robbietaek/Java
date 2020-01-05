package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * select ���� ���� : ���ڵ� ������ ��ȸ : executeQuery(Sql)
 * DDL, DML ���� ���� : ���� �߻� : int executeUpdate(Sql)
 * 	executeUpdate ���� �� ����� ����� ���ڵ� ���� ����
 */
public class JdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3. ����̹� Ŭ������ �ε��ϱ�
		Class.forName("org.mariadb.jdbc.Driver");
		//4. db�� Java�� �����ϴ� ��ü �����ϱ�
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234"); 
		//���ڿ��� ������ Ŭ������ �޸𸮿� �ε�.
		
		//5. SQL ��ɹ��� DB�� �����ϱ� ���� ��ü ����
		Statement stmt = conn.createStatement();
		String sql = "create table jdbctemp (id int primary key, name varchar(100))";
		int result = stmt.executeUpdate(sql);	//���� (�߰�,����,����)�� ���ڵ� ����
		System.out.println("1. ��� : "+result);
		
		sql = "insert into jdbctemp values(1,'ȫ�浿')";
		result = stmt.executeUpdate(sql); //�߰��� ���ڵ� 1��
		System.out.println("2. ��� : "+result);
		
		sql = "insert into jdbctemp values(2,'���')";
		result = stmt.executeUpdate(sql); //�߰��� ���ڵ� 1��
		System.out.println("3. ��� : "+result);
		
		sql = "delete from jdbctemp where id = 1";
		result = stmt.executeUpdate(sql); //������ ���ڵ� 1��
		System.out.println("4. ��� : "+result);




}
}
