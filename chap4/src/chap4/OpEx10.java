package chap4;

import java.util.Scanner;

public class OpEx10 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner (System.in);
		double score = scan.nextDouble();
		String result = (score>=60)?"�հ�":"���հ�";
		System.out.println(score+"����"+result+"�Դϴ�.");
		System.out.println(score + "��"+ ((score%2==0)?"¦��":"Ȧ��"));
		//¦��, Ȧ��, 0���� ����ϱ�
		result = (score%2==1)?"Ȧ��":(score%2>=0)?"¦��":"0";
		System.out.println(score + "����" + result + "�Դϴ�.");
	}

}
