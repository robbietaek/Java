package chap5;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		
		if(ch>='a' && ch<='b') {
			System.out.println("�ҹ����Դϴ�.");
			
		}

		else if(ch>='A' && ch<='Z') {
			System.out.println("�빮���Դϴ�.");
		}
		
		else if(ch>='0' && ch<='9')
			System.out.println("�����Դϴ�.");
		
		else {
			System.out.println("��Ÿ�����Դϴ�.");
		}
	}

}
