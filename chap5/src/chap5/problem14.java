package chap5;

import java.util.Scanner;

public class problem14 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result =0;
		int temp = num;
		
		while(temp!=0) {

			result *= 10;
			result =+ temp%10;
			temp /= 10;
		}
		
		if(num==result) {
			System.out.println("���� �� �Դϴ�.");
		}
		else {
			System.out.println("�ٸ� �� �Դϴ�.");
		}
	}
	
}
