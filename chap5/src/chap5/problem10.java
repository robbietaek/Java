package chap5;

import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String star = "*";
		for(int i=1;i<=num;i++) {
			for(int j = num;j>=i;j--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}