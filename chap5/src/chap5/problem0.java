package chap5;

import java.util.Scanner;

public class problem0 {
public static void main(String[] args) {
	
	System.out.println("���ڸ� �Է��ϼ���.");
	Scanner scan = new Scanner(System.in);
	double num = scan.nextDouble();
	
	if(num>0) {
		System.out.println("����Դϴ�.");
	}
	
	else if(num<0) {
		System.out.println("�����Դϴ�.");
	}
	
	else{
		System.out.println("0�Դϴ�.");
	}
}
}
