package chap8;

import java.util.Date;

class Employee{
	String type;
	String name;
	String address;
	String dept;
}

class FormalEmployee extends Employee{
	
	String empNo;
	String position;
	int salary;
	
	FormalEmployee(String name, String address, String dept, String empNo, int salary, String position){
		this.type = "������";
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;		
	}
	
	int getPay() {
		return this.salary = (int)(salary/12);
	}
	
	public String toString() {
		return type+", �̸� : "+name+", �ּ� : "+address+", �μ� : "+dept+", ������ȣ : "+empNo+", ���� : "+position+", ���� :"+ salary;
	}

	
}

class InformalEmployee extends Employee{
	
	Date expireDate;
	int primaryPay;
	
	InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay){
		this.type = "��������";
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;		
	}
	
	int getPay() {
		return this.primaryPay = (int)(primaryPay);
	}
	
	public String toString() {
		return "\n"+type+", �̸� : "+name+", �ּ� : "+address+", �μ� : "+dept+", ��ุ���� : "+expireDate+", �⺻�ӱ� :"+ primaryPay;
	}

}





public class homework {

	 public static void main(String[] args) {
		  //�������� ��ü ����
		  FormalEmployee fe = new FormalEmployee("������", "����� ��걸","�ѹ���", "1", 5000, "����");
		  System.out.println(fe);
		  System.out.print(fe.name + "�� �޿� : " +   fe.getPay());

		  //���������� ��ü ����
		  Date expireDate = new Date();
		  expireDate.setTime(expireDate.getTime() +1000L * 60 * 60 * 24 * 365 * 2);
		  InformalEmployee ie = new InformalEmployee("�̺���", "����� ���α�", "������", expireDate, 1000);
		  System.out.println(ie);
		  System.out.print(ie.name + "�� �޿� : " +  ie.getPay());

		 }

}
