package chap5;

import java.util.Scanner;

public class problem2 {
public static void main(String[] args) {
	
	for(int i=0;i<100;i++) {
		
	System.out.println("������ �Է��ϼ���.");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	if(num%4==0) {
		if(num%400==0) {
			System.out.println("�����Դϴ�.");
		}
		else if(num%100==0) {
			System.out.println("����Դϴ�.");
		}
		else if(num%100!=0)
			System.out.println("�����Դϴ�.");
		}
	
	else if(num%4!=0) {
		System.out.println("����Դϴ�");
	}
	}
}
}
