package chap4;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner (System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		
		System.out.println((ch>='a')?(char)(ch-32):(ch<='z')?"�ҹ��ھƴ�":"");
		

	}

}
