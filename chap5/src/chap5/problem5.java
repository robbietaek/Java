package chap5;

import java.util.Scanner;

public class problem5 {
	public static void main(String[] args) {
		
		System.out.println("�ڿ����� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num !=0) {
			sum+=num%10;
			num /=10;
		}

		System.out.println(sum);
	}

}
